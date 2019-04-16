package com.newland.demo.fegin.api;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient("compute-service")
//@FeignClient(value = "compute-service",fallback = FeginClientHystrix.class)
public interface FeginClient {

    @GetMapping("/add")
    int add(@RequestParam(value = "a") int a, @RequestParam(value = "b") int b);

}

