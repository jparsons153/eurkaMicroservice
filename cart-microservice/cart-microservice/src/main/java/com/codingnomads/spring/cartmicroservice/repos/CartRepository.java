package com.codingnomads.spring.cartmicroservice.repos;

import com.codingnomads.spring.cartmicroservice.models.Cart;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CartRepository extends JpaRepository<Cart, Long> {
    findByUserId(userId)
}
