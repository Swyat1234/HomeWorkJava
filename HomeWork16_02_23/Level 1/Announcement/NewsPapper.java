package Announcement;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class NewsPapper {
    public static void main(String[] args) {
        List<Announcement> announcements = new ArrayList<>();
        announcements.add(new Announcement(11, "First", "First description", "FirstAuthor", 5));
        announcements.add(new Announcement(12, "Second", "Second description", "Second Author", 3));
        announcements.add(new Announcement(13, "Third", "Third description", "Third Author", 2));
        announcements.add(new Announcement(14, "Fourth", "Fourth description", "Fourth Author", 1));
        announcements.add(new Announcement(15, "Fifth", "Fifth description", "Fifth Author", 8));
        announcements.add(new Announcement(16, "Sixth", "Sixth description", "Sixth Author", 4));
        announcements.add(new Announcement(17, "Seventh", "Seventh description", "Seventh Author", 0));
        announcements.add(new Announcement(18, "Eighth", "Eighth description", "Eighth Author", 9));
        announcements.add(new Announcement(19, "Ninth", "Ninth description", "Ninth Author", 7));
        announcements.add(new Announcement(20, "Tenth", "Tenth description", "Tenth Author", 10));
        Comparator<Announcement> customComparator = new AnnouncementYearComporator().reversed()
                .thenComparing(new AnnouncementNameComparator()
                        .thenComparing(new AnnouncementAuthorComporator()
                                .thenComparing(new AnnouncementDescriptionComporator())));
        Collections.sort(announcements,customComparator);
        System.out.println(announcements);
        Collections.sort(announcements,new MaxValueComparator().reversed());
        System.out.println(announcements);
        Collections.sort(announcements,new MinValueComparator().reversed());
        System.out.println(announcements);

    }
}
