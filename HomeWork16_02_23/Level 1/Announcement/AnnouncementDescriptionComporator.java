package Announcement;

import java.util.Comparator;

public class AnnouncementDescriptionComporator implements Comparator<Announcement> {
    @Override
    public int compare(Announcement o1, Announcement o2) {
        return o1.getDescription().compareTo(o2.getDescription());
    }
}
