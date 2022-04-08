package com.example.miniavito.service.facade;

import com.example.miniavito.bean.AnnonceHeureSuplementaire;
import com.example.miniavito.bean.AnnonceImmobilier;
import com.example.miniavito.bean.Matiere;
import com.example.miniavito.bean.TypeImmobilier;

import javax.transaction.Transactional;
import java.util.List;

public interface AnnoceImmobilierService {

    int save(AnnonceImmobilier annonceImmobilier);

    List<AnnonceImmobilier> findAll();
    AnnonceImmobilier findByRef(String ref);
    AnnonceImmobilier findByRefVille(String refVille);
    AnnonceImmobilier findByTypeAnnonce(String typeAnnonce);
    List<AnnonceImmobilier> findByMontantLessThanEqual(double montant);
    List<AnnonceImmobilier> findByMontantGreaterThanEqual(double montant);
    @Transactional
    int deleteByRef(String ref);

    @Transactional
    int deleteByUserRef(String ref);

    int save(TypeImmobilier typeImmobilier);

    int update(AnnonceImmobilier annonceImmobilier);
}
