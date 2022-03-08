public class PlayingCardDeck {
    PlayingCard[][] deck;
    String[] suits = {"clubs", "diamonds", "hearts", "spades"};
    String[] ranks = {"Ace","2","3","4","5","6","7","8","9","10","Jack","Queen","King"};

    PlayingCardDeck(){
        deck = new PlayingCard[4][13];
        for (int s=0; s<4; s++){
            for(int r=0; r<13; r++){
                deck[s][r] = new PlayingCard(ranks[r],suits[s]);
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
