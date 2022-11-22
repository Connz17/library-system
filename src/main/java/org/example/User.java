package org.example;

public class User extends Person{

    private Account account;


    public User(int id, String name, Account account) {
        super(id, name);
        this.account = account;
    }

    @Override
    public String toString() {
        return "User{}";
    }

// public void loanBook(LibraryDatabase libraryDatabase, Account account){
//     libraryDatabase.getListOfBooks().
// }
}
