import java.util.Arrays;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
    Person dave = new Person("dave", 25);
    Person peter = new Person();

    Phone phone1 = new Phone(1,"первый",20);
    Phone phone2 = new Phone(2,"второй",30);
    Phone phone3 = new Phone(3,"третий",40);

        System.out.println(phone1);
        System.out.println(phone2);
        System.out.println(phone3);

        phone1.receiveCall();
        phone2.receiveCall();
        phone3.receiveCall();
    }
}



            









