package com.example.miniavito.service.facade;

import com.example.miniavito.bean.User;

import org.springframework.transaction.annotation.Transactional;

import java.util.List;

public interface UserService {

    public User findByLogin(String login) ;

    public User findByRef(String ref) ;



    public List<User> findByProf(boolean prof) ;

    public List<User> findAll();

    public int save(User user) ;

    public long count();

    public void delete(User entity);






}
