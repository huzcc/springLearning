package org.example;

import org.example.service.SomeService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Date;

public class MyTest {

    @Test
    public void test(){
//       ApplicationContext 容器中对象的装配时机
//       ApplicationContext容器，会在容器对象=初始化的时候，将其中对象全部加载到内存中。
        String config = "beans.xml";
        ApplicationContext ctx = new ClassPathXmlApplicationContext(config);
        SomeService someService = (SomeService)ctx.getBean("someService");
//        someService.doSomething();
        Date data = (Date)ctx.getBean("data");
        System.out.println(data);
    }


}
