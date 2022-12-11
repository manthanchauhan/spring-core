package org.spring.core;

import java.util.Arrays;

public class Course {
    private String name;
    private Book[] books;

    Course(String name, Book[] books){
        this.name = name;
        this.books = books;
    }

    Course(){}

    public void setName(String name){
        this.name = name;
    }

    public String getName(){
        return this.name;
    }

    @Override
    public String toString() {
        return "Course{" +
                "name='" + name + '\'' +
                "books='" + Arrays.toString(this.books) + '\'' +
                '}';
    }
}
