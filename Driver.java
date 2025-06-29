import java.util.Scanner;
public class Driver {
    public static void main(String[] args) {
        Library library = new Library();
        Scanner sc = new Scanner(System.in);

        // Sample data
        library.addBook(new Book("The Alchemist", "Paulo Coelho"));
        library.addBook(new Book("1984", "George Orwell"));
        library.addUser(new User("Alice"));
        library.addUser(new User("Bob"));

        int choice;
        do {
            System.out.println("\n--- Library Menu ---");
            System.out.println("1. View Books");
            System.out.println("2. View Users");
            System.out.println("3. Issue Book");
            System.out.println("4. Return Book");
            System.out.println("0. Exit");
            System.out.print("Enter choice: ");
            choice = sc.nextInt();
            sc.nextLine(); // consume newline

            switch (choice) {
                case 1 -> library.showBooks();
                case 2 -> library.showUsers();
                case 3 -> {
                    System.out.print("Enter user name: ");
                    String userName = sc.nextLine();
                    User user = library.findUser(userName);
                    if (user == null) {
                        System.out.println("User not found.");
                        break;
                    }
                    System.out.print("Enter book title: ");
                    String bookTitle = sc.nextLine();
                    Book book = library.findBook(bookTitle);
                    if (book == null || book.isIssued) {
                        System.out.println("Book not available.");
                        break;
                    }
                    if (user.borrowBook(book)) {
                        System.out.println("Book issued to " + userName);
                    } else {
                        System.out.println("User already has a book.");
                    }
                }
                case 4 -> {
                    System.out.print("Enter user name: ");
                    String userName = sc.nextLine();
                    User user = library.findUser(userName);
                    if (user == null || user.borrowedBook == null) {
                        System.out.println("No book to return.");
                        break;
                    }
                    if (user.returnBook()) {
                        System.out.println("Book returned.");
                    }
                }
                case 0 -> System.out.println("Exiting...");
                default -> System.out.println("Invalid choice.");
            }
        } while (choice != 0);

        sc.close();
    }
}

