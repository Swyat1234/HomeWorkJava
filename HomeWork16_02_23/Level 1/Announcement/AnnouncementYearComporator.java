package Announcement;

import java.util.Comparator;

public class AnnouncementYearComporator implements Comparator<Announcement> {
    @Override
    public int compare(Announcement o1, Announcement o2) {
        if (o1.getYear() < o2.getYear()) {
            return -1;
        }
        if (o1.getYear() == o2.getYear()) {
            {
                return 0;
            }
        }
        return 1;
    }
}
