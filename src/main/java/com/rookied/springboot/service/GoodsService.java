package com.rookied.springboot.service;

import com.rookied.springboot.entity.Goods;
import com.rookied.springboot.entity.PageBean;

/**
 * @author zhangqiang
 * @date 2020/5/22
 */
public interface GoodsService extends BaseService<Goods> {
    PageBean<Goods> findByPage(Goods goods,int pageCode,int pageSize);
}
