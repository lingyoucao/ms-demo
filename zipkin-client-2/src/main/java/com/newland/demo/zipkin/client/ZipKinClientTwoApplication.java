package com.newland.demo.zipkin.client;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

/**
 * Created by lcs on 2018/7/6.
 *
 * @author lcs
 */


@SpringBootApplication
public class ZipKinClientTwoApplication {

    public static void main(String[] args) {

        SpringApplication.run(ZipKinClientTwoApplication.class, args);
    }

    @Bean
    @LoadBalanced
    RestTemplate restTemplate() {
        return new RestTemplate();
    }

}
