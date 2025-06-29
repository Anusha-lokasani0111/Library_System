public class User {
    String name;
    Book borrowedBook;

    public User(String name) {
        this.name = name;
        this.borrowedBook = null;
    }

    public boolean borrowBook(Book book) {
        if (borrowedBook == null && !book.isIssued) {
            borrowedBook = book;
            book.issue();
            return true;
        }
        return false;
    }

    public boolean returnBook() {
        if (borrowedBook != null) {
            borrowedBook.returnBook();
            borrowedBook = null;
            return true;
        }
        return false;
    }

    @Override
    public String toString() {
        return name + (borrowedBook != null ? " has borrowed " + borrowedBook.title : " has no book borrowed");
    }
}

