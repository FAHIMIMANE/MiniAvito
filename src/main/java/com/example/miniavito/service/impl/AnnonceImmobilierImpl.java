package com.example.miniavito.service.impl;

import com.example.miniavito.dao.AnnonceImmobilierDao;
import com.example.miniavito.service.facade.AnnoceImmobilierService;
import org.springframework.beans.factory.annotation.Autowired;

public class AnnonceImmobilierImpl implements AnnoceImmobilierService {

    @Autowired
    private AnnonceImmobilierDao annonceImmobilierDao;
}
