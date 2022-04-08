package com.example.miniavito.service.facade;

import com.example.miniavito.bean.AnnonceHeureSuplementaire;
import com.example.miniavito.bean.AnnonceImmobilier;

import javax.transaction.Transactional;

public interface AnnoceImmobilierService {

    int save(AnnonceImmobilier annonceImmobilier);


    AnnonceImmobilier findByRef(String ref);

    @Transactional
    int deleteByRef(String ref);

    @Transactional
    int deleteByUserRef(String ref);

    int update(AnnonceImmobilier annonceImmobilier);
}
