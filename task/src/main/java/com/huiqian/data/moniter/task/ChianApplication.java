package com.huiqian.data.moniter.task;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.huiqian.data.moniter.task.dao")
public class ChianApplication {

	public static void main(String[] args) {
		SpringApplication.run(ChianApplication.class, args);
	}

}
