package com.company.Excercise_15;

import java.util.Scanner;
import java.io.*;

class TaskEight{
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите текст для записи: ");
        String text = scanner.nextLine();

        String fileName = "file.txt";
        File file = new File(fileName);
        FileWriter writer = new FileWriter(file);
        writer.write(text);
        writer.flush();
        writer.close();

        FileReader fr = new FileReader(file);
        char [] a = new char[1000];

        int num = fr.read(a);
        System.out.println("В текстовом файле записано: ");
        for (int ii = 0; ii < num; ii++){
            System.out.print(a[ii]);
        }

    }
}