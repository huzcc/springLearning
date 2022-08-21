package org.example.service;

import org.example.service.iml.SomeServiceImpl;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author huzc
 */
public class AppMain {
    public static void main(String[] args) {

//        SomeService someService = new SomeServiceImpl();
//        someService.doSomething();

        String config = "beans.xml";
        ApplicationContext ctx = new ClassPathXmlApplicationContext(config);
        SomeService someService = (SomeService)ctx.getBean("someService");
        someService.doSomething();
    }

}
