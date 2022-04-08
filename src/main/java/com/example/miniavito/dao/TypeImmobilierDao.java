package com.example.miniavito.dao;

import com.example.miniavito.bean.TypeImmobilier;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TypeImmobilierDao extends JpaRepository<TypeImmobilier,Long> {
 TypeImmobilier findByReference (String reference);

}
