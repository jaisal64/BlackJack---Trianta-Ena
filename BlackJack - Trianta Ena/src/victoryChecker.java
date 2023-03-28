import java.util.List;

public class victoryChecker {

//for black jack

    public void victoryCheck(List<player> playerList, player dealer, playingCards blackJack, inGame game){

        if(dealer.totalSum>31) {
            for (player x : playerList) {
                if (x.bust || x.dealer) {
                    continue;
                }
                game.winBet(x, dealer);
                System.out.println("Player " + x.name + " has won this round");


            }

        } else if (dealer.totalSum==31) {
            System.out.println("Dealer has won this round with total 31!");
            for (player x : playerList) {
                if (x.bust || x.dealer) {
                    continue;
                }
                game.loseBet(x, dealer);
                System.out.println("Player " + x.name + " has lost this round");

            }
        }
        else {
            for (player x : playerList) {
                if (x.bust || x.dealer) {
                    continue;
                }
                if (x.totalSum > dealer.totalSum) {
                    game.winBet(x, dealer);
                    System.out.println("Player " + x.name + " has won this round");

                } else if (x.totalSum <= dealer.totalSum) {
                    game.loseBet(x, dealer);
                    System.out.println("Player " + x.name + " has lost this round");
                }
            }
        }
        for (player x : playerList) {
            System.out.println("Player " + x.name + " has money = "+ x.money);
        }


    }





    //for tic tac toe

    public boolean winCheck(gameBoard board, player a) {


        for (int i = 0; i < board.length; i++) {
            int j = 0;
            int x = 0;
            while (j < board.length && board.board[i][j] == a.playSymbol) {
                x++;
                j++;
            }
            if (x == board.length - 1) {
                return true;
            }
        }
        for (int i = 1; i < board.length; i++) {
            int j = 0;
            int x = 0;
            while (j < board.length - 1 && board.board[i][j] == a.playSymbol) {
                x++;
                j++;
            }
            if (x == board.length - 1) {
                return true;
            }

        }
        for (int k = 0; k < board.length; k++) {
            int j = 0;
            int y = 0;
            while (j < board.length && board.board[j][k] == a.playSymbol) {
                y++;
                j++;
            }
            if (y == board.length) {
                return true;
            }
        }

        int z = 0;
        for (int i = 0, j = 0; i < board.length && j < board.length; i++, j++) {
            if (board.board[i][j] == a.playSymbol) {
                z++;
            }
        }
        if (z == board.length) {
            return true;
        }
            z = 0;
            for (int i = board.length-1, j = 0; i > -1 && j < board.length; i--, j++) {
                if (board.board[i][j] == a.playSymbol) {
                    z++;
                }
            }
            if (z == board.length) {
                return true;
            }

            return false;

    }
//for order and chaos
    public boolean orderChaosCheck(gameBoard b, player a) {
        for (int i = 0; i < 5; i++) {
            int j = 0;
            int x = 0;
            while (j < 5 && b.board[i][j] == a.playSymbol) {
                x++;
                j++;
            }
            if (x == 5) {
                return true;
            }
        }
            for (int i = 1; i < 6; i++) {
                int j = 0;
                int x = 0;
                while (j < 5 && b.board[i][j] == a.playSymbol) {
                    x++;
                    j++;
                }
                if (x == 5) {
                    return true;
                }

        }
        for (int k = 0; k < 5; k++) {
            int j = 0;
            int y = 0;
            while (j < 5 && b.board[j][k] == a.playSymbol) {
                y++;
                j++;
            }
            if (y == 5) {
                return true;
            }
        }

        for (int k = 1; k < 6; k++) {
            int j = 0;
            int y = 0;
            while (j < 6 && b.board[j][k] == a.playSymbol) {
                y++;
                j++;
            }
            if (y == 5) {
                return true;
            }
        }

        int z = 0;
        for (int i = 0, j = 0; i <5 && j < 5; i++, j++) {
            if (b.board[i][j] == a.playSymbol) {
                z++;
            }
        }
        if (z == 5) {
            return true;
        }
        z = 0;
        for (int i = 1, j = 1; i <6 && j < 6; i++, j++) {
            if (b.board[i][j] == a.playSymbol) {
                z++;
            }
        }
        if (z == 5) {
            return true;
        }

        z = 0;
        for (int i = 0, j = 1; i <5 && j < 6; i++, j++) {
            if (b.board[i][j] == a.playSymbol) {
                z++;
            }
        }
        if (z == 5) {
            return true;
        }

        z = 0;
        for (int i = 1, j = 0; i <5 && j < 5; i++, j++) {
            if (b.board[i][j] == a.playSymbol) {
                z++;
            }
        }
        if (z == 5) {
            return true;
        }

        z = 0;
        for (int i = 5, j = 0; i >-1 && j < 5; i--, j++) {
            if (b.board[i][j] == a.playSymbol) {
                z++;
            }
        }
        if (z == 5) {
            return true;
        }

        z = 0;
        for (int i = 4, j = 0; i >-1 && j < 5; i--, j++) {
            if (b.board[i][j] == a.playSymbol) {
                z++;
            }
        }
        if (z == 5) {
            return true;
        }

        z = 0;
        for (int i = 5, j = 5; i >0 && j > 0; i--, j--) {
            if (b.board[i][j] == a.playSymbol) {
                z++;
            }
        }
        if (z == 5) {
            return true;
        }


        return false;
    }

}
