package com.yin.oa.service;

import com.yin.oa.model.User;

/**
 * User: yin
 * Date: 13-4-27
 * Time: 下午2:33
 * User operate interface
 */
public interface UserService {

    public long saveUser(User user);

    public User getUser(long id);

    public void updateUser(User user);
}
