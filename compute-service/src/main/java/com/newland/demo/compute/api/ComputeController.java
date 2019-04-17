package com.newland.demo.compute.api;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by lcs on 2019/4/16.
 *
 * @author lcs
 */

@RestController
public class ComputeController {

    @Value("${server.port}")
    private String port;

    @GetMapping("/add")
    public int add(@RequestParam("a") int a, @RequestParam("b") int b) {
        System.out.println("输出了，端口：" + port);
        return a + b;
    }
}
