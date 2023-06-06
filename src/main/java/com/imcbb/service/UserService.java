package com.imcbb.service;

import com.imcbb.annotation.LogPrint;
import com.imcbb.dao.User;
import com.imcbb.dao.UserDao;
import org.springframework.stereotype.Service;

/**
 * @author kevin
 */
@Service
public class UserService {

    private final UserDao userDao;

    public UserService(UserDao userDao) {
        this.userDao = userDao;
    }

    @LogPrint("user")
    public User getUser(long id) {
        return userDao.getUserById(id);
    }

    @LogPrint("abc")
    public boolean addUser(User user) {
        return userDao.addUser(user);
    }

    public boolean updateUserInfo(User user) {

        return userDao.updateUserInfo(user);
    }
}
