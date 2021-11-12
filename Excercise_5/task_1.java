package com.company.Excercise_5;

class task_1 {
    public static void main(String[] args){
        Plate plate = new Plate("Иван", 32);
        Mug mug = new Mug("Вова", 200);

        System.out.println(plate.toString());
        System.out.println(mug.toString());
    }
}

abstract class Dish{
    private String owner_name;

    public Dish(String owner_name){
        setOwner(owner_name);
    }

    public void setOwner(String owner_name){
        this.owner_name = owner_name;
    }

    public String getOwner_name() {
        return owner_name;
    }

    public abstract String toString();
}

class Mug extends Dish{
    private double volume;

    public Mug(String owner_name, double volume){
        super(owner_name);
        setVolume(volume);
    }

    public void setVolume(double volume) {
        this.volume = volume;
    }

    public double getVolume() {
        return volume;
    }

    public String toString(){
        return "Владелец чашки: " + getOwner_name() + "\nОбъем: " + getVolume() + "мл";
    }
}

class Plate extends Dish{
    private int radius;

    public Plate(String owner_name, int radius){
        super(owner_name);
        setRadius(radius);
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    public int getRadius() {
        return radius;
    }

    public String toString(){
        return "Владелец тарелки: " + getOwner_name() + "\nРадиус: " + getRadius() + "см";
    }
}
