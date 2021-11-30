package com.company.Excercise_7;

import java.awt.*;

class TestClass {
    public static void main(String[] args){
        Shape s1 = new Circle(5.5, "RED", false); // Upcast Circle to Shape
        System.out.println(s1); // which version?
        System.out.println(s1.getArea()); // which version?
        System.out.println(s1.getPerimeter()); // which version?
        System.out.println(s1.getColor());
        System.out.println(s1.isFilled());

        // Ошибка по причине того, что метод getRadius() не прописан в абстрактном классе, к которому принадлежит s1
//        System.out.println(s1.getRadius());

        Circle c1 = (Circle)s1; // Downcast back to Circle
        System.out.println(c1);
        System.out.println(c1.getArea());
        System.out.println(c1.getPerimeter());
        System.out.println(c1.getColor());
        System.out.println(c1.isFilled());
        System.out.println(c1.getRadius());

        // Нельзя создавать переменные типизированные под абстрактный класс
//        Shape s2 = new Shape();


        Shape s3 = new Rectangle(1.0, 2.0, "RED", false); // Upcast
        System.out.println(s3);
        System.out.println(s3.getArea());
        System.out.println(s3.getPerimeter());
        System.out.println(s3.getColor());

        // Метод getLength() не пренадлежит абстрактному классу Shape, от которого создана переменная
        //System.out.println(s3.getLength());

        Rectangle r1 = (Rectangle)s3; // downcast
        System.out.println(r1);
        System.out.println(r1.getArea());
        System.out.println(r1.getColor());
        System.out.println(r1.getLength());
        Shape s4 = new Square(6.6); // Upcast
        System.out.println(s4);
        System.out.println(s4.getArea());
        System.out.println(s4.getColor());

        // Метод getSide() не принадлежит классу Rectangle
//        System.out.println(s4.getSide());

// Take note that we downcast Shape s4 to Rectangle,
// which is a superclass of Square, instead of Square
        Rectangle r2 = (Rectangle)s4;
        System.out.println(r2);
        System.out.println(r2.getArea());
        System.out.println(r2.getColor());

        // Метод getSide() не принадлежит классу Rectangle
//        System.out.println(r2.getSide());

        System.out.println(r2.getLength());
// Downcast Rectangle r2 to Square
        Square sq1 = (Square)r2;
        System.out.println(sq1);
        System.out.println(sq1.getArea());
        System.out.println(sq1.getColor());
        System.out.println(sq1.getSide());
        System.out.println(sq1.getLength());
    }
}

abstract class Shape{
    protected String color = "notColor";
    protected boolean filled = false;

    public Shape(){

    }

    public Shape(String color, boolean filled){
        setColor(color);
        setFilled(filled);
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isFilled() {
        return filled;
    }

    public void setFilled(boolean filled) {
        this.filled = filled;
    }

    public abstract double getArea();

    public abstract double getPerimeter();

    public abstract String toString();
}

class Circle extends Shape{
    protected double radius = 0;

    public Circle(){}

    public Circle(double radius){
        setRadius(radius);
    }

    public Circle(double radius, String color, boolean filled){
        super(color, filled);
        setRadius(radius);
    }

    public double getRadius() {
        return this.radius;
    }

    public void setRadius(double radius) {
        if (radius >= 0) this.radius = radius;
        else this.radius = 0;
    }

    @Override
    public double getArea(){
        if (isFilled()){
            return Math.PI * Math.pow(getRadius(), 2);
        }
        else{
            return 0;
        }
    }

    @Override
    public double getPerimeter() {
        return 2 * Math.PI * getRadius();
    }

    @Override
    public String toString(){
        String line = getColor() + " круг с радиусом " + getRadius() + "\n";
        line += "Имеет площадь закрашенной части: " + getArea();
        line += "\nИмеет периметр: " + getPerimeter() + "\n";
        return line;
    }
}

class Rectangle extends Shape{
    protected double width = 0;
    protected double length = 0;

    Rectangle(){}

    public Rectangle(double width, double length){
        setWidth(width);
        setLength(length);
    }

    public Rectangle(double width, double length, String color, boolean filled){
        super(color, filled);
        setWidth(width);
        setLength(length);
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        if (width >= 0) this.width = width;
        else this.width = 0;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        if (length >= 0) this.length = length;
        else this.length = 0;
    }

    @Override
    public double getArea(){
        if (isFilled()){
            return getWidth() * getLength();
        }
        else {
            return 0;
        }
    }

    @Override
    public double getPerimeter() {
        return 2 * (getWidth() + getLength());
    }

    @Override
    public String toString(){
        String line = getColor() + " прямоугольник со сторонами " + getWidth() + " и " + getLength();
        line += "\nИмеет площадь закрашенной части: " + getArea();
        line += "\nИмеет периметр: " + getPerimeter() + "\n";
        return line;
    }
}

class Square extends Rectangle{
    public Square(){}
    public Square(double side){
        super(side, side);
    }

    public Square(double side, String color, boolean filled){
        super(side, side, color, filled);
    }

    public double getSide(){
        return getWidth();
    }

    public void setSize(double side){
        setWidth(side);
        setLength(side);
    }

    @Override
    public void setWidth(double width) {
        if (width >= 0) this.width = width;
        else this.width = 0;
    }

    @Override
    public void setLength(double length) {
        if (length >= 0) this.length = length;
        else this.length = 0;
    }

    @Override
    public String toString(){
        String line = getColor() + " квадрат со стороной " + getSide();
        line += "\nИмеет площадь закрашенной части: " + getArea();
        line += "\nИмеет периметр: " + getPerimeter() + "\n";
        return line;
    }
}

