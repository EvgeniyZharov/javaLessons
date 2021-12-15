package com.company.Excercise_22;

class Client {
    public static void main(String[] args) {
        ChairFactory chairFactory = new MagicСhairFactory();
        Chair chair = chairFactory.createChair();

        chair.output();
    }

    static ChairFactory createChairBySpecial(String special){
        if (special.equalsIgnoreCase("Magic")){
            return new MagicСhairFactory();
        }else if (special.equalsIgnoreCase("Multifunctional")){
            return new MultifunctionalСhairFactory();
        }else if (special.equalsIgnoreCase("Victorian")){
            return new VictorianChairFactory();
        }else{
            throw new RuntimeException(special + " is unknown.");
        }
    }
}
