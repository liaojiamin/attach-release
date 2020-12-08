package com.ljm.attach.demo.service.impl;

import com.ljm.attach.demo.service.UserService;
import org.springframework.stereotype.Service;

/**
 * @author liaojiamin
 * @Date:Created in 20:54 2020/12/7
 */
@Service
public class UserServiceImpl implements UserService {
    @Override
    public String getById(Long userId) {
        getOne(userId, true);
        getTwo(userId, true, 3000);
        return userId.toString();
    }

    public void getOne(Long userId, boolean isUser){
        System.out.println("is MyUserId: "+ userId);
        System.out.println("isUser: "+ isUser);
    }

    public void getTwo(Long userId, Boolean isUser, Integer sleepTimes){
        System.out.println(userId);
    }
}
