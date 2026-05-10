package com.example.FoodOrder.Model;

import com.fasterxml.jackson.annotation.JsonBackReference;
import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "food")
public class Foods {
    @Id
    private int foodId;
    private String foodName;
    private int quantity;
    @ManyToOne
    @JoinColumn(name = "hotelid")
    @JsonBackReference
    private Hotels hotel;
}