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
       if(findByRef(annonceImmobilier.getRef())!=null)
           return -1;
       else if(UserService.findByRef(annonceImmobilier.getRefUser())==true)
           return -2;
       else if(TypeImmobilierService.findByRef(annonceImmobilier.getRefTypeImmobilier()==true))
            return -3;


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
