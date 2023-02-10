package NumberSearch;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class NumberSearch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Person vasya = new Person("Вася","Пупкин",1234567);
        Person petya = new Person("Петя","Пупкин",0000000);
        Person dima = new Person("Дима","Пенков",19191919);
        List list = new ArrayList<>();
        list.add(0,vasya);
        list.add(1,petya);
        list.add(2,dima);
        

    }
}
