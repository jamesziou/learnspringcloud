/*
 * Copyright (C), 2015-2021, zhaojn
 * FileName: Application
 * Author:   zhaojn
 * Date:     2021/5/27 20:11
 * Description: 启动类
 * History:
 * 作者姓名          修改时间          版本号          描述
 * zhaojn           2021/5/27 20:11   1.0.0           初版
 */

package com.zhaojn.eureka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.ApplicationPidFileWriter;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * 启动类<br>
 *
 * @author zhaojn
 * @create 2021/5/27
 * @since 1.0.0
 */
@SpringBootApplication
@EnableEurekaServer
public class EurekaServerApplication {

  public static void main(String[] args) {
    SpringApplication application = new SpringApplication(EurekaServerApplication.class);
    application.addListeners(new ApplicationPidFileWriter());
    application.run(args);
  }
}
