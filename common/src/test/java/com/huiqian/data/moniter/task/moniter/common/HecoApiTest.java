package com.huiqian.data.moniter.task.moniter.common;

import com.huiqian.data.moniter.common.EthApi;
import com.huiqian.data.moniter.common.enums.TransactionStatus;
import com.huiqian.data.moniter.common.req.*;
import com.huiqian.data.moniter.common.resp.Block;
import com.huiqian.data.moniter.common.resp.Resp;
import com.huiqian.data.moniter.common.resp.Transaction;
import com.huiqian.data.moniter.common.resp.TransactionReceipt;
import org.junit.Before;
import org.junit.Test;
import retrofit2.Call;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

import java.io.IOException;
import java.util.List;

public class HecoApiTest {

    EthApi ethApi;

    @Before
    public void before() {
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl("https://http-mainnet.hecochain.com/")
                .addConverterFactory(GsonConverterFactory.create())
                .build();
        ethApi = retrofit.create(EthApi.class);
    }

    @Test
    public void eth_blockNumber() {
        try {
            Call<Resp<String>> respCall = ethApi.eth_blockNumber("", new EthBlockNumberReq());
            Response<Resp<String>> execute = respCall.execute();
            System.out.println(execute);
            System.out.println(execute.body());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void eth_getBlockByHash() {
        try {
            Call<Resp<Block>> respCall = ethApi.eth_getBlockByHash("v3/9aa3d95b3bc440fa88ea12eaa4456161",new EthGetBlockByHashReq("0xc0f4906fea23cf6f3cce98cb44e8e1449e455b28d684dfa9ff65426495584de6"));
            Response<Resp<Block>> execute = respCall.execute();
            System.out.println(execute.body());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void eth_getBlockByNumber() {
        try {
            Call<Resp<Block>> respCall = ethApi.eth_getBlockByNumber("v3/9aa3d95b3bc440fa88ea12eaa4456161",new EthGetBlockByNumberReq(14241910));
            Response<Resp<Block>> execute = respCall.execute();
            System.out.println(execute.body());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void eth_getTransactionByHash() {
        try {
            Call<Resp<Transaction>> respCall = ethApi.eth_getTransactionByHash("v3/9aa3d95b3bc440fa88ea12eaa4456161",new EthGetTransactionByHashReq("0x88df016429689c079f3b2f6ad39fa052532c56795b733da78a91ebe6a713944b"));
            Response<Resp<Transaction>> execute = respCall.execute();
            System.out.println(execute.body());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void eth_getTransactionCount() {
        try {
            Call<Resp<String>> respCall = ethApi.eth_getTransactionCount("v3/9aa3d95b3bc440fa88ea12eaa4456161",new EthGetTransactionCountReq("0xc94770007dda54cF92009BFF0dE90c06F603a09f"));
            Response<Resp<String>> execute = respCall.execute();
            System.out.println(execute.body());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void eth_getTransactionReceipt() {
        try {
            Call<Resp<TransactionReceipt>> respCall = ethApi.eth_getTransactionReceipt("v3/9aa3d95b3bc440fa88ea12eaa4456161",new EthGetTransactionReceiptReq("0xab059a62e22e230fe0f56d8555340a29b2e9532360368f810595453f6fdd213b"));
            Response<Resp<TransactionReceipt>> execute = respCall.execute();
            System.out.println(execute.body());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void eth_getBlockTransactionCountByHash() {
        try {
            Call<Resp<String>> respCall = ethApi.eth_getBlockTransactionCountByHash("v3/9aa3d95b3bc440fa88ea12eaa4456161",new EthGetBlockTransactionCountByHashReq("0x8243343df08b9751f5ca0c5f8c9c0460d8a9b6351066fae0acbd4d3e776de8bb"));
            Response<Resp<String>> execute = respCall.execute();
            System.out.println(execute.body());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void eth_getBlockTransactionCountByNumber() {
        try {
            Call<Resp<String>> respCall = ethApi.eth_getBlockTransactionCountByHash("v3/9aa3d95b3bc440fa88ea12eaa4456161",new EthGetBlockTransactionCountByNumberReq(TransactionStatus.latest));
            Response<Resp<String>> execute = respCall.execute();
            System.out.println(execute.body());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void eth_getTransactionByBlockHashAndIndex() {
        try {
            Call<Resp<Transaction>> respCall = ethApi.eth_getTransactionByBlockHashAndIndex("v3/9aa3d95b3bc440fa88ea12eaa4456161",new EthGetTransactionByBlockHashAndIndexReq("0xc0f4906fea23cf6f3cce98cb44e8e1449e455b28d684dfa9ff65426495584de6", 0));
            Response<Resp<Transaction>> execute = respCall.execute();
            System.out.println(execute.body());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void eth_getCode() {
        try {
            Call<Resp<String>> respCall = ethApi.eth_getCode("v3/9aa3d95b3bc440fa88ea12eaa4456161",new EthGetCodeReq("0xb59f67a8bff5d8cd03f6ac17265c550ed8f33907"));
            Response<Resp<String>> execute = respCall.execute();
            System.out.println(execute.body());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void eth_getStorageAt() {
        try {
            Call<Resp<String>> respCall = ethApi.eth_getStorageAt("v3/9aa3d95b3bc440fa88ea12eaa4456161",new EthGetStorageAtReq("0x295a70b2de5e3953354a6a8344e616ed314d7251", 0));
            Response<Resp<String>> execute = respCall.execute();
            System.out.println(execute.body());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void eth_accounts() {
        try {
            Call<Resp<List<String>>> respCall = ethApi.eth_accounts("v3/9aa3d95b3bc440fa88ea12eaa4456161",new EthAccountsReq());
            Response<Resp<List<String>>> execute = respCall.execute();
            System.out.println(execute.body());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


}
