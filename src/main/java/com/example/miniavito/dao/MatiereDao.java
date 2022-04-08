package com.example.miniavito.dao;


import com.example.miniavito.bean.Matiere;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MatiereDao extends JpaRepository<Matiere,Long> {
    Matiere findByRef(String ref);

}
