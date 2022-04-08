package com.example.miniavito.service.facade;

import com.example.miniavito.bean.AnnonceVoiture;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface AnnonceVoitureService {
    List<AnnonceVoiture> findByUserRef(String ref);

    int deleteByUserRef(String ref);

    public int save(AnnonceVoiture annonceVoiture);

    List<AnnonceVoiture> findByRefCarburant(String refCarburant);

    int deleteByRef(String ref);

    List<AnnonceVoiture> findByMontantAndRefModel(double montant, String refModel);

    List<AnnonceVoiture> findByMontant(double montant);

    AnnonceVoiture findByRef(String ref);

    @Query("select v from AnnonceVoiture v where v.montant >= :mt")
    List<AnnonceVoiture> findByMontantSuperieur(@Param("mt") double mt);

    @Query("select v from AnnonceVoiture v where v.montant <= :mt")
    List<AnnonceVoiture> findByMontantInferieur(@Param("mt") double mt);
}
