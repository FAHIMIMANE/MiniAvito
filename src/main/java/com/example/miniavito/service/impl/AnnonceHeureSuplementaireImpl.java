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

    @Override
    public int deleteByUserRef(String ref) {

        return annonceHeureSuplementaireDao.deleteByUserRef(ref);
    }

    public AnnonceHeureSuplementaire findByRef(String ref) {
        return annonceHeureSuplementaireDao.findByRef(ref);
    }

    public List<AnnonceHeureSuplementaire> findByMontantLessThanEqual(double montant){
        return annonceHeureSuplementaireDao.findByMontantLessThanEqual(montant);
    }
    public List<AnnonceHeureSuplementaire> findByMontantGreaterThanEqual(double montant){
        return annonceHeureSuplementaireDao.findByMontantGreaterThanEqual(montant);
    }

    public List<AnnonceHeureSuplementaire> findByMatiereRef(String ref){
        return annonceHeureSuplementaireDao.findByMatiereRef(ref);
    }


    public List<AnnonceHeureSuplementaire> findByJourDisponnibilite(String jourDisponibilite){
        return annonceHeureSuplementaireDao.findByJourDisponnibilite(jourDisponibilite);
    }



    public int save(AnnonceHeureSuplementaire annonceHeureSuplementaire) {

            prepare(annonceHeureSuplementaire);
            int res=validate(annonceHeureSuplementaire);
            if (res==1){
                if (findByRef(annonceHeureSuplementaire.getRef())!=null){
                    return -4;
                }else{
                    annonceHeureSuplementaireDao.save(annonceHeureSuplementaire);
                    return 1;
                }
            }else{
                return -5;
            }


    }

    public int update(AnnonceHeureSuplementaire annonceHeureSuplementaire){
        prepare(annonceHeureSuplementaire);
        if(findByRef(annonceHeureSuplementaire.getRef()) == null){
            return -1;
        }else if(isUserExist(annonceHeureSuplementaire.getUser()) == false){
            return -2;
        }else if(isMatiereExist(annonceHeureSuplementaire.getMatiere()) == false) {
            return -3;
        }else if(annonceHeureSuplementaire.getMontant()<0){
            return -4;
        }else{
            annonceHeureSuplementaireDao.save(annonceHeureSuplementaire);
            return 1;
        }

    }

    public void prepare(AnnonceHeureSuplementaire annonceHeureSuplementaire){
        User user=userService.findByRef(annonceHeureSuplementaire.getUser().getRef());
        Matiere matiere=matiereService.findByRef(annonceHeureSuplementaire.getMatiere().getRef());
        annonceHeureSuplementaire.setMatiere(matiere);
        annonceHeureSuplementaire.setUser(user);
    }

    public int validate(AnnonceHeureSuplementaire annonceHeureSuplementaire){
        if(findByRef(annonceHeureSuplementaire.getRef()) != null){
            return -1;
        }else if(isUserExist(annonceHeureSuplementaire.getUser()) == false){
            return -2;
        }else if(isMatiereExist(annonceHeureSuplementaire.getMatiere()) == false){
            return -3;
        }else if(annonceHeureSuplementaire.getMontant()<0){
            return -4;
        }
        else{
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
