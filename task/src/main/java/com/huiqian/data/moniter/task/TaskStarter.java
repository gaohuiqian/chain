package com.huiqian.data.moniter.task;

import com.huiqian.data.moniter.task.service.EvmService;
import org.springframework.boot.CommandLineRunner;

import javax.annotation.Resource;

public class TaskStarter implements CommandLineRunner {

    @Resource
    EvmService ethService;
    @Resource
    EvmService hecoService;


    public void run(String... args) throws Exception {

        ethService.start();
        hecoService.start();
    }
}
