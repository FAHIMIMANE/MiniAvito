package com.example.miniavito.service.impl;

import com.example.miniavito.bean.AnnonceAppareilInformatique;
import com.example.miniavito.bean.Categorie;
import com.example.miniavito.bean.User;
import com.example.miniavito.dao.AnnonceAppareilInformatiqueDao;
import com.example.miniavito.service.facade.AnnonceAppareilInformatiqueService;
import com.example.miniavito.service.facade.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class AnnonceAppareilInformatiqueImpl implements AnnonceAppareilInformatiqueService {
    @Autowired
    private AnnonceAppareilInformatiqueDao annonceAppareilInformatiqueDao;
    @Autowired
    private UserService userService;

    public List<AnnonceAppareilInformatique> findByPrixGreaterThan(double prix) {
        return annonceAppareilInformatiqueDao.findByPrixGreaterThan(prix);
    }
    public List<AnnonceAppareilInformatique> findByPrixLessThan(double prix) {
        return annonceAppareilInformatiqueDao.findByPrixLessThan(prix);
    }
    public List<AnnonceAppareilInformatique> findByPrixBetween(double prix1, double prix2) {
        return annonceAppareilInformatiqueDao.findByPrixBetween(prix1, prix2);
    }

    public List<AnnonceAppareilInformatique> findByCategorieRef(String ref) {
        return annonceAppareilInformatiqueDao.findByCategorieRef(ref);
    }
    @Transactional
    public int deleteByRef(String ref) {
        return annonceAppareilInformatiqueDao.deleteByRef(ref);
    }

    public AnnonceAppareilInformatique findByRef(String ref) {
        return annonceAppareilInformatiqueDao.findByRef(ref);
    }


    public int save(AnnonceAppareilInformatique annonceAppareilInformatique) {
        prepare(annonceAppareilInformatique);
        int res=validate(annonceAppareilInformatique);
        if(res>0){
            handleprocess(annonceAppareilInformatique);
        }
        return res;
    }

    private void handleprocess(AnnonceAppareilInformatique annonceAppareilInformatique) {
        annonceAppareilInformatiqueDao.save(annonceAppareilInformatique);
    }

    private int validate(AnnonceAppareilInformatique annonceAppareilInformatique) {
    }

    private void prepare(AnnonceAppareilInformatique annonceAppareilInformatique) {
        User user=userService.findByRef(annonceAppareilInformatique.getUser().getRef());

    }

    public List<AnnonceAppareilInformatique> findAll() {
        return annonceAppareilInformatiqueDao.findAll();
    }
}
