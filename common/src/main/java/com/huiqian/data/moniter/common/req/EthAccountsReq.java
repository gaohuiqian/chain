package com.huiqian.data.moniter.common.req;

public class EthAccountsReq extends Req {
    @Override
    String abstractGetMethod() {
        return "eth_accounts";
    }
}
