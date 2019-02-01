package com.venkat.service;

import com.venkat.common.DBConnection;
import com.venkat.enity.City;

import java.io.Serializable;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class CityService implements Serializable {

    public List<City> fetchCities() throws SQLException, ClassNotFoundException {

        Connection connection = DBConnection.getInstance().getConnection();
        List<City> cities = new ArrayList<City>();
        String sql = "SELECT * FROM city";

        Statement statement = connection.createStatement();
        ResultSet resultSet = statement.executeQuery(sql);
        while(resultSet.next()){
            City city = new City();
            city.setName(resultSet.getString("Name"));
            city.setCode(resultSet.getString("CountryCode"));
            city.setCapital(resultSet.getString("District"));
            city.setPopulation(resultSet.getLong("Population"));
            cities.add(city);
        }

        return cities;
    }
}
