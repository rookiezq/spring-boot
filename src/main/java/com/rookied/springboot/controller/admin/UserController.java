package com.rookied.springboot.controller.admin;

import com.rookied.springboot.entity.User;
import com.rookied.springboot.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author zhangqiang
 * @date 2020/5/9
 */
@RestController
public class UserController {
    @Autowired
    private UserService userService;

    @RequestMapping("/findAll")
    public List<User> findAll(){
        return userService.findAll();
    }

    @RequestMapping("/findById")
    public List<User> findById(Long id){
        return userService.findById(id);
    }

    @RequestMapping("/addById")
    public List<User> add(Long id){
        return userService.findById(id);
    }
}
