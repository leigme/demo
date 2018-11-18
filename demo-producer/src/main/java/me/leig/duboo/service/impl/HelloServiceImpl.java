package me.leig.duboo.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import me.leig.dubbo.service.HelloService;

@Service(version = "${demo.service.version}")
public class HelloServiceImpl implements HelloService {

    @Override
    public String sayHello(String name) {
        return "Hello, " + name + "! from Maven + Spring Boot + Dubbo";
    }

}
