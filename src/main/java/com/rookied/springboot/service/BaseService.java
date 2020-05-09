package com.rookied.springboot.service;

import java.util.List;

/**
 * @author zhangqiang
 * @date 2020/5/9
 */
public interface BaseService<T> {
    /**
     * 查询所有
     * @return List<T>
     */
    List<T> findAll();

    /**
     * 根据id查询
     * @param id 值
     * @return List<T>
     */
    List<T> findById(Long id);

    /**
     * 添加
     * @param t 某个实体
     */
    void create(T t);

    /**
     * 删除多个
     * @param id 多个id值
     */
    void delete(Long... id);

    /**
     * 更新
     * @param id 值
     */
    void update(Long id);
}
