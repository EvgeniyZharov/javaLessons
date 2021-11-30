package com.company.Excercise_8;

import java.awt.*;
import java.util.Random;
import javax.swing.*;

class TaskOne {
    public static void main(String[] args){
        new DrawFigures();
    }
}

class DrawFigures extends JFrame{
    public DrawFigures(){
        super("Drow Figures in JFrame");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(1400, 800);
        setVisible(true);
    }

    public void paint(Graphics gr){
        super.paint(gr);
        Random rand = new Random();

        for (int ii = 0; ii < 20; ii++){

            int number = rand.nextInt(5);
            int colorNum = rand.nextInt(5);
            int positionX = 100 + rand.nextInt(1200);
            int positionY = 100 + rand.nextInt(600);
            switch (number){
                case (0):

                    Oval circle = new Oval(colorNum, positionX, positionY, 100, 100);
                    gr.drawOval(circle.getPositionX(), circle.getPositionY(),circle.getWidth(), circle.getHeight());
                    switch (circle.getColor()){
                        case (0):
                            gr.setColor(Color.RED);
                            break;
                        case (1):
                            gr.setColor(Color.BLUE);
                            break;
                        case (2):
                            gr.setColor(Color.ORANGE);
                            break;
                        case (3):
                            gr.setColor(Color.GREEN);
                            break;
                        case (4):
                            gr.setColor(Color.YELLOW);
                            break;
                        default:
                            gr.setColor(Color.BLACK);
                    }
                    gr.fillOval(circle.getPositionX(), circle.getPositionY(),circle.getWidth(), circle.getHeight());
                    break;
                case (1):
                    Oval oval = new Oval(colorNum, positionX, positionY, 150, 100);
                    gr.drawOval(oval.getPositionX(), oval.getPositionY(),oval.getWidth(), oval.getHeight());
                    switch (oval.getColor()){
                        case (0):
                            gr.setColor(Color.RED);
                            break;
                        case (1):
                            gr.setColor(Color.BLUE);
                            break;
                        case (2):
                            gr.setColor(Color.ORANGE);
                            break;
                        case (3):
                            gr.setColor(Color.GREEN);
                            break;
                        case (4):
                            gr.setColor(Color.YELLOW);
                            break;
                        default:
                            gr.setColor(Color.BLACK);
                    }
                    gr.fillOval(oval.getPositionX(), oval.getPositionY(), oval.getWidth(), oval.getHeight());
                    break;
                case (2):
                    Rectangle quadrat = new Rectangle(colorNum, positionX, positionY, 100, 100);
                    gr.drawPolygon(quadrat.getPolygonX(), quadrat.getPolygonY(), quadrat.getPolygonX().length);
                    switch (quadrat.getColor()){
                        case (0):
                            gr.setColor(Color.RED);
                            break;
                        case (1):
                            gr.setColor(Color.BLUE);
                            break;
                        case (2):
                            gr.setColor(Color.ORANGE);
                            break;
                        case (3):
                            gr.setColor(Color.GREEN);
                            break;
                        case (4):
                            gr.setColor(Color.YELLOW);
                            break;
                        default:
                            gr.setColor(Color.BLACK);
                    }
                    gr.fillPolygon(quadrat.getPolygonX(), quadrat.getPolygonY(), quadrat.getPolygonX().length);
                    break;
                case (3):
                    Rectangle rectangle = new Rectangle(colorNum, positionX, positionY, 100, 150);
                    gr.drawPolygon(rectangle.getPolygonX(), rectangle.getPolygonY(), rectangle.getPolygonX().length);
                    switch (rectangle.getColor()){
                        case (0):
                            gr.setColor(Color.RED);
                            break;
                        case (1):
                            gr.setColor(Color.BLUE);
                            break;
                        case (2):
                            gr.setColor(Color.ORANGE);
                            break;
                        case (3):
                            gr.setColor(Color.GREEN);
                            break;
                        case (4):
                            gr.setColor(Color.YELLOW);
                            break;
                        default:
                            gr.setColor(Color.BLACK);
                    }
                    gr.fillPolygon(rectangle.getPolygonX(), rectangle.getPolygonY(), rectangle.getPolygonX().length);
                    break;
                case (4):
                    Triangle triangle = new Triangle(colorNum, positionX, positionY, 100);
                    gr.drawPolygon(triangle.getPolygonX(), triangle.getPolygonY(), triangle.getPolygonX().length);
                    switch (triangle.getColor()){
                        case (0):
                            gr.setColor(Color.RED);
                            break;
                        case (1):
                            gr.setColor(Color.BLUE);
                            break;
                        case (2):
                            gr.setColor(Color.BLACK);
                            break;
                        case (3):
                            gr.setColor(Color.GREEN);
                            break;
                        case (4):
                            gr.setColor(Color.YELLOW);
                            break;
                        default:
                            gr.setColor(Color.GRAY);
                    }
                    gr.fillPolygon(triangle.getPolygonX(), triangle.getPolygonY(), triangle.getPolygonX().length);
                    break;

            }

        }


    }
}

