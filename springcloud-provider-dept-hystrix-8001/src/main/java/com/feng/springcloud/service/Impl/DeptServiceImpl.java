package com.feng.springcloud.service.Impl;

import com.feng.springcloud.mapper.DeptMapper;
import com.feng.springcloud.pojo.Dept;
import com.feng.springcloud.service.DeptService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DeptServiceImpl implements DeptService {

    @Autowired
    private DeptMapper deptMapper;
    public int addDept(Dept dept) {
        return deptMapper.addDept(dept);
    }

    public List<Dept> queryAllDept() {
        return deptMapper.queryAllDept();
    }

    public Dept queryDept(Long deptno) {
        return deptMapper.queryDept(deptno);
    }
}
