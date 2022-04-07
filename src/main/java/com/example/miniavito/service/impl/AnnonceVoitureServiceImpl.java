package com.example.miniavito.service.impl;

import com.example.miniavito.bean.AnnonceVoiture;
import com.example.miniavito.dao.AnnonceVoitureDao;
import com.example.miniavito.service.facade.AnnonceVoitureService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AnnonceVoitureServiceImpl implements AnnonceVoitureService {
    @Autowired
    private AnnonceVoitureDao annonceVoitureDao;

    @Override
    public List<AnnonceVoiture> findByRefCarburant(String refCarburant) {
        return null;
    }
}
