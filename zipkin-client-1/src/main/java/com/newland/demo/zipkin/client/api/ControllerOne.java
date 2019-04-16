package com.newland.demo.zipkin.client.api;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.concurrent.TimeUnit;

/**
 * Created by lcs on 2019/4/11.
 *
 * @author lcs
 */
@RestController
public class ControllerOne {

    private final Logger logger = LoggerFactory.getLogger(getClass());

    @Autowired
    private RestTemplate restTemplate;

    @RequestMapping("/service1")
    public String service1() {
        logger.info("====call service1===");
        try {
            TimeUnit.SECONDS.sleep(1);
        } catch (InterruptedException e) {
        }
        return restTemplate.getForObject("http://zipkin-client-2/service2", String.class);
    }

}
