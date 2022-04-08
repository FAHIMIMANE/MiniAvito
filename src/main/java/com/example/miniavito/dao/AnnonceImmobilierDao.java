package com.example.miniavito.dao;

import com.example.miniavito.bean.AnnonceImmobilier;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AnnonceImmobilierDao extends JpaRepository<AnnonceImmobilier,Long> {
    AnnonceImmobilier findByRef(String ref);
    int deleteByRef(String ref);


}
