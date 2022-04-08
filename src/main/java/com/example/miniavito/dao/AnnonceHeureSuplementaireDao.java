package com.example.miniavito.dao;

import com.example.miniavito.bean.AnnonceHeureSuplementaire;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface AnnonceHeureSuplementaireDao extends JpaRepository<AnnonceHeureSuplementaire, Long> {
    AnnonceHeureSuplementaire findByRef(String ref);
    List<AnnonceHeureSuplementaire> findByMontantLessThanEqual(double montant);
    List<AnnonceHeureSuplementaire> findByMontantGreaterThanEqual(double montant);
    List<AnnonceHeureSuplementaire> findByMatiereRef(String ref);
    List<AnnonceHeureSuplementaire> findByJourDisponnibilite(String jourDisponibilite);


}
