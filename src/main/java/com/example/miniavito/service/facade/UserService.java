package com.example.miniavito.service.facade;

import com.example.miniavito.bean.User;

public interface UserService {
    public User findByRef(String ref);
}
