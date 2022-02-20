CREATE TABLE `trade_date` (
  `id` int NOT NULL AUTO_INCREMENT,
  `chain` varchar(45) NOT NULL COMMENT '''区块链类型''',
  `to_address` varchar(200) NOT NULL,
  `create_day` varchar(100) NOT NULL DEFAULT '2022-01-01',
  `trade_count` int NOT NULL DEFAULT '0',
  `trade_amount` bigint NOT NULL DEFAULT '0',
  `create_time` datetime DEFAULT NULL,
  `update_time` datetime DEFAULT NULL,
  PRIMARY KEY (`id`,`create_day`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb3