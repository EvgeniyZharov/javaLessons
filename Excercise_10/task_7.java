package com.company.Excercise_10;
import java.util.Scanner;

public class task_7 {
    public static void main(String[] args){
        int number = -1;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите натуральное число для разложения на простые множители: ");
        while (number == -1){
            if (scanner.hasNextInt()) {
                number = scanner.nextInt();
                System.out.println(1);
                simple_num(number, 2);
            } else {
                System.out.println("Вы ввели не натуральное число");
            }
        }

    }

    public static void simple_num(int num, int del){
        if (num == 1){
            System.out.println(".");
        }
        else if (num % del == 0){
            System.out.println(del);
            num /= del;
            simple_num(num, del);
        }
        else {
            del++;
            simple_num(num, del);
        }
    }
}
