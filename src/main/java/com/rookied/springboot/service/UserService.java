package com.rookied.springboot.service;

import com.rookied.springboot.entity.User;

/**
 * @author zhangqiang
 * @date 2020/5/9
 */
public interface UserService extends BaseService<User> {
    User findByName(String username);
}
