package org.example;

import java.util.Random;

public class Book {

    private int id = new Random().nextInt();
    private String title;
    private String author;
    private String genre;
    private String publisher;
    private String subGenre;


    public Book(int id, String title, String author, String genre, String publisher, String subGenre) {
        this.id = id;
        this.title = title;
        this.author = author;
        this.genre = genre;
        this.publisher = publisher;
        this.subGenre = subGenre;
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public String getSubGenre() {
        return subGenre;
    }

    public void setSubGenre(String subGenre) {
        this.subGenre = subGenre;
    }

    @Override
    public String toString() {
        return "Book " + id + "\n" +
                "Title " + title +
                " by " + author +
                ". Genre " + genre +
                "and subGenre " + subGenre +
                ". Published by " + publisher + "\n";
    }
}
