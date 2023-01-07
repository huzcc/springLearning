package org.example;

import com.mysql.jdbc.Connection;
import org.example.dao.UserDao;
import org.example.dao.UserDaoImpl;
import org.example.entity.Address;
import org.example.entity.Student;
import org.example.entity.User;
import org.example.factoryBean.MyConnectionFactoryBean;
import org.example.service.UserService;
import org.example.service.UserServiceImpl;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class SpringFactory {
    @Test
    public void testSpringFactory(){
        String config = "spring-context.xml";
        ApplicationContext ctx = new ClassPathXmlApplicationContext(config);
        UserDao userDao = (UserDaoImpl) ctx.getBean("userDao");
        userDao.deleteUser(1);
        UserService userService = (UserServiceImpl)ctx.getBean("userService");
        userService.deleteUser(1);
    }

    @Test
    public void testSet(){
        String config = "./spring-context.xml";
        ApplicationContext ctx = new ClassPathXmlApplicationContext(config);
        User user = (User) ctx.getBean("user");
        System.out.println(user);
    }

    @Test
    public void testConstructors(){
        String config = "./spring-context.xml";
        ApplicationContext ctx = new ClassPathXmlApplicationContext(config);
        Student user = (Student) ctx.getBean("student");
        System.out.println(user);
    }

    @Test
    //当从工厂索要一个bean时，如果是FactoryBean，实际返回的是工厂bean的getObject的返回值
    public void testFactoryBean() throws SQLException {
        String config = "./spring-context.xml";
        ApplicationContext ctx = new ClassPathXmlApplicationContext(config);
        Connection conn = (Connection) ctx.getBean("conn");
        //获取工厂bean
        MyConnectionFactoryBean myConnectionFactoryBean = (MyConnectionFactoryBean) ctx.getBean("&conn");

        System.out.println(conn);

        PreparedStatement preparedStatement = conn.prepareStatement("select * from aaaa");
        ResultSet resultSet = preparedStatement.executeQuery();
        resultSet.next();
        System.out.println(resultSet.getInt("aaaa"));

    }

    @Test
    public void testLife(){
        String config = "./spring-context2.xml";
        ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext(config);
        Address address = (Address) ctx.getBean("address");
        Address address1 = (Address) ctx.getBean("address");
        System.out.println("---------------");
        ctx.close();
    }

}
