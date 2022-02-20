package com.huiqian.data.moniter.common.req;

public class EthNewPendingTransactionFilterReq extends Req {
    @Override
    String abstractGetMethod() {
        return "eth_newPendingTransactionFilter";
    }
}
