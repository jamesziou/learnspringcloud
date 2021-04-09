/*
 * Copyright (C), 2015-2021, zhaojn
 * FileName: TUserEntiryrepository
 * Author:   zhaojn
 * Date:     2021/4/9 22:29
 * Description: user查询接口
 * History:
 * 作者姓名          修改时间          版本号          描述
 * zhaojn           2021/4/9 22:29   1.0.0           初版
 */

package com.zhaojn.license.db.repository;

import com.zhaojn.license.db.entry.UserEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

/**
 * user查询接口<br>
 *
 * @author zhaojn
 * @create 2021/4/9
 * @since 1.0.0
 */
@Repository
public interface UserEntityRepository extends CrudRepository<UserEntity, String> {

  /**
   * 根据登录账号查用户信息
   *
   * @param userCode 登录账号
   * @return 用户信息
   */
  public UserEntity getUserByUserCode(String userCode);
}
