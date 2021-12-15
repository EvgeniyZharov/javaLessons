package com.company.Excercise_29;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class ReadObject {
    public static void main(String[] args){
        try{
            FileInputStream fis = new FileInputStream("currency.bin");
            ObjectInputStream ois = new ObjectInputStream(fis);

            CurrencyInfo currencyInfo1 = (CurrencyInfo) ois.readObject();
            CurrencyInfo currencyInfo2 = (CurrencyInfo) ois.readObject();

            System.out.println(currencyInfo1);
            System.out.println(currencyInfo2);

            ois.close();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e){
            e.printStackTrace();
        }
    }
}
