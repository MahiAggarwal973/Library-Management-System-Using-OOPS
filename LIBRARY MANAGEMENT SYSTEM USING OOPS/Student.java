import java.util.ArrayList;

public class Student extends Person {

    private String department;
    private ArrayList<Book> borrowedBooks;

    public Student(int id, String name, String department) {
        super(id, name);
        this.department = department;
        borrowedBooks = new ArrayList<>();
    }

    public String getDepartment() {
        return department;
    }

    public ArrayList<Book> getBorrowedBooks() {
        return borrowedBooks;
    }

    public void borrowBook(Book book) {
        borrowedBooks.add(book);
    }

    public void returnBook(Book book) {
        borrowedBooks.remove(book);
    }

    @Override
    public void displayDetails() {
        System.out.println("\nStudent Details");
        System.out.println("Student ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("Department: " + department);

        System.out.println("Borrowed Books:");
        if (borrowedBooks.isEmpty()) {
            System.out.println("No books borrowed.");
        } else {
            for (Book b : borrowedBooks) {
                System.out.println("- " + b.getBookName());
            }
        }
    }
}