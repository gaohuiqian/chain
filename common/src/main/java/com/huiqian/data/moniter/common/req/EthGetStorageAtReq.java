package com.huiqian.data.moniter.common.req;

import com.huiqian.data.moniter.common.enums.TransactionStatus;
import com.huiqian.data.moniter.common.util.JsonRpcParamUtil;
import com.huiqian.data.moniter.common.util.NumberUtil;

import java.util.List;

public class EthGetStorageAtReq extends Req {
    @Override
    String abstractGetMethod() {
        return "eth_getStorageAt";
    }

    public EthGetStorageAtReq(String address, int index) {
        List<Object> params = JsonRpcParamUtil.createParams(address, NumberUtil.toHex(index), TransactionStatus.latest);

        setParams(params);
    }
}
