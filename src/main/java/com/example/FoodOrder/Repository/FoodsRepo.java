package com.example.FoodOrder.Repository;

import com.example.FoodOrder.Model.Foods;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface FoodsRepo extends JpaRepository<Foods,Integer>{
        List<Foods> findByfoodName(String foodName);
}
