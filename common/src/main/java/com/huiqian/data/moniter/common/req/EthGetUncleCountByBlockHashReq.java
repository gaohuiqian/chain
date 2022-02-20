package com.huiqian.data.moniter.common.req;

import com.huiqian.data.moniter.common.util.JsonRpcParamUtil;

import java.util.List;

public class EthGetUncleCountByBlockHashReq extends Req {
    @Override
    String abstractGetMethod() {
        return "eth_getUncleCountByBlockHash";
    }

    public EthGetUncleCountByBlockHashReq(String blockHash) {
        List<Object> params = JsonRpcParamUtil.createParams(blockHash);
        setParams(params);

    }
}
