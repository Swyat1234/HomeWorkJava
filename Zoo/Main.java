import Zoo.*;

public class Main {
    public static void main(String[] args) {
        Cat cat = new Cat();
        Dog dog = new Dog();
        Lamb lamb = new Lamb();
        Cow cow = new Cow();
        cow.voice();
        cow.eat("Meat");
        cow.eat("Grass");
        cow.eat("Dog");


        dog.voice();
        dog.eat("Meat");
        dog.eat("Grass");
        dog.eat("Fish");

        cat.voice();
        cat.eat("Meat");
        cat.eat("Grass");
        cat.eat("Dog");

        lamb.voice();
        lamb.eat("Grass");
        lamb.eat("Meat");
        lamb.eat("Cat");

    }
}



            









