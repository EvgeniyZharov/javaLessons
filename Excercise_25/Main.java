package com.company.Excercise_25;

class DecoratorPatternDemo {
    public static void main(String[] args) {
        Shape circle = new Circle();
        Shape rectangle = new Rectangle();
        Shape red_circle = new RedShapeDecorator(new Circle());
        Shape red_rectangle = new RedShapeDecorator(new Rectangle());

        circle.draw();
        rectangle.draw();
        System.out.println("\n");
        red_circle.draw();
        red_rectangle.draw();
    }
}


