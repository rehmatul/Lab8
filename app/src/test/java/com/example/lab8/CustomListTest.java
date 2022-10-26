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
        CustomList list1;
        list1 = new CustomList(null, new ArrayList<City>());
        list1.addCity(new City("Estevan", "SK"));
        int listSize = list1.getCount();
        list1.DeleteCity(new City("Estevan", "SK"));
        assertEquals(list1.getCount(),listSize);

    }
    @Test
    public void HasCityTest(){
        CustomList list2 = new CustomList(null, new ArrayList<City>());
        City city = (new City("Estevan", "SK"));
        list2.addCity(city);
        assertEquals(true, list2.hasCity(city));

    }
    @Test
    public void CountCitiesTest(){
        list = new CustomList(null, new ArrayList<City>());
        list.addCity(new City("Estevan", "SK"));
        int listSize = list.getCount();
        assertEquals(listSize, list.CountCities());

    }



}

