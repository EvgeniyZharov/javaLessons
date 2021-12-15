package com.company.Excercise_20;

import java.util.Date;
import java.util.Objects;

public class task_2 {
    public static void main(String[] args){
        Student student1 = new Student("ivan", "Wed Feb 14 23:32:23 MSK 2021");

        System.out.println(student1);

        student1.setFinishDate();

        System.out.println(student1);
    }
}

class Student{
    private String name;
    private String startDate;
    private String finishDate = "-1";

    Student(String name, String startDate){
        this.name = name;
        this.startDate = startDate;
    }

    public void setFinishDate() {
        Date date = new Date();
        this.finishDate = date.toString();
    }

    public String getName() {
        return name;
    }

    public String getStartDate() {
        return startDate;
    }

    public String getFinishDate() {
        if (!Objects.equals(finishDate, "-1")){
            return finishDate;
        }
        else {
            return "Задание еще не сдано.";
        }
    }

    public String toString(){
        String text = "Студент: " + getName() + "\nПолучил работу: " + getStartDate();
        text += "\nСдал работу: " + getFinishDate();
        return text;
    }
}