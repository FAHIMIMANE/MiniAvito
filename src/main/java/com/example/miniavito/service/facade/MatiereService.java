package com.example.miniavito.service.facade;


import com.example.miniavito.bean.Matiere;

import java.util.List;

public interface MatiereService {

    Matiere findByRef(String ref);
    public int save(Matiere matiere);
    int deleteByRef (String ref );
    int update (Matiere matiere);
    List <Matiere> findAll();
}
