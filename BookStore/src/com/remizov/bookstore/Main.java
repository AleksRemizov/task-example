package com.remizov.bookstore;


import com.remizov.bookstore.entity.*;
import com.remizov.bookstore.model.BookGenre;

import java.util.ArrayList;

public class Main {
    private ArrayList<Book> books = new ArrayList<Book>();
    private ArrayList<Customer> customers= new ArrayList<>();
    private ArrayList<Seller>sellers = new ArrayList<>();
    private ArrayList<Order>orders = new ArrayList<>();

    public static void main(String[] args) {


    }
    public void initDate(){
        books.add(new Book(1,"Мастер и Маргарита","M.Булгаков",1200, BookGenre.Art));
        books.add(new Book(2,"Мёртвые души","Н.Гоголь",1000, BookGenre.Art));
        books.add(new Book(3,"Собачье сердце","M.Булгаков",1500, BookGenre.Art));
        books.add(new Book(4,"Идиот","Ф.Достоевский",900, BookGenre.Art));
        books.add(new Book(5,"Палата №6","А.Чехов",800, BookGenre.Art));

        customers.add(new Customer(1,"Иванов И.И.",32));
        customers.add(new Customer(2,"Петров И.И.",35));
        customers.add(new Customer(3,"Сидоров А.И.",30));
        customers.add(new Customer(4,"Харс И.И.",38));
        customers.add(new Customer(5,"Иванов С.И.",31));

        sellers.add(new Seller(1,"Ремизов А.С.",34));
        sellers.add(new Seller(2,"Савчук М.Л.",33));
        sellers.add(new Seller(3,"Прокопчук И.В.",31));
        sellers.add(new Seller(4,"Плотко А.А.",34));
        sellers.add(new Seller(5,"Степаненко А.Д.",34));

        orders.add(new Order(1, 2, 3 , new long[]{1, 2, 5}));
        orders.add(new Order(2, 4, 2 , new long[]{2, 3, 5}));
        orders.add(new Order(3, 5, 4 , new long[]{4, 1, 5}));
        orders.add(new Order(4, 1, 5 , new long[]{1, 4, 3}));
        orders.add(new Order(5, 5, 3 , new long[]{4, 2, 5}));
    }
}
