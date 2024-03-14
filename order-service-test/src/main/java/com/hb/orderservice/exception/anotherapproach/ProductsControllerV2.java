package com.hb.orderservice.exception.anotherapproach;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class ProductsControllerV2 {

    @GetMapping("/v2/prod/{prodId}")
    public void getprod(@PathVariable String prodId){
        List<String> products = new ArrayList<>();
        // fetch all from db
        try {
            if(products.isEmpty())
                throw new EmptyInventoryException("Inventory empty!");
            else if (!products.contains(prodId)) {
                throw new ProductNotAvailableException("Product unavailable");
            }
        } catch (Exception e) {
            throw new BusinessExceptions(e);
        }
    }
}
