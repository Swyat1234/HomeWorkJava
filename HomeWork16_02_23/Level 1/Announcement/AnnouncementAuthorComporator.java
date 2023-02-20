package Announcement;

import java.util.Comparator;

public class AnnouncementAuthorComporator implements Comparator<Announcement> {
    @Override
        public int compare(Announcement o1, Announcement o2) {
            return o1.getAuthor().compareTo(o2.getAuthor());
        }
    }
