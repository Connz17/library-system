package org.example;

import java.util.ArrayList;
import java.util.List;

public class Account {

    private int noOfBorrowedBooks;
    private int noOfReservedBooks;
    private int noOfReturnedBooks;
    private int noOfLostBooks;

    private List <Book> booksLoaned = new ArrayList<>();

    public Account(int noOfBorrowedBooks, int noOfReservedBooks, int noOfReturnedBooks, int noOfLostBooks) {
        this.noOfBorrowedBooks = noOfBorrowedBooks;
        this.noOfReservedBooks = noOfReservedBooks;
        this.noOfReturnedBooks = noOfReturnedBooks;
        this.noOfLostBooks = noOfLostBooks;

    }

    public int getNoOfBorrowedBooks() {
        return noOfBorrowedBooks;
    }

    public void setNoOfBorrowedBooks(int noOfBorrowedBooks) {
        this.noOfBorrowedBooks = noOfBorrowedBooks;
    }

    public int getNoOfReservedBooks() {
        return noOfReservedBooks;
    }

    public void setNoOfReservedBooks(int noOfReservedBooks) {
        this.noOfReservedBooks = noOfReservedBooks;
    }

    public int getNoOfReturnedBooks() {
        return noOfReturnedBooks;
    }

    public void setNoOfReturnedBooks(int noOfReturnedBooks) {
        this.noOfReturnedBooks = noOfReturnedBooks;
    }

    public int getNoOfLostBooks() {
        return noOfLostBooks;
    }

    public void setNoOfLostBooks(int noOfLostBooks) {
        this.noOfLostBooks = noOfLostBooks;
    }


}
