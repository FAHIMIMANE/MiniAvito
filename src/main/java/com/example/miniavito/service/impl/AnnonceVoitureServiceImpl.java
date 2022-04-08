package com.example.miniavito.service.impl;

import com.example.miniavito.bean.AnnonceVoiture;
import com.example.miniavito.bean.User;
import com.example.miniavito.dao.AnnonceVoitureDao;
import com.example.miniavito.service.facade.AnnonceVoitureService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AnnonceVoitureServiceImpl implements AnnonceVoitureService {

    @Override
    public int save(AnnonceVoiture annonceVoiture) {
        if (findByRef(annonceVoiture.getRef()) != null) {
            return -1;
        } else if (isClientExist(annonceVoiture.getUser()) == false) {
            return -2;
        } else {
            annonceVoitureDao.save(annonceVoiture);
            return 1;
        }
    }

    private boolean isClientExist(User user) {
        return user != null;
    }

    @Override
    public List<AnnonceVoiture> findByUserRef(String ref) {
        return annonceVoitureDao.findByUserRef(ref);
    }

    @Override
    public int deleteByUserRef(String ref) {
        return annonceVoitureDao.deleteByUserRef(ref);
    }

    @Override
    public List<AnnonceVoiture> findByRefCarburant(String refCarburant) {
        return annonceVoitureDao.findByRefCarburant(refCarburant);
    }

    @Override
    public int deleteByRef(String ref) {
        return annonceVoitureDao.deleteByRef(ref);
    }

    @Override
    public List<AnnonceVoiture> findByMontant(double montant) {
        return annonceVoitureDao.findByMontant(montant);
    }

    @Override
    public List<AnnonceVoiture> findByMontantAndRefModel(double montant, String refModel) {
        return annonceVoitureDao.findByMontantAndRefModel(montant, refModel);
    }

    @Override
    public AnnonceVoiture findByRef(String ref) {
        return annonceVoitureDao.findByRef(ref);
    }

    @Override
    public List<AnnonceVoiture> findByMontantSuperieur(double mt) {
        return annonceVoitureDao.findByMontantSuperieur(mt);
    }

    @Override
    public List<AnnonceVoiture> findByMontantInferieur(double mt) {
        return annonceVoitureDao.findByMontantInferieur(mt);
    }

    @Autowired
    private AnnonceVoitureDao annonceVoitureDao;

}
