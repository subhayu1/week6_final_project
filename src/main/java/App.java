public class App {
  /*
  2. Create a class called App with a main method.

a.      Instantiate a Deck and two Players, call the shuffle method on the deck.
b.     Using a traditional for loop, iterate 52 times calling the Draw method on the other player each iteration using the Deck you instantiated.
c.      Using a traditional for loop, iterate 26 times and call the flip method for each player.
Compare the value of each card returned by the two player’s flip methods. Call the incrementScore method on the player whose card has the higher value.  Print a message to say which player received a point.
Note:  If the values are equal (it is a tie), print a message saying that no point was awarded.
d.      After the loop, compare the final score from each player.
e.      Print the final score of each player and either “Player 1”, “Player 2”, or “Draw” depending on which score is higher or if they are both the same.

   */

  public static void main(String[] args) {
    // Instantiate a Deck and two Players, call the shuffle method on the deck.
    Deck deck = new Deck();
    Player player1 = new Player("Player 1");
    Player player2 = new Player("Player 2");
    deck.shuffle();

    // iterate 52 times calling the Draw method
    for (int i = 0; i < 52; i++) {
      if (i % 2 == 0) {
        player1.draw(deck);
      } else {
        player2.draw(deck);
      }
    }

    //flip and compare cards
    for (int i = 0; i < 26; i++) {
      Card card1 = player1.flip();
      Card card2 = player2.flip();

      card1.describe();
      card2.describe();

      int result = Integer.compare(card1.getValue(), card2.getValue());

      if (result > 0) {
        player1.incrementScore();
        System.out.println(player1.getName() + " receives a point.");
      } else if (result < 0) {
        player2.incrementScore();
        System.out.println(player2.getName() + " receives a point.");
      } else {
        System.out.println("It's a tie! No points awarded.");
      }
    }
    // Determine the winner
    int score1 = player1.getScore();
    int score2 = player2.getScore();

    System.out.println("\nFinal Scores:");
    System.out.println(player1.getName() + ": " + score1);
    System.out.println(player2.getName() + ": " + score2);

    if (score1 > score2) {
      System.out.println(player1.getName() + " wins!");
    } else if (score1 < score2) {
      System.out.println(player2.getName() + " wins!");
    } else {
      System.out.println("It's a draw!");
    }
  }

}
