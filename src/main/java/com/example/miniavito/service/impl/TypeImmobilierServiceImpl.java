package com.example.miniavito.service.impl;

import com.example.miniavito.bean.AnnonceImmobilier;
import com.example.miniavito.bean.TypeImmobilier;
import com.example.miniavito.dao.AnnonceImmobilierDao;
import com.example.miniavito.dao.TypeImmobilierDao;
import com.example.miniavito.service.facade.AnnoceImmobilierService;
import com.example.miniavito.service.facade.TypeImmobilierService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;


@Service
public class TypeImmobilierServiceImpl implements TypeImmobilierService {
 @Autowired
    private TypeImmobilierDao typeImmobilierDao;

    @Autowired
    private AnnoceImmobilierService annoceImmobilierService;

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
 @Transactional
    @Override
    public int deleteByRef(String ref) {
    annoceImmobilierService.deleteByTypeImmobilierRef(ref);
        return  typeImmobilierDao.deleteByRef(ref);
    }
}
