package com.example.miniavito.dao;

import com.example.miniavito.bean.AnnonceHeureSuplementaire;
import com.example.miniavito.bean.AnnonceImmobilier;
import com.example.miniavito.bean.AnnonceVoiture;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface AnnonceVoitureDao extends JpaRepository<AnnonceVoiture, Long> {


    List<AnnonceVoiture> findByRefCarburant(String refCarburant);


    List<AnnonceVoiture> findByUserRef(String ref);

    int deleteByUserRef(String ref);

    int deleteByRef(String ref);

    List<AnnonceVoiture> findByMontant(double montant);

    List<AnnonceVoiture> findByMontantAndRefModel(double montant, String refModel);

    AnnonceVoiture findByRef(String ref);

    List<AnnonceVoiture> findByMontantLessThanEqual(double montant);

    List<AnnonceVoiture> findByMontantGreaterThanEqual(double montant);


}