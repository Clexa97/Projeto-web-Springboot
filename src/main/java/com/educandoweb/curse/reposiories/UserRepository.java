package com.educandoweb.curse.reposiories;

import com.educandoweb.curse.entites.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {


}
