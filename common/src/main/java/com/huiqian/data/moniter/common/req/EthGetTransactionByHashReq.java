package com.huiqian.data.moniter.common.req;

import com.huiqian.data.moniter.common.util.JsonRpcParamUtil;

import java.util.List;

public class EthGetTransactionByHashReq extends Req {
    @Override
    String abstractGetMethod() {
        return "eth_getTransactionByHash";
    }

    public EthGetTransactionByHashReq(String transactionHash) {

        List<Object> params = JsonRpcParamUtil.createParams(transactionHash);

        setParams(params);
    }
}
