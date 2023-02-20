package Announcement;

import java.util.Comparator;

public class Announcement{
    int price;
    String name;
    String description;
    String author;
    int year;

    public Announcement(int price, String name, String description, String author, int year) {
        this.price = price;
        this.name = name;
        this.description = description;
        this.author = author;
        this.year = year;
    }

    @Override
    public String toString() {
        return "Announcement{" +
                "price=" + price +
                ", name='" + name + '\'' +
                ", description='" + description + '\'' +
                ", author='" + author + '\'' +
                ", year=" + year +
                '}';
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public String getAuthor() {
        return author;
    }

    public int getYear() {
        return year;
    }

    public int getPrice() {
        return price;
    }
}

