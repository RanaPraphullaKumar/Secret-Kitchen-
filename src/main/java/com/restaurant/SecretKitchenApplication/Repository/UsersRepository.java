package com.restaurant.SecretKitchenApplication.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.restaurant.SecretKitchenApplication.Entity.Users;

import java.util.Optional;

public interface UsersRepository extends JpaRepository<Users, Long> {
    Optional<Users> findByEmail(String email);
    boolean existsByEmail(String email);
}
