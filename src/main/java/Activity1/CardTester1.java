package Activity1;
/**
 * This is a class that tests the Card class.
 */
public class CardTester1 {

	/**
	 * The main method in this class checks the Card operations for consistency.
	 *	@param args is not used.
	 */
	public static void main(String[] args) {
		/* *** TO BE IMPLEMENTED IN ACTIVITY 1 *** */
		Card1 realCard = new Card1("8","Spades",7);
		Card1 realCard2 = new Card1("Queen","Clubs",7);
		Card1 realCard3 = new Card1("Jack","Spades",10);
		System.out.println(realCard.toString());
		System.out.println(realCard2.toString());
		System.out.println(realCard3.toString());

	}
}
