package com.example.FoodOrder.Controller;

import com.example.FoodOrder.Model.FoodOrder;
import com.example.FoodOrder.Service.FoodOrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin("*")
public class FoodOrderController {

    @Autowired
    private FoodOrderService service;

    @PostMapping("/order")
    public String addOrder(@RequestBody FoodOrder order) {
         FoodOrder foodOrder = service.addOrder(order);
         if(foodOrder == null){
             return "Required Quantity is Not Available";
         }
         return "Order Placed Successfully";
    }

    @GetMapping("/order")
    public List<FoodOrder> getAllOrders() {
        return service.getAllOrders();
    }


    @GetMapping("/order/{id}")
    public FoodOrder getOrderById(@PathVariable int id) {
        return service.getOrderById(id);
    }

    @PutMapping("/order")
    public FoodOrder updateOrder(@RequestBody FoodOrder order) {
        return service.updateOrder(order);
    }

    @DeleteMapping("/order/{id}")
    public String deleteOrder(@PathVariable int id) {
        service.deleteOrder(id);
        return "Order Cancelled";
    }
}