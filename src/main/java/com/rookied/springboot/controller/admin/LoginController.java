package com.rookied.springboot.controller.admin;

import com.rookied.springboot.entity.Result;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

/**
 * @author zhangqiang
 * @date 2020/5/8
 */
@Controller
public class LoginController {
    final Environment environment;

    public LoginController(Environment environment) {
        this.environment = environment;
    }

    @RequestMapping("/login")
    @ResponseBody
    public Result login(@RequestParam("username") String username, @RequestParam("password") String password) {
        System.out.println("username:" + username + ", password:" + password);
        return new Result(true,"登录成功");
    }

    @RequestMapping("/blog")
    public String blog(){
        return environment.getProperty("url");
    }

    @GetMapping("/login")
    public String login(){
        return "home/login";
    }
}
