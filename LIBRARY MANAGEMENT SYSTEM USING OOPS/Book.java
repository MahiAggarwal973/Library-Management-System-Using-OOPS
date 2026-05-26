public class Book {

    private int bookId;
    private String bookName;
    private String authorName;
    private boolean isAvailable;

    public Book(int bookId, String bookName, String authorName) {
        this.bookId = bookId;
        this.bookName = bookName;
        this.authorName = authorName;
        this.isAvailable = true;
    }

    public int getBookId() {
        return bookId;
    }

    public String getBookName() {
        return bookName;
    }

    public String getAuthorName() {
        return authorName;
    }

    public boolean isAvailable() {
        return isAvailable;
    }

    public void setAvailability(boolean status) {
        isAvailable = status;
    }

    public void displayBook() {
        System.out.println("\nBook ID: " + bookId);
        System.out.println("Book Name: " + bookName);
        System.out.println("Author: " + authorName);
        System.out.println("Status: " + (isAvailable ? "Available" : "Issued"));
    }
}
