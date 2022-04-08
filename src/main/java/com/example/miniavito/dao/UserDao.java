package com.example.miniavito.dao;

import com.example.miniavito.bean.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserDao extends JpaRepository<User,Long> {
    User findByRef(String ref);
}
