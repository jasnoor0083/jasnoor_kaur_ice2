package cardgameweek4;
/**
 * 
 */
public class GamePlayer {

	public static void main(String[] args) {
		CardHand ch = new CardHand();
                ch.generateHand();
                for(Card c: ch.cards)
                {
                    System.out.println(c.getRank() + " of " + c.getColor());
                }
               // System.out.println(ch.cards); show what happens when there is no toString()
	}

}