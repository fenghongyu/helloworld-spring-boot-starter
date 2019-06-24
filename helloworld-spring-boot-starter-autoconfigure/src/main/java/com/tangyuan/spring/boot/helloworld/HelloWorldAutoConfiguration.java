package com.tangyuan.spring.boot.helloworld;

import org.springframework.boot.autoconfigure.condition.ConditionalOnWebApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

/**
 * Created on 2019-06-24
 * @author fenghongyu
 */
//定义为配置类
@Configuration
//在web条件下成立
@ConditionalOnWebApplication
//启用HelloWorldProperties配置功能，并加入到IOC容器中
@EnableConfigurationProperties({HelloWorldProperties.class})
//导入HelloWorldService组件
@Import(HelloWorldServiceImpl.class)
public class HelloWorldAutoConfiguration {
}
