package com.yin.oa.web.action;

import com.opensymphony.xwork2.ActionSupport;
import com.yin.oa.service.UserService;
import org.apache.struts2.ServletActionContext;
import org.apache.struts2.convention.annotation.Action;
import org.apache.struts2.convention.annotation.Namespace;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * User: yin
 * Date: 13-4-27
 * Time: 下午2:36
 * User web Action
 */
@Namespace("/user")
@Scope("prototype")
public class UserAction extends ActionSupport {

    @Autowired
    private UserService userService;

    @Action("hello")
    public String hello() {
        userService.hello();

        HttpServletResponse response = ServletActionContext.getResponse();
        response.setContentType("text/plain;charset=UTF-8");
        try {
            response.getWriter().write("In struts2 hello action method.");
            response.getWriter().flush();
        } catch (IOException ex) {
           // ignore
        }

        return null;
    }

    public String saveUser() {
        return null;
    }

    public String getUser() {
        return null;
    }

    public String updateUser() {
        return null;
    }
}
