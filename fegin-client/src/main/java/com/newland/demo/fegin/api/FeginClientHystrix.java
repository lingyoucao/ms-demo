package com.newland.demo.fegin.api;

import org.springframework.stereotype.Component;

@Component
public class FeginClientHystrix implements FeginClient {

    @Override
    public int add(int a, int b) {
        return -9999;
    }
}