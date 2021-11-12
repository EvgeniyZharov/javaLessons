package com.company.Excercise_5;

class task_2 {
    public static void main(String[] args){
        Laika laika = new Laika("Бернард");
        Corgi corgi = new Corgi("Фергюс");

        System.out.println(laika.toString());
        System.out.println(corgi.toString());
    }
}

abstract class Dog{
    private String name;

    public Dog(String name){
        setName(name);
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
    public abstract String toString();
}

class Laika extends Dog{
    public Laika(String name){
        super(name);
    }

    public String toString(){
        return "Собака породы: лайка\nПо кличке: " + getName();
    }
}

class Corgi extends Dog{
    public Corgi(String name){
        super(name);
    }

    public String toString(){
        return "Собака породы: корги\nПо кличке: " + getName();
    }
}