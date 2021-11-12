package com.company.Excercise_2;

class Task_1{
    public static void main(String[] args){

        Shape circle = new Shape();
        System.out.println(circle.toString());

        Ball ball = new Ball();
        Book book = new Book();

        Dog dog = new Dog(5, "Бобик");
        System.out.println(dog.toStrign());
    }
}

class Shape{
    private String name = "Это фигура";

//    public void getName(String name){ this.name = name; }
    public String toString(){ return this.name; }
}

class Ball{
    private String name = "Это мяч";
}

class Book{
    private String name = "Это книга";
}

class Dog{
    private int age;
    private String name;

    Dog (int age, String name){
        this.age = age;
        this.name = name;
    }

    public void newAge(int age){ this.age = age; }

    public void newName(String name){ this.name = name; }

    public int getAge(){ return this.age; }

    public String getName(){ return this.name; }

    public int getHommeAge(){ return this.age * 7; }

    public String toStrign(){
        String line = "Это собака по кличке: " + getName() + "\n";
        line += "Ее возраст: " + getAge() + " лет\n" + "По человеческим меркам: " + getHommeAge() + "лет";
        return line;
    }

}