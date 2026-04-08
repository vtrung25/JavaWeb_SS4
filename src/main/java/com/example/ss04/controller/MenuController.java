package com.example.ss04.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;


//B2
@Controller
public class MenuController {
    @GetMapping("/menu")
    @ResponseBody
    public String getMenu(@RequestParam(value = "category", required = false, defaultValue = "chay") String category){

        return "Loai mon: " + category;
    }

    //B4
    @GetMapping("/products")
    public String getProducts(
            @RequestParam(value = "category", required = false,defaultValue = "thiet bi") String category,
            @RequestParam(value = "limit", required = false, defaultValue = "1") int limit,
            ModelMap modelMap
    ){
        modelMap.addAttribute("category", category);
        modelMap.addAttribute("limit", limit);
        modelMap.addAttribute("messges", "Kiểm tra thành công");

        return "productList";
    }

}
