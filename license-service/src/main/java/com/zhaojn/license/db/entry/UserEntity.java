/*
 * Copyright (C), 2015-2021, zhaojn
 * FileName: TUserEntity
 * Author:   zhaojn
 * Date:     2021/4/9 22:24
 * Description:
 * History:
 * 作者姓名          修改时间          版本号          描述
 * zhaojn           2021/4/9 22:24   1.0.0           初版
 */

package com.zhaojn.license.db.entry;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Objects;

/**
 * <br>
 *
 * @author zhaojn
 * @create 2021/4/9
 * @since 1.0.0
 */
@Entity
@Table(name = "user", schema = "license", catalog = "")
public class UserEntity {

    private String id;
    private String userCode;
    private String name;
    @JsonIgnore
    private String password;
    private String email;
    private Timestamp createTime;
    private String createUser;
    private Timestamp updateTime;
    private String updateUser;

    @Id
    @Column(name = "id")
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    @Basic
    @Column(name = "user_code")
    public String getUserCode() {
        return userCode;
    }

    public void setUserCode(String userCode) {
        this.userCode = userCode;
    }

    @Basic
    @Column(name = "name")
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Basic
    @Column(name = "password")
    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Basic
    @Column(name = "email")
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Basic
    @Column(name = "create_time")
    public Timestamp getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Timestamp createTime) {
        this.createTime = createTime;
    }

    @Basic
    @Column(name = "create_user")
    public String getCreateUser() {
        return createUser;
    }

    public void setCreateUser(String createUser) {
        this.createUser = createUser;
    }

    @Basic
    @Column(name = "update_time")
    public Timestamp getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Timestamp updateTime) {
        this.updateTime = updateTime;
    }

    @Basic
    @Column(name = "update_user")
    public String getUpdateUser() {
        return updateUser;
    }

    public void setUpdateUser(String updateUser) {
        this.updateUser = updateUser;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        UserEntity that = (UserEntity) o;
        return Objects.equals(id, that.id)
                && Objects.equals(userCode, that.userCode)
                && Objects.equals(name, that.name)
                && Objects.equals(password, that.password)
                && Objects.equals(email, that.email)
                && Objects.equals(createTime, that.createTime)
                && Objects.equals(createUser, that.createUser)
                && Objects.equals(updateTime, that.updateTime)
                && Objects.equals(updateUser, that.updateUser);
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                id, userCode, name, password, email, createTime, createUser, updateTime, updateUser);
    }
}
