package com.company.Excercise_30;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CarTest {

    @Test
    void getBrandTest() {
        Car car = new Car("BMW", 2018);
        assertEquals("BMW", car.getBrand());
    }

    @Test
    void setBrandTest() {
        Car car = new Car("BMW", 2018);
        car.setBrand("Mercedes");
        assertEquals("Mercedes", car.getBrand());
    }

    @Test
    void getYearTest() {
        Car car = new Car("BMW", 2018);
        assertEquals(2018, car.getYear());
    }

    @Test
    void setYearTest() {
        Car car = new Car("BMW", 2018);
        car.setYear(2020);
        assertEquals(2020, car.getYear());
    }
}