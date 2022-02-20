package com.huiqian.data.moniter.common.req;

public class EthGasPriceReq extends Req {
    @Override
    String abstractGetMethod() {
        return "eth_gasPrice";
    }

    public EthGasPriceReq() {
    }
}
