package com.example.miniavito.service.facade;

import com.example.miniavito.bean.AnnonceHeureSuplementaire;

import java.util.List;

public interface AnnonceHeureSuplementaireService {
    AnnonceHeureSuplementaire findByRef(String ref);
    List<AnnonceHeureSuplementaire> findByMontantLessThanEqual(double montant);
    List<AnnonceHeureSuplementaire> findByMontantGreaterThanEqual(double montant);
    List<AnnonceHeureSuplementaire> findByMatiereRef(String ref);
    List<AnnonceHeureSuplementaire> findByJourDisponnibilite(String jourDisponibilite);
    int update(AnnonceHeureSuplementaire annonceHeureSuplementaire);
    int deleteByUserRef(String ref);

    public int save(AnnonceHeureSuplementaire annonceHeureSuplementaire);
}
