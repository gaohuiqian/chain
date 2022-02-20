package com.huiqian.data.moniter.common.req;

import com.huiqian.data.moniter.common.util.JsonRpcParamUtil;

import java.util.List;

public class EthGetBlockTransactionCountByHashReq extends Req {
    @Override
    String abstractGetMethod() {
        return "eth_getBlockTransactionCountByHash";
    }

    public EthGetBlockTransactionCountByHashReq(String blockHash) {
        List<Object> params = JsonRpcParamUtil.createParams(blockHash);
        setParams(params);
    }
}
