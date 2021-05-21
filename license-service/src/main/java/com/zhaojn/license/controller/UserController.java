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
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 用户控制器<br>
 *
 * @author zhaojn
 * @create 2021/4/9
 * @since 1.0.0
 */
@RequestMapping("/user")
@RestController
@Slf4j
public class UserController {
    @Autowired
    private UserService userService;

    @GetMapping("/{user_code}/")
    public ResponseEntity<ResponseEntityVo> getUserByCode(
            @PathVariable("user_code") String userCode) {
        String logId = MDC.get("requestId");
        UserEntity user = userService.getUserByUserCode(userCode);
        HttpStatus status = HttpStatus.OK;
        if (user == null) {
            status = HttpStatus.NOT_FOUND;
        }
        return new ResponseEntity<>(ResponseEntityVo.builder().result(user).build(), status);
    }
}
