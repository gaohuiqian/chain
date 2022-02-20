package com.huiqian.data.moniter.common.req;

import com.huiqian.data.moniter.common.util.JsonRpcParamUtil;

import java.util.List;

public class EthGetUncleByBlockNumberAndIndexReq extends Req {
    @Override
    String abstractGetMethod() {
        return "eth_getUncleByBlockNumberAndIndex";
    }

    public EthGetUncleByBlockNumberAndIndexReq(int blockNumber, int index) {

        List<Object> params = JsonRpcParamUtil.createParams(Integer.toHexString(blockNumber), Integer.toHexString(index));
        setParams(params);
    }

    public EthGetUncleByBlockNumberAndIndexReq(String blockNumberHex, String indexHex) {
        List<Object> params = JsonRpcParamUtil.createParams(blockNumberHex, indexHex);
        setParams(params);
    }
}
