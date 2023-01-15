package org.example.service;

import org.example.entity.User;

import java.util.List;

/**
 * @author huzc
 */
public interface UserService {

    public List<User> queryUsers();
    public Integer updateUser();
    public Integer saveUser();
    public Integer deleteUser();

}
