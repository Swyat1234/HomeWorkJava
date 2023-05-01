package HomeWork20_04_23;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;


public class StudentTest {

    public static void main(String[] args) {
        List<Student> backEndGroup = new ArrayList<>();
        List<Student> frontEndGroup = new ArrayList<>();
        List<Student> qAGroup = new ArrayList<>();
        backEndGroup.add(new Student("Brad", 4, false, "Male"));
        backEndGroup.add(new Student("Dave", 3, true, "Male"));
        backEndGroup.add(new Student("Sasha", 5, false, "Female"));
        backEndGroup.add(new Student("Clare", 5, true, "Female"));
        backEndGroup.add(new Student("Steffi", 5, false, "Female"));

        frontEndGroup.add(new Student("Hope", 5, false, "Female"));
        frontEndGroup.add(new Student("Dave", 3, true, "Male"));
        frontEndGroup.add(new Student("Penelope", 4, false, "Female"));
        frontEndGroup.add(new Student("Kate", 5, false, "Female"));
        frontEndGroup.add(new Student("Clark", 4, true, "Male"));

        qAGroup.add(new Student("Lora", 5, false, "Female"));
        qAGroup.add(new Student("Jim", 5, true, "Female"));
        qAGroup.add(new Student("Olga", 4, false, "Female"));
        qAGroup.add(new Student("Liza", 3, false, "Female"));
        qAGroup.add(new Student("Steffen", 4, true, "Female"));

        List<List<Student>> groupsList = new ArrayList<>();
        groupsList.add(backEndGroup);
        groupsList.add(frontEndGroup);
        groupsList.add(qAGroup);
        List<Integer> rate = groupsList.stream().map(StudentTest::apply).collect(Collectors.toList());
        System.out.println(rate);
    }

    private static Object apply(List<Student> students) {
        return Student::getRate;
    }
}

