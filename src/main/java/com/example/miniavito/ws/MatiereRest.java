package com.example.miniavito.ws;


import com.example.miniavito.bean.Matiere;
import com.example.miniavito.service.facade.MatiereService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/matiere")
public class MatiereRest {
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
    @DeleteMapping("/ref/{re}")
    public int deleteByRef(@PathVariable String ref) {
        return matiereService.deleteByRef(ref);
    }
    @PutMapping("/")
    public int update(@RequestBody Matiere matiere) {
        return matiereService.update(matiere);
    }
}
