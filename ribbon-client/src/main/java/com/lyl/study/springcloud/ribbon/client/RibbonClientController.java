package com.lyl.study.springcloud.ribbon.client;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping("/ribbon/client")
public class RibbonClientController {
    @Autowired
    private RestTemplate restTemplate;

    @GetMapping("/hi")
    @HystrixCommand
    public String hi(String name) {
        return restTemplate.getForObject("http://hi-service/hi?name=" + name, String.class);
    }
}