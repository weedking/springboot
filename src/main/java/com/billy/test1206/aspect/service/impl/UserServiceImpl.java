package com.billy.test1206.aspect.service.impl;


import com.billy.test1206.pojo.User;
import com.billy.test1206.aspect.service.UserService;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Service
//@Controller
@Component
public class UserServiceImpl implements UserService {
    @Override
    public void printUser(User user){
        if (user == null){
            throw new RuntimeException("检查用户参数是否为空......");
        }
        System.out.print("id =" + user.getId());
        System.out.print("\tusername =" + user.getUserName());
        System.out.println("\tnote =" + user.getNote());
    }
}
