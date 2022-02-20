package com.huiqian.data.moniter.common.req;

import com.huiqian.data.moniter.common.enums.TransactionStatus;
import com.huiqian.data.moniter.common.util.JsonRpcParamUtil;

import java.util.List;

public class EthGetTransactionCountReq extends Req {
    @Override
    String abstractGetMethod() {
        return "eth_getTransactionCount";
    }

    public EthGetTransactionCountReq(String address) {
        List<Object> params = JsonRpcParamUtil.createParams(address, TransactionStatus.latest);
        setParams(params);
    }
}
