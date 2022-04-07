package com.example.miniavito.service.impl.impl;

import com.example.miniavito.dao.MatiereDao;
import com.example.miniavito.service.facade.facade.MatiereService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MatiereServiceImpl implements MatiereService {
    @Autowired
    private MatiereDao matiereDao;
}
