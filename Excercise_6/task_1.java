package com.company.Excercise_6;

class TestInterface {
    public static void main(String[] args){
        Nameable planet_one;
        Nameable planet_two;
        Nameable car_one;
        Nameable animal_one;

        planet_one = new Planet("Земля");
        planet_two = new Planet("Марс");
        car_one = new Car("Мерседес");
        animal_one = new Animal("Лев");

        System.out.println(planet_one.getName());
        System.out.println(planet_two.getName());
        System.out.println(car_one.getName());
        System.out.println(animal_one.getName());

    }
}

interface Nameable{

    default String getName(){
        return "Эта сущность не имеет имени.";
    }
}

class Planet implements Nameable{
    private String name;

    Planet(String name){ this.name = name; }


    public String getName(){
        return "Эта планета называется: " + name;
    }
}

class Car implements Nameable{
    private String name;

    Car(String name){ this.name = name; }


    public String getName(){
        return "Машина марки: " + name;
    }
}

class Animal implements Nameable{
    private String name;

    Animal(String name){ this.name = name; }


    public String getName(){
        return "Животное: " + name;
    }
}

