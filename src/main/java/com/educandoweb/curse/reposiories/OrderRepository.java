package com.educandoweb.curse.reposiories;

import com.educandoweb.curse.entites.Order;
import com.educandoweb.curse.entites.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order, Long> {


}
