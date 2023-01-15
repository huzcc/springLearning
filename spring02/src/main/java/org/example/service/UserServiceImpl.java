package org.example.service;

import org.example.entity.User;

import java.util.List;

/**
 * @author huzc
 */
public class UserServiceImpl implements UserService {
    @Override
    public List<User> queryUsers() {
        System.out.println("事务控制");
        System.out.println("打印日志");
        System.out.println("queryUsers");
        return null;
    }

    @Override
    public Integer updateUser() {
        System.out.println("事务控制");
        System.out.println("打印日志");
        System.out.println("update User");
        return 1;
    }

    @Override
    public Integer saveUser() {
        System.out.println("事务控制");
        System.out.println("打印日志");
        System.out.println("save User");
        return 1;
    }

    @Override
    public Integer deleteUser() {
        System.out.println("事务控制");
        System.out.println("打印日志");
        System.out.println("delete User");
        return 1;
    }
}
