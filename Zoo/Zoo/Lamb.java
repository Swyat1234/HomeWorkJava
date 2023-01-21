package Zoo;

public class Lamb extends Herbivore{
    private String food = "Grass";
    private String voice = "Бе-е-е";

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
