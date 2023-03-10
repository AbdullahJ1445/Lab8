package com.example.lab8;


import static org.junit.jupiter.api.Assertions.assertEquals;


//import org.junit.Before;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

public class CustomListTest {

    private CustomList list;

    /**
     * create a mocklist for my citylist
     * @return
     */
    public CustomList MockCityList(){
        list = new CustomList(null, new ArrayList<>());
        return list;
    }

    /**
    * get the size of the list
    * increase the list by adding a new city
    * check if our current size matches the initial size plus one
    */

    @Test
    public void addCityTest(){
        list = MockCityList();
        int listSize = list.getCount();
        list.addCity(new City("Estevan", "SK"));
        assertEquals(list.getCount(),listSize + 1);
    }

    /**
     * has city test
     * check if the city is in the list
     * if it is, return true
     * if it is not, return false
     */

     @Test
     public void hasCityTest(){
         list = MockCityList();
         list.addCity(new City("Estevan", "SK"));
         assertEquals(list.hasCity("Estevan"), true);
     }

    /**
    * delete city test
    * check if the city is in the list
    * if it is, delete it
    * if it is not, return false
    */

    @Test
    public void deleteCityTest(){
        list = MockCityList();
        list.addCity(new City("Estevan", "SK"));
        list.deleteCity("Estevan");
        assertEquals(list.hasCity("Estevan"), false);
    }

    /**
    * count cities test
    * check if the city is in the list
    * if it is, return the number of cities
    * if it is not, return 0
    */

    @Test
    public void countCitiesTest(){
        list = MockCityList();
        list.addCity(new City("Estevan", "SK"));
        list.addCity(new City("Regina", "SK"));
        list.addCity(new City("Saskatoon", "SK"));
        assertEquals(list.countCities("SK"), 3);
    }

}
