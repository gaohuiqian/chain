package com.huiqian.data.moniter.common.req;

import com.huiqian.data.moniter.common.enums.TransactionStatus;
import com.huiqian.data.moniter.common.util.JsonRpcParamUtil;

import java.util.List;

public class EthGetBalanceReq extends Req {
    @Override
    String abstractGetMethod() {
        return "eth_getBalance";
    }

    public EthGetBalanceReq(String account) {
        List<Object> params = JsonRpcParamUtil.createParams(account, TransactionStatus.latest);
        setParams(params);
    }

    public EthGetBalanceReq(String account, TransactionStatus status) {
        List<Object> params = JsonRpcParamUtil.createParams(account, status);
        setParams(params);
    }


}
