package com.lyl.study.springcloud.feign.client;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(value = "hi-service")
public interface FeignService {
    @GetMapping(value = "/hi")
    String sayHi(@RequestParam("name") String name);
}