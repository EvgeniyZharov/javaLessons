package com.company.Excercise_3;

class BookTest{
    public static void main(String[] args){
        Book book = new Book("Властелин колец", "Дж. Р. Р. Толкин", 1954, 9.1);
        System.out.println(book.toString());
    }
}

class Book{
    private String title;
    private String author_name;
    private int year;
    private double rating;

    Book(String title, String author_name, int year, double rating){
        this.title = title;
        this.author_name = author_name;
        this.year = year;
        this.rating = rating;
    }

    public void setTitle(String title){ this.title = title; }
    public void setAuthor_name(String author_name){ this.author_name = author_name; }
    public void setYear(int year){ this.year = year; }
    public void setRating(double rating){ this.rating = rating; }

    public String getTitle(){ return this.title; }
    public String getAuthor_name(){ return this.author_name; }
    public int getYear(){ return this.year; }
    public double getRating(){ return this.rating; }

    public String toString(){
        String line = "Книга '" + getTitle() + "', написанная в " + getYear() + " году и получившая рейтинг: " + getRating();
        line += "\nЕё автор - " + getAuthor_name();
        return line;
    }
}
