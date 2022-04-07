package com.example.miniavito.service.impl;

import com.example.miniavito.dao.AnnonceImmobilierDao;
import com.example.miniavito.service.facade.AnnoceImmobilierService;
import com.example.miniavito.service.facade.TypeImmobilierService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AnnonceImmobilierImpl implements AnnoceImmobilierService {

    @Autowired
    private AnnonceImmobilierDao annonceImmobilierDao;
    @Autowired
  private TypeImmobilierService typeImmobilierService;



}
