package com.it.entity;

import java.util.Date;

/**
 * 用户实体类
 */
public class User {
    //用户id
    private Integer id;
    //创建时间
    private Date create_time;
    //创建者
    private Integer create_by;
    //更新时间
    private Date update_time;
    //更新者
    private Integer update_by;
    //是否删除 0 没有删除 1 已删除
    private Integer is_deleted;
    //昵称
    private String nickname;
    //用户名
    private String username;
    //密码
    private String password;
    //性别
    private Integer sex;
    //邮箱
    private String email;
    //手机号
    private String phone_number;
    //系统角色编号  1-管理员  2-健康管家
    private Integer role_id;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Date getCreate_time() {
        return create_time;
    }

    public void setCreate_time(Date create_time) {
        this.create_time = create_time;
    }

    public Integer getCreate_by() {
        return create_by;
    }

    public void setCreate_by(Integer create_by) {
        this.create_by = create_by;
    }

    public Date getUpdate_time() {
        return update_time;
    }

    public void setUpdate_time(Date update_time) {
        this.update_time = update_time;
    }

    public Integer getUpdate_by() {
        return update_by;
    }

    public void setUpdate_by(Integer update_by) {
        this.update_by = update_by;
    }

    public Integer getIs_deleted() {
        return is_deleted;
    }

    public void setIs_deleted(Integer is_deleted) {
        this.is_deleted = is_deleted;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Integer getSex() {
        return sex;
    }

    public void setSex(Integer sex) {
        this.sex = sex;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone_number() {
        return phone_number;
    }

    public void setPhone_number(String phone_number) {
        this.phone_number = phone_number;
    }

    public Integer getRole_id() {
        return role_id;
    }

    public void setRole_id(Integer role_id) {
        this.role_id = role_id;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", create_time=" + create_time +
                ", create_by=" + create_by +
                ", update_time=" + update_time +
                ", update_by=" + update_by +
                ", is_deleted=" + is_deleted +
                ", nickname='" + nickname + '\'' +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", sex=" + sex +
                ", email='" + email + '\'' +
                ", phone_number='" + phone_number + '\'' +
                ", role_id=" + role_id +
                '}';
    }
}
