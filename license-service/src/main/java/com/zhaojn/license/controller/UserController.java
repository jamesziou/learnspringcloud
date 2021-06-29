/*
 * Copyright (C), 2015-2021, zhaojn
 * FileName: UserController
 * Author:   zhaojn
 * Date:     2021/4/9 22:34
 * Description: 用户控制器
 * History:
 * 作者姓名          修改时间          版本号          描述
 * zhaojn           2021/4/9 22:34   1.0.0           初版
 */

package com.zhaojn.license.controller;

import com.zhaojn.license.db.entry.UserEntity;
import com.zhaojn.license.service.UserService;
import com.zhaojn.license.vo.ResponseEntityVo;
import lombok.extern.slf4j.Slf4j;
import org.slf4j.MDC;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpRequest;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.http.server.ServletServerHttpRequest;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;
import org.springframework.web.servlet.support.RequestContext;
import org.springframework.web.servlet.support.RequestContextUtils;

/**
 * 用户控制器<br>
 *
 * @author zhaojn
 * @create 2021/4/9
 * @since 1.0.0
 */
@RequestMapping(
    value = "/user",
    consumes = {"application/json;charset=UTF-8"})
@RestController
@Slf4j
public class UserController {
  @Autowired private UserService userService;

  @GetMapping("/{user_code}/")
  public ResponseEntity<ResponseEntityVo> getUserByCode(
      @PathVariable("user_code") String userCode) {
    ServletRequestAttributes attributes =
        (ServletRequestAttributes) RequestContextHolder.currentRequestAttributes();
    attributes.getRequest().getHeaderNames();
    String logId = MDC.get("requestId");
    UserEntity user = userService.getUserByUserCode(userCode);
    HttpStatus status = HttpStatus.OK;
    if (user == null) {
      status = HttpStatus.NOT_FOUND;
    }
    return new ResponseEntity<>(ResponseEntityVo.builder().result(user).build(), status);
  }

  @PostMapping(value = "/login")
  public void login() {}
}
