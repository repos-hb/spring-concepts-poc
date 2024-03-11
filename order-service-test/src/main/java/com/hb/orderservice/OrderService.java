package com.hb.orderservice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.annotation.Resource;

@Service
public class OrderService {

    @Autowired
//    @Qualifier("orderRepositoryOracleImpl")   byType
//    @Resource(name = "orderRepositoryOracleImpl")   // byName
    private OrderRepository orderRepository;


    @Value("${order.value.threshold:200}")
    int thresholdValue;

    @PostConstruct
    public void init(){
        System.out.println("in postconstruct");
        System.out.println("threshold value: "+thresholdValue);
    }

    @PreDestroy
    public void del(){
        System.out.println("in predestroy");
    }
}
