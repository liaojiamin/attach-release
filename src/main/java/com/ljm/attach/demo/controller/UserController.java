package com.ljm.attach.demo.controller;

import com.ljm.attach.demo.response.User;
import com.ljm.attach.demo.service.UserService;
import com.ljm.attach.demo.visualvm.Calculator;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.Random;

/**
 * @author liaojiamin
 * @Date:Created in 20:50 2020/12/7
 */
@RestController
@RequestMapping("/user")
public class UserController {
    @Resource
    private UserService userService;

    @RequestMapping("/getById")
    public String getById(@RequestParam("userId") Long userId) {
        return userService.getById(userId);
    }

    @RequestMapping("arg1")
    public String arg1(@RequestParam("name") String name) {
        Calculator calculator = new Calculator();
        Random random = new Random();
        Integer calculatorResult = calculator.add(random.nextInt(50), random.nextInt(50));
        if(calculatorResult > 50){
            return String.valueOf(calculatorResult);
        }
        System.out.println(calculatorResult);
        return String.valueOf(calculatorResult);
    }

    @RequestMapping("/constructor")
    public User constructor(User user) {
        return user;
    }

    @RequestMapping("/same1")
    public String same(@RequestParam("name") String name) {
        return "hello: " + name;
    }

    @RequestMapping("/same2")
    public User same(@RequestParam("id") int id,
                     @RequestParam("name") String name) {
        return new User(id, name);
    }

    @RequestMapping("/exception")
    public String exception() {
        try {
            System.out.println("exception start");
            System.out.println(1 / 0);
            System.out.println("exception end");
        } catch (Exception e) {
        }
        return "success";
    }
}
