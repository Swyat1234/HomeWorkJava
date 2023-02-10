package HomeWork020223;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Brokers {
    public static void main(String[] args) {
        List<String> brokers = new ArrayList<>();
        brokers.add(0,"Борисов");
        brokers.add(1,"Данилов");
        brokers.add(2,"Кирилов");
        brokers.add(3,"Якимов");
        brokers.add(4,"Евгенъев");
        brokers.add(5,"Оленьев");
        brokers.add(6,"Первый");
        brokers.add(7,"Второй");
        brokers.add(8,"Третий");
        brokers.add(9,"Четвёртый");
        Collections.swap(brokers,0,9);
        Collections.swap(brokers,1,8);
        Collections.swap(brokers,2,7);
        System.out.println(brokers);


    }
}
