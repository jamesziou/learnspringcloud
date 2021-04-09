/*
 * Copyright (C), 2015-2021, zhaojn
 * FileName: Applications
 * Author:   zhaojn
 * Date:     2021/4/9 19:31
 * Description: 鉴权启动类
 * History:
 * 作者姓名          修改时间          版本号          描述
 * zhaojn           2021/4/9 19:31   1.0.0           初版
 */

package com.zhaojn.license;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

/**
 * 鉴权启动类<br>
 *
 * @author zhaojn
 * @create 2021/4/9
 * @since 1.0.0
 */
@SpringBootApplication
@EnableJpaRepositories(basePackages = "com.zhaojn.license.db.repository")
public class LicenseServiceApplications {

  public static void main(String[] args) {
    SpringApplication.run(LicenseServiceApplications.class, args);
  }
}
