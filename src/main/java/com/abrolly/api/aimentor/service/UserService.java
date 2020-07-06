package com.abrolly.api.aimentor.service;


import com.abrolly.api.aimentor.dao.UserDao;
import com.abrolly.api.aimentor.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    @Autowired
    private UserDao userDao;

    public List<User> getAllUserService(){
        return userDao.getAllUserDao();
    }


    public User getUserByIdService(Long userId){
        return userDao.getUserByIdDao(userId);
    }

    public User createUserService(User user){
        return userDao.createUserDao(user);
    }

    public User updateUserService(User userDetails, Long userId){
        return userDao.updateUserDao(userDetails, userId);
    }

    public void deleteUserService(Long userId){
        userDao.deleteUserDao(userId);
    }
}
