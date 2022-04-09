package com.example.miniavito.service.impl;

import com.example.miniavito.bean.*;
import com.example.miniavito.dao.AnnonceImmobilierDao;
import com.example.miniavito.dao.TypeImmobilierDao;
import com.example.miniavito.service.facade.AnnoceImmobilierService;
import com.example.miniavito.service.facade.TypeImmobilierService;
import com.example.miniavito.service.facade.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class AnnonceImmobilierImpl implements AnnoceImmobilierService {

    @Autowired
    private AnnonceImmobilierDao annonceImmobilierDao;
    @Autowired
    private TypeImmobilierService typeImmobilierService;
    @Autowired
    private UserService userService;
    @Override
    public int save(AnnonceImmobilier annonceImmobilier) {
        prepare(annonceImmobilier);
      int res=validate(annonceImmobilier);
      if(res>0){
          handleprocess(annonceImmobilier);
      }
        return res;
    }

    @Override
    public List<AnnonceImmobilier> findAll() {
        return annonceImmobilierDao.findAll();
    }
    @Transactional
    @Override
    public int deleteByUserRef(String ref) {
        return annonceImmobilierDao.deleteByUserRef(ref);
    }



   @Transactional
    @Override
    public int deleteByRef(String ref) {
        return annonceImmobilierDao.deleteByRef(ref);
    }

    @Override
    public AnnonceImmobilier findByRef(String ref) {
        return annonceImmobilierDao.findByRef(ref);
    }

    @Override
    public List<AnnonceImmobilier> findByRefVille(String refVille) {
        return annonceImmobilierDao.findByRefVille(refVille);
    }

    @Override
    public List<AnnonceImmobilier> findByTypeAnnonce(String typeAnnonce) {
        return annonceImmobilierDao.findByTypeAnnonce(typeAnnonce);
    }

    @Override
    public List<AnnonceImmobilier> findByPrixLessThanEqual(double prix) {
        return null;
    }

    @Override
    public List<AnnonceImmobilier> findByPrixGreaterThanEqual(double prix) {
        return null;
    }



    @Override
    public List<AnnonceImmobilier> findByPrixNonExistant() {
        return annonceImmobilierDao.findByPrixNonExistant();
    }





    void prepare(AnnonceImmobilier annonceImmobilier){
        TypeImmobilier typeImmobilier=typeImmobilierService.findByRef(annonceImmobilier.getTypeImmobilier().getRef());
        annonceImmobilier.setTypeImmobilier(typeImmobilier);
        User user=userService.findByRef(annonceImmobilier.getUser().getRef());
        annonceImmobilier.setUser(user);
    }
    int validate(AnnonceImmobilier annonceImmobilier){
        if(annonceImmobilierDao.findByRef(annonceImmobilier.getRef())!=null)
            return -1;
        else if(isUserExist(annonceImmobilier.getUser())==true)
            return -2;
        else if(typeImmobilierService.findByRef(annonceImmobilier.getTypeImmobilier().getRef())==null)
            return -3;
        else if (isPrixNegatif(annonceImmobilier.getPrix())==true)
            return -4;
        else
            return 1;
    }
    void handleprocess(AnnonceImmobilier annonceImmobilier){
        annonceImmobilierDao.save(annonceImmobilier);

    }

    public int update(AnnonceImmobilier annonceImmobilier){

        if (annonceImmobilierDao.findByRef(annonceImmobilier.getRef())==null)
            return -1;
        else if (isUserExist(annonceImmobilier.getUser())==true)
            return -2;
        else if (isPrixNegatif(annonceImmobilier.getPrix())==true)
            return -4;
        else
            annonceImmobilierDao.save(annonceImmobilier);
        return 1;
    }
    private boolean isUserExist(User user){
        return user==null;
    }
   /* private boolean isTypeImmobilierExist(TypeImmobilier typeImmobilier){
        return typeImmobilier==null;*/

}
    private boolean isPrixNegatif(double prix){
        return prix<0;
    }
   }
