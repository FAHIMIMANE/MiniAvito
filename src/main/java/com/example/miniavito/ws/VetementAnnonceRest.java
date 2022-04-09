package com.example.miniavito.ws;


import com.example.miniavito.bean.User;
import com.example.miniavito.bean.VetementAnnonce;
import com.example.miniavito.service.impl.UserServiceImpl;
import com.example.miniavito.service.impl.VetementAnnonceServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/vetement-annonce")
public class VetementAnnonceRest {
    @GetMapping("/ref/{ref}")
    public VetementAnnonce findByRef(@PathVariable String ref) {
        return vetementAnnonceService.findByRef(ref);
    }
    @GetMapping("/taille/{taille}")
    public VetementAnnonce findByTaille(@PathVariable String taille) {
        return vetementAnnonceService.findByTaille(taille);
    }
    @GetMapping("/findByPrixIsLessThanEqual/prix/{prix}")
    public VetementAnnonce findByPrixIsLessThanEqual(@PathVariable double prix) {
        return vetementAnnonceService.findByPrixIsLessThanEqual(prix);
    }
  @GetMapping("/")
    public List<VetementAnnonce> findAll() {
        return vetementAnnonceService.findAll();
    }
    @GetMapping("/marque/{marque}")
    public VetementAnnonce findByMarque(@PathVariable String marque) {
        return vetementAnnonceService.findByMarque(marque);
    }
  @PostMapping("/")
    public int save(@RequestBody VetementAnnonce vetementAnnonce) {
        return vetementAnnonceService.save(vetementAnnonce);
    }
@DeleteMapping("/ref/{ref}")
@Transactional
    public int deleteByRef(@PathVariable String ref) {
        return vetementAnnonceService.deleteByRef(ref);
    }
  @GetMapping("/findByPrixIsGreaterThanEqual/prix/{prix}")
    public VetementAnnonce findByPrixIsGreaterThanEqual(@PathVariable double prix) {
        return vetementAnnonceService.findByPrixIsGreaterThanEqual(prix);
    }
  @GetMapping("/style/{style}")
    public VetementAnnonce findByStyle(@PathVariable String style) {
        return vetementAnnonceService.findByStyle(style);
    }
    @GetMapping("/categories/{categories}")
    public VetementAnnonce findByCategories(@PathVariable String categories) {
        return vetementAnnonceService.findByCategories(categories);
    }
  @PutMapping("/")
    public int update(@RequestBody VetementAnnonce vetementAnnonce) {
        return vetementAnnonceService.update(vetementAnnonce);
    }

    @Autowired
    private VetementAnnonceServiceImpl vetementAnnonceService ;

}
