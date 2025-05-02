package com.tourism.citytours.controller;

import com.tourism.citytours.model.Avis;
import com.tourism.citytours.service.AvisService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/avis")
public class AvisController {

    @Autowired
    private AvisService avisService;

    @GetMapping
    public List<Avis> getAllAvis() {
        return avisService.getAll();
    }

    @GetMapping("/{id}")
    public Avis getAvisById(@PathVariable Long id) {
        return avisService.getById(id);
    }

    @PostMapping
    public Avis createAvis(@RequestBody Avis avis) {
        return avisService.create(avis);
    }

    @PutMapping("/{id}")
    public Avis updateAvis(@PathVariable Long id, @RequestBody Avis avis) {
        return avisService.update(id, avis);
    }

    @DeleteMapping("/{id}")
    public void deleteAvis(@PathVariable Long id) {
        avisService.delete(id);
    }
}
