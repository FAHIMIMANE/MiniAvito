package com.example.miniavito.service.impl;

import com.example.miniavito.bean.User;
import com.example.miniavito.bean.VetementAnnonce;
import com.example.miniavito.dao.VetementAnnonceDao;
import com.example.miniavito.service.facade.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class VetementAnnonceServiceImpl implements VetementAnnonceService {
    @Autowired
    private VetementAnnonceDao vetementAnnonceDao;
    @Autowired
    private UserService userService;
    @Override
    public VetementAnnonce findByRef(String ref) {
        return vetementAnnonceDao.findByRef(ref);
    }

    @Override
    public VetementAnnonce findByTaille(String taille) {
        return vetementAnnonceDao.findByTaille(taille);
    }

    @Override
    public VetementAnnonce findByPrixIsLessThanEqual(double prix) {
        return findByPrixIsLessThanEqual(prix);
    }

    @Override
    public List<VetementAnnonce> findAll() {
        return vetementAnnonceDao.findAll();
    }

    @Override
    public VetementAnnonce findByMarque(String marque) {
        return vetementAnnonceDao.findByMarque(marque);
    }

    @Override
    public int save(VetementAnnonce vetementAnnonce) {
        prepare(vetementAnnonce);
        int res = validate(vetementAnnonce);
        if( res < 0){
            return -1;
        }else{
            handlProcess(vetementAnnonce);
            return 1;
        }


    }

    private void prepare(VetementAnnonce vetementAnnonce ){
        User user= userService.findByRef(vetementAnnonce.getUser().getRef());
        vetementAnnonce.setUser(user);
    }
    private int validate(VetementAnnonce vetementAnnonce){
        if(findByRef(vetementAnnonce.getRef()) != null){
            return -1;
        }else if(vetementAnnonce.getUser() == null){
            return -2;
        }else if(vetementAnnonce.getPrix()<0){
            return -3;
        }
        else{
            return 1;
        }
    }
    private void handlProcess(VetementAnnonce vetementAnnonce){

        vetementAnnonceDao.save(vetementAnnonce);
    }

    @Override
    public int deleteByRef(String ref) {
        return vetementAnnonceDao.deleteByRef(ref);
    }

    @Override
    public int deleteByUserRef(String ref) {
        return vetementAnnonceDao.deleteByUserRef(ref);
    }

    @Override
    public VetementAnnonce findByPrixIsGreaterThanEqual(double prix) {
        return vetementAnnonceDao.findByPrixIsGreaterThanEqual(prix);
    }

    @Override
    public VetementAnnonce findByStyle(String style) {
        return vetementAnnonceDao.findByStyle(style);
    }

    @Override
    public VetementAnnonce findByCategories(String categories) {
        return vetementAnnonceDao.findByCategories(categories);
    }

    @Override
    public int update(VetementAnnonce vetementAnnonce) {
        if(findByRef(vetementAnnonce.getRef()) == null)
            return -1;
       else
           vetementAnnonceDao.save(vetementAnnonce);
       return 1;

    }
}
