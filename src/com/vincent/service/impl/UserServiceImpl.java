package com.vincent.service.impl;

import com.vincent.bean.User;
import com.vincent.dao.UserDao;
import com.vincent.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;

/**
 * @author Vincent
 * @Description:
 * @create 2018-02-26 17:07
 */
@Component
@Transactional
public class UserServiceImpl implements UserService {

    @Autowired
    private UserDao userDao;

    @Override
    public void register(User user) {
        userDao.save(user);
    }

    @Override
    public User login(User user) {

        return userDao.findUser(user);
    }
}
