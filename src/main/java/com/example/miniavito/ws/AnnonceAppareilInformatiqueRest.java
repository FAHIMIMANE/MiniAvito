package com.example.miniavito.ws;

import com.example.miniavito.bean.AnnonceAppareilInformatique;
import com.example.miniavito.service.facade.AnnonceAppareilInformatiqueService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/annonceappareilinformatique")
public class AnnonceAppareilInformatiqueRest {
    @GetMapping("/findByPrixGreaterThan/prix/{prix}")
    public List<AnnonceAppareilInformatique> findByPrixGreaterThan(@PathVariable double prix) {
        return annonceAppareilInformatiqueService.findByPrixGreaterThan(prix);
    }
    @GetMapping("/findByPrixLessThan/prix/{prix}")
    public List<AnnonceAppareilInformatique> findByPrixLessThan(@PathVariable double prix) {
        return annonceAppareilInformatiqueService.findByPrixLessThan(prix);
    }
    @GetMapping("/findByPrixBetween/prix1/{prix1}/prix2/{prix2}")
    public List<AnnonceAppareilInformatique> findByPrixBetween(@PathVariable double prix1,@PathVariable double prix2) {
        return annonceAppareilInformatiqueService.findByPrixBetween(prix1, prix2);
    }
    @GetMapping("/findByCategorieRef/ref/{ref}")
    public List<AnnonceAppareilInformatique> findByCategorieRef(@PathVariable String ref) {
        return annonceAppareilInformatiqueService.findByCategorieRef(ref);
    }

    @Transactional
    @DeleteMapping("/ref/{ref}")
    public int deleteByRef(@PathVariable String ref) {
        return annonceAppareilInformatiqueService.deleteByRef(ref);
    }
    @GetMapping("/ref/{ref}")
    public AnnonceAppareilInformatique findByRef(@PathVariable String ref) {
        return annonceAppareilInformatiqueService.findByRef(ref);
    }
    @Transactional
    @DeleteMapping("/user/ref/{ref}")
    public int deleteByUserRef(@PathVariable String ref) {
        return annonceAppareilInformatiqueService.deleteByUserRef(ref);
    }

    @PostMapping("/")
    public int save(@RequestBody AnnonceAppareilInformatique annonceAppareilInformatique) {
        return annonceAppareilInformatiqueService.save(annonceAppareilInformatique);
    }
    @GetMapping("/")
    public List<AnnonceAppareilInformatique> findAll() {
        return annonceAppareilInformatiqueService.findAll();
    }

    @Autowired
    private AnnonceAppareilInformatiqueService annonceAppareilInformatiqueService;
}
