package Hospital;

import java.util.ArrayList;
import java.util.Random;

public class Doctor {

    static ArrayList<Cure> recipes = new ArrayList<>();

    public static void addCure(String cureName){
        recipes.add(new Cure(cureName));
    }
    public static String getRandomElement(ArrayList<Cure> list) {
        Random random = new Random();
        int randomIndex = random.nextInt(list.size());
        return list.get(randomIndex).toString();
    }
    }

