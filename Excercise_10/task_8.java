package com.company.Excercise_10;
import java.util.Scanner;

public class task_8 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        String line = scanner.next();
        palidrom(line, 0);
//        if (check(line)){
//            System.out.println("Yes");
//        }
//        else {
//            System.out.println("No");
//        }

    }
    public static void palidrom(String line, int num){
        if (num < line.length() / 2){
            if (line.charAt(num) == line.charAt(line.length() - (num + 1))){
                palidrom(line, num + 1);
            }
            else {
                System.out.println("No");
            }
        }
        else {
            System.out.println("YES");
        }
    }


    public static boolean check(String line){
        for (int ii = 0; ii < line.length() / 2; ii++){
            if (line.charAt(ii) != line.charAt(line.length() - (ii + 1))){
                return false;
            }
        }
        return true;
    }
}
