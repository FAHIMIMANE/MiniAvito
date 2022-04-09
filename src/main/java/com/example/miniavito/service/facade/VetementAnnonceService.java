package com.example.miniavito.service.facade;

import com.example.miniavito.bean.AnnonceVoiture;
import com.example.miniavito.bean.VetementAnnonce;

import java.util.List;

public interface VetementAnnonceService {
    VetementAnnonce findByRef(String ref);
    VetementAnnonce findByTaille(String taille);
    VetementAnnonce findByPrixIsLessThanEqual(double prix);
    List <VetementAnnonce> findAll ();
    VetementAnnonce findByMarque (String marque);
    int save(VetementAnnonce vetementAnnonce);
    int deleteByRef(String ref);
    int deleteByUserRef(String ref);
    VetementAnnonce findByPrixIsGreaterThanEqual(double prix);
    VetementAnnonce findByStyle(String style);
    VetementAnnonce findByCategories(String categories);
    public int update(VetementAnnonce vetementAnnonce );


}
