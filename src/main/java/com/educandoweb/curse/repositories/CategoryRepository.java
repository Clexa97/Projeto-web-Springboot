package com.educandoweb.curse.repositories;

import com.educandoweb.curse.entites.Category;
import com.educandoweb.curse.entites.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository<Category, Long> {


}
