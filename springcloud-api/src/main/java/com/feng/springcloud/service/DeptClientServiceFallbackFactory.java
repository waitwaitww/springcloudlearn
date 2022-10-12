package com.feng.springcloud.service;

import org.springframework.cloud.openfeign.FallbackFactory;

public class DeptClientServiceFallbackFactory implements FallbackFactory {
    public Object create(Throwable cause) {
        return null;
    }
}
