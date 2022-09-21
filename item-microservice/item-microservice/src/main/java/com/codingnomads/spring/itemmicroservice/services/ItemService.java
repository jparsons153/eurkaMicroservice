package com.codingnomads.spring.itemmicroservice.services;

import com.codingnomads.spring.itemmicroservice.models.Item;
import com.codingnomads.spring.itemmicroservice.repos.ItemRepository;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ItemService {

    @Autowired
    ItemRepository itemRepository;

    public List<Item> getAllItems(){return itemRepository.findAllItems();}

    public Item getItemById(Long id) {
        Optional<Item> optional;
        if ((optional = itemRepository.findById(id)).isEmpty()) {
            return null;
        } else {
            return optional.get();
        }
    }

    public Item insertNewItem(Item item) {
        return itemRepository.save(item);
    }

    public Item updateItem(Item updatedItem) {
        Item item = itemRepository.findByName(updatedItem.getName());
        BeanUtils.copyProperties(updatedItem, item);
        return itemRepository.save(item);
    }

    public void deleteItemById(Long id) {
        itemRepository.deleteById(id);
    }
}
