package com.example.miniavito.dao;

import com.example.miniavito.bean.AnnonceImmobilier;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AnnonceImmobilierDao extends JpaRepository<AnnonceImmobilier,Long> {
}
