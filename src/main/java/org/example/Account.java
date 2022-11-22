package org.example;

import java.util.ArrayList;
import java.util.List;

public class Account {



    private List <Book> booksLoaned = new ArrayList<>();

    public Account() {
    }



    public List <Book> loanedBooks(){
        return booksLoaned;
    }

    public void displayAccount(){
        for (int i = 0; i < booksLoaned.size(); i++) {
            System.out.println(booksLoaned.get(i));
        }
    }

    public int numberOfBooksBorrowed(){
        return booksLoaned.size();
    }

    public void addBook(Book book){
        booksLoaned.add(book);
    }

    public void deleteBook(Book book){
        booksLoaned.remove(book);
    }

    public Book getBookByTitle(String title){
        for (Book book: booksLoaned ) {
            if (book.getTitle().contains(title)){
                return book;
            }
        }
        return null;
    }

}
