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

    public int numberOfBooksBorrowed(){
        return booksLoaned.size();
    }


}
