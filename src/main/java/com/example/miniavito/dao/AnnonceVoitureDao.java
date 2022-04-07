package com.example.miniavito.dao;

import com.example.miniavito.bean.AnnonceImmobilier;
import com.example.miniavito.bean.AnnonceVoiture;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface AnnonceVoitureDao extends JpaRepository<AnnonceVoiture,Long> {

    List<AnnonceVoiture> findByRefCarburant(String refCarburant);

}
