package com.example.miniavito.service.impl.impl;

import com.example.miniavito.dao.AnnonceVoitureDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AnnonceVoitureServiceImpl implements AnnonceVoitureService {
    @Autowired
    private AnnonceVoitureDao annonceVoitureDao;
}
