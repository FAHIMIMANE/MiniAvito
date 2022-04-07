package com.example.miniavito.service.impl;

import com.example.miniavito.dao.AnnonceHeureSuplementaireDao;
import com.example.miniavito.service.facade.AnnonceHeureSuplementaireService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AnnonceHeureSuplementaireImpl implements AnnonceHeureSuplementaireService {
    @Autowired
    private AnnonceHeureSuplementaireDao annonceHeureSuplementaireDao;
}
