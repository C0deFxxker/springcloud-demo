package com.lyl.study.springcloud.feign.client;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

@RestController
@RequestMapping("/feign")
public class FeignController {
    @Autowired
    private FeignService feignService;

    @GetMapping("/hi")
    public String sayHi(String name) {
        return feignService.sayHi(name);
    }
}