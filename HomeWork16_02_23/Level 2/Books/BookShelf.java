package Author;

import java.util.*;

public class BookShelf {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Author rowling = new Author("Joan","Rowling",1960);
        PublishingHouse publicEngland = new PublishingHouse("PublicEngland",1800);
        List<Book> books = new ArrayList<>();
        books.add(new Book(rowling.getName() + " " + rowling.getSurname(),2001,"Harry Potter",publicEngland.getHouseName()));
        books.add(new Book(rowling.getName() + " " + rowling.getSurname(),2002,"Harry Potter 2", publicEngland.getHouseName()));
        books.add(new Book(rowling.getName() + " " + rowling.getSurname(),2002,"Harry Potter 3", publicEngland.getHouseName()));
        books.add(new Book(rowling.getName() + " " + rowling.getSurname(),2002,"Harry Potter 4", publicEngland.getHouseName()));
        books.add(new Book(rowling.getName() + " " + rowling.getSurname(),2002,"Harry Potter 5", publicEngland.getHouseName()));
        BookSortChoice(scanner, books);

    }

    private static void BookSortChoice(Scanner scanner, List<Book> books) {
        System.out.println("Как отсортировать книги ? 1 - По автору ,2 - По году публикации,3 - по названию книги , 4 - по названию издательства");
        int choice = scanner.nextInt();
        System.out.println("По возростанию или убыванию ? 1 - по возрастанию , 2 - по убыванию");
        int choice2 = scanner.nextInt();
        if(choice == 1 && choice2 == 1){
            Collections.sort(books,new BookAuthorComparator());
            System.out.println(books);
        } else if (choice == 2 && choice2 == 1) {
            Collections.sort(books,new BookYearComparator());
            System.out.println(books);
        } else if (choice == 3 && choice2 == 1) {
            Collections.sort(books,new BookYearComparator());
            System.out.println(books);
        } else if (choice == 4 && choice2 == 1) {
            Collections.sort(books,new BookPublishingHouseComparator());
            System.out.println(books);
        }
        if(choice == 1 && choice2 == 2){
            Collections.sort(books,new BookAuthorComparator());
            System.out.println(books);
        } else if (choice == 2 && choice2 == 2) {
            Collections.sort(books,new BookYearComparator());
            System.out.println(books);
        } else if (choice == 3 && choice2 == 2) {
            Collections.sort(books,new BookYearComparator());
            System.out.println(books);
        } else if (choice == 4 && choice2 == 2) {
            Collections.sort(books,new BookPublishingHouseComparator());
            System.out.println(books);
        }
    }
}
