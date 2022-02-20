package com.huiqian.data.moniter.common.resp;

import lombok.Data;

import java.util.List;

@Data
public class Block {

    private String difficulty;
    private String extraData;
    private String gasLimit;
    private String gasUsed;
    private String hash;
    private String logsBloom;
    private String miner;
    private String mixHash;
    private String nonce;
    private String number;
    private String parentHash;
    private String receiptsRoot;
    private String sha3Uncles;
    private String size;
    private String stateRoot;
    private String timestamp;
    private String totalDifficulty;
    private List<String> transactions;
    private String transactionsRoot;
    private List<String> uncles;
}
