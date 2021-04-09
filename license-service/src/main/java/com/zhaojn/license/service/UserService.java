/*
 * Copyright (C), 2015-2021, zhaojn
 * FileName: UserService
 * Author:   zhaojn
 * Date:     2021/4/9 22:38
 * Description: 用户业务类
 * History:
 * 作者姓名          修改时间          版本号          描述
 * zhaojn           2021/4/9 22:38   1.0.0           初版
 */

package com.zhaojn.license.service;

import com.zhaojn.license.db.entry.UserEntity;

/**
 * 用户业务类<br>
 *
 * @author zhaojn
 * @create 2021/4/9
 * @since 1.0.0
 */
public interface UserService {

 /**
  * 根据登录账号取用户
  * @param userCode 登录账号
  * @return 用户信息
  */
  UserEntity getUserByUserCode(String userCode);
}
