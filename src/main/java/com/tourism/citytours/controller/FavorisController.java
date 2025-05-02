package com.tourism.citytours.controller;

import com.tourism.citytours.model.Favoris;
import com.tourism.citytours.service.FavorisService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/favoris")
public class FavorisController {

    @Autowired
    private FavorisService favorisService;

    @GetMapping
    public List<Favoris> getAllFavoris() {
        return favorisService.getAll();
    }

    @GetMapping("/{id}")
    public Favoris getFavorisById(@PathVariable Long id) {
        return favorisService.getById(id);
    }

    @PostMapping
    public Favoris createFavoris(@RequestBody Favoris favoris) {
        return favorisService.create(favoris);
    }

    @PutMapping("/{id}")
    public Favoris updateFavoris(@PathVariable Long id, @RequestBody Favoris favoris) {
        return favorisService.update(id, favoris);
    }

    @DeleteMapping("/{id}")
    public void deleteFavoris(@PathVariable Long id) {
        favorisService.delete(id);
    }
}
