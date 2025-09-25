public class Main {
    public static void main(String[] args) {
        Library library = new Library();

        // Adding books
        Book b1 = new Book(1, "Java Basics", "James Gosling");
        Book b2 = new Book(2, "Effective Java", "Joshua Bloch");
        Book b3 = new Book(3, "Clean Code", "Robert C. Martin");

        library.addBook(b1);
        library.addBook(b2);
        library.addBook(b3);

        // Adding users
        User u1 = new User(1, "Sharmin");
        User u2 = new User(2, "Rahul");

        library.addUser(u1);
        library.addUser(u2);

        // Issue & return demo
        u1.issueBook(b1);  // Sharmin issues Java Basics
        u2.issueBook(b1);  // Rahul tries same book (should fail)
        u1.returnBook(b1); // Sharmin returns it
        u2.issueBook(b1);  // Rahul issues it now

        // Show available books
        library.showAvailableBooks();
    }
}
