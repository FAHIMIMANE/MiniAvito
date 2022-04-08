package com.example.miniavito.ws;

import com.example.miniavito.bean.AnnonceImmobilier;
import com.example.miniavito.bean.TypeImmobilier;
import com.example.miniavito.service.facade.AnnoceImmobilierService;
import com.example.miniavito.service.facade.TypeImmobilierService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.transaction.Transactional;
import java.util.List;

@RestController
@RequestMapping("/api/v1/annonceimmobilier")
public class TypeImmobilierRest {
    @GetMapping("/ref/{ref}")
    public TypeImmobilier findByRef(@PathVariable String ref) {
        return typeImmobilier.findByRef(ref);
    }
  @PostMapping("/")
    public int save(@RequestBody TypeImmobilier typeImmobilier) {
        return this.typeImmobilier.save(typeImmobilier);
    }

    @Autowired
    private TypeImmobilierService typeImmobilier;
}
