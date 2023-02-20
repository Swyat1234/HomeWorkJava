package Soldier;

import java.util.Comparator;

public class HeightSoldiersComparator implements Comparator<Soldier> {

    @Override
    public int compare(Soldier o1, Soldier o2) {
        if(o1.height < o2.height){
            return -1;
        }
        if(o1.height == o2.height){
            return 0;
        }
        return 0;
    }

    @Override
    public Comparator<Soldier> reversed() {
        return Comparator.super.reversed();
    }
}
