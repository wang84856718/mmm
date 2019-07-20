package com.ithema.service.impl;

import com.itheima.RoleDao;
import com.itheima.UserDao;
import com.ithema.User;
import com.ithema.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class UserImpl implements UserService {

    @Autowired
    private UserDao userDao;


    @Override
    public List<User> findAll() {
        return userDao.findAll();
    }

    @Override
    public void save(User user) {
        userDao.save(user);
    }

    @Override
    public void deleteUser(String userId) {

        //从user表中删除
        userDao.deleteUser(userId);
        //从user_role中删除
        userDao.deleteUser_Role(userId);

    }
}
