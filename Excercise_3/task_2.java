package com.company.Excercise_3;

class TaskTwo{
    public static void main(String[] args){
        Human human = new Human("Vova", 20, 1, 100, 150);
        System.out.println(human.toString());
    }
}


class Human{
    private String name;
    private int age;
    private Head head;
    private Hand hand;
    private Leg leg;

    Human(String name, int age, int count, int strong, int lenght){
        this.name = name;
        this.age = age;
        head = new Head(count);
        hand = new Hand(strong);
        leg = new Leg(lenght);
    }

    public String toString(){
        String line = "Человек по имени " + this.name + ", которому уже " + this.age + " лет\n";
        line += "Имеет всего " + head.getInfo() + " голов(у,ы);";
        line += "\nСилу рук: " + hand.getInfo();
        line += "\nДлину ног: " + leg.getInfo() + " неопределенной меры.";
        return line;
    }
}


class Head{
    private int count;

    Head(int count){ this.count = count; }

    public int getInfo(){ return this.count; }
}

class Hand{
    private int strong;

    Hand(int strong){ this.strong = strong; }

    public int getInfo(){ return this.strong; }
}

class Leg{
    private int length;

    Leg(int length){ this.length = length; }

    public int getInfo(){ return this.length; }
}