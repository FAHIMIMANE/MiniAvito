package com.example.miniavito.ws;

import com.example.miniavito.bean.AnnonceImmobilier;
import com.example.miniavito.service.facade.AnnoceImmobilierService;
import com.example.miniavito.service.impl.AnnonceImmobilierImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/annonceimmobilier")
public class AnnonceImmobilierRest {
@PutMapping("/update")
    public void update(@RequestBody AnnonceImmobilier annonceimobilier){
    annoceImmobilierService.update(annonceimobilier);
}
@Autowired
    private AnnoceImmobilierService annoceImmobilierService;
}
