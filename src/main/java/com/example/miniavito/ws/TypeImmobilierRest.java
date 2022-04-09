package com.example.miniavito.ws;

import com.example.miniavito.bean.AnnonceImmobilier;
import com.example.miniavito.bean.TypeImmobilier;
import com.example.miniavito.service.facade.AnnoceImmobilierService;
import com.example.miniavito.service.facade.TypeImmobilierService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/typeImmobilierr")
public class TypeImmobilierRest {
    @GetMapping("/ref/{ref}")
    public TypeImmobilier findByRef(@PathVariable String ref) {
        return typeImmobilier.findByRef(ref);
    }
  @PostMapping("/")
    public int save(@RequestBody TypeImmobilier typeImmobilier) {
        return this.typeImmobilier.save(typeImmobilier);
    }
  @GetMapping("/")
    public List<TypeImmobilier> findAll() {
        return typeImmobilier.findAll();
    }
    @GetMapping("/libelle/{libelle}")
    public List<AnnonceImmobilier> findByLibelle(@PathVariable String libelle) {
        return typeImmobilier.findByLibelle(libelle);
    }
  @DeleteMapping("/ref/{ref}")
  @Transactional
    public int deleteByRef(@PathVariable String ref) {
        return typeImmobilier.deleteByRef(ref);
    }

    @Autowired
    private TypeImmobilierService typeImmobilier;
}
