package com.huiqian.data.moniter.common.resp;

import lombok.Data;

import java.util.List;

@Data
public class TransactionReceipt {
    private String transactionHash;
    private String blockHash;
    private String blockNumber;
    private String contractAddress;
    private String cumulativeGasUsed;
    private String from;
    private String gasUsed;
    private List<Log> logs;
    private String logsBloom;
    private String root;
    private String status;
    private String to;
    private String transactionIndex;

    @Data
    public static class Log {
        private String blockHash;
        private String address;
        private String logIndex;
        private String data;
        private boolean removed;
        private List<String> topics;
        private String blockNumber;
        private String transactionIndex;
        private String transactionHash;
    }
}
