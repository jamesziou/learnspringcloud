/*
 Copyright (C), 2015-2021, zhaojn
 FileName: ConfigServerApplication
 Author:   zhaojn
 Date:     2021/4/5 21:00
 Description: 配置服务启动类
 History:
 作者姓名          修改时间          版本号          描述
 zhaojn           2021/4/5 21:00   1.0.0           初版
*/

package com.zhaojn.config;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.ApplicationPidFileWriter;
import org.springframework.boot.web.servlet.ServletComponentScan;
import org.springframework.cloud.config.server.EnableConfigServer;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * 配置服务启动类<br>
 * 在SpringBootApplication上使用@ServletComponentScan注解后，<br>
 * Servlet、Filter、Listener可以直接通过@WebServlet、@WebFilter 、@WebListener注解自动注册
 *
 * @author zhaojn
 * @create 2021/4/5
 * @since 1.0.0
 */
@ServletComponentScan
@EnableConfigServer
@SpringBootApplication
@EnableEurekaClient
public class ConfigServiceApplication {
  public static void main(String[] args) {
    SpringApplication application = new SpringApplication(ConfigServiceApplication.class);
    application.addListeners(new ApplicationPidFileWriter());
    application.run(args);
  }
}
