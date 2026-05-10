package com.example.FoodOrder.Model;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "foodorder")
public class FoodOrder {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int orderid;
    private int foodId;
    private int quantityOrdered;




}
