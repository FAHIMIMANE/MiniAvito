package com.example.miniavito.service.impl;

import com.example.miniavito.bean.User;
import com.example.miniavito.dao.UserDao;
import com.example.miniavito.service.facade.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import java.util.List;

@Service
public class UserServiceImpl implements UserService {
    @Override
    public User findByLogin(String login) {
        return userDao.findByLogin(login);
    }
    @Override
    public User findByRef(String login) {
        return userDao.findByRef(login);
    }
    @Override
    public User findByProf(String login) {
        return userDao.findByProf(login);
    }
    @Override
    public List<User> findByProf(boolean prof) {
        return userDao.findByProf(prof);
    }
    @Override
    public List<User> findAll() {
        return userDao.findAll();
    }
    @Override
    public int save(User user) {
        User user1 = findByRef(user.getRef())  ;
        if (user1 != null)
            return -1 ;
        else if(user.getPassword().length() <= 8)
            return -2;
        else{
            userDao.save(user);
            return 1 ;
        }



    }
    @Override
    public long count() {
        return userDao.count();
    }
    @Transactional
    @Override
    public void delete(User entity) {
        userDao.delete(entity);
    }

    @Autowired
    private UserDao userDao;

}
