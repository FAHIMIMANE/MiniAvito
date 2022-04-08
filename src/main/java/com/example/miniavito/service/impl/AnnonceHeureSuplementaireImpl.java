package com.example.miniavito.service.impl;

import com.example.miniavito.bean.AnnonceHeureSuplementaire;
import com.example.miniavito.bean.Matiere;
import com.example.miniavito.bean.User;
import com.example.miniavito.dao.AnnonceHeureSuplementaireDao;
import com.example.miniavito.service.facade.AnnonceHeureSuplementaireService;
import com.example.miniavito.service.facade.MatiereService;
import com.example.miniavito.service.facade.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AnnonceHeureSuplementaireImpl implements AnnonceHeureSuplementaireService {
    @Autowired
    private AnnonceHeureSuplementaireDao annonceHeureSuplementaireDao;

    @Autowired
    private UserService userService;

    @Autowired
    private MatiereService matiereService;

    public AnnonceHeureSuplementaire findByRef(String ref) {
        return annonceHeureSuplementaireDao.findByRef(ref);
    }

    public List<AnnonceHeureSuplementaire> findByMontantLessThanEqual(double montant){
        return annonceHeureSuplementaireDao.findByMontantLessThanEqual(montant);
    }
    public List<AnnonceHeureSuplementaire> findByMontantGreaterThanEqual(double montant){
        return annonceHeureSuplementaireDao.findByMontantGreaterThanEqual(montant);
    }

    public List<AnnonceHeureSuplementaire> findByRefMatiere(String refMatiere){
        return annonceHeureSuplementaireDao.findByRefMatiere(refMatiere);
    }

    public List<AnnonceHeureSuplementaire> findByJourDisponibilite(String jourDisponibilite){
        return annonceHeureSuplementaireDao.findByJourDisponibilite(jourDisponibilite);
    }



    public int save(AnnonceHeureSuplementaire annonceHeureSuplementaire) {

        if(findByRef(annonceHeureSuplementaire.getRef()) != null){
            return -1;
        }else if(isUserExist(userService.findByRef(annonceHeureSuplementaire.getRefUser())) == false){
            return -2;
        }else if(isMatiereExist(matiereService.findByRef(annonceHeureSuplementaire.getRefMatiere())) == false){
            return -3;

        }else{
            annonceHeureSuplementaireDao.save(annonceHeureSuplementaire);
            return 1;
        }
    }




    private boolean isUserExist(User user) {
        return user!=null;
    }

    private boolean isMatiereExist(Matiere matiere) {
        return matiere!=null;
    }

    private boolean isAnnonceHeureSuplementaireExist(AnnonceHeureSuplementaire annonceHeureSuplementaire) {
        return annonceHeureSuplementaire!=null;
    }

}
