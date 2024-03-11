package com.hb.orderservice;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Repository;

@Repository
@Scope("prototype")
public class OrderRepositoryOracleImpl implements OrderRepository{
}
