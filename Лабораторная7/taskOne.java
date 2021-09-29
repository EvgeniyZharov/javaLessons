package com.company.Лабораторная7;

import java.util.ArrayList;

class TaskSeven{
    public static void main(String[] args){
        ArrayList<String> listOne = new ArrayList<>();
        listOne.add("Hello");
        ArrayList<String> listTwo = new ArrayList<>(listOne);
        listTwo.add("World!");
        listTwo.add(1, "Big");

        System.out.println("Элементы первой коллекции: ");
        read(listOne);
        System.out.println("Элементы второй коллекции: ");
        read(listTwo);

        System.out.println("Словон на месте 3: " + listTwo.get(2));
        System.out.println("Индекс слова World!: " + listTwo.indexOf("World!"));
        System.out.println("Длина коллекции: " + listTwo.size());
        if (listTwo.remove("Big")){
            System.out.println("Элемент удален.");
        } else System.out.println("Элемент не удален.");
        System.out.println("Длина коллекции: " + listTwo.size());
        listTwo.clear();
        System.out.println("Элементы коллекции: ");
        read(listTwo);
    }

    public static void read(ArrayList<String> list){
        if (list.size() != 0){
            for (String line : list){
                System.out.println(line);
            }
        } else System.out.println("В коллекции нет элементов.");
    }
}