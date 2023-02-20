package Author;

import java.util.Comparator;

public class BookYearComparator implements Comparator<Book> {
    @Override
    public int compare(Book o1, Book o2) {
        if (o1.getPublicationYear() < o2.getPublicationYear()){
            return -1;
        } else if (o1.getPublicationYear() > o2.publicationYear) {
            return 1;
        }
        return 0;
    }

    @Override
    public Comparator<Book> reversed() {
        return Comparator.super.reversed();
    }
}
