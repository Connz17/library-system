package org.example;

public class Librarian extends Person{

    private LibraryDatabase libraryDatabase;


    public Librarian(String name, LibraryDatabase libraryDatabase) {
        super(name);
        this.libraryDatabase = libraryDatabase;
    }

    @Override
    public String toString() {
        return "Librarian{}";
    }
}
