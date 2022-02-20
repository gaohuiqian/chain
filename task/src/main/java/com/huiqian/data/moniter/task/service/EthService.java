package com.huiqian.data.moniter.task.service;

import com.huiqian.data.moniter.task.constans.Chain;

public class EthService extends EvmService {

    public EthService(String baseUrl, Chain chain, String path) {
        super(baseUrl, chain, path);
    }
}
