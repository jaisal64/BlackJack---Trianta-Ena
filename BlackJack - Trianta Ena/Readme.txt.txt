# CS611-<Assignment 2>
## <Cards Anyone?>
---------------------------------------------------------------------------
<Jaisal Singh>
<jaisal@bu.edu>
<U60118211>

## Files
---------------------------------------------------------------------------
<A brief description of each file and what it does>

There is one main file and 6 files for classes that are explained below.
I have used my previous Tic Tac Toe code and only added the code for blackJack. I have added one new class: Playing cards.
Although I could have just used my previous gameBoard class, just for clarity I have created a new PlayingCards class. Rest all the csame classes are used.

Main:
It initializes the game by asking which game the user wants to play. It then calls on the other classes
to implement different parts and phases of the game. At the end it asks if the user wants to play again or exit. 
*For Blackjack I have initialized all class objects and called them from the main method to run the game.

Class1: gameBoard
*Only used for Tic Tac Toe
contains details about playing are such as width and length. Includes methods for generating,
updating and printing the playing board.It only allows a board size greater than 2.

Class2: player
Contains information about the players playing such as name, playSymbol, wins, losses, draws,
team and the position of the player on the board. This attributes are used at different points in the game.
*I have added some new attribues such as cards, hand, totalSum,money,bust, dealer to use in blackjack.


Class3: playingCards
This class contains all the attributes and methods required for any game of cards such as generating a new deck, how many deck are needed,
deal a new card, shuffle decks, print current hand, sum of cards in hand, numerical value of each cards.

Class3: inGame
contains information about running the game. In tic tac toe and order and chaos it used the nextMove 
method to ask for input, evaluate if input is correct and the move is legal and then calls method updateBoard
in gameBoard class to update the input on the board.
*For blackjack I have added methods to execute all the turns of the dealers and players and in case of victory and defeat to update the player
bets and money to reflect the round outcome. 

Class4:victoryChecker
contains methods to evaluate victory conditions for both Tic Tac Toe and order and chaos. It returns a boolean
value after checking every move for victory.
*For blackJack i have added a new method that checks if a player has one or lost.

Class5:gameInitiator
Has not been used for this assignment.

## Notes
---------------------------------------------------------------------------
1. <Files to be parsed should be stored in ConfigFiles, for parser class to
read class>

2. <Bonus Done>
Board scalability has been implemented allowing board size of 3 or higher.
There is provision for rectangular board as well for other games.
Player class has team attributes, however has not been used for this game. Player class also allows for scalability and 
extendability to other games.

*For Blackjack i have basically used the same gamestructure of classes. My class structure is very generic and can be applied o any game as
it contains different classes to implemnt different aspects of every game such as start, middle and end.Thus my code is extremely scalable to any game.

3. <Notes to grader>
Both tic tac toe and order and chaos have been fully implemented with tic tac toe having a fully scalable board.
Both games are using the same methods for multiple functions that can even be extended to other games. All illegal moves and
invalid inputs have been accounted for. If game ends in stalemate then draw is declared.

*For BLackjack I have implemented the entire game. Due to lack of time i was unable to implement exceptions and error catching. But the standard game works.
There are only 5 players and player one is the dealer by default. Rest of the code has been commented to help understand it.method names are self-explanatory.

## How to compile and run
---------------------------------------------------------------------------
1. Navigate to the directory "src" after unzipping the files
2. Run the following instructions:
<Example below>
javac Main.java
java Main

Java version Used to compile and run: JAVA 17

## Input/Output Example
---------------------------------------------------------------------------
<Place here an example of how the program runs. Include both its
outputs and correctly formatted inputs. Please clearly mark the inputs.>
Output:
Welcome. Input 1 to play Tic Tac Toe or 2 for Order and Chaos
Press 3 for BlackJack.
Sorry due to lack of time could not write this.

