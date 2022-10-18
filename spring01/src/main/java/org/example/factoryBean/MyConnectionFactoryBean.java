package org.example.factoryBean;

import org.springframework.beans.factory.FactoryBean;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 * @author huzc
 */
public class MyConnectionFactoryBean implements FactoryBean<Connection> {


    @Override
    public Connection getObject() throws Exception {
        Class.forName("com.mysql.jdbc.Driver");
        return  DriverManager.getConnection("jdbc:mysql:localhost:3306:/mybatis-shine","root","123");
    }

    @Override
    public Class<?> getObjectType() {
        return Connection.class;
    }

    @Override
    public boolean isSingleton() {
        return FactoryBean.super.isSingleton();
    }
}
