public class PlayingCard {
    public String rank; //(1-Ace,2,3,4,5,6,7,8,9,10,Jack,Queen,King)
    public String suit; //0-clubs (♣), 1-diamonds (♦), 2-hearts (♥), and 3-spades (♠)


    PlayingCard(){
        this("","");
    }

    PlayingCard(String r, String s){
        rank = r;
        suit = s;
    }

    public void showState() {
       System.out.println(suit+":"+rank);
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