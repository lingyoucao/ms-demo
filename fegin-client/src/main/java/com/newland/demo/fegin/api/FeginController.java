package com.newland.demo.fegin.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by lcs on 2019/4/16.
 *
 * @author lcs
 */
@RestController
public class FeginController {
    @Autowired
    FeginClient feginClient;

    @GetMapping("/add")
    public int add() {
        return feginClient.add(10, 20);
    }
}
