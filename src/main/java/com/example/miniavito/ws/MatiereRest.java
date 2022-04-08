package com.example.miniavito.ws;


import com.example.miniavito.bean.Matiere;
import com.example.miniavito.service.facade.MatiereService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/matiere")
public class MatiereRest {
    @PutMapping("/update")
    public void update(@RequestBody Matiere matiere) {
        matiereService.update(matiere);
    }

    @Autowired
    private MatiereService matiereService;

    @PostMapping("/")
    public int save(@RequestBody Matiere matiere) {
        return matiereService.save(matiere);
    }

    @GetMapping("/ref/{ref}")
    public Matiere findByRef(@PathVariable String ref) {
        return matiereService.findByRef(ref);
    }
}
