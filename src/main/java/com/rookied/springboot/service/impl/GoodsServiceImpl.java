package com.rookied.springboot.service.impl;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.rookied.springboot.entity.Goods;
import com.rookied.springboot.entity.PageBean;
import com.rookied.springboot.mapper.GoodsMapper;
import com.rookied.springboot.service.GoodsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author zhangqiang
 * @date 2020/5/22
 */
@Service
public class GoodsServiceImpl implements GoodsService {
    @Autowired
    GoodsMapper goodsMapper;

    @Override
    public PageBean<Goods> findByPage(Goods goods, int pageCode, int pageSize) {
        PageHelper.startPage(pageCode,pageSize);
        Page<Goods> page = goodsMapper.findByPage();
        return new PageBean<>(page.getTotal(),page.getResult());
    }

    /**
     * 查询所有
     *
     * @return List<T>
     */
    @Override
    public List<Goods> findAll() {
        return null;
    }

    /**
     * 根据id查询
     *
     * @param id 值
     * @return List<T>
     */
    @Override
    public List<Goods> findById(Long id) {
        return null;
    }

    /**
     * 添加
     *
     * @param goods 某个实体
     */
    @Override
    public void create(Goods goods) {

    }

    /**
     * 删除多个
     *
     * @param ids
     */
    @Override
    public void delete(Long... ids) {

    }

    /**
     * 更新
     *
     * @param id 值
     */
    @Override
    public void update(Long id) {

    }
}
