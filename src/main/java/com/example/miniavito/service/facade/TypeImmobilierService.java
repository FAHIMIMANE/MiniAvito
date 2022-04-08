package com.example.miniavito.service.facade;

import com.example.miniavito.bean.TypeImmobilier;
import com.example.miniavito.bean.User;

public interface TypeImmobilierService {
    TypeImmobilier findByRef(String ref);
}
