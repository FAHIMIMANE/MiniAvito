package com.example.miniavito.ws;

import com.example.miniavito.bean.AnnonceImmobilier;
import com.example.miniavito.bean.TypeImmobilier;
import com.example.miniavito.service.facade.AnnoceImmobilierService;
import com.example.miniavito.service.impl.AnnonceImmobilierImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.transaction.Transactional;
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
    public List<AnnonceImmobilier> findByMontantLessThanEqual(@PathVariable double montant) {
        return annoceImmobilierService.findByMontantLessThanEqual(montant);
    }
    @GetMapping("/findByMontantGreaterThanEqual/montant/{montant}")
    public List<AnnonceImmobilier> findByMontantGreaterThanEqual(double montant) {
        return annoceImmobilierService.findByMontantGreaterThanEqual(montant);
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
