package com.example.FoodOrder.Model;

import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.*;
import lombok.Data;

import java.util.List;

@Data
@Entity
@Table(name = "hotel")
public class Hotels{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer hotelid;
    private String hotelName;
    private String hotelLocation;
    @OneToMany(mappedBy = "hotel")
    @JsonManagedReference
    private List<Foods> foods;
}