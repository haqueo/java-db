package com.daoimpl;

import com.dao.RestaurantDao;
import com.entities.Restaurant;
import com.util.ConnectionConfiguration;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;

public class RestaurantDaoImpl implements RestaurantDao {
    @Override
    public void createRestaurantTable() {
        Connection connection = null;
        Statement statement = null;

        try{
            connection = ConnectionConfiguration.getConnection();
            statement = connection.createStatement();
            statement.execute("CREATE TABLE IF NOT EXISTS restaurants (id int primary key unique AUTO_INCREMENT," +
                    " first_name varchar(55), last_name varchar(55))");
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (statement!= null){
                try {
                    statement.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }

            if (connection != null){
                try {
                    connection.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }

        }

    }

    @Override
    public void insert(Restaurant restaurant) {

    }

    @Override
    public Restaurant selectById(int id) {
        return null;
    }

    @Override
    public List<Restaurant> selectAll() {
        return null;
    }

    @Override
    public void delete(int id) {

    }

    @Override
    public void update(Restaurant restaurant, int id) {

    }
}
