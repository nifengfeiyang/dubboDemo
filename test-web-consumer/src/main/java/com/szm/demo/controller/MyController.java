package com.szm.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import javax.annotation.Resource;
import com.szm.demo.service.UserService;

@Controller
public class MyController {

	@Resource(name="userService")
    private UserService userService;

    @RequestMapping("/hello/test/world")
    public void sayHello(){
        System.out.println(userService.sayHello()+"**************************");
    }
}
