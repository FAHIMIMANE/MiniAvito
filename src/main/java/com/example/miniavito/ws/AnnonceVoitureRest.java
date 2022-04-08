package com.example.miniavito.ws;

import com.example.miniavito.bean.AnnonceVoiture;
import com.example.miniavito.service.facade.AnnonceVoitureService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/annoncevoiture")

public class AnnonceVoitureRest {
    @GetMapping("/ref-carburant/{ref-carburant}")
    public List<AnnonceVoiture> findByRefCarburant(@PathVariable String refCarburant) {
        return annonceVoitureService.findByRefCarburant(refCarburant);
    }

    @GetMapping("/user/ref/{ref}")
    public List<AnnonceVoiture> findByUserRef(@PathVariable String ref) {
        return annonceVoitureService.findByUserRef(ref);
    }

    @DeleteMapping("/user-delete/ref/{ref}")
    public int deleteByUserRef(@PathVariable String ref) {
        return annonceVoitureService.deleteByUserRef(ref);
    }

    @DeleteMapping("/ref/{ref}")
    public int deleteByRef(String ref) {
        return annonceVoitureService.deleteByRef(ref);
    }

    @GetMapping("/montant/{montant}")
    public List<AnnonceVoiture> findByMontant(double montant) {
        return annonceVoitureService.findByMontant(montant);
    }

    @GetMapping("/montant/{montant}/refmodel/{refmodel}")
    public List<AnnonceVoiture> findByMontantAndRefModel(double montant, String refModel) {
        return annonceVoitureService.findByMontantAndRefModel(montant, refModel);
    }

    @GetMapping("/montantlessthan/montant/{montant}")
    public List<AnnonceVoiture> findByMontantLessThanEqual(double montant) {
        return annonceVoitureService.findByMontantLessThanEqual(montant);
    }

    @GetMapping("/montantgreatherthan/montant/{montant}")
    public List<AnnonceVoiture> findByMontantGreaterThanEqual(double montant) {
        return annonceVoitureService.findByMontantGreaterThanEqual(montant);
    }

    @PutMapping("/")
    public int update(@RequestBody AnnonceVoiture annonceVoiture) {
        return annonceVoitureService.update(annonceVoiture);
    }

    @GetMapping("/")
    public List<AnnonceVoiture> findAll() {
        return annonceVoitureService.findAll();
    }

    @GetMapping("/ref/{ref}")
    public AnnonceVoiture findByRef(@PathVariable String ref) {
        return annonceVoitureService.findByRef(ref);
    }

    @PostMapping("/")
    public int save(@RequestBody AnnonceVoiture annonceVoiture) {
        return annonceVoitureService.save(annonceVoiture);
    }

    @Autowired
    private AnnonceVoitureService annonceVoitureService;

}