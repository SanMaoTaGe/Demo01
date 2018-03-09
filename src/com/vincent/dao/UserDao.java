package com.vincent.dao;

import com.vincent.bean.User; /**
 * @author Vincent
 * @Description:
 * @create 2018-02-26 17:10
 */
public interface UserDao {
    void save(User user);

    User findUser(User user);
}
