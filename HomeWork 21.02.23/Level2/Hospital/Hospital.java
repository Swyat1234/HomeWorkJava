package Hospital;

import java.util.Arrays;

public class Hospital {
    public static void main(String[] args) {
        for (String s : Arrays.asList("Оля", "Лёша", "Виталик", "Катя", "Петя", "Даша", "Таня", "Ваня", "Дима","Вася")) {
            Registry.addPatient(s);
        }
        for(String s : Arrays.asList("Зелёнка","Синька","Пластырь","Грелка")){
            Doctor.addCure(s);
        }
        for (Patient s:Registry.patientArrayList) {
            System.out.println("Для пациента " + s + " Назначить лечение " + Doctor.getRandomElement(Doctor.recipes));
        }
    }
}
