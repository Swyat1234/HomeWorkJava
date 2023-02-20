package Author;

public class Author{
    String name;
    String surname;
    int birthday;

    public Author(String name, String surname, int birthday) {
        this.name = name;
        this.surname = surname;
        this.birthday = birthday;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public int getBirthday() {
        return birthday;
    }
}
