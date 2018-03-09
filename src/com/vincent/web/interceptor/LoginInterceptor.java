package com.vincent.web.interceptor;

import com.opensymphony.xwork2.ActionInvocation;
import com.opensymphony.xwork2.interceptor.MethodFilterInterceptor;
import com.vincent.bean.User;
import com.vincent.util.Constant;
import org.apache.struts2.ServletActionContext;

/**
 * @author Vincent
 * @Description:
 * @create 2018-02-27 18:27
 */
public class LoginInterceptor extends MethodFilterInterceptor {

    @Override
    protected String doIntercept(ActionInvocation actionInvocation) throws Exception {
        User user = (User) ServletActionContext.getRequest().getAttribute("user");
        if (user == null) {
            //登录
            System.out.println("Loginterceptor#...去登录");
            return Constant.TO_LOGIN;

        }
        //放行
        return actionInvocation.invoke();
    }
}
