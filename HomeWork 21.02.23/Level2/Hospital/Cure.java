package Hospital;

public class Cure {
    String cureName;

    public Cure(String cureName) {
        this.cureName = cureName;
    }

    @Override
    public String toString() {
        return "Cure{" +
                "cureName='" + cureName + '\'' +
                '}';
    }
}
