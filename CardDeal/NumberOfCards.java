public enum NumberOfCards {
    NUMBER_OF_CARDS;
int i;
    NumberOfCards() {
        int i = Suits.values().length * Ranks.values().length;
        this.i = i;
    }
}
