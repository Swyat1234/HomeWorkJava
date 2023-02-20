package Soldier;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Soldier {
   int height;

    public Soldier(int height) {
        this.height = height;
    }

    @Override
    public String toString() {
        return "Soldier{" +
                "height=" + height +
                '}';
    }

    public static void main(String[] args) {
        List<Soldier> soldiers =new ArrayList<>();
        soldiers.add(new Soldier(185));
        soldiers.add(new Soldier(175));
        soldiers.add(new Soldier(165));
        Collections.sort(soldiers,new HeightSoldiersComparator().reversed());
        System.out.println(soldiers);
    }
}
