package com.example.miniavito.service.facade;

import com.example.miniavito.bean.AnnonceImmobilier;

import javax.transaction.Transactional;

public interface AnnoceImmobilierService {

    int save(AnnonceImmobilier annonceImmobilier);

    @Transactional
    int deleteByRef(String ref);

    @Transactional
    int deleteByUserRef(String ref);
}
