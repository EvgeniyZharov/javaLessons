package com.company.Excercise_19;

import java.util.Scanner;

public class Main {
    public static void main (String[] args) throws TriangleException {
        int a = 0, b = 0, c = 0;
        System.out.println("Введите значения углов треугольника.");
        Scanner scanner = new Scanner(System.in);
        a = scanner.nextInt();
        b = scanner.nextInt();
        c = scanner.nextInt();
        if(a + b + c == 180){
            System.out.println("Отлично! Сумма углов треугольника 180 градусов.");
        } else {
            throw new TriangleException("Такого треугольника не существует.");
        }



    }

}

class TriangleException extends Exception {

    public TriangleException (String message) {
        super(message);
    }
}
