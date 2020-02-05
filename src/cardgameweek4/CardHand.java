package cardgameweek4;
/**
  
 */

public class CardHand {

        private int handSize = 60;
	public Card[] cards = new Card[handSize];

	
        /**
         * Add comments during class to explain what this method does.
         */
        public void generateHand()
        {
                int countCards = 0;
		for(Card.Color s: Card.Color.values())
                {
                    for(Card.Rank v: Card.Rank.values())
                    {
                        cards[countCards] = (new Card(s,v));
                        countCards++;
                    }
                }//end outter for
        }//end method

}