package com.example.miniavito.service.impl.impl;

import com.example.miniavito.dao.MatiereDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MatiereServiceImpl {
    @Autowired
    private MatiereDao matiereDao;
}
