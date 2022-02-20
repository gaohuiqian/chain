package com.huiqian.data.moniter.common.req;

import com.huiqian.data.moniter.common.enums.TransactionStatus;
import com.huiqian.data.moniter.common.util.JsonRpcParamUtil;

import java.util.List;

public class EthGetBlockTransactionCountByNumberReq extends Req {
    @Override
    String abstractGetMethod() {
        return "eth_getBlockTransactionCountByNumber";
    }

    public EthGetBlockTransactionCountByNumberReq(TransactionStatus status) {
        List<Object> params = JsonRpcParamUtil.createParams(status);
        setParams(params);
    }
}
