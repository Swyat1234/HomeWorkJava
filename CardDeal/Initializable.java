public interface Initializable {
    static void initialization(String [] deck){
        for (int i = 0; i < Ranks.values().length; i++) {
            for (int j = 0; j < Suits.values().length; j++) {
                deck[Suits.values().length * i + j] = Ranks.values()[i] + " " + Suits.values()[j];
            }
        }
    }
}
