public interface Displaylable {
    static void display(int players , String [] deck){
        final int cardsForPlayer = 5;
        for (int i = 0; i < players * cardsForPlayer; i++) {
            System.out.println(deck[i]);

            if (i % cardsForPlayer == cardsForPlayer - 1)
                System.out.println();
        }
    }
}
