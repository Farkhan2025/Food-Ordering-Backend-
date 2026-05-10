package com.example.FoodOrder.Controller;

import com.example.FoodOrder.Model.Foods;
import com.example.FoodOrder.Service.FoodsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin("*")
public class FoodsController {

    @Autowired
    private FoodsService service;

    @PostMapping("/food")
    public Foods addFood(@RequestBody Foods food) {

        return service.addFood(food);
    }

    @GetMapping("/food")
    public List<Foods> getAllFoods() {

        return service.getAllFoods();
    }

    @GetMapping("/food/{id}")
    public Foods getFoodById(@PathVariable int id) {

        return service.getFoodById(id);
    }
    @GetMapping("order/foodname")
    public List<Foods> getbyfoodname(@RequestParam String foodName){
        return service.getbyfoodname(foodName);
    }

    @PutMapping("/food")
    public Foods updateFood(@RequestBody Foods food) {

        return service.updateFood(food);
    }

    @DeleteMapping("/food/{id}")
    public String deleteFood(@PathVariable int id) {
        service.deleteFood(id);
        return "Food Deleted";
    }
    @DeleteMapping("food")
    public String deleteAllFood(){
        service.deleteAllFood();
        return "All Foods Are Deleted";
    }
}