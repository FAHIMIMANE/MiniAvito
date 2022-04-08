package com.example.miniavito.service.impl;

import com.example.miniavito.bean.Matiere;
import com.example.miniavito.dao.MatiereDao;
import com.example.miniavito.service.facade.MatiereService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MatiereServiceImpl implements MatiereService {
    @Autowired
    private MatiereDao matiereDao;

    public Matiere findByRef(String ref){
        return matiereDao.findByRef(ref);
    }

    @Override
    public int save(Matiere matiere) {
        if(findByRef(matiere.getRef()) != null) {
            return -1;
        }else{
            matiereDao.save(matiere);
            return 1;
        }

    }
}
