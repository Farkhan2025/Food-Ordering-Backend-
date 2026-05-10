package com.example.FoodOrder.Repository;

import com.example.FoodOrder.Model.FoodOrder;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FoodsOrderRepo extends JpaRepository<FoodOrder, Integer> {
}
