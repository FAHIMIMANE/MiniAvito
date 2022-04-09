package com.example.miniavito.dao;

import com.example.miniavito.bean.User;
import com.example.miniavito.bean.VetementAnnonce;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface VetementAnnonceDao extends JpaRepository<VetementAnnonce,Long> {
    VetementAnnonce findByRef(String ref);
    VetementAnnonce findByTaille(String taille);
    VetementAnnonce findByPrixIsLessThanEqual(double prix);
    VetementAnnonce findByMarque (String marque);
    int deleteByRef(String ref);
    VetementAnnonce findByPrixIsGreaterThanEqual(double prix);
    VetementAnnonce findByStyle(String style);
    VetementAnnonce findByCategories(String categories);

}
