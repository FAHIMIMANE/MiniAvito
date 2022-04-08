package com.example.miniavito.ws;


import com.example.miniavito.bean.AnnonceHeureSuplementaire;
import com.example.miniavito.service.facade.AnnonceHeureSuplementaireService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/annonceheuresuplementaire")
public class AnnonceHeureSuplementaireRest {

    @Autowired
    private AnnonceHeureSuplementaireService annonceHeureSuplementaireService;

    @PostMapping("/")
    public int save(@RequestBody AnnonceHeureSuplementaire annonceHeureSuplementaire) {
        return annonceHeureSuplementaireService.save(annonceHeureSuplementaire);
    }

    @GetMapping("/ref/{ref}")
    public AnnonceHeureSuplementaire findByRef(@PathVariable String ref) {
        return annonceHeureSuplementaireService.findByRef(ref);
    }
    @PutMapping("/update")
    public void update(@RequestBody AnnonceHeureSuplementaire annonceHeureSuplementaire){
        annonceHeureSuplementaireService.update(annonceHeureSuplementaire);
    }

}
