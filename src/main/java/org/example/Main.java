package org.example;


public class Main {

    LibraryDatabase database = new LibraryDatabase();



    public static void main(String[] args) {
        LibraryDatabase library = new LibraryDatabase();
        LibraryInitialiser init = new LibraryInitialiser(library);
        init.Initialise();

        //library.displayBooks();

        //library.getBookByTitle("To Sir With Love");

        Account account = new Account();

        User Bob = new User(1, "Bob", account);

        //Bob.checkAccount(account);

        Bob.loanBook(library, account, "To Sir With Love");

        Bob.checkAccount(account);

        Bob.returnBook(library, account, "To Sir With Love");

        Bob.checkAccount(account);



    }
}