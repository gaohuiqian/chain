package com.huiqian.data.moniter.common.req;

import com.huiqian.data.moniter.common.util.JsonRpcParamUtil;

import java.util.List;

public class EthGetBlockByHashReq extends Req {
    @Override
    String abstractGetMethod() {
        return "eth_getBlockByHash";
    }

    public EthGetBlockByHashReq(String hash) {
        List<Object> params = JsonRpcParamUtil.createParams(hash, false);
        setParams(params);
    }
}
