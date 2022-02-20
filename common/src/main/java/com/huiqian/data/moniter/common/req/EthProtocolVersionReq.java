package com.huiqian.data.moniter.common.req;

public class EthProtocolVersionReq extends Req {
    @Override
    String abstractGetMethod() {
        return "eth_protocolVersion";
    }

    public EthProtocolVersionReq() {
    }
}
