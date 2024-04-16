package com.educandoweb.curse.repositories;

import com.educandoweb.curse.entites.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order, Long> {


}
