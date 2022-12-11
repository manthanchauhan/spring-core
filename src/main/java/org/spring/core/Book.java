package org.spring.core;

public class Book {
    private String name;
    private int price;

    Book(String name, int price){
        this.name = name;
        this.price = price;
    }

    Book(){}

    @Override
    public String toString() {
        return "Book{" +
                "name='" + name + '\'' +
                ", price=" + price +
                '}';
    }
}
