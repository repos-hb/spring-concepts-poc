package com.hb.orderservice.exception;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class ProductsController {

    @GetMapping("/prod/{prodId}")
    public void getprod(@PathVariable String prodId){
        List<String> products = new ArrayList<>();
        // fetch all from db
        if(products.isEmpty())
            throw new EmptyInventoryException("Inventory empty!");
        else if (!products.contains(prodId)) {
            throw new ProductNotAvailableException("Product unavailable");
        }
    }
}
