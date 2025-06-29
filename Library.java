 import java.util.ArrayList;

public class Library {
    ArrayList<Book> books = new ArrayList<>();
    ArrayList<User> users = new ArrayList<>();

    public void addBook(Book book) {
        books.add(book);
    }

    public void addUser(User user) {
        users.add(user);
    }

    public Book findBook(String title) {
        for (Book b : books) {
            if (b.title.equalsIgnoreCase(title)) return b;
        }
        return null;
    }

    public User findUser(String name) {
        for (User u : users) {
            if (u.name.equalsIgnoreCase(name)) return u;
        }
        return null;
    }

    public void showBooks() {
        System.out.println("\nLibrary Books:");
        for (Book b : books) System.out.println(b);
    }

    public void showUsers() {
        System.out.println("\nLibrary Users:");
        for (User u : users) System.out.println(u);
    }
}
