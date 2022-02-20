package com.huiqian.data.moniter.common.resp;

import lombok.Data;

@Data
public class Transaction {
    private String hash;
    private String blockHash;
    private String blockNumber;
    private String from;
    private String gas;
    private String gasPrice;
    private String input;
    private String nonce;
    private String r;
    private String s;
    private String to;
    private String transactionIndex;
    private String v;
    private String value;
}
