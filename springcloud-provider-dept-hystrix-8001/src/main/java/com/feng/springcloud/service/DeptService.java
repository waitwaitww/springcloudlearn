package com.feng.springcloud.service;

import com.feng.springcloud.pojo.Dept;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface DeptService {
    public int addDept(Dept dept);

    public List<Dept> queryAllDept();

    public Dept queryDept(Long deptno);
}
