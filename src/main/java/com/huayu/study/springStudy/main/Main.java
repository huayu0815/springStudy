package com.huayu.study.springStudy.main;

import com.huayu.study.springStudy.biz.IUserService;
import com.huayu.study.springStudy.config.ConfigMain;
import com.huayu.study.springStudy.core.IUserCoreService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

/**
 * Created by zhaohuayu on 16/12/27.
 */
public class Main {

    /**
     * 经过实践,如果没有加入AOP,spring仅仅通过反射生成对象并放到context中(IOC),getBean的时候,类型为
     * 接口或实现类均可。如果任意方法作为切点,则会利用动态代理生成类的代理类。注意:如果委托类没有实现接口,
     * 则利用cglib生成委托类的子类作为代理类,Method.getAnnotation可以获取方法上对应的annotation对象。
     * 如果实现了接口,则默认使用jdkProxy生成实现接口的代理类,getBean的时候,获取的对象为接口类型,不再是
     * 实现类型(强转为UserServiceImpl会报错),如果注解加到接口方法上,Method.getAnnotation可以获取方
     * 法上对应的annotation对象,如果仅仅加到实现类的方法上,Method.getAnnotation无法获取annotation对象
     * @param args
     */
    public static void main(String[] args) {
        ApplicationContext applicationContext =new FileSystemXmlApplicationContext("");


        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ConfigMain.class) ;
        //按类型获取
        //IUserService userService = context.getBean(IUserService.class) ;
        IUserService userService = (IUserService) context.getBean("userService") ;
        userService.sayHelloWorld();
    }
}
