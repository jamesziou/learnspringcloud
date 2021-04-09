/*
 * Copyright (C), 2015-2021, zhaojn
 * FileName: UserServiceIImpl
 * Author:   zhaojn
 * Date:     2021/4/9 23:34
 * Description: 用户实现类
 * History:
 * 作者姓名          修改时间          版本号          描述
 * zhaojn           2021/4/9 23:34   1.0.0           初版
 */

package com.zhaojn.license.service.impl;

import com.zhaojn.license.db.entry.UserEntity;
import com.zhaojn.license.db.repository.UserEntityRepository;
import com.zhaojn.license.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * 用户实现类<br>
 *
 * @author zhaojn
 * @create 2021/4/9
 * @since 1.0.0
 */
@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserEntityRepository userEntityRepository;

    @Override
    public UserEntity getUserByUserCode(String userCode) {
        return userEntityRepository.getUserByUserCode(userCode);
    }
}
