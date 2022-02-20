package com.huiqian.data.moniter.common.req;

public class NetListeningReq extends Req {
    @Override
    String abstractGetMethod() {
        return "net_listening";
    }

    public NetListeningReq() {
    }
}
