package com.tangyuan.spring.boot.helloworld;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * Created on 2019-06-24
 * @author fenghongyu
 */
@Component
public class HelloWorldServiceImpl implements HelloWorldService{

    @Autowired
    private HelloWorldProperties helloWorldProperties;

    /**
     * 打招呼方法
     *
     * @param name 人名，向谁打招呼使用
     * @return
     */
    @Override
    public String sayHello(String name) {
        return "Hello " + name + " " + helloWorldProperties.getMsg();
    }
}
