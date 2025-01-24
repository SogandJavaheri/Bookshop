package com.github.sogandjavaheri.Bookshop;

public class Bookshop {

    String book_name;
    String author;
    int year_of_publish;

    public static void main (String[] args) {

        Bookshop book1 = new Bookshop();

        book1.book_name = "Hamlet";
        book1.author = "Shakespeare";
        book1.year_of_publish = 1623;

        System.out.println(book1.book_name);
        System.out.println(book1.author);
        System.out.println(book1.year_of_publish);

    }

    public static void AmountSell(){

    }

    public static void AmountBuy(){

    }
}