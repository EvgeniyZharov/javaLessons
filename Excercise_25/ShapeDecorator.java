package com.company.Excercise_25;

public class ShapeDecorator implements Shape{
    Shape shape;

    public ShapeDecorator(Shape shape){
        this.shape = shape;
    }

    @Override
    public void draw() {
        shape.draw();
    }
}
