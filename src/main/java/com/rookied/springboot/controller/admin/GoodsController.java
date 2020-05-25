package com.rookied.springboot.controller.admin;

import com.rookied.springboot.entity.Goods;
import com.rookied.springboot.entity.PageBean;
import com.rookied.springboot.service.GoodsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author zhangqiang
 * @date 2020/5/22
 */
@RestController
@CrossOrigin
@RequestMapping("/goods")
public class GoodsController {
    @Autowired
    GoodsService goodsService;

    @RequestMapping("/findByPage")
    public PageBean<Goods> findByPage(Goods goods,
                                      @RequestParam(value = "pageCode", required = false) int pageCode,
                                      @RequestParam(value = "pageSize", required = false) int pageSize) {
        System.out.println(pageCode+"--------"+pageSize);
        return goodsService.findByPage(goods, pageCode, pageSize);

    }
}
