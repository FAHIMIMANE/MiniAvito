package com.example.miniavito.service.facade;

import com.example.miniavito.bean.AnnonceImmobilier;
import com.example.miniavito.bean.TypeImmobilier;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

public interface TypeImmobilierService {
    List<TypeImmobilier> findAll();
    TypeImmobilier findByRef(String ref);
    List<AnnonceImmobilier> findByLibelle(String libelle);
    public int save(TypeImmobilier typeImmobilier) ;

    int deleteByRef(String ref);

}
