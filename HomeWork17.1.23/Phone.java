public class Phone {
    int number;
    String model;
    int weight;

    public Phone(int number, String model, int weight) {
        this.number = number;
        this.model = model;
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "Phone{" +
                "number=" + number +
                ", model='" + model + '\'' +
                ", weight=" + weight +
                '}';
    }

    public int getNumber(int number){
        this.number = number;
        return number;
    }

    public void receiveCall(){
        String name = "Alex";
        System.out.println("Звонит " + name + " " + getNumber(number));
    }


}
