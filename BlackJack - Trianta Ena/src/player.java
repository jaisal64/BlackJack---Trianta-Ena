public class player {
    String name;
    String playSymbol;
    int wins=0;
    int losses=0;
    int draws=0;
    int positionBoard;
    char team;
    int [] cards= new int[14];

    String [][] hand= new String[14][2];
    int totalSum=0;
    int bet=0;
    int money=0;

    boolean bust= false;

    boolean dealer = false;




    public boolean isDealer() {
        return dealer;
    }

    public void setDealer(boolean dealer) {
        this.dealer = dealer;
    }









    public boolean isBust() {
        return bust;
    }

    public void setBust(boolean bust) {
        this.bust = bust;
    }


    public int getTotalSum() {
        return totalSum;
    }

    public void setTotalSum(int totalSum) {
        this.totalSum = totalSum;
    }

    public int getBet() {
        return bet;
    }

    public void setBet(int bet) {
        this.bet = bet;
    }

    public int getMoney() {
        return money;
    }

    public void setMoney(int money) {
        this.money = money;
    }




    public int[] getCards() {
        return cards;
    }

    public void setCards(int[] cards) {
        this.cards = cards;
    }

    public void setHand(String[][] hand) {
        this.hand = hand;
    }




    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPlaySymbol() {
        return playSymbol;
    }

    public void setPlaySymbol(String playSymbol) {
        this.playSymbol = playSymbol;
    }

    public int getWins() {
        return wins;
    }

    public void setWins(int wins) {
        this.wins = wins;
    }

    public int getLosses() {
        return losses;
    }

    public void setLosses(int losses) {
        this.losses = losses;
    }

    public int getDraws() {
        return draws;
    }

    public void setDraws(int draws) {
        this.draws = draws;
    }

    public int getPositionBoard() {
        return positionBoard;
    }

    public void setPositionBoard(int positionBoard) {
        this.positionBoard = positionBoard;
    }

    public char getTeam() {
        return team;
    }

    public void setTeam(char team) {
        this.team = team;
    }
}
