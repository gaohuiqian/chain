package com.huiqian.data.moniter.common.req;

import com.huiqian.data.moniter.common.enums.TransactionStatus;
import com.huiqian.data.moniter.common.util.JsonRpcParamUtil;

import java.util.List;

public class EthGetCodeReq extends Req {
    @Override
    String abstractGetMethod() {
        return "eth_getCode";
    }

    public EthGetCodeReq(String address) {
        List<Object> params = JsonRpcParamUtil.createParams(address, TransactionStatus.latest);
        setParams(params);
    }
}
