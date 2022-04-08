package com.example.miniavito.service.facade;

import com.example.miniavito.bean.AnnonceHeureSuplementaire;

import java.util.List;

public interface AnnonceHeureSuplementaireService {
    AnnonceHeureSuplementaire findByRef(String ref);
    List<AnnonceHeureSuplementaire> findByMontantLessThanEqual(double montant);
    List<AnnonceHeureSuplementaire> findByMontantGreaterThanEqual(double montant);
    List<AnnonceHeureSuplementaire> findByRefMatiere(String refMatiere);
    List<AnnonceHeureSuplementaire> findByJourDisponnibilite(String jourDisponibilite);
    public int save(AnnonceHeureSuplementaire annonceHeureSuplementaire);
}
