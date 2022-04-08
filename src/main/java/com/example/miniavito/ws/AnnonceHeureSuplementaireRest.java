package com.example.miniavito.ws;


import com.example.miniavito.bean.AnnonceHeureSuplementaire;
import com.example.miniavito.service.facade.AnnonceHeureSuplementaireService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

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

    @GetMapping("/findByMontantLessThanEqual/montant/{montant}")
    public List<AnnonceHeureSuplementaire> findByMontantLessThanEqual(@PathVariable double montant) {
        return annonceHeureSuplementaireService.findByMontantLessThanEqual(montant);
    }

    @GetMapping("/findByMontantGreaterThanEqual/montant/{montant}")
    public List<AnnonceHeureSuplementaire> findByMontantGreaterThanEqual(@PathVariable double montant) {
        return annonceHeureSuplementaireService.findByMontantGreaterThanEqual(montant);
    }

    @GetMapping("/findByMatiereRef/Matiere/ref/{ref}")
    public List<AnnonceHeureSuplementaire> findByMatiereRef(@PathVariable String ref) {
        return annonceHeureSuplementaireService.findByMatiereRef(ref);
    }

    @GetMapping("/findByJourDisponnibilite/jourDisponibilite/{jourDisponibilite}")
    public List<AnnonceHeureSuplementaire> findByJourDisponnibilite(@PathVariable String jourDisponibilite) {
        return annonceHeureSuplementaireService.findByJourDisponnibilite(jourDisponibilite);
    }

    @PutMapping("/update")
    public int update(@RequestBody AnnonceHeureSuplementaire annonceHeureSuplementaire) {
        return annonceHeureSuplementaireService.update(annonceHeureSuplementaire);
    }
}
