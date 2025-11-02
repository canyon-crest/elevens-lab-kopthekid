package Activity2;
/**
 * This is a class that tests the Deck class.
 */
public class DeckTester2 {

	/**
	 * The main method in this class checks the Deck operations for consistency.
	 *	@param args is not used.
	 */
	public static void main(String[] args) {
		/* *** TO BE IMPLEMENTED IN ACTIVITY 2 *** */
		String[] suits = new String[4];
		suits[0]="Spades";
		suits[1]="Clubs";
		suits[2]="Hearts";
		suits[3]="Diamonds";
		String[] ranks = new String[4];
		ranks[0]="Jack";
		ranks[1]="Queen";
		ranks[2]="King";
		ranks[3]="Ace";
		int[] values = new int[4];
		values[0] = 11;
		values[1] = 12;
		values[2] = 13;
		values[3] = 14;
		Deck2 myDeck = new Deck2(ranks,suits,values);
	}
}
