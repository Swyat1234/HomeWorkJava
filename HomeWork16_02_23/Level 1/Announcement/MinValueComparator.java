package Announcement;

import java.util.Comparator;

public class MinValueComparator implements Comparator<Announcement> {
    @Override
    public int compare(Announcement o1, Announcement o2) {
        if(o1.getPrice() < o2.getPrice() || o1.getYear() < o2.getYear()){
            return 1;
        } else if (o1.getPrice() > o2.getPrice() || o1.getYear() > o2.getYear()) {
            return -1;
        }
        return 0;
    }
}
