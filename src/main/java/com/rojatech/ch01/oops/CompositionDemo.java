// Java program to illustrate
// the concept of Composition
 
// Importing required classes
package com.rojatech.ch01.oops;

import lombok.AllArgsConstructor;

import java.io.*;
import java.util.*;
 
@AllArgsConstructor
class Book {
    public String title;
    public String author;
}

@AllArgsConstructor
class Library {

    private final List<Book> books;

    public List<Book> getTotalBooksInLibrary()
    {
        return books;
    }
}
 
public class CompositionDemo {

	public static void main(String[] args) {

        Book b1
            = new Book("EffectiveJ Java", "Joshua Bloch");
        Book b2
            = new Book("Thinking in Java", "Bruce Eckel");
        Book b3 = new Book("Java: The Complete Reference",
                           "Herbert Schildt");

        List<Book> books = List.of(b1,b2,b3);
 
        Library library = new Library(books);

        List<Book> bks = library.getTotalBooksInLibrary();

        for (Book bk : bks) {
            System.out.println("Title : " + bk.title
                               + " and "
                               + " Author : " + bk.author);
        }
	}
}
