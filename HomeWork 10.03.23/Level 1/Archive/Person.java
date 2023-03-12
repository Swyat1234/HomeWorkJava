package HomeWork10_03_23;

public class Person {
    private String name;
    private int BirthYear;
    private String surname;
    private String post;
    private int id;

    public int getId() {
        return id;
    }

    public Person(String name, int birthYear, String surname, String post, int id) {
        this.name = name;
        BirthYear = birthYear;
        this.surname = surname;
        this.post = post;
        this.id = id;
    }
}
