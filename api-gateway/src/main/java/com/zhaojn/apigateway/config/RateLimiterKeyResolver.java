 /*
  * Copyright (C), 2015-2021, zhaojn
  * FileName: RateLimiterKeyResolver
  * Author:   zhaojn
  * Date:     2021/5/29 22:55
  * Description: 限流key
  * History:
  * 作者姓名          修改时间          版本号          描述
  * zhaojn           2021/5/29 22:55   1.0.0           初版
  */

 package com.zhaojn.apigateway.config;

 import org.springframework.cloud.gateway.filter.ratelimit.KeyResolver;
 import org.springframework.context.annotation.Bean;
 import org.springframework.context.annotation.Configuration;
 import reactor.core.publisher.Mono;

 import java.net.InetSocketAddress;
 import java.util.Optional;

 /**
  * 限流key<br>
  *
  * @author zhaojn
  * @create 2021/5/29
  * @since 1.0.0
  */
 @Configuration
 public class RateLimiterKeyResolver {
     @Bean
     public KeyResolver ipKeyResolver() {
         return exchange ->
                 Optional.ofNullable(exchange.getRequest().getRemoteAddress()).map((ip) -> Mono.just(ip.getHostName())).
                         orElseGet(() -> Mono.just(exchange.getRequest().getPath().value()));

     }
 }