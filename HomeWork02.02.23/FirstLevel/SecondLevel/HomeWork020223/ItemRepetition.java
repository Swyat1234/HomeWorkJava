package HomeWork020223;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class ItemRepetition {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add(0,"Ручка");
        list.add(1,"Карандаш");
        list.add(2,"Пенал");
        list.add(3,"Резинка");
        list.add(4,"Линейка");
        list.add(5,"Ручка");
        Set<String> stringSet = new HashSet<>(list);
        list.clear();
        list.addAll(stringSet);

        System.out.println(list);


    }
}
