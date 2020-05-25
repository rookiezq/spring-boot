package com.rookied.springboot.mapper;

import com.github.pagehelper.Page;
import com.rookied.springboot.entity.Goods;
import org.apache.ibatis.annotations.Mapper;


import java.util.List;

/**
 * @author zhangqiang
 * @date 2020/5/22
 */
@Mapper
public interface GoodsMapper {
    Page<Goods> findByPage();
}
