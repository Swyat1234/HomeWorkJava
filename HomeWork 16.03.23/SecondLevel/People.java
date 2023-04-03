package Homework;

import java.util.Objects;

public class People {
    int age;
    String firstName;

    @Override
    public String toString() {
        return "People{" +
                "age=" + age +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", weight=" + weight +
                ", high=" + high +
                '}';
    }

    public People(int age, String firstName, String lastName, double weight, int high) {
        this.age = age;
        this.firstName = firstName;
        this.lastName = lastName;
        this.weight = weight;
        this.high = high;
    }

    String lastName;
    double weight;
    int high;

    public int getAge() {
        return age;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public double getWeight() {
        return weight;
    }

    public int getHigh() {
        return high;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        People people = (People) o;
        return age == people.age && Double.compare(people.weight, weight) == 0 && high == people.high && Objects.equals(firstName, people.firstName) && Objects.equals(lastName, people.lastName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(age, firstName, lastName, weight, high);
    }
}
