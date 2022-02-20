package com.huiqian.data.moniter.common.req;

import com.huiqian.data.moniter.common.util.JsonRpcParamUtil;
import com.huiqian.data.moniter.common.util.NumberUtil;

import java.util.List;

public class EthGetBlockByNumberReq extends Req {
    @Override
    String abstractGetMethod() {
        return "eth_getBlockByNumber";
    }

    public EthGetBlockByNumberReq(int blockNumber) {
        List<Object> params = JsonRpcParamUtil.createParams(NumberUtil.toHex(blockNumber), false);
        setParams(params);
    }

    public EthGetBlockByNumberReq(String hexString) {
        List<Object> params = JsonRpcParamUtil.createParams(hexString, false);
        setParams(params);

    }
}
