package com.feng.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
@EnableDiscoveryClient//服务发现(提供服务信息,info页面等)
public class DeptProver_8001 {

    public static void main(String[] args) {
        SpringApplication.run(DeptProver_8001.class,args);
    }
}
