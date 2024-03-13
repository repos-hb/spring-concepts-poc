package com.hb.orderservice.controller;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Order {

    int id;
    String item;
    String price;
    String qty;
    String total;
}
