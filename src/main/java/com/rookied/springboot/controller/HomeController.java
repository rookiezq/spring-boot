package com.rookied.springboot.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @author zhangqiang
 * @date 2020/5/9
 */
@Controller
public class HomeController {

    @GetMapping(value = {"/", "/index"})
    public String index() {
        return "home/index";
    }

    @GetMapping(value = {"/", "/goods"})
    public String user() {
        return "site/goods";
    }

    @GetMapping(value = {"/", "/users"})
    public String users() {
        return "site/users";
    }
}
