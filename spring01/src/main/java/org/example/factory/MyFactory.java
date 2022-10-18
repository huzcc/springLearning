package org.example.factory;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class MyFactory {

    private Properties properties = new Properties();

    public MyFactory() {
    }

    public MyFactory(String config) throws IOException {

        InputStream resourceAsStream = MyFactory.class.getResourceAsStream(config);
        properties.load(resourceAsStream);
    }

    public Object getBean(String name) throws ClassNotFoundException, InstantiationException, IllegalAccessException {
        String classPath = properties.getProperty(name);
        Class classInstance = Class.forName(classPath);
        return classInstance.newInstance();
    }


    public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException {
        String classPath = "org/example/dao/UserDAoImpl";
        Class classInstance = Class.forName(classPath);
        classInstance.newInstance();
    }
}
