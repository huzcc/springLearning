package org.example.dao;

public class UserDaoImpl implements UserDao {
    @Override
    public void deleteUser(Integer id) {
        System.out.println("delete user in dao");
    }
}
