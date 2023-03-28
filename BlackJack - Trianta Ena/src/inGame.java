import java.util.InputMismatchException;
import java.util.Scanner;

public class inGame {

    Scanner p = new Scanner(System.in);
    int moveCount = 0;


// First dealer move for Blackjack
    public void dealerFirstMove(player x, playingCards blackJack){
        x.hand[0]= blackJack.dealCard(blackJack.cardRange);
       // blackJack.printHand(x,x,false);
        x.cards[0]= blackJack.cardToValue(x.hand[0][1]);
    }

    public void dealerSecondTurn(player x, playingCards blackJack){
        x.hand[1]= blackJack.dealCard(blackJack.cardRange);
        x.hand[2]= blackJack.dealCard(blackJack.cardRange);

    }

    public void playerFirstMove(player x, player dealer, playingCards blackJack){
        x.hand[0]= blackJack.dealCard(blackJack.cardRange);
        blackJack.printHand(x,dealer,false);
        x.cards[0]= blackJack.cardToValue(x.hand[moveCount][1]);
        x.totalSum= blackJack.cardSum(x.cards);
        if(x.totalSum>31){
            x.bust= true;
            System.out.println("Player" + x.name + "has gone bust this round");
        }

        System.out.println("How much $$ would you like to bet? Enter 0 to Fold ");
        int bet = p.nextInt();
        if(bet==0){
            x.bust=true;
        }
        else if (bet> x.money) {
            while(bet>x.money) {
                System.out.println("Please enter $$ within your budget!!");
                bet = p.nextInt();
            }
        }
        x.bet= bet;


    }

    public void playerSecondTurn(player x, player dealer, playingCards blackJack){
        x.hand[1]= blackJack.dealCard(blackJack.cardRange);
        x.hand[2]= blackJack.dealCard(blackJack.cardRange);
        blackJack.printHand(x,dealer,false);
        x.cards[1]= blackJack.cardToValue(x.hand[1][1]);
        x.cards[2]= blackJack.cardToValue(x.hand[2][1]);
        x.totalSum= blackJack.cardSum(x.cards);

    }


    public void playerHitOrStand(player x, player dealer, playingCards blackJack){
        int hit =1;
        int i=0;
        while(hit==1 && x.totalSum<31){

            System.out.println("Player " +x.name  +" Your total is " + x.totalSum );
            System.out.println("Enter 1 to hit or 2 to stand");
            hit = p.nextInt();
            if(hit==1) {
                x.hand[3 + i] = blackJack.dealCard(blackJack.cardRange);
                x.cards[3+i]= blackJack.cardToValue(x.hand[3+i][1]);
                blackJack.printHand(x, dealer, false);
                x.totalSum = blackJack.cardSum(x.cards) ;
                if(x.totalSum>31){
                    x.bust=true;
                    System.out.println("Player " + x.name + " has gone bust");
                }
                i++;

                }
            }
        }



    public void dealerFinalTurn(player dealer, playingCards blackJack){
        dealer.totalSum = blackJack.cardSum(dealer.cards) ;
        int i=0;
        while(dealer.totalSum<27){
            dealer.hand[3+i] = blackJack.dealCard(blackJack.cardRange);
            dealer.cards[3+i]= blackJack.cardToValue(dealer.hand[3+i][1]);
            dealer.totalSum = blackJack.cardSum(dealer.cards) ;
            i++;
        }
        blackJack.printHand(dealer, dealer, false);
        System.out.println("Dealer has card total " + dealer.totalSum);
    }


    public void winBet(player x, player dealer){
        x.money= x.money + x.bet;
        dealer.money= dealer.money - x.bet;
    }

    public void loseBet(player x, player dealer){
        x.money= x.money - x.bet;
        dealer.money= dealer.money + x.bet;
    }




//Tic tac toe methods
    public void NextMove(player a, gameBoard b) {



        int pos=0;
        try{
            System.out.println("Enter Position for " + a.playSymbol);
            pos = p.nextInt();
        } catch(InputMismatchException e){
            System.out.println("Please enter correct input");
            pos = p.nextInt();
        }


        int x = pos/b.length;
        int y = pos%b.length;

        /* Checking that move is legal*/

        while( pos > (b.length*b.length-1)|| b.board[x][y].equals("X") || b.board[x][y].equals("O")) {
            System.out.println("Enter CORRECT Position for Player" + a.name);

            pos = p.nextInt();
            x = pos / b.length;
            y = pos % b.length;

        }
        if (0 <= pos && pos < (b.length) * (b.length)) {
            b.updateBoard(pos, a, b.getBoard());
        }

    }
}

