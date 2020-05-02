package com.lagou.dao;

import com.lagou.pojo.User;

import java.util.List;

public interface IUserDao {

    //查询所有用户
    public List<User> findAll() ;


    //根据条件进行用户查询
    public User findByCondition(User user) ;

    //增加用户
    public void addUser(User user);

    //修改用户
    public void updateUser(User user);

    //删除用户
    public void deleteUser(User user);

}
