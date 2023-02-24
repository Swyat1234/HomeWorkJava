package Hospital;

import java.util.ArrayDeque;

import java.util.Deque;

public class Registry {
    static Deque<Patient> patientArrayList = new ArrayDeque<>();
    public static void addPatient(String name){
        patientArrayList.add(new Patient(name));
        if(Registry.patientArrayList.size()> 10){
            System.out.println("Простите , очередь переполнена нужно подождать");
            Registry.patientArrayList.removeLast();
        }
    }
}
