package com.huayu.study.springStudy.config;

import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

/**
 * Created by zhaohuayu on 16/12/27.
 */
@Configurable
@ComponentScan("com.huayu.study.springStudy")
@EnableAspectJAutoProxy
public class ConfigMain {
}
