package com.codingnomads.spring.usermicroservice.repos;

import com.codingnomads.spring.usermicroservice.models.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
    User findByUsername(String username);

    User findById(long id);

    User deleteById(long id);
}
