package org.example;

public class User extends Person{

    private Account account;


    public User(String name, Account account) {
        super(name);
        this.account = account;
    }

    public Account getAccount() {
        return account;
    }

    public void setAccount(Account account) {
        this.account = account;
    }

    public void loanBook(LibraryDatabase libraryDatabase, Account account, String title){
         account.addBook(libraryDatabase.getBookByTitle(title));
         libraryDatabase.deleteBook(libraryDatabase.getBookByTitle(title));
     }

    public void returnBook(LibraryDatabase libraryDatabase, Account account, String title){
        libraryDatabase.addBook(account.getBookByTitle(title));
        account.deleteBook(account.getBookByTitle(title));

    }

    public void checkAccount(Account account){
        account.displayAccount();
    }



}
