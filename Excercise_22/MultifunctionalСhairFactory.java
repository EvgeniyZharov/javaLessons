package com.company.Excercise_22;

public class MultifunctionalСhairFactory implements ChairFactory{
    @Override
    public Chair createChair() {
        return new MultifunctionalСhair();
    }
}
