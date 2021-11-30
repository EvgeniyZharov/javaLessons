package com.company.Excercise_10;
import java.util.Scanner;

public class task_6 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        if (scanner.hasNextInt()){
            int num = scanner.nextInt();
            check_simple(num, 2);
        }
        else {
            System.out.println("No");
        }
    }
    public static void check_simple(int num, int del){
        if (num == 2 || num == del){
            System.out.println("YES");
        }

        else if (num % del == 0){
            System.out.println("NO");
        }
        else {
            check_simple(num, del + 1);
        }
    }
}
