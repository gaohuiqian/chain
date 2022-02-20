package com.huiqian.data.moniter.common.req;

public class EthChainIdReq extends Req {
    @Override
    String abstractGetMethod() {
        return "eth_chainId";
    }

    public EthChainIdReq() {
    }
}
