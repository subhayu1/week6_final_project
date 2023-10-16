import java.util.ArrayList;
import java.util.List;


public class Player {
  /*
  c.      Player
i.     Fields
                1.     hand (List of Card)
                 2.     score (set to 0 in the constructor)
                 3.     name
ii.    Methods
                1.     describe (prints out information about the player and calls the describe method for each card in the Hand List)
                2.     flip (removes and returns the top card of the Hand)
                3.     draw (takes a Deck as an argument and calls the draw method on the deck, adding the returned Card to the hand field)
               4.     incrementScore (adds 1 to the Player’s score field)

   */
  private List<Card> hand;
  private int score;
  private String name;

  public Player(String name) {
    this.name = name;
    this.score = 0;
    this.hand = new ArrayList<>();

  }
  public void describe() {
    System.out.println("Player: " + name + " Score: " + score);
    for (Card card : hand) {
      card.describe();
    }
  }
  public Card flip() {
    if(hand.isEmpty()) {
      return null;
    }
    return hand.remove(0);
  }
  public void draw(Deck deck) {
    Card card = deck.draw();
    if(card != null) {
      hand.add(card);
    }
  }
  public void incrementScore() {
    score++;
  }
  public String getName() {
    return name;
  }
  public int getScore() {
    return score;
  }



}
