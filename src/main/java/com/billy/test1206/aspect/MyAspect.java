package com.billy.test1206.aspect;

//import com.user.app.aspect.validator.UserValidator;
//import com.user.app.aspect.validator.impl.UserValidatorImpl;
//import com.user.app.pojo.User;

import com.billy.test1206.aspect.validator.impl.UserValidatorImpl;
import com.billy.test1206.aspect.validator.UserValidator;
import com.billy.test1206.pojo.User;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;

@Aspect
public class MyAspect {
    @DeclareParents(value = "com.billy.test1206.aspect.service.impl.UserServiceImpl+",defaultImpl = UserValidatorImpl.class)
    public UserValidator userValidator;

    @Pointcut("execution(* com.billy.test1206.aspect.service.impl.UserServiceImpl.printUser(..))")
    public void pointCut(){

    }

    @Before("pointCut()")
    public void before() {
        System.out.println("前置通知...");
    }

    @Before("pointCut() && args(user)")
    public void beforeParam( User user) {
        System.out.println("before ......");
    }

    @After("pointCut()")
    public void after() {
        System.out.println("后置通知...");
    }

    @AfterReturning("pointCut()")
    public void afterReturn(){
        System.out.println("事后返回通知...");
    }

    @AfterThrowing("pointCut()")
    public void afterThrowing() {
        System.out.println("异常通知...");
    }

    @Around("pointCut()")
    public void around(ProceedingJoinPoint jp) throws Throwable{
        System.out.println("环绕之前...");
        jp.proceed();
        System.out.println("环绕之后...");
    }

}

