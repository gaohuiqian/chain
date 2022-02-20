package com.huiqian.data.moniter.common;

import com.huiqian.data.moniter.common.anno.NotImpl;
import com.huiqian.data.moniter.common.req.Req;
import com.huiqian.data.moniter.common.resp.*;
import retrofit2.Call;
import retrofit2.http.*;

import java.util.List;

public interface EthApi {

    @Headers({"Content-Type: application/json"})
    @POST("{url}")
    Call<Resp<String>> eth_blockNumber(@Path(value = "url", encoded = true) String url, @Body Req req);

    @Headers({"Content-Type: application/json"})
    @POST("{url}")
    Call<Resp<String>> eth_getBalance(@Path(value = "url", encoded = true) String url, @Body Req req);

    @Headers({"Content-Type: application/json"})
    @POST("{url}")
    Call<Resp<Block>> eth_getBlockByHash(@Path(value = "url", encoded = true) String url, @Body Req req);

    @Headers({"Content-Type: application/json"})
    @POST("{url}")
    Call<Resp<Block>> eth_getBlockByNumber(@Path(value = "url", encoded = true) String url, @Body Req req);

    @Headers({"Content-Type: application/json"})
    @POST("{url}")
    Call<Resp<Transaction>> eth_getTransactionByHash(@Path(value = "url", encoded = true) String url, @Body Req req);

    @Headers({"Content-Type: application/json"})
    @POST("{url}")
    Call<Resp<String>> eth_getTransactionCount(@Path(value = "url", encoded = true) String url, @Body Req req);

    @Headers({"Content-Type: application/json"})
    @POST("{url}")
    Call<Resp<TransactionReceipt>> eth_getTransactionReceipt(@Path(value = "url", encoded = true) String url, @Body Req req);

    @Headers({"Content-Type: application/json"})
    @POST("{url}")
    Call<Resp<String>> eth_getBlockTransactionCountByHash(@Path(value = "url", encoded = true) String url, @Body Req req);

    @Headers({"Content-Type: application/json"})
    @POST("{url}")
    Call<Resp<String>> eth_getBlockTransactionCountByNumber(@Path(value = "url", encoded = true) String url, @Body Req req);

    @Headers({"Content-Type: application/json"})
    @POST("{url}")
    Call<Resp<Transaction>> eth_getTransactionByBlockHashAndIndex(@Path(value = "url", encoded = true) String url, @Body Req req);

    @NotImpl
    @Headers({"Content-Type: application/json"})
    @POST("{url}")
    Call<Resp<String>> eth_sendRawTransaction(@Path(value = "url", encoded = true) String url, @Body Req req);

    @Headers({"Content-Type: application/json"})
    @POST("{url}")
    Call<Resp<String>> eth_getCode(@Path(value = "url", encoded = true) String url, @Body Req req);

    @Headers({"Content-Type: application/json"})
    @POST("{url}")
    Call<Resp<String>> eth_getStorageAt(@Path(value = "url", encoded = true) String url, @Body Req req);

    @Headers({"Content-Type: application/json"})
    @POST("{url}")
    Call<Resp<List<String>>> eth_accounts(@Path(value = "url", encoded = true) String url, @Body Req req);

    @Headers({"Content-Type: application/json"})
    @POST("{url}")
    Call<Resp<Block>> eth_getProof(@Path(value = "url", encoded = true) String url, @Body Req req);

    @Headers({"Content-Type: application/json"})
    @POST("{url}")
    Call<Resp<String>> eth_call(@Path(value = "url", encoded = true) String url, @Body Req req);

    @Headers({"Content-Type: application/json"})
    @POST("{url}")
    Call<Resp<Block>> eth_getLogs(@Path(value = "url", encoded = true) String url, @Body Req req);

    @Headers({"Content-Type: application/json"})
    @POST("{url}")
    Call<Resp<String>> eth_protocolVersion(@Path(value = "url", encoded = true) String url, @Body Req req);

    @Headers({"Content-Type: application/json"})
    @POST("{url}")
    Call<Resp<String>> eth_gasPrice(@Path(value = "url", encoded = true) String url, @Body Req req);

    @NotImpl
    @Headers({"Content-Type: application/json"})
    @POST("{url}")
    Call<Resp<Block>> eth_estimateGas(@Path(value = "url", encoded = true) String url, @Body Req req);

    @NotImpl
    @Headers({"Content-Type: application/json"})
    @POST("{url}")
    Call<Resp<Block>> eth_feeHistory(@Path(value = "url", encoded = true) String url, @Body Req req);

    @Headers({"Content-Type: application/json"})
    @POST("{url}")
    Call<Resp<String>> eth_maxPriorityFeePerGas(@Path(value = "url", encoded = true) String url, @Body Req req);

    @Headers({"Content-Type: application/json"})
    @POST("{url}")
    Call<Resp<String>> eth_chainId(@Path(value = "url", encoded = true) String url, @Body Req req);

    @Headers({"Content-Type: application/json"})
    @POST("{url}")
    Call<Resp<String>> net_version(@Path(value = "url", encoded = true) String url, @Body Req req);

    @Headers({"Content-Type: application/json"})
    @POST("{url}")
    Call<Resp<String>> net_listening(@Path(value = "url", encoded = true) String url, @Body Req req);

    @Headers({"Content-Type: application/json"})
    @POST("{url}")
    Call<Resp<Uncle>> eth_getUncleByBlockNumberAndIndex(@Path(value = "url", encoded = true) String url, @Body Req req);

    @Headers({"Content-Type: application/json"})
    @POST("{url}")
    Call<Resp<Uncle>> eth_getUncleByBlockHashAndIndex(@Path(value = "url", encoded = true) String url, @Body Req req);

    @Headers({"Content-Type: application/json"})
    @POST("{url}")
    Call<Resp<String>> eth_getUncleCountByBlockHash(@Path(value = "url", encoded = true) String url, @Body Req req);

    @Headers({"Content-Type: application/json"})
    @POST("{url}")
    Call<Resp<String>> eth_getUncleCountByBlockNumber(@Path(value = "url", encoded = true) String url, @Body Req req);

    @NotImpl
    @Headers({"Content-Type: application/json"})
    @POST("{url}")
    Call<Resp<Block>> eth_getFilterChanges(@Path(value = "url", encoded = true) String url, @Body Req req);

    @NotImpl
    @Headers({"Content-Type: application/json"})
    @POST("{url}")
    Call<Resp<Block>> eth_getFilterLogs(@Path(value = "url", encoded = true) String url, @Body Req req);

    @Headers({"Content-Type: application/json"})
    @POST("{url}")
    Call<Resp<String>> eth_newBlockFilter(@Path(value = "url", encoded = true) String url, @Body Req req);

    @NotImpl
    @Headers({"Content-Type: application/json"})
    @POST("{url}")
    Call<Resp<Block>> eth_newFilter(@Path(value = "url", encoded = true) String url, @Body Req req);

    @Headers({"Content-Type: application/json"})
    @POST("{url}")
    Call<Resp<String>> eth_newPendingTransactionFilter(@Path(value = "url", encoded = true) String url, @Body Req req);
}
