package HomeWork10_03_23;

import java.util.HashMap;
import java.util.Map;

public class KeyTest {
    public static void main(String[] args) {
        Map<Archive,Person> data = new HashMap<>();
        Person vasya = new Person("Вася",2000,"Васильев","Дворник",1);
        Person dima = new Person("Дима",2001,"Дмитриев","Дворник",2);
        Person dasha = new Person("Даша",2002,"Дмитриева","Дворник",3);
        Person sveta = new Person("Света",2003,"Васильева","Дворник",4);
        Person jenya = new Person("Женя",2004,"Евгенье","Дворник",5);
        Person petya = new Person("Петя",2005,"Петров","Дворник",6);
        Person vanya = new Person("Ваня",2006,"Иванов","Дворник",7);
        Person igor = new Person("Игорь",2007,"Игоръев","Дворник",8);
        Person dmitriy = new Person("Дмитрий",2008,"Васильев","Дворник",9);
        Person oleg = new Person("Олег",2009,"Иванов","Дворник",10);
        data.put(Archive.NUMBER_ID,vasya);
        data.put(Archive.NUMBER_ID,dima);
        data.put(Archive.NUMBER_ID,sveta);
        data.put(Archive.NUMBER_ID,jenya);
        data.put(Archive.NUMBER_ID,petya);
        data.put(Archive.NUMBER_ID,dasha);
        data.put(Archive.NUMBER_ID,vanya);
        data.put(Archive.NUMBER_ID,igor);
        data.put(Archive.NUMBER_ID,dmitriy);
        data.put(Archive.NUMBER_ID,oleg);
    }
}
