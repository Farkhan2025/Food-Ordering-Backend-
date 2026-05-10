package com.example.FoodOrder.Service;

import com.example.FoodOrder.Model.Hotels;
import com.example.FoodOrder.Repository.HotelsRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class HotelsService {

    @Autowired
    private HotelsRepo repo;

    public Hotels addHotel(Hotels hotel) {
        return repo.save(hotel);
    }

    public List<Hotels> getAllHotels() {
        return repo.findAll();
    }

    public Hotels getHotelById(int id) {
        return repo.findById(id).orElse(null);
    }

    public Hotels updateHotel(Hotels hotel) {
        return repo.save(hotel);
    }

    public void deleteHotel(int id) {
        repo.deleteById(id);
    }
}