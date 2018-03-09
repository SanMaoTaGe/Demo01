package com.vincent.web.action;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;
import com.vincent.bean.User;
import com.vincent.service.UserService;
import com.vincent.util.Constant;
import com.vincent.util.Md5Util;
import org.apache.struts2.ServletActionContext;
import org.apache.struts2.convention.annotation.Namespace;
import org.apache.struts2.convention.annotation.ParentPackage;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

/**
 * @author Vincent
 * @Description:
 * @create 2018-02-26 16:40
 */

@Controller
@Scope(value = "prototype")
public class UserAction extends ActionSupport implements ModelDriven {
    private User user;

    @Autowired
    private UserService userService;

    @Override
    public User getModel() {
        if (user == null) {
            user = new User();

        }
        return user;
    }


    public String login() {
        System.out.println("login-----------------");
        String user_password = user.getUser_password();
        String password_after_md5 = Md5Util.encodePwd(user_password);
        user.setUser_password(password_after_md5);
        User userLogin = userService.login(user);
        if (userLogin != null) {
            ServletActionContext.getRequest().setAttribute("user", userLogin);
            return Constant.LOGIN_SUCCESS;
        }
        addFieldError("msg", "用户名或者密码错误");
        return Constant.LOGIN_ERROR;
    }

    /**
     * 注册
     *
     * @return
     */
    public String register() {
        System.out.println("----------------------------------------555555555555555555555555555555----------");
        user.setUser_state('1');
        String user_password = user.getUser_password();
        String password_after_md5 = Md5Util.encodePwd(user_password);
        user.setUser_password(password_after_md5);
        userService.register(user);
        return Constant.REGISTER_SUCCESS;
    }


}
