package com.example.miniavito.dao;

import com.example.miniavito.bean.AnnonceHeureSuplementaire;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AnnonceHeureSuplementaireDao extends JpaRepository<AnnonceHeureSuplementaire, Long> {

}
