package com.example.miniavito.dao;

import com.example.miniavito.bean.Categorie;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CategorieDao extends JpaRepository<Categorie,Long> {
    Categorie findByRef(String ref);
    int deleteByRef(String ref);
}
