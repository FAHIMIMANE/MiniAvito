package com.example.miniavito.dao;

import com.example.miniavito.bean.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserDao extends JpaRepository<User,Long> {
    User findByLogin(String login);
    User findByRef(String ref);


    List<User> findByProf(boolean prof);
}
