/*
 * Copyright (C), 2015-2021, zhaojn
 * FileName: MyFilter
 * Author:   zhaojn
 * Date:     2021/5/8 20:16
 * Description: filter
 * History:
 * 作者姓名          修改时间          版本号          描述
 * zhaojn           2021/5/8 20:16   1.0.0           初版
 */

package com.zhaojn.config.filter;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

import javax.servlet.*;
import java.io.IOException;

/**
 * filter<br>
 *
 * @author zhaojn
 * @create 2021/5/8
 * @since 1.0.0
 */
@Slf4j
@Component
public class DecryptFilter implements Filter {

  @Override
  public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
      throws IOException, ServletException {
    log.info("------>DecryptFilter<------");
    chain.doFilter(request, response);
  }
}
