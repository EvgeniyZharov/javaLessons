package com.company.Excercise_18;

import java.util.Objects;
import java.util.Scanner;

class Main{
    public static void main(String[] args){
        User[] users = new User[3];
        users[0] = new User("Ivanov I. I.", "32418124097", true);
        users[1] = new User("Petrov P. P.", "14235872424", false);
        users[2] = new User("Popov P. P.", "21344979823", true);
        Scanner scanner = new Scanner(System.in);
        boolean flag = false;
        System.out.println("Здравствуйте! Чтобы перейти в раздел покупок, пожалуйста, введите ваше ФИО: ");
        String name = scanner.nextLine();
        System.out.println("Введите свой ИНН: ");
        String userINN = scanner.nextLine();
        for (User user : users){
            if (Objects.equals(user.getName(), name)){
                if (Objects.equals(user.getINN(), userINN))
                {
                    if (user.isDate()){
                        flag = true;
                        break;
                    }
                    else{
                        System.out.println("Ваш ИНН просрочен.");
                    }
                }
                System.out.println("Вы ввели некорректный ИНН");

            }
        }
        if (flag) {
            System.out.println("Все отлично. Можете приступать к покупкам.");
        } else {
            System.out.println("Про Вас нет информации в базе данных. Доступ ограничен");
        }
    }
}

class User{
    private String name;
    private String INN;
    private boolean date;

    User(String name, String INN, boolean date){
        this.name = name;
        this.INN = INN;
        this.date = date;
    }

    public String getName() {
        return name;
    }

    public String getINN() {
        return INN;
    }

    public boolean isDate() {
        return date;
    }

}