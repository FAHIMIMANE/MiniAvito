package com.example.miniavito.service.facade;

import com.example.miniavito.bean.User;

import java.util.List;

public interface UserService {
    public User findByLogin(String login);

    public User findByRef(String login);



    public List<User> findByProf(boolean prof);


    public int save(User user) ;


}
