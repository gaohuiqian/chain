package com.huiqian.data.moniter.common.req;

public class EthBlockNumberReq extends Req {

    @Override
    String abstractGetMethod() {
        return "eth_blockNumber";
    }


}
