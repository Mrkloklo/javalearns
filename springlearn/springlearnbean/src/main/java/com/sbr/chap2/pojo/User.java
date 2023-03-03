package com.sbr.chap2.pojo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;


//@Component三个衍生注解
//
//为了更好的进行分层，Spring可以使用其它三个注解，功能一样，目前使用哪一个功能都一样。
//
//@Controller：controller层
//@Service：service层
//@Repository：dao层
//  写上这些注解，就相当于将这个类交给Spring管理装配了！
@Component
// 相当于配置文件中 <bean id="user" class="当前注解的类"/>
@Scope("prototype")
//@scope
//
//singleton：默认的，Spring会采用单例模式创建这个对象。关闭工厂 ，所有的对象都会销毁。
//prototype：多例模式。关闭工厂 ，所有的对象不会销毁。内部的垃圾回收机制会回收
public class User {
    @Value("秦疆")
    // 相当于配置文件中 <property name="name" value="秦疆"/>
    public String name;

}

//XML与注解比较
//
//        XML可以适用任何场景 ，结构清晰，维护方便
//        注解不是自己提供的类使用不了，开发简单方便
//        xml与注解整合开发 ：推荐最佳实践
//
//        xml管理Bean
//        注解完成属性注入
//        使用过程中， 可以不用扫描，扫描是为了类上的注解
//<context:annotation-config/>
//        1
//        作用：
//
//        进行注解驱动注册，从而使注解生效
//
//        用于激活那些已经在spring容器里注册过的bean上面的注解，也就是显示的向Spring注册
//
//        如果不扫描包，就需要手动配置bean
//
//        如果不加注解驱动，则注入的值为null！
//
