package com.example.miniavito.service.impl;

import com.example.miniavito.bean.AnnonceVoiture;
import com.example.miniavito.bean.User;
import com.example.miniavito.dao.AnnonceVoitureDao;
import com.example.miniavito.service.facade.AnnonceVoitureService;
import com.example.miniavito.service.facade.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class AnnonceVoitureServiceImpl implements AnnonceVoitureService {
    @Override
    public int update(AnnonceVoiture annonceVoiture) {
        if(findByRef(annonceVoiture.getRef()) == null){
            return -1;
        }else if (annonceVoiture.getMontant()<0){
            return -2;
        }
        else{
            annonceVoitureDao.save(annonceVoiture);
            return 1;
        }
    }

    private void prepare(AnnonceVoiture annonceVoiture){
        User user= userService.findByRef(annonceVoiture.getUser().getRef());
        annonceVoiture.setUser(user);
    }
    private int validate(AnnonceVoiture annonceVoiture){
        if(findByRef(annonceVoiture.getRef()) != null){
            return -1;
        }else if(annonceVoiture.getUser() == null){
            return -2;
        }else if(annonceVoiture.getMontant()<0){
            return -3;
        }
        else{
            return 1;
        }
    }

    private void handlProcess(AnnonceVoiture annonceVoiture){
        annonceVoitureDao.save(annonceVoiture);
    }
    @Override
    public int save(AnnonceVoiture annonceVoiture) {
        prepare(annonceVoiture);
        int res = validate(annonceVoiture);
        if( res < 0){
            return -1;
        }else{
            handlProcess(annonceVoiture);
            return 1;
        }
    }

    @Override
    public List<AnnonceVoiture> findByRefCarburant(String refCarburant) {
        return annonceVoitureDao.findByRefCarburant(refCarburant);
    }

    @Override
    public List<AnnonceVoiture> findByUserRef(String ref) {
        return annonceVoitureDao.findByUserRef(ref);
    }
@Transactional
    @Override
    @Transactional
    public int deleteByUserRef(String ref) {
        return annonceVoitureDao.deleteByUserRef(ref);
    }

    @Override
    public List<AnnonceVoiture> findAll() {
        return annonceVoitureDao.findAll();
    }

    @Override
    @Transactional
    public int deleteByRef(String ref) {
        return annonceVoitureDao.deleteByRef(ref);
    }

    @Override
    public List<AnnonceVoiture> findByMontant(double montant) {
        return annonceVoitureDao.findByMontant(montant);
    }

    @Override
    public List<AnnonceVoiture> findByMontantAndRefModel(double montant, String refModel) {
        return annonceVoitureDao.findByMontantAndRefModel(montant,refModel);
    }

    @Override
    public AnnonceVoiture findByRef(String ref) {
        return annonceVoitureDao.findByRef(ref);
    }

    @Override
    public List<AnnonceVoiture> findByMontantLessThanEqual(double montant) {
        return annonceVoitureDao.findByMontantLessThanEqual(montant);
    }

    @Override
    public List<AnnonceVoiture> findByMontantGreaterThanEqual(double montant) {
        return annonceVoitureDao.findByMontantGreaterThanEqual(montant);
    }


    @Autowired
    private  UserService userService;
    @Autowired
    private AnnonceVoitureDao annonceVoitureDao;


}

