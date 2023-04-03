package Homework;

import java.util.Comparator;

public class Comporator implements Comparator<People> {

    @Override
    public int compare(People o1, People o2) {
        if(o1.age > 18){
            return 1;
        }
        if(o1.age < 18){
            return 0;
        }
        return 0;
    }
}
