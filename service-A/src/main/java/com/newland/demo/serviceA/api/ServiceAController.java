package com.newland.demo.serviceA.api;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

/**
 * Created by lcs on 2019/4/11.
 *
 * @author lcs
 */
@RestController
public class ServiceAController {

    @GetMapping("/hello")
    public String hello() {
        return "hello api A [" + new Date().toString() + "]";
    }

    @GetMapping("/world")
    public String world() {
        return "world api A [" + new Date().toString() + "]";
    }
}
