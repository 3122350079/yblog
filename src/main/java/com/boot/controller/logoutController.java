package com.boot.controller;

import io.swagger.annotations.Api;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
/**
 * @author 游政杰
 * 2021/5/20
 */
@Controller
@Api("注销控制器")
public class logoutController {


    @RequestMapping(path = "/logout")
    public void logout() {
        System.out.println("用户退出了");
    }


}
