package com.yin.oa.web;

import org.apache.struts2.convention.annotation.Action;
import org.apache.struts2.convention.annotation.Namespace;
import org.springframework.context.annotation.Scope;

/**
 * User: yin
 * Date: 13-4-27
 * Time: 下午2:36
 * User web Action
 */
@Namespace("user")
@Scope
public class UserAction {

    @Action("hello")
    public String hello() {
        System.out.println("xxxx");
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