abstract class Shape{
    protected int colorNum;
    protected int positionX;
    protected int positionY;

    public Shape(int colorNum, int positionX, int positionY){
        this.colorNum = colorNum;
        this.positionX = positionX;
        this.positionY = positionY;
    }

    public int getColor(){
        return colorNum;
    }

    public void setColorNum(int colorNum) {
        this.colorNum = colorNum;
    }

    public int getPositionX(){
        return positionX;
    };

    public int getPositionY(){
        return positionY;
    };

}

class Oval extends Shape {
    private int width;
    private int height;

    public Oval(int colorNum, int positionX, int positionY, int width, int height){
        super(colorNum, positionX, positionY);
        this.width = width;
        this.height = height;
    }

    public int getWidth() {
        return width;
    }

    public int getHeight(){
        return height;
    }

}

class Rectangle extends Shape {
    private int sizeA;
    private int sizeB;

    public Rectangle(int colorNum, int positionX, int positionY, int sizeA, int sizeB){
        super(colorNum, positionX, positionY);
        this.sizeA = sizeA;
        this.sizeB = sizeB;
    }

    public int[] getPolygonX(){
        int a = getPositionX();
        int[] poligonX = new int[4];
        poligonX[0] = (int) Math.round(a - 0.5 * sizeB);
        poligonX[1] = (int) Math.round(a + 0.5 * sizeB);
        poligonX[2] = (int) Math.round(a + 0.5 * sizeB);
        poligonX[3] = (int) Math.round(a - 0.5 * sizeB);
        return poligonX;
    }

    public int[] getPolygonY(){
        int a = getPositionY();
        int[] poligonY = new int[4];
        poligonY[0] = (int) Math.round(a - 0.5 * sizeA);
        poligonY[1] = (int) Math.round(a - 0.5 * sizeA);
        poligonY[2] = (int) Math.round(a + 0.5 * sizeA);
        poligonY[3] = (int) Math.round(a + 0.5 * sizeA);
        return poligonY;
    }
}

class Triangle extends Shape {
    private int size;

    public Triangle(int colorNum, int positionX, int positionY, int size){
        super(colorNum, positionX, positionY);
        this.size = size;
    }

    public int[] getPolygonX(){
        int a = getPositionX();
        int[] polygonX = new int[3];
        polygonX[0] = (int) Math.round(a - 0.5 * size);
        polygonX[1] = (int) Math.round(a + 0.5 * size);
        polygonX[2] = a;
        return polygonX;
    }

    public int[] getPolygonY(){
        int a = getPositionY();
        int[] polygonY = new int[3];
        polygonY[0] = (int) Math.round(a + Math.pow(3, 0.5) * size / 6);
        polygonY[1] = (int) Math.round(a + Math.pow(3, 0.5) * size / 6);
        polygonY[2] = (int) Math.round(a - Math.pow(3, 0.5) * size / 3);
        return polygonY;
    }
}