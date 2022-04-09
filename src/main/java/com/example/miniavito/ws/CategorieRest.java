package com.example.miniavito.ws;

import com.example.miniavito.bean.Categorie;
import com.example.miniavito.service.facade.CategorieService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/categorie")
public class CategorieRest {
    @GetMapping("/ref/{ref}")
    public Categorie findByRef(@PathVariable String ref) {
        return categorieService.findByRef(ref);
    }

    @GetMapping("/")
    public List<Categorie> findAll() {
        return categorieService.findAll();
    }

    @PostMapping("/")
    public int save(@RequestBody Categorie categorie) {
        return categorieService.save(categorie);
    }

    @Transactional
    @DeleteMapping("/ref/{ref}")
    public int deleteByRef(@PathVariable String ref) {
        return categorieService.deleteByRef(ref);
    }

    @Autowired
    private CategorieService categorieService;
}
