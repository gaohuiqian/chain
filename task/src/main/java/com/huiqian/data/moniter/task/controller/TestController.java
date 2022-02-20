package com.huiqian.data.moniter.task.controller;

import com.huiqian.data.moniter.task.dao.BlockMapper;
import com.huiqian.data.moniter.task.service.EthService;
import com.huiqian.data.moniter.task.service.EvmService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
public class TestController {

    @Resource
    EvmService ethService;

    @Resource
    BlockMapper blockMapper;

    @GetMapping("/test")
    public String test() {
        System.out.println(blockMapper);
        ethService.start();
        return "success";
    }
}
