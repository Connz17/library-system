package org.example;


public class Main {

    LibraryDatabase database = new LibraryDatabase();



    public static void main(String[] args) {
        LibraryDatabase database = new LibraryDatabase();
        System.out.println(database.getListOfBooks());

        LibraryInitialiser ini = new LibraryInitialiser(database);

        ini.LibraryInit();
        System.out.println(database.getListOfBooks().toString());
    }
}