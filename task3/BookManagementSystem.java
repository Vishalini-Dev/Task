package task3;//Question1

import java.util.Scanner;
public class BookManagementSystem {
    public static void main(String[] args) {
        //input from user
        Library library = new Library();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("task3.Library Management System");
            System.out.println("1. Add Book");
            System.out.println("2. Remove Book");
            System.out.println("3. Search Book");
            System.out.println("4. Replace Book");
            System.out.println("5. Display Books");
            System.out.println("6. Exit");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();

            switch (choice) {
                //add book in system
                case 1:
                    System.out.print("Enter Book ID: ");
                    int bookID = scanner.nextInt();
                    scanner.nextLine();
                    System.out.print("Enter Title: ");
                    String title = scanner.nextLine();
                    System.out.print("Enter Author: ");
                    String author = scanner.nextLine();
                    System.out.print("Is Available (true/false): ");
                    boolean isAvailable = scanner.nextBoolean();
                    library.addBook(new Book(bookID, title, author, isAvailable));
                    System.out.println("Book added successfully!");
                    break;

                // remove book in system
                case 2:
                    System.out.print("Enter Book ID to remove: ");
                    int removeID = scanner.nextInt();
                    library.removeBook(removeID);
                    System.out.println("Book removed successfully!");
                    break;

                //Search book in system
                case 3:
                    System.out.print("Enter Book ID to search: ");
                    int searchID = scanner.nextInt();
                    Book foundBook = library.searchBook(searchID);
                    if (foundBook != null) {
                        System.out.println("Book found:");
                        System.out.println("Book ID: " + foundBook.getBookID());
                        System.out.println("Title: " + foundBook.getTitle());
                        System.out.println("Author: " + foundBook.getAuthor());
                        System.out.println("Available: " + foundBook.isAvailable());
                    } else {
                        System.out.println("Book not found.");
                    }
                    break;

                //Replace book in system
                case 4:
                    System.out.print("Enter Book ID to replace: ");
                    int replaceID = scanner.nextInt();
                    scanner.nextLine();
                    System.out.print("Enter new Title: ");
                    String newTitle = scanner.nextLine();
                    System.out.print("Enter new Author: ");
                    String newAuthor = scanner.nextLine();
                    System.out.print("Is Available (true/false): ");
                    boolean newIsAvailable = scanner.nextBoolean();
                    library.replaceBook(replaceID, new Book(replaceID, newTitle, newAuthor, newIsAvailable));
                    System.out.println("Book replaced successfully!");
                    break;

                 //displaying all books in system
                case 5:
                    System.out.println("Displaying all books:");
                    library.displayBooks();
                    break;

                //exit
                case 6:
                    System.out.println("Exiting...");
                    scanner.close();
                    return;

                //invalid input
                default:
                    System.out.println("Invalid choice! Please try again.");
            }
        }
    }
}
