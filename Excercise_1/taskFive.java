package com.company.Лабораторная1;

class FiveTask {

    static long factorial(int num){
        if (num <= 1) return 1;
        else return num * factorial(num - 1);

    }

    static long factorial2(int num){
        int new_num = 1;
        while (num > 1){
            new_num *= num;
            num--;
        }
        return new_num;
    }

    public static void main(String[] args){
        System.out.println("Задание 1.5");
        System.out.println("факториал числа\n");
        for (int ii = 0; ii < 10; ii++){
            System.out.println(factorial2(ii));
        }
        System.out.println("Все факториалы определяются верно.");
    }
}