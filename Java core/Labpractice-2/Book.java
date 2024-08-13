package com.assignment;
class Book {
    private String title;
    private String author;
    private String isbn;

    public Book(String title, String author, String isbn) {
        this.title = title;
        this.author = author;
        this.isbn = isbn;
    }

    public void printDetails() {
        System.out.println("Title: " + title + ", Author: " + author + ", ISBN: " + isbn);
    }

    public static void main(String[] args) {
        Book book = new Book("The Great Gatsby", "F. Scott Fitzgerald", "1234567890");
        book.printDetails();
    }
}

