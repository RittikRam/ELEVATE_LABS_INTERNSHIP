package LibraryManagementSystem;

// LibraryManagementSystem.java
import java.util.Scanner;

public class LibraryManagementSystem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        library myLibrary = new library();

        // Populate the library with some initial data for demonstration
        myLibrary.addBook(new Book(1, "The Lord of the Rings", "J.R.R. Tolkien"));
        myLibrary.addBook(new Book(2, "The Hitchhiker's Guide to the Galaxy", "Douglas Adams"));
        myLibrary.addBook(new Book(3, "1984", "George Orwell"));

        myLibrary.addUser(new User(101, "Alice"));
        myLibrary.addUser(new User(102, "Bob"));

        int choice;
        do {
            System.out.println("\n--- Library Management System Menu ---");
            System.out.println("1. Issue a book");
            System.out.println("2. Return a book");
            System.out.println("3. Exit");
            System.out.print("Enter your choice: ");

            choice = scanner.nextInt();

            scanner.nextLine();

            switch (choice) {
                case 1:
                    System.out.print("Enter Book ID to issue: ");
                    int issueBookId = scanner.nextInt();
                    System.out.print("Enter User ID: ");
                    int issueUserId = scanner.nextInt();
                    myLibrary.issueBook(issueBookId, issueUserId);
                    break;
                case 2:
                    System.out.print("Enter Book ID to return: ");
                    int returnBookId = scanner.nextInt();
                    System.out.print("Enter User ID: ");
                    int returnUserId = scanner.nextInt();
                    myLibrary.returnBook(returnBookId, returnUserId);
                    break;
                case 3:
                    System.out.println("Exiting system. Goodbye!");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        } while (choice != 3);

        scanner.close();
    }
}