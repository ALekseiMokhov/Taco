package com.example.Taco.data;

import com.example.Taco.Order;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface OrderRepository extends CrudRepository<Order,Long> {
    List<Order> findByDeliveryZip(String deliveryZip);

}