package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        UserDatabase userDatabase = new UserDatabase();
        Scanner scanner = new Scanner(System.in);


        while (true) {
            System.out.println("Choose an option: \n1. Register \n2. Login \n3. Exit");
            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            if (choice == 1) {
                System.out.print("Enter username: ");
                String username = scanner.nextLine();
                System.out.print("Enter password: ");
                String password = scanner.nextLine();
                userDatabase.registerUser(username, password);
            } else if (choice == 2) {
                System.out.print("Enter username: ");
                String username = scanner.nextLine();
                System.out.print("Enter password: ");
                String password = scanner.nextLine();
                userDatabase.loginUser(username, password);
            } else if (choice == 3) {
                System.out.println("Exiting...");
                break;
            } else {
                System.out.println("Invalid option. Try again.");
            }
        }
        scanner.close();
        
        LibraFaca libraryFacade = new LibraFaca();
        
        libraryFacade.registerUser("Alice");
        libraryFacade.registerUser("Bob");

        Library library = Library.getInstance();
        library.addBook(new Book("Java Programming", "Author A"));
        library.addBook(new Book("Design Patterns", "Author B"));

        libraryFacade.borrowBook("Java Programming", "Alice");
        libraryFacade.returnBook("Java Programming", "Alice");

        libraryFacade.setLoanPolicy(new ExteLoPoli());
        libraryFacade.borrowBook("Design Patterns", "Alice");
    }
}
