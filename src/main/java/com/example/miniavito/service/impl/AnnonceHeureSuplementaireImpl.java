package com.example.miniavito.service.impl;

import com.example.miniavito.bean.AnnonceHeureSuplementaire;
import com.example.miniavito.dao.AnnonceHeureSuplementaireDao;
import com.example.miniavito.service.facade.AnnonceHeureSuplementaireService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AnnonceHeureSuplementaireImpl implements AnnonceHeureSuplementaireService {
    @Autowired
    private AnnonceHeureSuplementaireDao annonceHeureSuplementaireDao;

    public AnnonceHeureSuplementaire findByRef(String ref) {
        return annonceHeureSuplementaireDao.findByRef(ref);
    }

    public List<AnnonceHeureSuplementaire> findByMontantLessThanEqual(double montant){
        return annonceHeureSuplementaireDao.findByMontantLessThanEqual(montant);
    }
    public List<AnnonceHeureSuplementaire> findByMontantGreaterThanEqual(double montant){
        return annonceHeureSuplementaireDao.findByMontantGreaterThanEqual(montant);
    }

    public List<AnnonceHeureSuplementaire> findByRefMatiere(String refMatiere){
        return annonceHeureSuplementaireDao.findByRefMatiere(refMatiere);
    }

    public List<AnnonceHeureSuplementaire> findByJourDisponibilite(String jourDisponibilite){
        return annonceHeureSuplementaireDao.findByJourDisponibilite(jourDisponibilite);
    }
}
