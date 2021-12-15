package com.company.Excercise_22;

public class MagicСhairFactory implements ChairFactory{
    @Override
    public Chair createChair() {
        return new MagicСhair();
    }
}
