package com.tangyuan.spring.boot.helloworld;

/**
 * Created on 2019-06-24
 * @author fenghongyu
 */
public interface HelloWorldService {
    /**
     * 打招呼方法
     * @param name 人名，向谁打招呼使用
     * @return
     */
    String sayHello(String name);
}
