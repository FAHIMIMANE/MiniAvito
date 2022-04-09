package com.example.miniavito.ws;

import com.example.miniavito.bean.AnnonceImmobilier;
import com.example.miniavito.bean.TypeImmobilier;
import com.example.miniavito.service.facade.AnnoceImmobilierService;
import com.example.miniavito.service.impl.AnnonceImmobilierImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;


import java.util.List;

@RestController
@RequestMapping("/api/v1/annonceimmobilier")
public class AnnonceImmobilierRest {
@PutMapping("/update")
    public void update(@RequestBody AnnonceImmobilier annonceimobilier){
    annoceImmobilierService.update(annonceimobilier);
}
@PostMapping("/")
    public int save(@RequestBody AnnonceImmobilier annonceImmobilier) {
        return annoceImmobilierService.save(annonceImmobilier);
    }
     @GetMapping("/")
    public List<AnnonceImmobilier> findAll() {
        return annoceImmobilierService.findAll();
    }
  @GetMapping("/ref/{ref}")
    public AnnonceImmobilier findByRef(@PathVariable String ref) {
        return annoceImmobilierService.findByRef(ref);
    }
   @GetMapping("/refVille/{refVille}")
    public List<AnnonceImmobilier> findByRefVille(@PathVariable String refVille) {
        return annoceImmobilierService.findByRefVille(refVille);
    }
    @GetMapping("/typeAnnonce/{typeAnnonce}")
    public List<AnnonceImmobilier> findByTypeAnnonce(@PathVariable String typeAnnonce) {
        return annoceImmobilierService.findByTypeAnnonce(typeAnnonce);
    }
   @GetMapping("/findByMontantLessThanEqual/montant/{montant}")
    public List<AnnonceImmobilier> findByMontantLessThanEqual(@PathVariable double prix) {
        return annoceImmobilierService.findByPrixLessThanEqual(prix);
    }
    @GetMapping("/findByMontantGreaterThanEqual/montant/{montant}")
    public List<AnnonceImmobilier> findByMontantGreaterThanEqual(@PathVariable double prix) {
        return annoceImmobilierService.findByPrixGreaterThanEqual(prix);
    }
  @GetMapping("/findByPrixNonExistant")
    public List<AnnonceImmobilier> findByPrixNonExistant() {
        return annoceImmobilierService.findByPrixNonExistant();
    }
    @DeleteMapping("/deleteByRef/ref/{ref}")
    @Transactional
    public int deleteByRef(@PathVariable String ref) {
        return annoceImmobilierService.deleteByRef(ref);
    }
  @DeleteMapping("/deleteByUserRef/ref/{ref}")
    @Transactional
    public int deleteByUserRef(@PathVariable String ref) {
        return annoceImmobilierService.deleteByUserRef(ref);
    }



    @Autowired
    private AnnoceImmobilierService annoceImmobilierService;
}
