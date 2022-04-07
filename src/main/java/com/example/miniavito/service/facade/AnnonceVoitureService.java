package com.example.miniavito.service.facade;

import com.example.miniavito.bean.AnnonceVoiture;

import java.util.List;

public interface AnnonceVoitureService {
//;;
    List<AnnonceVoiture> findByRefCarburant(String refCarburant);
}
