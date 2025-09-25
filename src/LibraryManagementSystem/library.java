package LibraryManagementSystem;

import java.util.ArrayList;

public class library {
    private ArrayList<Book> allBooks;
    private ArrayList<User> allUsers;

    public library() {
        this.allBooks = new ArrayList<>();
        this.allUsers = new ArrayList<>();
    }

    public void addBook(Book book) {
        this.allBooks.add(book);
        System.out.println("Book '" + book.getTitle() + "' has been added to the library.");
    }

    public void addUser(User user) {
        this.allUsers.add(user);
        System.out.println("User '" + user.getName() + "' has been registered.");
    }

    public void issueBook(int bookId, int userId) {
        Book bookToIssue = findBookById(bookId);
        User userToIssueTo = findUserById(userId);

        if (bookToIssue == null) {
            System.out.println("Error: Book with ID " + bookId + " not found.");
            return;
        }

        if (userToIssueTo == null) {
            System.out.println("Error: User with ID " + userId + " not found.");
            return;
        }

        if (bookToIssue.isIssued()) {
            System.out.println("Error: Book '" + bookToIssue.getTitle() + "' is already issued.");
            return;
        }

        bookToIssue.setIssued(true);
        userToIssueTo.borrowBook(bookToIssue);
        System.out.println("Book '" + bookToIssue.getTitle() + "' has been issued to user '" + userToIssueTo.getName() + "'.");
    }

    public void returnBook(int bookId, int userId) {
        Book bookToReturn = findBookById(bookId);
        User userToReturnFrom = findUserById(userId);

        if (bookToReturn == null) {
            System.out.println("Error: Book with ID " + bookId + " not found.");
            return;
        }

        if (userToReturnFrom == null) {
            System.out.println("Error: User with ID " + userId + " not found.");
            return;
        }

        if (!bookToReturn.isIssued()) {
            System.out.println("Error: Book '" + bookToReturn.getTitle() + "' is not currently issued.");
            return;
        }

        bookToReturn.setIssued(false);
        userToReturnFrom.returnBook(bookToReturn);
        System.out.println("Book '" + bookToReturn.getTitle() + "' has been returned successfully by user '" + userToReturnFrom.getName() + "'.");
    }

    private Book findBookById(int bookId) {
        for (Book book : allBooks) {
            if (book.getBookId() == bookId) {
                return book;
            }
        }
        return null;
    }

    private User findUserById(int userId) {
        for (User user : allUsers) {
            if (user.getUserId() == userId) {
                return user;
            }
        }
        return null;
    }
}
