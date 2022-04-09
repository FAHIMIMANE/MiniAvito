package com.example.miniavito.service.facade;

import com.example.miniavito.bean.AnnonceImmobilier;
import com.example.miniavito.bean.TypeImmobilier;

import javax.transaction.Transactional;
import java.util.List;

public interface AnnoceImmobilierService {

    int save(AnnonceImmobilier annonceImmobilier);

    List<AnnonceImmobilier> findAll();
    AnnonceImmobilier findByRef(String ref);
    List<AnnonceImmobilier> findByRefVille(String refVille);
    List<AnnonceImmobilier> findByTypeAnnonce(String typeAnnonce);
    List<AnnonceImmobilier> findByMontantLessThanEqual(double montant);
    List<AnnonceImmobilier> findByMontantGreaterThanEqual(double montant);
    List<AnnonceImmobilier> findByPrixNonExistant();
    @Transactional
    int deleteByRef(String ref);

    @Transactional
    int deleteByUserRef(String ref);



    int update(AnnonceImmobilier annonceImmobilier);
}
