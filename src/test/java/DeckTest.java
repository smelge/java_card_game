import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DeckTest {
    Deck deck;

    @Before
    public void before(){
        deck = new Deck();
        deck.createDeck();
    }

    @Test
    public void testDeck(){
        assertEquals(52,deck.getDeckSize());
    }

    @Test
    public void dealCards(){
        deck.deckToucher();
        Cards card1 = deck.noelEdmunds(0);
        Cards card2 = deck.noelEdmunds(1);
        System.out.println(card1.getValue() + " of " + card1.getSuit());
        System.out.println(card2.getValue() + " of " + card2.getSuit());

//        System.out.println(deck.noelEdmunds(1));

//        assertEquals(SuitType.HEARTS);
    }
}
