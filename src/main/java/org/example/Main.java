package org.example;


public class Main {

    LibraryDatabase database = new LibraryDatabase();



    public static void main(String[] args) {
        LibraryDatabase library = new LibraryDatabase();

        LibraryInitialiser init = new LibraryInitialiser(library);

        init.Initialise();
        //System.out.println(library.getListOfBooks());
        //System.out.println(library.getListOfBooks());
        //library.displayBooks();
        library.getBookByTitle("Data");

    }
}