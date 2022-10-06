package org.example;
import org.example.ba03.Student;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyTest03 {
    @Test
    public void myTest01(){
        String config = "ba03/applicationContext.xml";
        ApplicationContext ctx = new ClassPathXmlApplicationContext(config);
        org.example.ba03.Student student = (Student) ctx.getBean("myStudent");
        System.out.println(student);
    }
}
