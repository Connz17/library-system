package org.example;

import java.util.Scanner;

public class LibrarySystem {

    Scanner console = new Scanner(System.in);
    User user = new User("", new Account());


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
        System.out.println(user.getName() + " Please choose a function you want to execute by entering the corresponding number: \n1- Display available books. \n2- Search for books by Title. \n3- Search for books by Genre. \n4- Search for books by Author. \n5- Search for books by Publisher. \n6- Loan Book. \n7- Return Book. \n8- Check account.");

    }

    public void checkStatus(){
        System.out.println("Would you like to use a function? \n 'YES' \n 'NO'");

    }

}
