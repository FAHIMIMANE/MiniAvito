package com.example.miniavito.service.impl;

import com.example.miniavito.bean.*;
import com.example.miniavito.dao.AnnonceImmobilierDao;
import com.example.miniavito.service.facade.AnnoceImmobilierService;
import com.example.miniavito.service.facade.TypeImmobilierService;
import com.example.miniavito.service.facade.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
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
        else if(isTypeImmobilierExist(annonceImmobilier.getTypeImmobilier())==true)
            return -3;
        else if (isPrixNegatif(annonceImmobilier.getPrix())==true)
            return -4;
        else
            return 1;
    }
    void handleprocess(AnnonceImmobilier annonceImmobilier){

        annonceImmobilierDao.save(annonceImmobilier);

    }
    int update(AnnonceImmobilier annonceImmobilier){
        if (annonceImmobilier==null)
            return -1;
        else if (isUserExist(annonceImmobilier.getUser())==true)
            return -2;
        else if (isPrixNegatif(annonceImmobilier.getPrix())==true)
            return -4;
        else
            annonceImmobilierDao.save(annonceImmobilier);
        return 1;
    }
    @Transactional
    @Override
    public int deleteByUserRef(String ref) {
        return annonceImmobilierDao.deleteByUserRef(ref);
    }

    @Override
    public AnnonceImmobilier findByRef(String ref) {
        return annonceImmobilierDao.findByRef(ref);
    }
    public List<AnnonceImmobilier> findAll() {
        return  AnnonceImmobilierDao.findAll();
    }


    private boolean isUserExist(User user){
        return user==null;
    }
    private boolean isTypeImmobilierExist(TypeImmobilier typeImmobilier){
        return typeImmobilier==null;

}
    private boolean isPrixNegatif(double prix){
        return prix<0;
    }



    public int deleteByRef(String ref) {
        return annonceImmobilierDao.deleteByRef(ref);
    }



    public int save(TypeImmobilier typeImmobilier) {
        return typeImmobilierService.save(typeImmobilier);
    }}
