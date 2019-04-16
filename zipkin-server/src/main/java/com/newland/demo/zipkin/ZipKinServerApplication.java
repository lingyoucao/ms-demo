package com.newland.demo.zipkin;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import zipkin.server.EnableZipkinServer;

/**
 * Created by lcs on 2018/7/6.
 *
 * @author lcs
 */


@SpringBootApplication
@EnableZipkinServer
public class ZipKinServerApplication {

    public static void main(String[] args) {

        SpringApplication.run(ZipKinServerApplication.class, args);
    }
}
