package Announcement;

import java.util.Comparator;

public class AnnouncementNameComparator implements Comparator<Announcement> {
    @Override
    public int compare(Announcement o1, Announcement o2) {
        return o1.getName().compareTo(o2.getName());
    }
}
