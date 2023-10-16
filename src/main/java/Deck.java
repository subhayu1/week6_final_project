import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Deck {
  /*
  b.     Deck
         i.     Fields
                         1.     cards (List of Card)

               ii.    Methods

                         1.     shuffle (randomizes the order of the cards)

                         2.     draw (removes and returns the top card of the Cards field)

                         3.     In the constructor, when a new Deck is instantiated,
                          the Cards field should be populated with the standard 52 cards.
   */
  private final List<Card> cards = new ArrayList<Card>();

  public Deck() {
    // populate the deck when a new Deck is instantiated
    String [] suits = {"Hearts", "Diamonds", "Spades", "Clubs"};
    String [] names = {"Ace", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine", "Ten",
                       "Jack", "Queen", "King"};
    for (String suit : suits) {
      for (int value = 2;value <= 14;value++) {
        String cardName = names[value - 2] + " of " + suit;
        Card card = new Card(value, cardName);
        cards.add(card);
      }

    }

  }
  public  void shuffle() {
    Collections.shuffle(cards);
  }
  public Card draw() {
    return cards.remove(0);
  }

}
