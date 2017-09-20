package com.dao;

import com.entities.Restaurant;

import java.util.List;

public interface RestaurantDao {

    void createRestaurantTable();

    void insert(Restaurant restaurant);

    Restaurant selectById(int id);

    List<Restaurant> selectAll();

    void delete(int id);

    void update(Restaurant restaurant, int id);


}
