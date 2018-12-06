package com.billy.test1206.aspect.controller;


import com.billy.test1206.aspect.service.UserService;
import com.billy.test1206.aspect.validator.UserValidator;
import com.billy.test1206.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;


@RestController
//@Controller
@RequestMapping(value = "/user",method = RequestMethod.GET,produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
public class UserController {
    // 注入用户服务
    @Autowired
    private UserService userService = null;
   // private UserService userService = null;

    // 定义请求
    @RequestMapping(value = "/print",method = RequestMethod.GET,produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    @ResponseBody
    public User printUser(Long id, String userName, String note) {
        User user = new User();
        user.setId(id);
        user.setUserName(userName);
        user.setNote(note);
        userService.printUser(user);
        return user;
//        return "123";
    }

    @RequestMapping("/tt")
    public String getHello(){

        return "123";
    }

    @RequestMapping("/vp")
    @ResponseBody
    public User validateAndPrint(Long id,String userName,String note){
        User user = new User();
        user.setId(id);
        user.setUserName(userName);
        user.setNote(note);
        // 强制转换
        UserValidator userValidator = (UserValidator) userService;
        // 验证用户是否为空
        if (userValidator.validate(user)) {
            userService.printUser(user);
        }
        return user;
    }

}
