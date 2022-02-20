package com.huiqian.data.moniter.common.req;

public class NetVersionReq extends Req {
    @Override
    String abstractGetMethod() {
        return "net_version";
    }

    public NetVersionReq() {
    }
}
