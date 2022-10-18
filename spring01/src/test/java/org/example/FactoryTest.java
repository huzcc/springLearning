package org.example;

import org.example.dao.UserDao;
import org.example.factory.MyFactory;

import java.io.IOException;

public class FactoryTest {

    public static void main(String[] args) throws IOException, ClassNotFoundException, InstantiationException, IllegalAccessException {
        MyFactory myFactory = new MyFactory("/bean.properties");
        UserDao userDao = (UserDao)myFactory.getBean("userDao");
        userDao.deleteUser(1);
    }
}
