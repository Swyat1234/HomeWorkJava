public class Person {
    String fullName;
    int age;

    public Person(){
    }

    public Person(String name,int age){
        this.fullName = name;
        this.age = age;
    }

    public void move(String person){
        System.out.println("Этот " + person + " двигаеться");
    }

    public void talk(String person){
        System.out.println("Этот " + person + " говорит");
    }
}
