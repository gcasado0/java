public class PlayingCardDeck {
    PlayingCard[] deck;
    String[] ranks = {"Ace","2","3","4","5","6","7","8","9","10","Jack","Queen","King"};
    String[] suits = {"clubs", "diamonds", "hearts", "spades"};

    PlayingCardDeck(){
        deck = new PlayingCard[52];
        int i = 0;
        for(int r=0; r<13; r++){
            for (int s=0; s<4; s++){
                deck[i] = new PlayingCard(ranks[r],suits[s]);
                i++;
            }
        }
        
    }

    public void showCards() {
        for(PlayingCard card : deck){
            card.showState();
        }
    }
}
