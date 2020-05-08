package com.rookied.springboot.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author zhangqiang
 * @date 2020/5/8
 */
@RestController
public class LoginController {
    final Environment environment;

    public LoginController(Environment environment) {
        this.environment = environment;
    }

    @RequestMapping("/login")
    public String login(@RequestParam("username") String username, @RequestParam("password") String password) {
        System.out.println("username:" + username + ", password:" + password);
        return null;
    }

    @RequestMapping("/blog")
    public String blog(){
        return environment.getProperty("url");
    }
}
