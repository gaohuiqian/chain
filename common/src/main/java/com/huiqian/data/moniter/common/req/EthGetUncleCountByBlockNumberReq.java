package com.huiqian.data.moniter.common.req;

import com.google.common.collect.Lists;

import java.util.List;

public class EthGetUncleCountByBlockNumberReq extends Req {
    @Override
    String abstractGetMethod() {
        return "eth_getUncleCountByBlockNumber";


    }

    public EthGetUncleCountByBlockNumberReq(int blockNumber) {
        List<String> params = Lists.newArrayList(Integer.toHexString(blockNumber));
        setParams(params);
    }
}
