package com.company.Excercise_5;

class FurnitureShop {
    public static void main(String[] args){
        Bed bed_one = new Bed(5490, 220);
        Bed bed_two = new Bed(11590, 200);
        Bed bed_three = new Bed(8990, 180);
        Cupboard cupboard_one = new Cupboard(11290, 250);
        Cupboard cupboard_two = new Cupboard(25490, 270);
        System.out.println("На данный момент в магазине есть следующая продукция:");
        System.out.println("1. " + bed_one.toString());
        System.out.println("2. " + bed_two.toString());
        System.out.println("3. " + bed_three.toString());
        System.out.println("4. " + cupboard_one.toString());
        System.out.println("5. " + cupboard_two.toString());
    }
}

abstract class Furniture{
    private double prise;

    public Furniture(double prise){
        setPrise(prise);
    }

    public void setPrise(double prise) {
        this.prise = prise;
    }

    public double getPrise() {
        return prise;
    }
    public abstract String toString();
}

class Bed extends Furniture{
    private int length;

    public Bed(double prise, int length){
        super(prise);
        setLength(length);
    }

    public void setLength(int length) {
        this.length = length;
    }

    public int getLength() {
        return length;
    }

    public String toString(){
        return "Кровать длиной " + getLength() + "см\n" + "По цене: " + getPrise() + " рублей";
    }
}

class Cupboard extends Furniture{
    private int volume;

    public Cupboard(double prise, int volume){
        super(prise);
        setVolume(volume);
    }

    public void setVolume(int length) {
        this.volume = length;
    }

    public int getVolume() {
        return volume;
    }

    public String toString(){
        return "Шкаф объемом " + getVolume() + "л\n" + "По цене: " + getPrise() + " рублей";
    }
}
