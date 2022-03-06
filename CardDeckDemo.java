public class CardDeckDemo {
    public static void main(String[] args) {
        PlayingCard c1 = new PlayingCard("Ace", "Club");
        c1.showState();

        PlayingCardDeck d1 = new PlayingCardDeck();
        d1.showCards();
    }
    
}
