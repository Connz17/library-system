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

    public void displayBooks(){
        for (int i = 0; i < listOfBooks.size(); i++) {
            System.out.println(listOfBooks.get(i));
        }
    }

    public Book getBookByTitle(String string){
        for (Book book: listOfBooks ) {
            if (book.getTitle().contains(string)){
                System.out.println(book);
                return book;
            }
        }
        return null;
    }

//    search books by title
//
//    search by genre
//
//    search by auther
//
//    search books by publisher
//
//    get book by id




}
