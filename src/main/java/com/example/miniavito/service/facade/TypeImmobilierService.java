package com.example.miniavito.service.facade;

import com.example.miniavito.bean.TypeImmobilier;
import com.example.miniavito.bean.User;

public interface TypeImmobilierService {

    public TypeImmobilier findByRef(String ref) ;
    public int save(TypeImmobilier typeImmobilier) ;

}
