package com.hb.orderservice.restendpointscenario1;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
public class ProductService {

    private static Map<String,List<String>> allProducts;

    public ProductService() {
        allProducts = new HashMap<>();
        List<String> items = new ArrayList<>();
        items.add("laptop");
        items.add("headphone");
        items.add("camera");
        allProducts.put("electronics",items);
    }

    @GetMapping("/search/{productType}")
    public ResponseEntity<List<String>> getProductsByProductType(@PathVariable String productType){
        List<String> list = allProducts.get(productType);
        return ResponseEntity.ok(list);
    }
}
