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

    public Book getBookByTitle(String title){
        for (Book book: listOfBooks ) {
            if (book.getTitle().contains(title)){
                return book;
            }
        }
        return null;
    }

    public Book getBookById(int id){
        for (Book book: listOfBooks ) {
            if (book.getId() == id){
                System.out.println(book);
                return book;
            }
        }
        return null;
    }

    public void searchBooksByTitle(String title){
        for (Book book: listOfBooks ) {
            if (book.getTitle().contains(title)){
                System.out.println(book);

            }
        }
    }

    public void searchBooksByGenre(String genre){
        for (Book book: listOfBooks ) {
            if (book.getGenre().contains(genre)){
                System.out.println(book);

            }
        }
    }

    public void searchBooksByAuthor(String author){
        for (Book book: listOfBooks ) {
            if (book.getAuthor().contains(author)){
                System.out.println(book);

            }
        }
    }

    public void searchBooksByPublisher(String publisher){
        for (Book book: listOfBooks ) {
            if (book.getPublisher().contains(publisher)){
                System.out.println(book);

            }
        }
    }






}
