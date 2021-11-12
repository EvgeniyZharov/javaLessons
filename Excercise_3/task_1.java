package com.company.Excercise_3;

class TestCircle{

    public static void main(String[] args){
        Circle cirlce_one = new Circle(10);
        Circle cirlce_two = new Circle(7);

        cirlce_two.setRadius(12);

        System.out.println("Радиус первой окружности: " + cirlce_one.get_radius());
        System.out.println("Радиус второй окружности: " + cirlce_two.get_radius());

        System.out.println("Площадь первой окружности: " + cirlce_one.get_square());
        System.out.println("Площадь второй окружности: " + cirlce_two.get_square());

        System.out.println("Периметр первой окружности: " + cirlce_one.get_perimetr());
        System.out.println("Периметр второй окружности: " + cirlce_two.get_perimetr());
    }
}

class Circle{
    private int radius;

    public Circle(int radius){
        this.radius = radius;
    }

    public void setRadius(int radius) { this.radius = radius; }

    public int get_radius(){
        return radius;
    }

    public double get_square(){
        return Math.pow(radius, 2) * Math.PI;
    }

    public double get_perimetr(){
        return radius * 2 * Math.PI;
    }
}