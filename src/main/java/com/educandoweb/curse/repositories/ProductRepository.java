package com.educandoweb.curse.repositories;

import com.educandoweb.curse.entites.Category;
import com.educandoweb.curse.entites.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {


}
