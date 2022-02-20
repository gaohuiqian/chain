package com.huiqian.data.moniter.common.req;

import com.huiqian.data.moniter.common.util.JsonRpcParamUtil;

import java.util.List;

public class EthGetTransactionByBlockHashAndIndexReq extends Req {
    @Override
    String abstractGetMethod() {
        return "eth_getTransactionByBlockHashAndIndex";
    }

    public EthGetTransactionByBlockHashAndIndexReq(String blockHash, int index) {
        List<Object> params = JsonRpcParamUtil.createParams(blockHash, "0x" + Integer.toHexString(index));
        setParams(params);
    }
}
