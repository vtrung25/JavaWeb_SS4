package com.example.ss04.controller;

import com.example.ss04.reponsitory.OrderRepository;
import com.example.ss04.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.*;

//B1
@Controller
@Repository("/orders")
public class LegacyController {
    private final OrderService orderService;

    @Autowired
    public LegacyController(OrderService orderService){
        this.orderService =  orderService;
    }

    @GetMapping
    @ResponseBody
    public String getAllOrder(){
        return orderService.getAllOrder();
    }

    @GetMapping("/{id}")
    @ResponseBody
    public String getOrderById(@PathVariable int id){
        return orderService.getOrderById(id);
    }

    @PostMapping("/add")
    @ResponseBody
    public String addOrder(){
        return orderService.addOrder();
    }

    //B3
    //Cacsh A
//    @GetMapping("/{id}")
//    @ResponseBody
//    public String getOrderDetail(@PathVariable int id){
//        return "Chi tiet don hang so " + id;
//    }
//
//     Cach B
//    @GetMapping("/{id}")
//    @ResponseBody
//    public String getOrderDetail(@RequestParam(value = "id", required = false, defaultValue = "1") int id){
//        return "Chi tiet don hang so " + id;
//    }

    //B5
    @DeleteMapping("/cancel/{id}")
    @ResponseBody
    public String cancelOrder(@PathVariable Long id) {
        return orderService.cancelOrder(id);
    }
}
