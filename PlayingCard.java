public class PlayingCard {
    private final Rank rank;
    private final Suit suit;

    PlayingCard(Rank r, Suit s){
        rank = r;
        suit = s;
    }

    public void showState() {
       //System.out.println(suit+":"+rank);
       System.out.format("%s of %s%n", rank, suit);
    }
}


/*
Today's 52-card deck preserves the four original French suits of centuries ago: 
clubs (♣), diamonds (♦), hearts (♥), and spades (♠). 
These graphic symbols, or “pips,” bear little resemblance to the items they represent, 
but they were much easier to copy than more lavish motifs
A standard 52-card deck of playing cards has 13 ranks (Ace,2,3,4,5,6,7,8,9,10,Jack,Queen,King) 
and 4 suits per rank (Hearts, Clubs, Diamonds, Spades)
*/