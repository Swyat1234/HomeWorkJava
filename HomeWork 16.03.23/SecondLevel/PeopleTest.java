package Homework;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class PeopleTest {
    public static void main(String[] args) {
        List<People> peopleList = new ArrayList<>();
        peopleList.add(new People(40, "Anton", "Vladov", 100.0, 150));
        peopleList.add(new People(11, "Dima", "Dmitriev", 90.0, 170));
        peopleList.add(new People(12, "Sveta", "Svetlova", 80.0, 180));
        peopleList.add(new People(15, "Alex", "Juliea", 70.0, 170));
        peopleList.add(new People(21, "Amaria", "Marian", 69.0, 173));
        peopleList.add(new People(123, "Asemen", "Semenov", 72.0, 175));
        peopleList.add(new People(25, "Egor", "Egorov", 84.0, 188));
        List<People> sortedPeopleList = peopleList.stream()
                .filter(people -> people.age > 18)
                .filter(people -> people.high < 180)
                .filter(people -> people.firstName.charAt(0) == 'A')
                .collect(Collectors.toList());
        List<People> secondSortedPeopleList = peopleList.stream()
                .filter(people -> people.age > 30)
                .filter(people -> people.lastName.charAt(0) == 'A')
                .filter(people -> people.firstName.length() > 5)
                .collect(Collectors.toList());
        System.out.println(sortedPeopleList);
        System.out.println(secondSortedPeopleList);
        System.out.println(peopleList);
    }
}
