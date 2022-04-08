package com.example.miniavito.service.facade;

import com.example.miniavito.bean.AnnonceHeureSuplementaire;
import com.example.miniavito.bean.AnnonceImmobilier;
import com.example.miniavito.bean.Matiere;

import javax.transaction.Transactional;
import java.util.List;

public interface AnnoceImmobilierService {

    int save(AnnonceImmobilier annonceImmobilier);
    AnnonceImmobilier findByRef(String ref);
    List<AnnonceImmobilier> findAll();

    @Transactional
    int deleteByRef(String ref);

    @Transactional
    int deleteByUserRef(String ref);

}
