package com.example.miniavito.service.impl;

import com.example.miniavito.bean.TypeImmobilier;
import com.example.miniavito.dao.TypeImmobilierDao;
import com.example.miniavito.service.facade.TypeImmobilierService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class TypeImmobilierServiceImpl implements TypeImmobilierService {
 @Autowired
    private TypeImmobilierDao typeImmobilierDao;


}
