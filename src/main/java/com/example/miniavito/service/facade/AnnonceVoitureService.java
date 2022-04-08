package com.example.miniavito.service.facade;

import com.example.miniavito.bean.AnnonceVoiture;
import com.example.miniavito.bean.User;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface AnnonceVoitureService {

    List<AnnonceVoiture> findAll();

    public int update(AnnonceVoiture annonceVoiture);

    public int save(AnnonceVoiture annonceVoiture);

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