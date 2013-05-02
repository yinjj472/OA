package com.yin.oa.service.impl;

import com.yin.oa.model.User;
import com.yin.oa.service.UserService;
import org.apache.log4j.Logger;
import org.springframework.stereotype.Component;

/**
 * User: yin
 * Date: 13-4-27
 * Time: 下午2:34
 * User operate implement
 */
@Component
public class UserServiceImpl implements UserService {

    private static final Logger logger = Logger.getLogger(UserServiceImpl.class);

    @Override
    public long saveUser(User user) {
        return 0L;
    }

    @Override
    public User getUser(long id) {
        return null;
    }

    @Override
    public void updateUser(User user) {

    }

    @Override
    public void hello() {
        logger.info("Say hello to user.");
    }
}
