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
import org.springframework.cloud.config.server.EnableConfigServer;

/**
 * 配置服务启动类<br>
 *
 * @author zhaojn
 * @create 2021/4/5
 * @since 1.0.0
 */
@EnableConfigServer
@SpringBootApplication
public class ConfigServiceApplication {
  public static void main(String[] args) {
    SpringApplication.run(ConfigServiceApplication.class, args);
  }
}
