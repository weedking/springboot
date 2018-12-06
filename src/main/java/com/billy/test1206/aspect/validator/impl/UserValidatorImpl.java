package com.billy.test1206.aspect.validator.impl;

import com.billy.test1206.aspect.validator.UserValidator;
import com.billy.test1206.pojo.User;

public class UserValidatorImpl implements UserValidator {
    @Override
    public boolean validate(User user){
        System.out.println("引用新的接口："+UserValidator.class.getSimpleName());
        return user != null;
    }
}
