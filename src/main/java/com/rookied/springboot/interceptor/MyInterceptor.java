package com.rookied.springboot.interceptor;

import com.rookied.springboot.entity.User;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import javax.servlet.http.HttpServletRequest;

/**
 * @author zhangqiang
 * @date 2020/5/9
 */
@Component
@Aspect
public class MyInterceptor {

    @Pointcut("within(com.rookied.springboot.controller..*) && !within(com.rookied.springboot.controller.admin.LoginController)")
    public void pointCut() {
    }

    @Around("pointCut()")
    public Object trackInfo(ProceedingJoinPoint joinPoint) throws Throwable {
        System.out.println("进入切点");
        ServletRequestAttributes attributes = (ServletRequestAttributes) RequestContextHolder.getRequestAttributes();
        HttpServletRequest request = attributes.getRequest();
        User user = (User) request.getSession().getAttribute("user");
        if (user == null){
            System.out.println("-----------用户未登录-----------");
            attributes.getResponse().sendRedirect("/login");
        }
        System.out.println("-----------用户已登录-----------");
        return joinPoint.proceed();
    }
}
