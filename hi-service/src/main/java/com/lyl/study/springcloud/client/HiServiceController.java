package com.lyl.study.springcloud.client;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HiServiceController {
    @Value("${server.port}")
    private String port;

    @GetMapping("/hi")
    public String home(@RequestParam String name) throws InterruptedException {
//        Thread.sleep(2000);
        return "hi " + name + ", i am from port: " + port;
    }
}