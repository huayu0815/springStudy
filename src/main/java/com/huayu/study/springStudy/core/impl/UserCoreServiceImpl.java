package com.huayu.study.springStudy.core.impl;

import com.huayu.study.springStudy.core.IUserCoreService;
import org.springframework.stereotype.Service;

/**
 * Created by zhaohuayu on 16/12/27.
 */
@Service
public class UserCoreServiceImpl implements IUserCoreService {



    public void sayHelloWorld() {
        System.out.println("hello world from core");
    }
}
