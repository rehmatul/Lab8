package com.example.lab8;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;

public class CustomListTest {
    private CustomList list;

//    @Before
//    public void createList(){
//        list = new CustomList(null, new ArrayList<City>());
//
//    }

    @Test
    public void addCityTest(){
        list = new CustomList(null, new ArrayList<City>());
        int listSize = list.getCount();
        list.addCity(new City("Estevan", "SK"));
        assertEquals(list.getCount(),listSize+1);

    }
    @Test
    public void DeleteCityTest(){
        list = new CustomList(null, new ArrayList<City>());
        list.addCity(new City("Estevan", "SK"));
        int listSize = list.getCount();
        list.DeleteCity(new City("Estevan", "SK"));
        assertEquals(list.getCount(),listSize-1);

    }
    @Test
    public void HasCityTest(){
        list = new CustomList(null, new ArrayList<City>());
        list.addCity(new City("Estevan", "SK"));
        assertEquals(true, list.hasCity(new City("Estevan", "SK")));

    }
    @Test
    public void CountCitiesTest(){
        list = new CustomList(null, new ArrayList<City>());
        list.addCity(new City("Estevan", "SK"));
        int listSize = list.getCount();
        assertEquals(listSize, list.CountCities());

    }



}

