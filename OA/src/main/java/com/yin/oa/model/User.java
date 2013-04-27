package com.yin.oa.model;

import java.util.Date;

/**
 * User: yin
 * Date: 13-4-27
 * Time: 下午2:31
 * User Model
 */
public class User {

    private long id;
    private String name;
    private Date birthday;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }
}
