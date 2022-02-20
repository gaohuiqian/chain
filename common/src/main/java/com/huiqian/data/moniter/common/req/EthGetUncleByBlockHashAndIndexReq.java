package com.huiqian.data.moniter.common.req;

import com.huiqian.data.moniter.common.util.JsonRpcParamUtil;

import java.util.List;

public class EthGetUncleByBlockHashAndIndexReq extends Req {
    @Override
    String abstractGetMethod() {
        return "eth_getUncleByBlockHashAndIndex";
    }

    public EthGetUncleByBlockHashAndIndexReq(String blockHash, int index) {
        List<Object> params = JsonRpcParamUtil.createParams(blockHash, Integer.toHexString(index));
        setParams(params);
    }
}
