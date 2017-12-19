package com.y.cloud.example.demo.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 版权所有：   y.
 * 创建日期：   17-12-19.
 * 重要说明：
 * 修订历史：
 */
@RestController
@RefreshScope
public class RefreshController {

    @Value("${my.name}")
    private String myName;

    @GetMapping("/my")
    public String getName(){
        return myName;
    }

}
