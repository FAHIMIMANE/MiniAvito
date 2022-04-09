package com.example.miniavito.service.facade;

import com.example.miniavito.bean.AnnonceAppareilInformatique;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

public interface AnnonceAppareilInformatiqueService {

    List<AnnonceAppareilInformatique> findByPrixGreaterThan(double prix);

    List<AnnonceAppareilInformatique> findByPrixLessThan(double prix);

    List<AnnonceAppareilInformatique> findByPrixBetween(double prix1, double prix2);

    List<AnnonceAppareilInformatique> findByCategorieRef(String ref);

    int deleteByUserRef(String ref);

    @Transactional
    int deleteByRef(String ref);

    AnnonceAppareilInformatique findByRef(String ref);

    int save(AnnonceAppareilInformatique annonceAppareilInformatique);

    void prepare(AnnonceAppareilInformatique annonceAppareilInformatique);

    void handleprocess(AnnonceAppareilInformatique annonceAppareilInformatique);

    List<AnnonceAppareilInformatique> findAll();
}
