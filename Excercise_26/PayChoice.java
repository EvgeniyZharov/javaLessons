package com.company.Excercise_26;

public class PayChoice {
    Payment payment;

    public void setPayment(Payment payment){
        this.payment = payment;
    }

    public void executePayment(){
        payment.pay();
    }
}
