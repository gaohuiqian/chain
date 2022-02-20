package com.huiqian.data.moniter.common.req;

import lombok.Data;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

@Data
public abstract class Req {

    private static AtomicInteger atomicInteger = new AtomicInteger(0);

    private String jsonrpc = "2.0";
    private String method;
    private List<? extends Object> params = new ArrayList<Object>();
    private int id;

    public Req() {
        setMethod(abstractGetMethod());
        setId(defaultId());
    }

    abstract String abstractGetMethod();

    int defaultId() {
        return atomicInteger.incrementAndGet();
    }

}
