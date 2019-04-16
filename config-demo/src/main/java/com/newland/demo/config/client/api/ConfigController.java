package com.newland.demo.config.client.api;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by lcs on 2019/4/11.
 *
 * @author lcs
 */
@RestController
public class ConfigController {
    @Value("${hello-text}")
    private String helloText;

    @GetMapping("/hello")
    public String hello() {
        return helloText;
    }
}
