package com.huayu.study.springStudy.biz;

import com.huayu.study.springStudy.document.Action;

/**
 * Created by zhaohuayu on 16/12/27.
 */
public interface IUserService {

    @Action(name="注解式拦截的sayHelloWorld操作")
    void sayHelloWorld();
}
