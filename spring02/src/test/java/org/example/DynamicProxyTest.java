package org.example;

import org.example.fangdong.FangService;
import org.example.fangdong.FangServiceImpl;
import org.example.service.UserService;
import org.example.service.UserServiceImpl;
import org.junit.Test;
import org.springframework.cglib.proxy.Enhancer;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class DynamicProxyTest {
//通过接口，动态加载
    @Test
    public void testJDK(){
        final FangService fangService = new FangServiceImpl();

        InvocationHandler invocationHandler = new InvocationHandler() {

            @Override
            public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                //辅助功能、额外功能
                System.out.println("发布租房信息");
                System.out.println("带租客看房");

                fangService.zuFang();
                return null;
            }
        };

        FangService proxy = (FangService)Proxy.newProxyInstance(DynamicProxyTest.class.getClassLoader(),
                fangService.getClass().getInterfaces(), invocationHandler);
        proxy.zuFang();
    }

    //通过继承动态加载
    @Test
    public void testCGLIB(){
        final FangService fangService = new FangServiceImpl();
        Enhancer enhancer = new Enhancer();
        enhancer.setSuperclass(FangServiceImpl.class);
        enhancer.setCallback(new org.springframework.cglib.proxy.InvocationHandler() {

            @Override
            public Object invoke(Object o, Method method, Object[] objects) throws Throwable {
                //辅助功能、额外功能
                System.out.println("发布租房信息");
                System.out.println("带租客看房");

                fangService.zuFang();
                return null;
            }
        });

        FangServiceImpl proxy = (FangServiceImpl)enhancer.create();
        proxy.zuFang();
    }

    @Test
    public void testSpringAop(){
        String config = "./spring-context.xml";
        ApplicationContext ctx = new ClassPathXmlApplicationContext(config);
        UserService userService = (UserService)ctx.getBean("userService");
        userService.queryUsers();
    }
}
