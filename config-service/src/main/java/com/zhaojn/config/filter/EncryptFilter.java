/*
 * Copyright (C), 2015-2021, zhaojn
 * FileName: EncryptFilter
 * Author:   zhaojn
 * Date:     2021/5/8 20:36
 * Description: filter测试
 * History:
 * 作者姓名          修改时间          版本号          描述
 * zhaojn           2021/5/8 20:36   1.0.0           初版
 */

package com.zhaojn.config.filter;

import lombok.extern.slf4j.Slf4j;
import org.springframework.core.annotation.Order;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import java.io.IOException;

/**
 * filter测试<br>
 * 在SpringBootApplication上使用@ServletComponentScan注解后，Servlet、Filter、Listener可以直接通过@WebServlet、@WebFilter、@WebListener注解自动注册
 *
 * @author zhaojn
 * @create 2021/5/8
 * @since 1.0.0
 */
@Slf4j
@Order(3)
@WebFilter(urlPatterns = "/encrypt/*")
public class EncryptFilter implements Filter {

  @Override
  public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
      throws IOException, ServletException {
    log.info("------>EncryptFilter<------");
    chain.doFilter(request, response);
  }
}
