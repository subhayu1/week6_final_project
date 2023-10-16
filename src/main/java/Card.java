public class Card {
  /*
    a.      Card
        i.     Fields
                           1.     value (contains a value from 2-14 representing cards 2-Ace)

                           2.     name (e.g. Ace of Diamonds, or Two of Hearts)

               ii.    Methods

                   1.     Getters and Setters
                   2.     describe (prints out information about a card)
   */

  private final int value;
  private final String name;

  public Card(int value, String name) {
    this.value = value;
    this.name = name;
  }

  public int getValue() {
    return value;
  }
  public  void describe() {
    System.out.println(name);
  }

}
