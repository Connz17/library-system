package org.example;

import java.util.Scanner;

public class LibrarySystem {

    Scanner console = new Scanner(System.in);

    Account userAccount = new Account();
    User user = new User("", userAccount);


    public void addUser(){
        System.out.println("Please enter you name...");
        user.setName(console.nextLine());
        System.out.println("Welcome " + user.getName());
    }

    public void handleRegistration(){
        System.out.println("Welcome to the library please register with your name and create an account.");
        addUser();
    }

    public void selectLibraryFunction(){
        System.out.println(user.getName() + " Please choose a function you want to execute by entering the corresponding number: \n1- Display available books. \n2- Search for books by Title. \n3- Search for books by Genre. \n4- Search for books by Author. \n5- Search for books by Publisher. \n6- Search for books by Number. \n7- Loan Book. \n8- Return Book. \n9- Check account.");

    }

    public void checkStatus(){
        System.out.println("Would you like to use a function? \n 'YES' \n 'NO'");

    }

}
