package com.company.Excercise_2;

class Task_1{
    public static void main(String[] args){

        Shape circle = new Shape();
        System.out.println(circle.toString());

        Ball ball = new Ball();
        Book book = new Book();

        Dog dog = new Dog(5, "Бобик");
        System.out.println(dog.toString() + "\n");

        TestDog dogs = new TestDog(3);
        dogs.newDog(3, "Чижик");
        dogs.newDog(3, "Жучка");
        dogs.newDog(4, "Каштанка");
        dogs.getInfo();
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

    public String toString(){
        String line = "Это собака по кличке: " + getName() + "\n";
        line += "Ее возраст: " + getAge() + " лет\n" + "По человеческим меркам: " + getHommeAge() + "лет";
        return line;
    }

}

class TestDog{
    private Dog[] dogs;
    private int existDog = 0;
    private int countDog;

    TestDog(int countDogs){ this.dogs = new Dog[countDogs]; this.countDog = countDogs; }

    public void newDog(int age, String name){
        this.dogs[existDog] = new Dog(age, name);
        this.existDog++;
    }

    public void getInfo(){
        if (existDog == countDog) for (Dog dog : this.dogs) System.out.println(dog.toString() + "\n");
        else {
            Dog[] new_dogs = new Dog[existDog];
            System.arraycopy(this.dogs, 0, new_dogs, 0, existDog);
            for (Dog dog : new_dogs) System.out.println(dog.toString() + "\n");

        }
    }
}