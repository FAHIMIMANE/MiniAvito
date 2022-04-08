package com.example.miniavito.service.facade;


import com.example.miniavito.bean.Matiere;

public interface MatiereService {

    Matiere findByRef(String ref);
    public int save(Matiere matiere);
    int deleteByRef (String ref );
    void update(Matiere matiere);
}
