package HomeWork220223;

import java.util.HashMap;

import java.util.Map;

public class Football {
    public static void main(String[] args) {
        Map<Integer, String> map = new HashMap<>();
        map.put(1, "Забила команда № 2");
        map.put(2, "Потом забила команда № 1 ");
        map.put(3, "Затем забила команда № 2");
        map.put(4, "И в конце забила команда № 2");
        int countTeam1 = 0;
        int countTeam2 = 0;
        for (Integer s : map.keySet()) {
            if (map.get(s).contains("1")) {
                countTeam1++;
            } else if (map.get(s).contains("2")) {
                countTeam2++;
            }
        }
        System.out.println("Первая команда: " + countTeam1 + " голов");
        System.out.println("Вторая команда: " + countTeam2 + " голов");
    }
}

