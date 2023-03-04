package HomeWork280223.Appartement;

import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class House {
    public House() {
    }

    public static void main(String[] args) {
        TreeMap<Integer, People> house = new TreeMap<>();
        People vasya = new People("Vasya","Shutov");
        People dima = new People("Dima","Olegov");
        People tanya = new People("Tanya","Tanya");
        People efim = new People("Efim","Efimov");
        People oleg = new People("Oleg","Olegov");
        People valentin = new People("Valentin","Valentinov");
        People pavel = new People("Pavel","Pavlov");
        People oleksei = new People("Oleksei","Olekseiev");
        People urii = new People("Urii","Uriev");
        People henadii = new People("Henadii","Henadiev");
        house.put(1,vasya);
        house.put(2,dima);
        house.put(3,tanya);
        house.put(4,efim);
        house.put(5,oleg);
        house.put(6,valentin);
        house.put(7,pavel);
        house.put(8,oleksei);
        house.put(9,urii);
        house.put(10,henadii);
        System.out.println(house);

    }
}
