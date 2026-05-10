package com.example.FoodOrder.Repository;

import com.example.FoodOrder.Model.Hotels;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface HotelsRepo extends JpaRepository<Hotels,Integer> {

}
