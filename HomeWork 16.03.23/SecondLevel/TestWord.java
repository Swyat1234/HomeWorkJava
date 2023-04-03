package Homework;

public class TestWord {
    public static void main(String[] args) {
        String str = "test";
        firstLetter(str);

    }
    public static void firstLetter (String str){
        System.out.println(str.substring(0,1).toUpperCase() + str.substring(1));
    }
}
