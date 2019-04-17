package com.newland.demo.serviceB.api;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

/**
 * Created by lcs on 2019/4/11.
 *
 * @author lcs
 */
@RestController
public class ServiceBController {

    @GetMapping("/hello")
    public String hello() {
        System.out.println("hello api B");
        return "hello api B [" + new Date().toString() + "]";
    }

    @GetMapping("/world")
    public String world() {
        System.out.println("world api B");
        return "world api B [" + new Date().toString() + "]";
    }
}
