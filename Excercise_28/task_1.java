package com.company.Excercise_28;

public class task_1 {
    public static void main(String[] args){
        Car car = new Car("Totota");
        car.launch();
        Car motorcycle = new Car("BMW"){
            void launch(){
                Motor motor = new Motor();
                motor.launch_engine();
                System.out.println("Мотоцикл " + getTitle() + " заведен. Можно ехать." );
            }
        };
        motorcycle.launch();
    }
}

class Car{
    private String title;

    Car(String title){
        setTitle(title);
    }
    public void setTitle(String title) {
        this.title = title;
    }
    static class Motor{
        void launch_engine(){
            System.out.println("Двигатель запущен.");
        }
    }
    public String getTitle() {
        return title;
    }
    void launch(){
        Motor motor = new Motor();
        motor.launch_engine();
        System.out.println("Машина " + getTitle() + " заведена. Можно ехать." );
    }
}