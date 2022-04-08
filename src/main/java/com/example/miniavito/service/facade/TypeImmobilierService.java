package com.example.miniavito.service.facade;

import com.example.miniavito.bean.TypeImmobilier;

public interface TypeImmobilierService {
    TypeImmobilier findByReference (String reference);
}
