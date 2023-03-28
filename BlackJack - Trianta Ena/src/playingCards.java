import java.util.ArrayList;
import java.util.List;


public class playingCards {

    //creating a card deck

    String cards[] = {"Ace","Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine", "Ten", "Jack", "Queen", "King"};


    String cardSuit[] = {"Spades", "Diamond", "Club", "Hearts"};

    String cardDeck[]= new String[120];

    List<Integer> cardRange = new ArrayList<Integer>();


    public void generateNewDeck() {

        for (int f = 0; f < 4; f++) {
            for (int j = 0; j < 13; j++) {
                cardDeck[(f + 1) * j] = cards[j];
            }
        }
        for (int i = 0; i < 52; i++) {
            cardDeck[i + 52] = cardDeck[i];
        }
        for(int i=0; i<102;i++) {
            cardRange.add(i);
        }
    }

//method to get value of card from name

    public int cardToValue(String card ) {
        int value = 10;
        for (int i = 1; i < 11; i++) {
            if (cards[i - 1].equals(card)) {
                value = i;
                break;
            }
        }
        return value;
    }

        // method to calculate sum of players cards

        public int cardSum(int[] cards){
            int sum =0;
            int ace= 0;
            for(int i =0; i<cards.length;i++){
                sum = sum + cards[i] ;
                if(cards[i]==11){
                    ace++;
                }
            }

            if(sum>31 && ace==1){
                sum = sum - 10;

            }
            return sum;
        }


   // method to deal a card by selecting index from shuffled list cardRange and the removing it to simulate card deck


        public String [] dealCard(List cardRange){
            String [] card = new String[2];
            int index=0;
            index = (int) cardRange.get(0);
            cardRange.remove(0);
            card[1] = cardDeck[index%13];

            if(index<26){
                card[0] = cardSuit[0];
            } else if (index>25 && index < 52) {
                card[0] = cardSuit[1];
            } else if (index>51 && index < 78) {
                card[0] = cardSuit[2];
            } else if (index>77 && index < 102) {
                card[0] = cardSuit[3];
            }

            return card;

        }

//method to print a player's cards

public void printHand(player x, player y, boolean reveal){
    System.out.println("Player " + x.name +" has the following Hand");
            for(String [] h : x.hand){
                if(h[0]==null){
                    break;
                }
                System.out.print(h[0] + "-" + h[1] + "  ");

        }
    System.out.println();
    if(reveal) {
        System.out.println();
        System.out.println("Dealer player " + y.name + " has the following cards");
        for (String[] h : y.hand) {
            System.out.print(h[0] + "-" + h[1] + "  ");
        }
    }
    else{
            System.out.println("Dealer player " + y.name + " has the following opening card");
            System.out.println(y.hand[0][0] + "-" + y.hand[0][1]);
        }
    }






// Getters and setters

    public String[] getCards() {
        return cards;
    }

    public void setCards(String[] cards) {
        this.cards = cards;
    }

    public String[] getCardSuit() {
        return cardSuit;
    }

    public void setCardSuit(String[] cardSuit) {
        this.cardSuit = cardSuit;
    }

    public String[] getCardDeck() {
        return cardDeck;
    }

    public void setCardDeck(String[] cardDeck) {
        this.cardDeck = cardDeck;
    }


    public List<Integer> getCardRange() {
        return cardRange;
    }

    public void setCardRange(List<Integer> cardRange) {
        this.cardRange = cardRange;
    }

}
