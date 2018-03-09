package com.vincent.dao.impl;

import com.vincent.bean.User;
import com.vincent.dao.UserDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author Vincent
 * @Description:
 * @create 2018-02-26 17:11
 */


@SuppressWarnings("all")
@Repository
public class UserDaoImpl implements UserDao {

    @Autowired
    private HibernateTemplate hibernateTemplate;

    @Override
    public void save(User user) {
        this.hibernateTemplate.save(user);
    }

    @Override
    public User findUser(User user) {
        String hql = "from User where user_code = ? and user_password=? and user_state=1";
        List<User> list = (List<User>) this.hibernateTemplate.find(hql, user.getUser_code(), user.getUser_password());
        User user1 = null;
        if (list.size() > 0) {
            user1 = list.get(0);
        } else {
            System.out.println("登录查找用户失败---------");
        }

        return user1;
    }
}
