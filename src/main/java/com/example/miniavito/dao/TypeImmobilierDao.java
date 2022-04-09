package com.example.miniavito.dao;

import com.example.miniavito.bean.AnnonceImmobilier;
import com.example.miniavito.bean.TypeImmobilier;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TypeImmobilierDao extends JpaRepository<TypeImmobilier,Long> {
  int deleteByRef (String ref);
  TypeImmobilier findByRef(String ref);
  List<AnnonceImmobilier> findByLibelle(String libelle);
}
