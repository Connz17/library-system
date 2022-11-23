package org.example;


public class Main {

    public static void main(String[] args) {
        LibraryDatabase library = new LibraryDatabase();
        LibraryInitialiser init = new LibraryInitialiser(library);
        LibrarySystem system = new LibrarySystem();
        init.Initialise();
        system.handleRegistration();
        boolean online = true;

        while (online){
            system.selectLibraryFunction();
            int function = system.console.nextInt();
            system.console.nextLine();
            switch (function) {
                case 1:
                    library.displayBooks();
                    break;
                case 2:
                    System.out.println("Please enter the book title");
                    String title = system.console.nextLine();
                    library.searchBooksByTitle(title);
                    break;
                case 3:
                    System.out.println("Please enter the book genre");
                    String genre = system.console.nextLine();
                    library.searchBooksByGenre(genre);
                    break;
                case 4:
                    System.out.println("Please enter the book author");
                    String author = system.console.nextLine();
                    library.searchBooksByAuthor(author);
                    break;
                case 5:
                    System.out.println("Please enter the book publisher");
                    String publisher = system.console.nextLine();
                    library.searchBooksByPublisher(publisher);
                    break;
                case 6:
                    System.out.println("Please enter the book number");
                    int id = system.console.nextInt();
                    system.console.nextLine();
                    library.getBookById(id);
                    break;
                case 7:
                    System.out.println("Please enter the book title you wish to loan");
                    String bookTitle = system.console.nextLine();
                    system.user.loanBook(library,system.userAccount,bookTitle);
                    break;
                case 8:
                    System.out.println("Please enter the book title you wish to return");
                    String borrowedBook = system.console.nextLine();
                    system.user.returnBook(library,system.userAccount,borrowedBook);
                    break;
                case 9:
                    system.user.checkAccount(system.userAccount);
                    break;
            }
            system.checkStatus();
            String status = system.console.nextLine();
            if (status.equalsIgnoreCase("no")) {
                online = false;
            }

            }

    }
}




//            if (function == 1){
//
//
//            } else if (function == 2) {
//                System.out.println("Please enter the book title");
//                library.searchBooksByTitle(system.console.nextLine());
//            }
//
//            system.checkStatus();
//            String status = system.console.nextLine();
//            if (status.equalsIgnoreCase("no")){
//                online = false;
//
//            }


//        do {
//            if (system.selectLibraryFunction() == 1){
//                library.displayBooks();
//                continue;
//
//            } else if (system.selectLibraryFunction() == 2) {
//                System.out.println("Please enter the book title");
//                library.searchBooksByTitle(system.console.nextLine());
//                continue;
//            }
//
//            if (system.checkStatus().equalsIgnoreCase("no")){
//                online = false;
//            }
//
//        } while (online);