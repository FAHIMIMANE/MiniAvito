package com.example.miniavito.service.impl;

import com.example.miniavito.bean.AnnonceImmobilier;
import com.example.miniavito.bean.TypeImmobilier;
import com.example.miniavito.dao.TypeImmobilierDao;
import com.example.miniavito.service.facade.TypeImmobilierService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class TypeImmobilierServiceImpl implements TypeImmobilierService {
 @Autowired
    private TypeImmobilierDao typeImmobilierDao;



    @Override
    public List<TypeImmobilier> findAll() {
        return typeImmobilierDao.findAll();
    }
    @Override
    public TypeImmobilier findByRef(String ref) {
        return typeImmobilierDao.findByRef(ref);
    }

    @Override
    public List<AnnonceImmobilier> findByLibelle(String libelle) {
        return typeImmobilierDao.findByLibelle(libelle);
    }

    @Override
    public int save(TypeImmobilier typeImmobilier) {
        if (typeImmobilierDao.findByRef(typeImmobilier.getRef())!=null)
        return -1;
        else{
            typeImmobilierDao.save(typeImmobilier);
        return 1;
    }
    }

    @Override
    public int deleteByRef(String ref) {
        return  typeImmobilierDao.deleteByRef(ref);
    }
}
