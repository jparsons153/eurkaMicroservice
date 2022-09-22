package com.codingnomads.spring.itemmicroservice.repos;

import com.codingnomads.spring.itemmicroservice.models.Item;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ItemRepository extends JpaRepository<Item, Long> {

    Item findById(long id);

    Item deleteById(long id);

    Item findByName(String name);

}
