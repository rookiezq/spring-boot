package com.rookied.springboot.mapper;

import com.rookied.springboot.entity.User;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * @author zhangqiang
 * @date 2020/5/9
 */
@Mapper
public interface UserMapper {
    List<User> findAll();
}
