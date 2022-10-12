package com.feng.springcloud.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class configcontroller {

    @Value("${spring.application.name}")
    private String applicationName;

    @Value("${eureka.client.service-url.defaultZone}")
    private String eurekaServer;

    @Value("${server.port}")
    private String port;

    public String getconfig(){
        return "applicationName"+applicationName+"   eurekaServer:"+eurekaServer+"   port:"+port;
    }
}
