package com.huayu.study.springStudy.biz.impl;

import com.huayu.study.springStudy.biz.IUserService;
import com.huayu.study.springStudy.core.IUserCoreService;
import com.huayu.study.springStudy.document.Action;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by zhaohuayu on 16/12/27.
 */
@Service("userService")
public class UserServiceImpl implements IUserService {

    @Autowired
    IUserCoreService userCoreService ;

    @Action(name="注解式拦截的sayHelloWorld操作")
    public void sayHelloWorld() {
        userCoreService.sayHelloWorld();
        System.out.println("hello World from service");
    }
}
