package org.example;


public class Main {

    public static void main(String[] args) {
        LibraryDatabase library = new LibraryDatabase();
        LibraryInitialiser init = new LibraryInitialiser(library);
        LibrarySystem system = new LibrarySystem();
        init.Initialise();
        system.handleRegistration();
        boolean online = true;

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

            }

            system.checkStatus();
            String status = system.console.nextLine();
            if (status.equalsIgnoreCase("no")) {
                online = false;
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

            }








    }
}