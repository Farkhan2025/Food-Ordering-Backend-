package com.example.FoodOrder.Service;

import com.example.FoodOrder.Model.FoodOrder;
import com.example.FoodOrder.Model.Foods;
import com.example.FoodOrder.Repository.FoodsOrderRepo;
import com.example.FoodOrder.Repository.FoodsRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FoodOrderService {

    @Autowired
    private FoodsOrderRepo repo;

    @Autowired
    private FoodsRepo foodRepo;

    // CREATE ORDER (Auto quantity reduce)
    public FoodOrder addOrder(FoodOrder order) {

        Foods food = foodRepo.findById(order.getFoodId()).orElse(null);

        if (food != null && food.getQuantity() >= order.getQuantityOrdered()) {

            // reduce quantity
            food.setQuantity(food.getQuantity() - order.getQuantityOrdered());
            foodRepo.save(food);

            return repo.save(order);
        }

        return null; // not enough quantity
    }

    public List<FoodOrder> getAllOrders() {
        return repo.findAll();
    }

    public FoodOrder getOrderById(int id) {
        return repo.findById(id).orElse(null);
    }

    public FoodOrder updateOrder(FoodOrder order) {
        return repo.save(order);
    }

    // DELETE (Cancel order → restore quantity)
    public void deleteOrder(int id) {

        FoodOrder order = repo.findById(id).orElse(null);

        if (order != null) {
            Foods food = foodRepo.findById(order.getFoodId()).orElse(null);

            if (food != null) {
                food.setQuantity(food.getQuantity() + order.getQuantityOrdered());
                foodRepo.save(food);
            }

            repo.deleteById(id);
        }
    }

}