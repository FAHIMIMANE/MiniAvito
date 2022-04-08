package com.example.miniavito.service.facade;

import com.example.miniavito.bean.User;

public interface UserService {
    User findByRef(String ref);
}
