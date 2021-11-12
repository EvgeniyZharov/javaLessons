package com.company.Excercise_4;

class TestBall {
    public static void main(String[] args){
        Ball ball_one = new Ball(3, 7);
        Ball ball_two = new Ball();
        ball_two.setXY(7,3);
        ball_two.move(3, 7);
        System.out.println(ball_one.toString());
        System.out.println(ball_two.toString());


    }
}

class Ball{
    private double x = 0.0;
    private double y = 0.0;

    public Ball(double x, double y){ this.x = x; this.y = y; }

    public Ball(){}

    public void setX(double x) { this.x = x; }

    public void setY(double y) { this.y = y; }

    public double getX() { return x; }

    public double getY() { return y; }

    public void setXY(double x, double y){ setX(x); setY(y); }

    public void move(double xDisp, double yDisp){ this.x += xDisp; this.y += yDisp; }

    public String toString(){ return "x = " + getX() + "\ny = " + getY(); }
}