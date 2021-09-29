package com.company.Лабораторная4;

import javax.naming.Name;

class TaskFour{
    public static void main(String[] args){

        Planet planetOne = new Planet("Меркурий", 0);
        Country countryOne = new Country("Россия", 146000000);
        System.out.println(planetOne.getName());
        System.out.println(countryOne.getName());


        NameAble planetTwo = creatNameAble("Юпитер", 79, true);
        System.out.println(planetTwo.getName());

        read(new Planet("Земля", 1));
        read(new Country("США", 332280000));
    }

    static NameAble creatNameAble(String name, int num, boolean option){
        if (option) return new Planet(name, num);
        else return new Country(name, num);
    }

    static void read(NameAble elem){
        System.out.println(elem.getName());
    }
}

interface NameAble{

    String getName();
}

class Planet implements NameAble{
    private String name;
    private int sputnics;

    public Planet(String name, int sputnics){
        this.name = name;
        this.sputnics = sputnics;
    }

    public String getName(){
        return "Название планеты: " + name + "\nВсего у нее спутников: " + sputnics;
    }

}

class Country implements NameAble{
    private String name;
    private int population;

    public Country(String name, int population){
        this.name = name;
        this.population = population;
    }

    public String getName(){
        return "Название страны: " + name + "\nНаселение страны: " + population;
    }
}