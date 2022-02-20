package com.huiqian.data.moniter.task.config;

import com.alibaba.druid.pool.DruidDataSource;
import com.huiqian.data.moniter.task.constans.Chain;
import com.huiqian.data.moniter.task.service.EthService;
import com.huiqian.data.moniter.task.service.EvmService;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.sql.DataSource;

@Configuration
public class CustomMysqlConfiger {


    @Bean
    @ConfigurationProperties(prefix = "spring.datasource")
    public DataSource dataSource() {
        return new DruidDataSource();
    }

    @Bean
    public EvmService ethService(@Value("${eth.baseUrl}") String baseUrl,

                                 @Value("${eth.callPath}") String path,
                                 @Value("${eth.chain}") Chain chain
    ) {
        return new EthService(baseUrl, chain, path);
    }


    @Bean
    public EvmService hecoService(@Value("${heco.baseUrl}") String baseUrl,

                                  @Value("${heco.callPath}") String path,
                                  @Value("${heco.chain}") Chain chain
    ) {
        return new EthService(baseUrl, chain, path);
    }
}
