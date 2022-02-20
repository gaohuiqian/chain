package com.huiqian.data.moniter.common.req;

import com.alibaba.fastjson.JSON;
import com.huiqian.data.moniter.common.enums.TransactionStatus;
import com.huiqian.data.moniter.common.util.JsonRpcParamUtil;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

public class EthCallReq extends Req {
    @Override
    String abstractGetMethod() {
        return "eth_call";
    }

    public EthCallReq(String from, String to, int gas, int gasPrice, int value, String data) {


        List<Object> params = JsonRpcParamUtil.createParams(JSON.toJSONString(new InnerParam(from, to, Integer.toHexString(gas), Integer.toHexString(gasPrice), Integer.toHexString(value), data
        )), TransactionStatus.latest);

        setParams(params);

    }

    @Data
    @AllArgsConstructor
    @NoArgsConstructor
    static class InnerParam {
        private String from;
        private String to;
        private String gas;
        private String gasPrice;
        private String value;
        private String data;
    }
}
