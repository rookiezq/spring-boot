package com.rookied.springboot.controller.admin;

import com.rookied.springboot.entity.User;
import com.rookied.springboot.service.UserService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author zhangqiang
 * @date 2020/5/9
 */
@RestController
public class UserController {
    @Resource
    private UserService userService;

    @RequestMapping("/findAll")
    public List<User> findAll(){
        return userService.findAll();
    }

    @RequestMapping("/findById")
    public List<User> findById(Long id){
        return userService.findById(id);
    }
}
