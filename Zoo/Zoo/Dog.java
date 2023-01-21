package Zoo;

public class Dog extends Predator {
    protected String food = "Meat";
    protected String voice = "Гав";

    @Override
    public void voice() {
        System.out.println("Гав");
    }

    @Override
    public void eat(String food) {
        if (food.endsWith("Grass")) {
            System.out.println("Не ем такое");
        } else if (food.endsWith("Meat")) {
            System.out.println("Такое ем");
        } else {
            System.out.println("Не знаю что это , есть не буду");
        }
    }
}
