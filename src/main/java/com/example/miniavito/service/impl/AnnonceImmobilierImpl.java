package com.example.miniavito.service.impl;

import com.example.miniavito.bean.AnnonceImmobilier;
import com.example.miniavito.bean.TypeImmobilier;
import com.example.miniavito.bean.User;
import com.example.miniavito.dao.AnnonceImmobilierDao;
import com.example.miniavito.service.facade.AnnonceImmobilierService;
import com.example.miniavito.service.facade.TypeImmobilierService;
import com.example.miniavito.service.facade.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AnnonceImmobilierImpl implements AnnonceImmobilierService {

    @Autowired
    private AnnonceImmobilierDao annonceImmobilierDao;
    @Autowired
    private TypeImmobilierService typeImmobilierService;
    @Autowired
    private UserService userService;

    @Override
    public int save(AnnonceImmobilier annonceImmobilier){
        prepare(annonceImmobilier);
        int res = validate(annonceImmobilier);
        if (res>0){
            handleprocess(annonceImmobilier);
        }
    }


    void prepare(AnnonceImmobilier annonceImmobilier){
        TypeImmobilier typeImmobilier=typeImmobilierService.findByRef(annonceImmobilier.getTypeImmobilier().getRef());
        annonceImmobilier.setTypeImmobilier(typeImmobilier);
        User user = userService.findByRef(annonceImmobilier.getUser().getRef());
        annonceImmobilier.setUser(user);
     }
     int validate(AnnonceImmobilier annonceImmobilier){
         if(findByRef(annonceImmobilier.getRef())!=null)
             return -1;
         else if(isUserExist(annonceImmobilier.getUser())==true)
             return -2;
         else if(isTypeImmobilierExist(annonceImmobilier.getTypeImmobilier())==true))
             return -3;
         else
             return 1;
     }
     void handleprocess(AnnonceImmobilier annonceImmobilier) {


        annonceImmobilierDao.save(annonceImmobilier);


    }



     private boolean isUserExist(User user){
        return user!=null;
     }

    private boolean isTypeImmobilierExist(TypeImmobilier typeImmobilier){
        return typeImmobilier!=null;
    }




    public AnnonceImmobilier findByRef(String ref) {
        return annonceImmobilierDao.findByRef(ref);
    }

    public int deleteByRef(String ref) {
        return annonceImmobilierDao.deleteByRef(ref);
    }
}
