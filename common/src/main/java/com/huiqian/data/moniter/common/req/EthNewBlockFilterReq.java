package com.huiqian.data.moniter.common.req;

public class EthNewBlockFilterReq extends Req {
    @Override
    String abstractGetMethod() {
        return "eth_newBlockFilter";
    }
}
