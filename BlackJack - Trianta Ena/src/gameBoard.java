/*
This is the gameBoard class that contains our gameboard related info such as the card deck

 */
public class gameBoard {

    int width;
    int length;




// this is related to Tic tac toe and order and chaos
    String board[][];

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public String[][] getBoard() {
        return board;
    }

    public void setBoard(String[][] board) {
        this.board = board;
    }

     gameBoard(int size) {
        String[][] tempBoard = new String[size][size];
        setBoard(tempBoard);
        length = width = size;
        for (int i = 0; i < length; i++) {
            for (int j = 0; j < length; j++) {
                board[i][j] = String.valueOf(length * i + j);
            }
        }
    }

    public void printBoard() {
        for (int j = 0; j < length; j++) {
            System.out.println();

            for (int i = 0; i < length; i++) {
                if (board[j][i].length() < 2) {
                    System.out.print(board[j][i] + " |");
                } else {
                    System.out.print(board[j][i] + "|");
                }
            }
            System.out.println();
            for (int k = 0; k < length; k++)
                System.out.print("--+");
        }
        System.out.println();
    }

    public void updateBoard(int p, player a, String[][] board) {
        int x = p/length;
        int y = p%length;

        board[x][y] = a.playSymbol;
    }
}


