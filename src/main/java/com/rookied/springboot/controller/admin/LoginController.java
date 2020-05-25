package com.rookied.springboot.controller.admin;

import com.rookied.springboot.entity.Result;
import com.rookied.springboot.entity.User;
import com.rookied.springboot.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;


/**
 * @author zhangqiang
 * @date 2020/5/8
 */
@RestController
@CrossOrigin
public class LoginController {
    @Autowired
    UserService userService;

    @RequestMapping(value = "/login",method = RequestMethod.POST)
//    @ResponseBody
    public String login(@RequestParam(value = "username", required = false) String username, @RequestParam(value = "password", required = false) String password) {
//    public String login(@RequestBody User user) {
        System.out.println("username:" + username + ", password:" + password);
        User user = userService.findByName(username);

        if (user != null && password.equals(user.getPassword())) {
            ServletRequestAttributes attributes = (ServletRequestAttributes) RequestContextHolder.getRequestAttributes();
            //在session中添加user
            attributes.getRequest().getSession().setAttribute("user", user);
//            return new Result(true, user.getUsername());
            return "index";
        }
//        return new Result(false, "登录失败");
        return "login";
    }


    @GetMapping("/login")
    public String login() {
        return "home/login";
    }
}
