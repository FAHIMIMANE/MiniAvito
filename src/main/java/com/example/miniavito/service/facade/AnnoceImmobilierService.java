package com.example.miniavito.service.facade;

import com.example.miniavito.bean.AnnonceImmobilier;
import com.example.miniavito.bean.TypeImmobilier;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

public interface AnnoceImmobilierService {

    int save(AnnonceImmobilier annonceImmobilier);

    List<AnnonceImmobilier> findAll();
    AnnonceImmobilier findByRef(String ref);
    List<AnnonceImmobilier> findByRefVille(String refVille);
    List<AnnonceImmobilier> findByTypeAnnonce(String typeAnnonce);
    List<AnnonceImmobilier> findByPrixLessThanEqual(double prix);
    List<AnnonceImmobilier> findByPrixGreaterThanEqual(double prix);
    List<AnnonceImmobilier> findByPrixNonExistant();
 @Transactional
    int deleteByRef(String ref);

    @Transactional
    int deleteByUserRef(String ref);



    int update(AnnonceImmobilier annonceImmobilier);
}
