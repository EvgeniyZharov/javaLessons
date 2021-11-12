package com.company.Лабораторная1;

class Main {

    public static void main(String[] args) {
        System.out.println("Задание 1.1");
        System.out.println("сумма элементов целочисленного массива с помощью циклов for, while, do while\n");
        int sumFor = 0, sumWhile = 0, sumDoWhile = 0;
        int [] numbers = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
        for (int elem : numbers) System.out.print(elem + " ");

        for (int ii : numbers){
            sumFor += ii;
        }

        int jj = 0;
        while (jj < 10){
            sumWhile += numbers[jj];
            jj++;
        }

        int kk = 0;
        do {
            sumDoWhile += numbers[kk];
            kk++;
        } while (kk < 10);

        System.out.println("\nЗначения сумм, посчитанных с помощью for, while, do while: " + sumFor + '=' + sumWhile + '=' + sumDoWhile);
    }
}
