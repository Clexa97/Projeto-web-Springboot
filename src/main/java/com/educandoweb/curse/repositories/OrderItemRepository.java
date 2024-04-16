package com.educandoweb.curse.repositories;

import com.educandoweb.curse.entites.OrderItem;
import com.educandoweb.curse.entites.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {


}
