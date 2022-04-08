package com.example.miniavito.service.impl;

import com.example.miniavito.bean.AnnonceHeureSuplementaire;
import com.example.miniavito.bean.AnnonceImmobilier;
import com.example.miniavito.bean.User;
import com.example.miniavito.dao.UserDao;
import com.example.miniavito.service.facade.AnnonceHeureSuplementaireService;
import com.example.miniavito.service.facade.AnnonceImmobilierService;
import com.example.miniavito.service.facade.AnnonceVoitureService;
import com.example.miniavito.service.facade.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import javax.transaction.Transactional;
import java.util.List;

@Service
public class UserServiceImpl implements UserService {
    @Override
    public User findByLogin(String login) {
        return userDao.findByLogin(login);
    }
    @Override
    public User findByRef(String login) {
        return userDao.findByRef(login);
    }

    @Override
    public List<User> findByProf(boolean prof) {
        return userDao.findByProf(prof);
    }
    @Override
    public List<User> findAll() {
        return userDao.findAll();
    }
    @Override
    public int save(User user) {
        User user1 = findByRef(user.getRef())  ;
        if (user1 != null)
            return -1 ;
        else if(user.getPassword().length() <= 8)
            return -2;
        else{
            userDao.save(user);
            return 1 ;
        }



    }
    @Override
    public long count() {
        return userDao.count();
    }


    @Transactional
    @Override
    public int deleteByRef(String ref) {
        if(findByRef(ref) == null)
            return -1;
        else {
            int  res1 = annonceHeureSuplementaire.deleteByUserRef(ref);
            int  res2 = annonceImmobilier.deleteByUserRef(ref);
            int  res3 = annonceVoitureService.deleteByUserRef(ref);
            int res4 = userDao.deleteByRef(ref);
            return res1+res2+res3+res4 ;

        }
    }


    @Override
    public int seConnecter(User user) {
        {
            User user1 = findByLogin(user.getLogin());
            if (user == null)
                return -1;
            else if (!user.getPassword().equals(user.getPassword()))
                return -2;
            else
                return 1;
        }
    }
    @Override
    public int bloquer(String login) {
        User user = findByLogin(login);
        if (user == null)
            return -1;
        else if (user.isBlocked() == true)
            return -2;
        else {
            user.setBlocked(true);
            userDao.save(user);
            return 1;
        }
    }



    @Autowired
    private UserDao userDao;
    @Autowired
    private AnnonceHeureSuplementaireService annonceHeureSuplementaire;
    @Autowired
    private AnnonceImmobilierService annonceImmobilier;
    @Autowired
    private AnnonceVoitureService annonceVoitureService;
}
