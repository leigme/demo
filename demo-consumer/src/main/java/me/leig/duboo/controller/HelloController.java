package me.leig.duboo.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import me.leig.dubbo.service.HelloService;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @Reference(version = "${demo.service.version}")
    private HelloService helloService;

    @RequestMapping("/sayHello/{name}")
    public String sayHello(@PathVariable("name") String name) {
        return helloService.sayHello(name);
    }
}
