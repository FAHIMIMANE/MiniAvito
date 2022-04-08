package com.example.miniavito.service.impl;

import com.example.miniavito.dao.UserDao;
import com.example.miniavito.service.facade.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserDao userDao;

    @Override
    public boolean findByRef(String ref) {
        return userDao.findByRef(ref);
    }
}
