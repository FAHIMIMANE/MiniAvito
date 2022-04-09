package com.example.miniavito.service.impl;

import com.example.miniavito.bean.Categorie;
import com.example.miniavito.dao.CategorieDao;
import com.example.miniavito.service.facade.CategorieService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class CategorieImpl implements CategorieService {
    @Autowired
    private CategorieDao categorieDao;

    @Override
    public List<Categorie> findAll() {
        return categorieDao.findAll();
    }

    @Override
    public int save(Categorie categorie) {
        if (findByRef(categorie.getRef()) != null) {
            return -1;
        } else {
            categorieDao.save(categorie);
            return 1;
        }
    }

    @Override
    public Categorie findByRef(String ref) {
        return categorieDao.findByRef(ref);
    }

    @Override
    public int deleteByRef(String ref) {
        return categorieDao.deleteByRef(ref);
    }
}
