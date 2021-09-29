package com.company.Лабораторная3;

class TestClass{
    public static void main(String[] args){
        Plate plate_one = new Plate("стекло", 500, 20);
        Cup cup_one = new Cup("пластмас", 450, 25);

        plate_one.displayInfo();
        System.out.println();
        cup_one.displayInfo();
    }
}

abstract class Dish{
    private String material;
    private int price;
    public Dish(String material, int price){
        this.material = material;
        this.price = price;
    }

    public String getMaterial(){
        return material;
    }

    public int getPrice(){
        return price;
    }

    public abstract void displayInfo();
}

class Plate extends Dish{
    private int radius;


    public Plate(String material, int price, int radius){
        super(material, price);
        this.radius = radius;
    }

    public int getRadius() {
        return radius;
    }

    public void displayInfo(){
        System.out.println("Материал тарелки: " + getMaterial() + ".");
        System.out.println("Цена тарелки: " + getPrice() + "Руб.");
        System.out.println("Размер тарелки: " + getRadius() + "см.");
    }
}

class Cup extends Dish{
    private int volume;

    public Cup(String material, int price, int volume){
        super(material, price);
        this.volume = volume;
    }

    public int getVolume(){
        return volume;
    }

    public void displayInfo(){
        System.out.println("Материал стакана: " + getMaterial() + ".");
        System.out.println("Цена стакана: " + getPrice() + ".");
        System.out.println("Объем: " + getVolume() + "мл.");
    }
}


