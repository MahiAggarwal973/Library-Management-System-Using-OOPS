import java.util.ArrayList;

public class Library implements LibraryOperations {

    private ArrayList<Book> books;
    private ArrayList<Student> students;

    public Library() {
        books = new ArrayList<>();
        students = new ArrayList<>();
    }

    // Add Book
    public void addBook(Book book) {
        books.add(book);
        System.out.println("Book added successfully.");
    }

    // Add Student
    public void addStudent(Student student) {
        students.add(student);
        System.out.println("Student added successfully.");
    }

    // View Books
    public void viewBooks() {
        if (books.isEmpty()) {
            System.out.println("No books available.");
            return;
        }

        for (Book b : books) {
            b.displayBook();
        }
    }

    // Find Book
    private Book findBook(int bookId) {
        for (Book b : books) {
            if (b.getBookId() == bookId) {
                return b;
            }
        }
        return null;
    }

    // Find Student
    private Student findStudent(int studentId) {
        for (Student s : students) {
            if (s.id == studentId) {
                return s;
            }
        }
        return null;
    }

    // Issue Book
    @Override
    public void issueBook(int studentId, int bookId) {

        Student student = findStudent(studentId);
        Book book = findBook(bookId);

        try {

            if (student == null) {
                throw new Exception("Invalid Student ID.");
            }

            if (book == null) {
                throw new Exception("Book not found.");
            }

            if (!book.isAvailable()) {
                throw new Exception("Book already issued.");
            }

            if (student.getBorrowedBooks().size() >= 3) {
                throw new Exception("Student exceeds borrow limit.");
            }

            student.borrowBook(book);
            book.setAvailability(false);

            System.out.println("Book issued successfully.");

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    // Return Book
    @Override
    public void returnBook(int studentId, int bookId) {

        Student student = findStudent(studentId);
        Book book = findBook(bookId);

        try {

            if (student == null) {
                throw new Exception("Invalid Student ID.");
            }

            if (book == null) {
                throw new Exception("Book not found.");
            }

            if (!student.getBorrowedBooks().contains(book)) {
                throw new Exception("Student did not borrow this book.");
            }

            student.returnBook(book);
            book.setAvailability(true);

            System.out.println("Book returned successfully.");

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    // View Student Details
    public void viewStudentDetails(int studentId) {

        Student student = findStudent(studentId);

        if (student == null) {
            System.out.println("Student not found.");
            return;
        }

        student.displayDetails();
    }
}