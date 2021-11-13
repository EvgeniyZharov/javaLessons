package com.company.Excercise_6;

class task_2 {
    public static void main(String[] args){
        Priceable dish_one;
        Priceable dish_two;
        Priceable furniture_one;

        dish_one = new Dish(1190);
        dish_two = new Dish(990);
        furniture_one = new Furniture(11490);

        System.out.println(dish_one.getPrice());
        System.out.println(dish_two.getPrice());
        System.out.println(furniture_one.getPrice());

    }
}

interface Priceable{
    default String getPrice(){
        return "Этот объект еще не оценили";
    }
}

class Dish implements Priceable{
    private double price;

    Dish(double price){ this.price = price; }

    public String getPrice(){
        return "Эта посуда стоит " + this.price + " рублей";
    }
}

class Furniture implements Priceable{
    private double price;

    Furniture(double price){ this.price = price; }

    public String getPrice(){
        return "Эта модель мебели стоит " + this.price + " рублей";
    }
}
