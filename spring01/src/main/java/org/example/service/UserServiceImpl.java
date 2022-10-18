package org.example.service;

import org.example.dao.UserDao;

public class UserServiceImpl implements UserService {

    private UserDao userDao;

    public UserDao getUserDao() {
        return userDao;
    }

    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }

    @Override
    public void deleteUser(Integer id) {
        userDao.deleteUser(id);
        System.out.println("delete user in service");
    }
}
