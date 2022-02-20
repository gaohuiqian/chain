package com.huiqian.data.moniter.common.util;

import com.google.common.collect.Lists;

import java.util.List;

public class JsonRpcParamUtil {

    public static List<Object> createParams(Object... objects) {
        List<Object> params = Lists.newArrayList();
        for (Object obj : objects) {
            params.add(obj);
        }
        return params;
    }
}
