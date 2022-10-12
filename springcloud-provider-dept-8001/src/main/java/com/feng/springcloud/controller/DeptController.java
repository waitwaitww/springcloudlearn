package com.feng.springcloud.controller;


import com.feng.springcloud.pojo.Dept;
import com.feng.springcloud.service.DeptService;
import com.feng.springcloud.service.Impl.DeptServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.*;

import java.util.List;

//提供RESTFUL服务
@RestController
@RequestMapping("/dept")
public class DeptController {

    @Autowired
    private DeptService deptService = new DeptServiceImpl();

    @Autowired
    private DiscoveryClient client;

    @PostMapping("/add")
    public int addDept(Dept dept){
        return deptService.addDept(dept);
    }

    @GetMapping("/get/{deptno}")
    public Dept getDept(@PathVariable("deptno") Long deptno){
        return deptService.queryDept(deptno);
    }

    @GetMapping("/getall")
    public List<Dept> addAllDept(){
        return deptService.queryAllDept();
    }

    @GetMapping("/discovery")
    public Object discovery(){
        //获取微服务列表清单
        List<String> services = client.getServices();
        System.out.println(services);

        List<ServiceInstance> instances = client.getInstances("springxloud-provider-8001");
        for (ServiceInstance instance : instances) {
            System.out.println(instance.getHost()+"\t"+
                    instance.getPort()+"\t"+
                    instance.getUri()+"\t"+
                    instance.getServiceId());
        }

        return this.client;
    }
}
