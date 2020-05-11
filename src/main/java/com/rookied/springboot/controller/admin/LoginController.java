package com.rookied.springboot.controller.admin;

import com.rookied.springboot.entity.Result;
import com.rookied.springboot.entity.User;
import com.rookied.springboot.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;


/**
 * @author zhangqiang
 * @date 2020/5/8
 */
@Controller
public class LoginController {
    @Autowired
    UserService userService;

    @RequestMapping("/login")
    @ResponseBody
    public Result login(@RequestParam("username") String username, @RequestParam("password") String password) {
        System.out.println("username:" + username + ", password:" + password);
        User user = userService.findByName(username);
        if (user != null) {
            ServletRequestAttributes attributes = (ServletRequestAttributes) RequestContextHolder.getRequestAttributes();
            //在session中添加user
            attributes.getRequest().getSession().setAttribute("user",user);
            return new Result(true, user.getUsername());
        }
        return new Result(false, "登录失败");
    }


    @GetMapping("/login")
    public String login() {
        return "home/login";
    }
}
