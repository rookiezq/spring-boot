package com.rookied.springboot.entity;

/**
 * @author zhangqiang
 * @date 2020/5/9
 */
public class User {
    private Long id; //编号
    private String username; //用户名
    private String password; //密码

    public User() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
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
}
