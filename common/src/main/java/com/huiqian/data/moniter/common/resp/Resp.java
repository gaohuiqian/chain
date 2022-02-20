package com.huiqian.data.moniter.common.resp;

import lombok.Data;

@Data
public class Resp<T> {

    private String jsonrpc;
    private int id;
    private T result;
}
