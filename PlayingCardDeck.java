public class PlayingCardDeck {
    PlayingCard[][] deck;
    
    PlayingCardDeck(){
        deck = new PlayingCard[4][13];

        for (Suit s : Suit.values()){
            for(Rank r: Rank.values()){
                deck[s.ordinal()][r.ordinal()] = new PlayingCard(r, s);
            }
        }
        
    }

    public void showCards() {
        for (int s=0; s<4; s++){
            for(int r=0; r<13; r++){
                deck[s][r].showState();
            }
        }        
    }
}
