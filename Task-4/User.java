import java.util.ArrayList;
import java.util.List;

public class User {
    private int id;
    private String name;
    private List<Book> issuedBooks;

    public User(int id, String name) {
        this.id = id;
        this.name = name;
        this.issuedBooks = new ArrayList<>();
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void issueBook(Book book) {
        if (!book.isIssued()) {
            book.issueBook();
            issuedBooks.add(book);
        } else {
            System.out.println("Sorry, " + book.getTitle() + " is already issued to someone else.");
        }
    }

    public void returnBook(Book book) {
        if (issuedBooks.contains(book)) {
            book.returnBook();
            issuedBooks.remove(book);
        } else {
            System.out.println("You don’t have this book issued.");
        }
    }

    @Override
    public String toString() {
        return "User ID: " + id + ", Name: " + name + ", Books Issued: " + issuedBooks.size();
    }
}
