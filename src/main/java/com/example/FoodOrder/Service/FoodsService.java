package com.example.FoodOrder.Service;

import com.example.FoodOrder.Model.Foods;
import com.example.FoodOrder.Repository.FoodsRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FoodsService {

    @Autowired
    private FoodsRepo repo;

    public Foods addFood(Foods food) {

        return repo.save(food);
    }

    public List<Foods> getAllFoods() {

        return repo.findAll();
    }

    public Foods getFoodById(int id) {

        return repo.findById(id).orElse(null);
    }

    public Foods updateFood(Foods food) {

        return repo.save(food);
    }

    public void deleteFood(int id) {
        repo.deleteById(id);
    }
    public void  deleteAllFood(){

        repo.deleteAll();
    }

    public List<Foods> getbyfoodname(String foodName) {
    return  repo.findByfoodName(foodName);
    }
}