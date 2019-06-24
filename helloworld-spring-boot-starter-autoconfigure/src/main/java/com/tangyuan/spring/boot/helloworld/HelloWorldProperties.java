package com.tangyuan.spring.boot.helloworld;

import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * Created on 2019-06-24
 * @author fenghongyu
 */
@ConfigurationProperties(prefix = "hello")
public class HelloWorldProperties {
    /**
     * 打招呼的内容，默认为“World!”
     */
    private String msg = "World!";

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }
}
