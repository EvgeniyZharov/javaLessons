package com.company.Excercise_29;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class WriteObject {
    public static void main(String[] args){
        CurrencyInfo currencyInfo1 = new CurrencyInfo("Dollar-Rub", 80.32f);
        CurrencyInfo currencyInfo2 = new CurrencyInfo("Euro-Rub", 93.32f);

        try{
            FileOutputStream fos = new FileOutputStream("currency.bin");
            ObjectOutputStream oos = new ObjectOutputStream(fos);

            oos.writeObject(currencyInfo1);
            oos.writeObject(currencyInfo2);

        } catch (IOException e ){
            e.printStackTrace();
        }
    }
}
