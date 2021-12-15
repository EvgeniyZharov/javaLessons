package com.company.Excercise_23;

public class Car {
    private int year = 0;
    private String mark = "";
    private String model ="";
    public Car(int year, String mark, String model){
        this.year = year;
        this.mark = mark;
        this.model = model;
    }
    public int hashCode() {
        int result = model == null ? 0 : model.hashCode();
        result = 11 * result + year;
        return result;
    }

    public static void main(String[] args){
        Car smart1 = new Car(2016, "Honda", "Civic");
        Car smart2 = new Car(2021, "Tesla", "ModelX");
        Car smart3 = new Car(2017, "Tesla", "CyberTruck");
        Car smart4 = new Car(2021, "Kia", "Rio XLine");
        Car smart5 = new Car(2018, "Tesla", "Model3");


        if(smart1.hashCode()==smart1.hashCode()) {
            System.out.println("This car: " + smart1.mark + " " + smart1.model + " more than " + smart5.mark + " " + smart5.model);
        }
        else System.out.println("This car: " + smart1.mark + " " + smart1.model + " not same as  " + smart5.mark + " " + smart5.model);
        System.out.println("Hash of this car " + smart1.mark + " " + smart1.model+  ": " + smart1.hashCode());
        System.out.println("Hash of this car " + smart5.mark + " " + smart5.model+  ": " + smart5.hashCode());
        System.out.println("");
        if(smart1.hashCode()==smart2.hashCode()) {
            System.out.println("Car " + smart1.mark + " " + smart1.model + " same as " + smart2.mark + " " + smart2.model);
        }
        else System.out.println("Car " + smart1.mark + " " + smart1.model + " not same as " + smart2.mark + " " + smart2.model);
        System.out.println("Hash car " + smart1.mark + " " + smart1.model+  ": " + smart1.hashCode());
        System.out.println("Hash car " + smart2.mark + " " + smart2.model+  ": " + smart2.hashCode());
        System.out.println("");
        if(smart1.hashCode()==smart3.hashCode()) {
            System.out.println("Car " + smart1.mark + " " + smart1.model + " same as " + smart3.mark + " " + smart3.model);
        }
        else System.out.println("Car " + smart1.mark + " " + smart1.model + " not same as " + smart3.mark + " " + smart3.model);
        System.out.println("Hash car " + smart1.mark + " " + smart1.model+  ": " + smart1.hashCode());
        System.out.println("Hash car " + smart3.mark + " " + smart3.model+  ": " + smart3.hashCode());
        System.out.println("");
        if(smart1.hashCode()==smart4.hashCode()) {
            System.out.println("Car " + smart1.mark + " " + smart1.model + " same as " + smart4.mark + " " + smart4.model);
        }
        else System.out.println("Car " + smart1.mark + " " + smart1.model + " not same as " + smart4.mark + " " + smart4.model);
        System.out.println("Hash car " + smart1.mark + " " + smart1.model+  ": " + smart1.hashCode());
        System.out.println("Hash car " + smart5.mark + " " + smart4.model+  ": " + smart4.hashCode());


    }
}
