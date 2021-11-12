package com.company.Лабораторная1;

class MainTwo{
    public static void main(String[] args){
        System.out.println("Задание 1.2");
        System.out.println("аргументы командной строки в цикле for\n");
        for (String name : args){
            System.out.println(name);
        }
    }
}