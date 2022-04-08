package com.example.miniavito.dao;

import com.example.miniavito.bean.AnnonceImmobilier;
import com.example.miniavito.bean.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AnnonceImmobilierDao extends JpaRepository<AnnonceImmobilier,Long> {
    int deleteByRef (String ref);
    int deleteByUserRef (String ref);
    AnnonceImmobilier findByRef(String ref);


}
