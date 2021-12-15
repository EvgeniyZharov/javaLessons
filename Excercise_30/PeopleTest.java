package com.company.Excercise_30;

import static org.junit.jupiter.api.Assertions.*;

class PeopleTest {

    @org.junit.jupiter.api.Test
    void getNameTest() {
        People people = new People("John", 45);
        assertEquals("John", people.getName());
    }

    @org.junit.jupiter.api.Test
    void setNameTest() {
        People people = new People("John", 45);
        people.setName("Jack");
        assertEquals("Jack", people.getName());

    }

    @org.junit.jupiter.api.Test
    void getAgeTest() {
        People people = new People("John", 45);
        assertEquals(45, people.getAge());
    }

    @org.junit.jupiter.api.Test
    void setAgeTest() {
        People people = new People("John", 45);
        people.setAge(35);
        assertEquals(35, people.getAge());
    }
}