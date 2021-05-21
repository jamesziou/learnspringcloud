/*
 * Copyright (C), 2015-2021, zhaojn
 * FileName: FilterConfiguration
 * Author:   zhaojn
 * Date:     2021/5/8 20:26
 * Description: filter配置
 * History:
 * 作者姓名          修改时间          版本号          描述
 * zhaojn           2021/5/8 20:26   1.0.0           初版
 */

package com.zhaojn.config.configuration;

import com.zhaojn.config.filter.DecryptFilter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.Collections;

/**
 * filter配置<br>
 *
 * @author zhaojn
 * @create 2021/5/8
 * @since 1.0.0
 */
@Configuration
public class FilterConfiguration {

  @Bean
  @Autowired
  public FilterRegistrationBean<DecryptFilter> registerMyFilter(DecryptFilter filter) {
    FilterRegistrationBean<DecryptFilter> register = new FilterRegistrationBean<>();
    register.setFilter(filter);
    register.setOrder(5);
    register.setUrlPatterns(Collections.singleton("/decrypt/*"));
    return register;
  }
}
