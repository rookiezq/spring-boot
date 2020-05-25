package com.rookied.springboot.service.impl;

import com.rookied.springboot.entity.User;
import com.rookied.springboot.mapper.UserMapper;
import com.rookied.springboot.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author zhangqiang
 * @date 2020/5/9
 */
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;
    /**
     * 查询所有
     *
     * @return List<T>
     */
    @Override
    public List<User> findAll() {
        return userMapper.findAll();
    }

    /**
     * 根据id查询
     *
     * @param id 值
     * @return List<T>
     */
    @Override
    public List<User> findById(Long id) {
        return userMapper.findById(id);
    }

    /**
     * 添加
     *
     * @param user 某个实体
     */
    @Override
    public void create(User user) {

    }

    /**
     * 删除多个
     *
     * @param ids 多个id值
     */
    @Override
    public void delete(Long... ids) {
        for (Long id : ids) {
            userMapper.delete(id);
        }
    }

    /**
     * 更新
     *
     * @param id 值
     */
    @Override
    public void update(Long id) {

    }

    @Override
    public User findByName(String username) {
        return userMapper.findByName(username);
    }
}
