package org.example;

import java.util.ArrayList;
import java.util.List;

public class LibraryDatabase {

    private List <Book> listOfBooks = new ArrayList<>();

//    public LibraryDatabase(List<Book> listOfBooks) {
//        this.listOfBooks = listOfBooks;
//    }

    public List<Book> getListOfBooks() {
        return listOfBooks;
    }

    public void setListOfBooks(List<Book> listOfBooks) {
        this.listOfBooks = listOfBooks;
    }

    public void addBook(Book book){
        listOfBooks.add(book);
    }

    public void deleteBook(Book book){
        listOfBooks.remove(book);
    }

    public List<Book> displayBooks(){
        return listOfBooks;
    }



}
