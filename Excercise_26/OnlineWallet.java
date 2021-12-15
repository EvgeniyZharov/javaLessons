package com.company.Excercise_26;

import java.util.Scanner;

public class OnlineWallet implements Payment{
    public void pay(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Чтобы произвести оплату через электронную карту введите ее номер: ");
        String numCard = scanner.nextLine();
        System.out.println("Теперь введите 3 цифры с обратной стороны карты");
        String cvsCode = scanner.nextLine();
        System.out.println("Операция прошла успешно. С карты " + numCard + " скоро спишутся средства.");
    }
}
