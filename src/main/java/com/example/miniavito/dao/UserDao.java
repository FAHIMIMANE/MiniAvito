package com.example.miniavito.dao;

import com.example.miniavito.bean.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserDao extends JpaRepository<User,Long> {

}
