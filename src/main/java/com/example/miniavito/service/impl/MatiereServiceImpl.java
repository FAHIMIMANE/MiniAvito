package com.example.miniavito.service.impl;

import com.example.miniavito.bean.Matiere;
import com.example.miniavito.dao.MatiereDao;
import com.example.miniavito.service.facade.MatiereService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class MatiereServiceImpl implements MatiereService {
    @Autowired
    private MatiereDao matiereDao;

    public Matiere findByRef(String ref) {
        return matiereDao.findByRef(ref);
    }


    @Override
    public int save(Matiere matiere) {
        if (findByRef(matiere.getRef()) != null) {
            return -1;
        } else {
            matiereDao.save(matiere);
            return 1;
        }

    }
    @Transactional
    @Override
    public int deleteByRef(String ref) {
        return matiereDao.deleteByRef(ref);
    }

    @Override
    public int update(Matiere matiere) {
        if(findByRef(matiere.getRef())==null) {
            return -1;
        }
        else {
            matiereDao.save(matiere);
            return 1;
        }
    }

    @Override
    public List<Matiere> findAll() {
        return matiereDao.findAll();
    }
}
