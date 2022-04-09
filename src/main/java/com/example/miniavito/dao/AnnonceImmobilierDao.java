package com.example.miniavito.dao;

import com.example.miniavito.bean.AnnonceHeureSuplementaire;
import com.example.miniavito.bean.AnnonceImmobilier;
import com.example.miniavito.bean.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import java.util.List;

@Repository
public interface AnnonceImmobilierDao extends JpaRepository<AnnonceImmobilier,Long> {
    int deleteByRef (String ref);
    int deleteByUserRef (String ref);
    int deleteByTypeImmobilierRef(String ref);
    AnnonceImmobilier findByRef(String ref);
    List<AnnonceImmobilier>  findByRefVille(String refVille);
    List<AnnonceImmobilier>  findByTypeAnnonce(String typeAnnonce);
    List<AnnonceImmobilier> findByPrixLessThanEqual(double prix);
    List<AnnonceImmobilier> findByPrixGreaterThanEqual(double prix);
    @Query("SELECT a from AnnonceImmobilier a where a.prix is null")
    List<AnnonceImmobilier> findByPrixNonExistant();
}
