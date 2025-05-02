package com.tourism.citytours.controller;

import com.tourism.citytours.model.Hotel;
import com.tourism.citytours.service.HotelService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/hotels")
public class HotelController {

    @Autowired
    private HotelService hotelService;

    @GetMapping
    public List<Hotel> getAllHotels() {
        return hotelService.getAllHotels();
    }

    @GetMapping("/{id}")
    public Optional<Hotel> getHotelById(@PathVariable Long id) {
        return hotelService.getHotelById(id);
    }

    @PostMapping
    public Hotel createHotel(@RequestBody Hotel hotel) {
        return hotelService.saveHotel(hotel);
    }

    @PutMapping("/{id}")
    public Hotel updateHotel(@PathVariable Long id, @RequestBody Hotel updatedHotel) {
        Optional<Hotel> existing = hotelService.getHotelById(id);
        if (existing.isPresent()) {
            Hotel hotel = existing.get();
            hotel.setNom(updatedHotel.getNom());
            hotel.setAdresse(updatedHotel.getAdresse());
            hotel.setVille(updatedHotel.getVille());
            hotel.setPays(updatedHotel.getPays());
            hotel.setDescription(updatedHotel.getDescription());
            hotel.setPrixParNuit(updatedHotel.getPrixParNuit());
            hotel.setNombreEtoiles(updatedHotel.getNombreEtoiles());
            return hotelService.saveHotel(hotel);
        }
        return null;
    }

    @DeleteMapping("/{id}")
    public void deleteHotel(@PathVariable Long id) {
        hotelService.deleteHotel(id);
    }
}