package com.huiqian.data.moniter.task.service;

import com.alibaba.fastjson.JSON;
import com.huiqian.data.moniter.common.util.NumberUtil;
import com.huiqian.data.moniter.task.dao.BlockMapper;
import com.huiqian.data.moniter.task.entity.ChainBlock;
import com.huiqian.data.moniter.common.EthApi;
import com.huiqian.data.moniter.common.req.EthBlockNumberReq;
import com.huiqian.data.moniter.common.req.EthGetBlockByNumberReq;
import com.huiqian.data.moniter.common.resp.Block;
import com.huiqian.data.moniter.common.resp.Resp;
import com.huiqian.data.moniter.task.constans.Chain;
import com.huiqian.data.moniter.task.util.SpringContextUtil;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.lang3.StringUtils;
import retrofit2.Call;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

import java.io.IOException;
import java.math.BigInteger;
import java.util.concurrent.atomic.AtomicBoolean;

@Slf4j
public abstract class EvmService {

    EthApi ethApi;
    Chain chain;
    String path;
    int currentBlock;

    AtomicBoolean isRun = new AtomicBoolean(false);


    public EvmService(String baseUrl, Chain chain, String path) {
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl(baseUrl)
                .addConverterFactory(GsonConverterFactory.create())
                .build();
        EthApi ethApi = retrofit.create(EthApi.class);
        this.ethApi = ethApi;
        this.chain = chain;
        this.path = path;
    }


    public void start() {
        new Thread(new Runnable() {
            public void run() {
                scan();
            }
        }).start();
    }


    private void scan() {
        boolean start = isRun.compareAndSet(false, true);
        while (true && start) {
            try {
                if (currentBlock == 0) {
                    Integer currentBlockNum = getCurrentBlockNum();
                    if (currentBlockNum != null) {
                        currentBlock = currentBlockNum;
                    }
                    if (currentBlock > 0) {
                        currentBlock++;
                    }
                }

                Call<Resp<String>> respCall = ethApi.eth_blockNumber(path, new EthBlockNumberReq());
                Response<Resp<String>> execute = respCall.execute();

                String blockNumberHash = execute.body().getResult();
                if (StringUtils.isEmpty(blockNumberHash)) {
                    continue;
                }


                if (currentBlock < NumberUtil.parHex(blockNumberHash)) {
                    Call<Resp<Block>> blockCall = ethApi.eth_getBlockByNumber(path, new EthGetBlockByNumberReq(currentBlock));
                    Block result = blockCall.execute().body().getResult();
                    if (result != null) {
                        ChainBlock chainBlock = new ChainBlock();
                        chainBlock.setChain(chain.toString());
                        chainBlock.setData(JSON.toJSONString(result));
                        chainBlock.setBlockNumber(currentBlock);
                        SpringContextUtil.getBean(BlockMapper.class).insert(chainBlock);
                        log.info("chain {} process block {} success", chain, currentBlock);
                        currentBlock++;
                    }
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }


    private Integer getCurrentBlockNum() {
        return SpringContextUtil.getBean(BlockMapper.class).maxBlockNumber(chain.toString());
    }
}
