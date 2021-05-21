/*
 * Copyright (C), 2015-2021, zhaojn
 * FileName: SessionConfig
 * Author:   zhaojn
 * Date:     2021/5/21 20:52
 * Description: Session配置
 * History:
 * 作者姓名          修改时间          版本号          描述
 * zhaojn           2021/5/21 20:52   1.0.0           初版
 */

package com.zhaojn.license.configration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.redis.connection.jedis.JedisConnectionFactory;
import org.springframework.session.data.redis.config.annotation.web.http.EnableRedisHttpSession;
import org.springframework.session.web.context.AbstractHttpSessionApplicationInitializer;

/**
 * Session配置<br>
 *
 * @author zhaojn
 * @create 2021/5/21
 * @since 1.0.0
 */
@Configuration
@EnableRedisHttpSession
public class SessionConfig extends AbstractHttpSessionApplicationInitializer {

  public JedisConnectionFactory connectionFactory() {
    return new JedisConnectionFactory();
  }
}
