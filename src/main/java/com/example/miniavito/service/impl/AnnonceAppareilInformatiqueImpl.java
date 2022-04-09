package com.example.miniavito.service.impl;

import com.example.miniavito.bean.AnnonceAppareilInformatique;
import com.example.miniavito.bean.Categorie;
import com.example.miniavito.bean.User;
import com.example.miniavito.dao.AnnonceAppareilInformatiqueDao;
import com.example.miniavito.service.facade.AnnonceAppareilInformatiqueService;
import com.example.miniavito.service.facade.CategorieService;
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
    @Autowired
    private CategorieService categorieService;

    @Override
    public List<AnnonceAppareilInformatique> findByPrixGreaterThan(double prix) {
        return annonceAppareilInformatiqueDao.findByPrixGreaterThan(prix);
    }

    @Override
    public List<AnnonceAppareilInformatique> findByPrixLessThan(double prix) {
        return annonceAppareilInformatiqueDao.findByPrixLessThan(prix);
    }

    @Override
    public List<AnnonceAppareilInformatique> findByPrixBetween(double prix1, double prix2) {
        return annonceAppareilInformatiqueDao.findByPrixBetween(prix1, prix2);
    }

    @Override

    public List<AnnonceAppareilInformatique> findByCategorieRef(String ref) {
        return annonceAppareilInformatiqueDao.findByCategorieRef(ref);
    }
    @Transactional
    @Override
    public int deleteByUserRef(String ref) {
        return annonceAppareilInformatiqueDao.deleteByUserRef(ref);
    }

    @Transactional
    @Override
    public int deleteByRef(String ref) {
        return annonceAppareilInformatiqueDao.deleteByRef(ref);
    }

    @Override
    public AnnonceAppareilInformatique findByRef(String ref) {
        return annonceAppareilInformatiqueDao.findByRef(ref);
    }

    @Override
    public int save(AnnonceAppareilInformatique annonceAppareilInformatique) {
        prepare(annonceAppareilInformatique);
        int res = validate(annonceAppareilInformatique);
        if (res > 0) {
            handleprocess(annonceAppareilInformatique);
        }
        return res;
    }

    public void prepare(AnnonceAppareilInformatique annonceAppareilInformatique) {
        User user = userService.findByRef(annonceAppareilInformatique.getUser().getRef());
        Categorie categorie = categorieService.findByRef(annonceAppareilInformatique.getCategorie().getRef());
        annonceAppareilInformatique.setUser(user);
        annonceAppareilInformatique.setCategorie(categorie);
    }

    public void handleprocess(AnnonceAppareilInformatique annonceAppareilInformatique) {
        annonceAppareilInformatiqueDao.save(annonceAppareilInformatique);
    }

    private int validate(AnnonceAppareilInformatique annonceAppareilInformatique) {
        if (findByRef(annonceAppareilInformatique.getRef()) != null) {
            return -1;
        } else if (annonceAppareilInformatique.getUser() == null) {
            return -2;
        } else if (annonceAppareilInformatique.getCategorie().getRef() == null) {
            return -3;
        } else {
            return 1;
        }
    }

    @Override
    public List<AnnonceAppareilInformatique> findAll() {
        return annonceAppareilInformatiqueDao.findAll();
    }
}
