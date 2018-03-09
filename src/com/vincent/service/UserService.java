package com.vincent.service;

import com.vincent.bean.User; /**
 * @author Vincent
 * @Description:
 * @create 2018-02-26 17:05
 */
public interface UserService {
    void register(User user);

    User login(User user);
}
