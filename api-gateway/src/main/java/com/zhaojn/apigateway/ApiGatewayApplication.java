/*
 * Copyright (C), 2015-2021, zhaojn
 * FileName: ApiGatewayApplication
 * Author:   zhaojn
 * Date:     2021/5/29 9:34
 * Description: 网关启动类
 * History:
 * 作者姓名          修改时间          版本号          描述
 * zhaojn           2021/5/29 9:34   1.0.0           初版
 */

package com.zhaojn.apigateway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.ApplicationPidFileWriter;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * 网关启动类<br>
 *
 * @author zhaojn
 * @create 2021/5/29
 * @since 1.0.0
 */
@SpringBootApplication
@EnableEurekaClient
@RefreshScope
public class ApiGatewayApplication {

    public static void main(String[] args) {
        SpringApplication application = new SpringApplication(ApiGatewayApplication.class);
        application.addListeners(new ApplicationPidFileWriter());
        application.run(args);
    }
}
