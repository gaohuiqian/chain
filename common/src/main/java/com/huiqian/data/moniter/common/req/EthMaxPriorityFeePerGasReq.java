package com.huiqian.data.moniter.common.req;

public class EthMaxPriorityFeePerGasReq extends Req {
    @Override
    String abstractGetMethod() {
        return "eth_maxPriorityFeePerGas";
    }

    public EthMaxPriorityFeePerGasReq() {
    }
}
