package com.huiqian.data.moniter.common.req;

import com.huiqian.data.moniter.common.util.JsonRpcParamUtil;

import java.util.List;

public class EthGetTransactionReceiptReq extends Req {
    @Override
    String abstractGetMethod() {
        return "eth_getTransactionReceipt";
    }

    public EthGetTransactionReceiptReq(String hash) {

        List<Object> params = JsonRpcParamUtil.createParams(hash);

        setParams(params);
    }
}
