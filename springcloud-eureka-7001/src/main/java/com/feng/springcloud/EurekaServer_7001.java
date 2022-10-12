package com.feng.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer  //服务端的启动类，接收注册
public class EurekaServer_7001 {

    public static void main(String[] args) {
        SpringApplication.run(EurekaServer_7001.class,args);
    }
}
