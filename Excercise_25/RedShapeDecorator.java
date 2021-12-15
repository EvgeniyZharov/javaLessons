package com.company.Excercise_25;

public class RedShapeDecorator extends ShapeDecorator{

    public RedShapeDecorator(Shape shape){
        super(shape);
    }

    @Override
    public void draw() {
        System.out.println("Красная фигура");
        super.draw();
    }
}
