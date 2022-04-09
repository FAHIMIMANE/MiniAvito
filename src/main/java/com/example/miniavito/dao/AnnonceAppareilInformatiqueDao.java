package com.example.miniavito.dao;

import com.example.miniavito.bean.AnnonceAppareilInformatique;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface AnnonceAppareilInformatiqueDao extends JpaRepository<AnnonceAppareilInformatique,Long> {
    AnnonceAppareilInformatique findByRef(String ref);
    List<AnnonceAppareilInformatique>  findByPrixGreaterThan(double prix);
    List<AnnonceAppareilInformatique> findByPrixLessThan(double prix);
    List<AnnonceAppareilInformatique> findByPrixBetween(double prix1,double prix2);
    List<AnnonceAppareilInformatique> findByCategorieRef(String ref);
    int deleteByRef(String ref);
    int deleteByUserRef(String ref);


}
