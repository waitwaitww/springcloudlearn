package com.feng.springcloud.controller;

import com.feng.springcloud.pojo.Dept;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@RestController
@RequestMapping("/consumer/dept")
public class DeptConsumerController {


    @Autowired
    private RestTemplate restTemplate;

    //使用ribbon时，该值应该为变量即服务id，通过服务名访问
//    private static final String REST_URL_PREFIX = "http://localhost:8001/";
    private static final String REST_URL_PREFIX = "http://springcloud-provider-dept-8001/";

    @RequestMapping("/get/{deptno}")
    public Dept getDept(@PathVariable("deptno") Long deptno){
        return restTemplate.getForObject(REST_URL_PREFIX+"dept/get/"+deptno,Dept.class);
    }

    @RequestMapping("/getall")
    public List<Dept> getAll(){
        return restTemplate.getForObject(REST_URL_PREFIX+"dept/getall",List.class);
    }

    @RequestMapping("/add")
    public int addDept(Dept dept){
        return restTemplate.postForObject(REST_URL_PREFIX+"dept/add",dept,int.class);
    }
}
