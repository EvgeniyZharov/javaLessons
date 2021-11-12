package com.company.Лабораторная1;

import java.util.Random;
import java.util.Arrays;

class TaskFour{

    public static void quickSort(int[] array, int low, int high) {
        if (array.length == 0)
            return;//завершить выполнение, если длина массива равна 0

        if (low >= high)
            return;//завершить выполнение если уже нечего делить

        // выбрать опорный элемент
        int middle = low + (high - low) / 2;
        int opora = array[middle];

        // разделить на подмассивы, который больше и меньше опорного элемента
        int i = low, j = high;
        while (i <= j) {
            while (array[i] < opora) {
                i++;
            }

            while (array[j] > opora) {
                j--;
            }

            if (i <= j) {//меняем местами
                int temp = array[i];
                array[i] = array[j];
                array[j] = temp;
                i++;
                j--;
            }
        }

        // вызов рекурсии для сортировки левой и правой части
        if (low < j)
            quickSort(array, low, j);

        if (high > i)
            quickSort(array, i, high);
    }


    public static void main(String[] args){
        System.out.println("Задание 1.4");
        System.out.println("массив целых рандомных чисел, сортировка, вывод\n");
        int n = 10;
        Random rand = new Random();
        int [] numbers = new int[n];
        for (int j = 0; j < n; j++){
            int num = rand.nextInt(200) - 100;
            numbers[j] = num;
        }

        System.out.println("Было");
        System.out.println(Arrays.toString(numbers));

        int low = 0;
        int high = numbers.length - 1;

        quickSort(numbers, low, high);
        System.out.println("Стало");
        System.out.println(Arrays.toString(numbers));

    }
}