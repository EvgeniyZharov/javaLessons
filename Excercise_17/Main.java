package com.company.Excercise_17;

import java.util.Scanner;

enum Planets {
    Mercury(3e23, 2440),
    Venus(4e24, 6052),
    Earth(6e24, 6378),
    Mars(6e23, 3397),
    Jupiter(2e27, 71490),
    Saturn(6e26, 60270),
    Uranus(9e25, 25560),
    Neptune(1e26, 24760);

    private double weight;
    private double radius;
    private double G = 6.7; // гравитационная постоянная

    Planets(double m, double r) {
        weight = m;
        radius = r;
    }

    public double Gravity() {
        return (G * weight) / (radius * radius) / 1000000;
    }
}

public class Main {
    public static void main(String[] args) {
        int planet;
        Scanner sc = new Scanner(System.in);
        System.out.println("Сhoose your planet and press num button for Each planet: ");
        for(int i = 0; i < 8; i++){
            System.out.println(i + ". " + Planets.values()[i].name());
        }
        planet = sc.nextInt();

        System.out.println("Gravity on your planet is: " + Planets.values()[planet].Gravity());
    }
}
