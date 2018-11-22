public class Cards {
    private SuitType suit;
    private CardValues cardValues;

    public Cards(SuitType suit, CardValues cardValues){
        this.suit = suit;
        this.cardValues = cardValues;
    }

    public SuitType getSuit(){
        return this.suit;
    }

    public CardValues getValue(){
        return this.cardValues;
    }
}
