package com.company.Excercise_26;

import java.util.Scanner;

public class Credit implements Payment{
    public void pay(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Чтобы произвести оплату по кредитной карте введите ее номер: ");
        String numCard = scanner.nextLine();
        System.out.println("Операция прошла успешно. Кредит на карте " + numCard + " увеличился.");
    }
}
