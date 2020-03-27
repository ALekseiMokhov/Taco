package com.example.Taco.data;

import com.example.Taco.Order;

public interface OrderRepository {

    Order save(Order order);

}