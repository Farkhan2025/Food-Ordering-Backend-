package com.example.FoodOrder.Controller;

import com.example.FoodOrder.Model.Hotels;
import com.example.FoodOrder.Service.HotelsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin("*")
public class HotelController {

    @Autowired
     HotelsService service;

    @PostMapping("/hotel")
    public String addHotel(@RequestBody Hotels hotel) {
         service.addHotel(hotel);
         return "Hotel Added";
    }

    @GetMapping("/hotel")
    public List<Hotels> getAllHotels() {

        return service.getAllHotels();
    }

    @GetMapping("/hotel/{id}")
    public Hotels getHotelById(@PathVariable int id) {

        return service.getHotelById(id);
    }

    @PutMapping("/hotel")
    public Hotels updateHotel(@RequestBody Hotels hotel) {

        return service.updateHotel(hotel);
    }

    @DeleteMapping("/hotel/{id}")
    public String deleteHotel(@PathVariable int id) {
        service.deleteHotel(id);
        return "Hotel Deleted";

    }
}