import javax.smartcardio.Card;
import java.util.ArrayList;
import java.util.Collections;

public class Deck {
    private ArrayList<Cards> cards;

    public Deck(){
        this.cards = new ArrayList<Cards>();
    }

    public void createDeck(){
        cardCreator(SuitType.HEARTS);
        cardCreator(SuitType.CLUBS);
        cardCreator(SuitType.DIAMONDS);
        cardCreator(SuitType.SPADES);
    }

    private void cardCreator(SuitType suit){
        for (int i=1;i <=13;i++){
            Cards newCard;
            switch(i){
                case 1:newCard = new Cards(suit,CardValues.ACE);break;
                case 2:newCard = new Cards(suit,CardValues.TWO);break;
                case 3:newCard = new Cards(suit,CardValues.THREE);break;
                case 4:newCard = new Cards(suit,CardValues.FOUR);break;
                case 5:newCard = new Cards(suit,CardValues.FIVE);break;
                case 6:newCard = new Cards(suit,CardValues.SIX);break;
                case 7:newCard = new Cards(suit,CardValues.SEVEN);break;
                case 8:newCard = new Cards(suit,CardValues.EIGHT);break;
                case 9:newCard = new Cards(suit,CardValues.NINE);break;
                case 10:newCard = new Cards(suit,CardValues.TEN);break;
                case 11:newCard = new Cards(suit,CardValues.JACK);break;
                case 12:newCard = new Cards(suit,CardValues.QUEEN);break;
                default:newCard = new Cards(suit,CardValues.KING);break;
            }
//            System.out.println(newCard.getSuit() + " : " + newCard.getValue());
            this.cards.add(newCard);
        }
    }

    public int getDeckSize(){
        return this.cards.size();
    }

    public void deckToucher(){
        Collections.shuffle(this.cards);
    }

    public Cards noelEdmunds(int card){
        return this.cards.get(card);
    }


}

