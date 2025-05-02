package com.tourism.citytours.controller;

import com.tourism.citytours.model.Adresse;
import com.tourism.citytours.service.AdresseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/adresses")
public class AdresseController {

    @Autowired
    private AdresseService adresseService;

    @GetMapping
    public List<Adresse> getAllAdresses() {
        return adresseService.getAll();
    }

    @GetMapping("/{id}")
    public Adresse getAdresseById(@PathVariable Long id) {
        return adresseService.getById(id);
    }

    @PostMapping
    public Adresse createAdresse(@RequestBody Adresse adresse) {
        return adresseService.create(adresse);
    }

    @PutMapping("/{id}")
    public Adresse updateAdresse(@PathVariable Long id, @RequestBody Adresse adresse) {
        return adresseService.update(id, adresse);
    }

    @DeleteMapping("/{id}")
    public void deleteAdresse(@PathVariable Long id) {
        adresseService.delete(id);
    }
}
