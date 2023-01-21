package Zoo;

public class Cat extends Predator {
    protected String food = "Meat";
    protected String voice = "Мяу";

    @Override
    public void voice() {
        System.out.println("Мяу");
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

