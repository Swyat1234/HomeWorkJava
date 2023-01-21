package Zoo;

public class Cow extends Herbivore {
    protected String food = "Grass";
    protected String voice = "Му";

    @Override
    public void voice() {
        System.out.println(voice);
    }

    @Override
    public void eat(String food) {
        if (food.endsWith("Meat")) {
            System.out.println("Не ем такое");
        } else if (food.endsWith("Grass")) {
            System.out.println("Такое ем");
        } else {
            System.out.println("Не знаю что это , есть не буду");
        }
    }
}
