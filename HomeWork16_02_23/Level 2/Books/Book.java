package Author;

public class Book{
    String author;
    int publicationYear;
    String bookName;
    String publishingHouse;

    public Book(String author, int publicationYear, String bookName, String publishingHouse) {
        this.author = author;
        this.publicationYear = publicationYear;
        this.bookName = bookName;
        this.publishingHouse = publishingHouse;
    }

    public String getAuthor() {
        return author;
    }

    public int getPublicationYear() {
        return publicationYear;
    }

    public String getBookName() {
        return bookName;
    }

    public String getPublishingHouse() {
        return publishingHouse;
    }

    @Override
    public String toString() {
        return "Book{" +
                "author='" + author + '\'' +
                ", publicationYear=" + publicationYear +
                ", bookName='" + bookName + '\'' +
                ", publishingHouse='" + publishingHouse + '\'' +
                '}';
    }
}
