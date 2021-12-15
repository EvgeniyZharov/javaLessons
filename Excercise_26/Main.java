package com.company.Excercise_26;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Для оплаты выберите один из способов (ONLINE_WALLET, CREDIT_CARD):");
        String varPay = scanner.nextLine();
        PayChoice payChoice = new PayChoice();
        switch (varPay){
            case "ONLINE_WALLET":
                payChoice.setPayment(new OnlineWallet());
                break;
            case "CREDIT_CARD":
                payChoice.setPayment(new Credit());
                break;
        }
        payChoice.executePayment();
    }
}


