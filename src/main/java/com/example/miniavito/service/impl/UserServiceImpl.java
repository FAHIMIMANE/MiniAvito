package com.example.miniavito.service.impl;

import com.example.miniavito.bean.Matiere;
import com.example.miniavito.bean.User;
import com.example.miniavito.dao.UserDao;
import com.example.miniavito.service.facade.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


import java.util.List;

@Service
public class UserServiceImpl implements UserService {
    @Override
    public User findByLogin(String login) {
        return userDao.findByLogin(login);
    }

    @Override
    public User findByRef(String ref) {
        return userDao.findByRef(ref);
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
        User user1 = findByRef(user.getRef());
        if (user1 != null)
            return -1;
        else if (user.getPassword().length() < 8)
            return -2;
        else {
            userDao.save(user);
            return 1;
        }

    }

    @Override
    public long count() {
        return userDao.count();
    }

 @Transactional
    @Override
    public int deleteByRef(String ref) {
        if (findByRef(ref) == null)
            return -1;
        else {
            int res1 = annonceHeureSuplementaire.deleteByUserRef(ref);
            int res2 = annonceImmobilier.deleteByUserRef(ref);
            int res3 = annonceVoitureService.deleteByUserRef(ref);
            int res4 = userDao.deleteByRef(ref);
            return res1 + res2 + res3 + res4;

        }
    }

    @Autowired
    private UserDao userDao;
    @Autowired
    private AnnonceVoitureServiceImpl annonceVoitureService;
    @Autowired
    private AnnonceImmobilierImpl annonceImmobilier;
    @Autowired
    private AnnonceHeureSuplementaireImpl annonceHeureSuplementaire;

    @Override
    public int seConnecter(User user) {
        User user1 = userDao.findByLogin(user.getLogin());
        if (user1 == null)
            return -1;
        else if (!user1.getPassword().equals(user.getPassword()))
            return -2;
        else
            return 1;
    }

    @Override
    public int bloquer(User user) {
        User user1 = userDao.findByLogin(user.getLogin());
        if (user1 == null)
            return -1;
        else if (user1.isBlocked() == true)
            return -2;
        else {
            user1.setBlocked(true);
            userDao.save(user1);
            return 1;
        }
    }


    }

