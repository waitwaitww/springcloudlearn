package com.feng.springcloud.pojo;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

import java.io.Serializable;//序列化（所有实体类必须序列化）

@Data
@NoArgsConstructor
@Accessors(chain = true) // 链式写法
public class Dept implements Serializable {

    private Long deptno;

    private String dname;

    private String db_source;

    public Dept(String dname) {
        this.dname = dname;
    }

}
