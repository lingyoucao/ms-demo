package com.newland.demo.hystrix.api;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.TimeUnit;

/**
 * Created by lcs on 2019/4/16.
 *
 * @author lcs
 */
@RestController
public class HystrixController {

    private int count = 0;


    @GetMapping("hello")
    @HystrixCommand(fallbackMethod="fallbackHello")
    public String hello() {
        if(++count%2==0) {
            throw new RuntimeException("error");
        }
        return "hello";
    }

    public String fallbackHello() {
        return "hello fallback";
    }



}
