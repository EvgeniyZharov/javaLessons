package com.company.Excercise_20;

import java.util.Date;
import java.util.Scanner;

public class task_1 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        Calendar calendar = new Calendar(2021, 12, 15, 12, 54);

        System.out.println(calendar.toString());
    }

}

class Calendar {
    private Date date;
    private int year;
    private int mount;
    private int day;
    private int hour;
    private int minute;

    public Calendar(int year, int mount, int day, int hour, int minute) {
        this.year = year;
        this.mount = mount;
        this.day = day;
        this.hour = hour;
        this.minute = minute;
    }

    public String toString(){
        long unitdate = (year - 1970) * 31104000000L + mount * 2592000000L + day * 86400000L + hour * 3600000L + minute * 60000L;
        date = new Date(unitdate);
        return "Если считать, что в месяце 30 дней, то с погрешностью получается следующая дата: " + date.toString();
    }

}

