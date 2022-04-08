package com.example.miniavito.ws;

import com.example.miniavito.bean.AnnonceVoiture;
import com.example.miniavito.service.facade.AnnonceVoitureService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/annoncevoiture")
public class AnnonceVoitureRest {

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
