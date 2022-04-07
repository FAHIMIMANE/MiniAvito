package com.example.miniavito.dao;

import com.example.miniavito.bean.AnnonceImmobilier;
import com.example.miniavito.bean.AnnonceVoiture;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface AnnonceVoitureDao extends JpaRepository<AnnonceVoiture,Long> {

    List<AnnonceVoiture> findByRefCarburant(String refCarburant);

}
