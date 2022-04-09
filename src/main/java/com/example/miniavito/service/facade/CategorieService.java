package com.example.miniavito.service.facade;

import com.example.miniavito.bean.Categorie;

import java.util.List;

public interface CategorieService {
    List<Categorie> findAll();

    int save(Categorie categorie);

    Categorie findByRef(String ref);

    int deleteByRef(String ref);
}
