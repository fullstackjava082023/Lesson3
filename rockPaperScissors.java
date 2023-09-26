import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
       /* Rock,Paper,Scissors game.
                Take player name
        Take move from player  (0-Rock,1-Paper,2-Scissors)
        Make random computer move from 0 to 2.
        If Player win write the move (what player choose and what computer choose) and who is winner
        In case of the same choice print ”draw”
        Addition:
        Make the game for two players
        Addition:
        Make the game for two computers and make an option from the beginning to choose which game we will play (player vs pc, player vs player, pc vs pc) and according to choice play the game
*/
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter the player 1 name");
        String player1Name = scanner.nextLine();
        System.out.println("==========GAME STARTS==========");
        //take the move from player 1
        System.out.println(player1Name +  " please make your move 0-ROCK 1-PAPER 2-SCISSORS");
        int player1Move = scanner.nextInt();
        //we will print what was the move of player 1
        String player1choice = "";
        switch (player1Move) {
            case 0 :
                player1choice = "ROCK";
                break;
            case 1 :
                player1choice = "PAPER";
                break;
            default:
                player1choice = "SCISSORS";
        }
        System.out.println("Player " + player1Name + " picks " + player1choice );
        //computer makes a move 0 to 2
        int pc1Move = (int) (Math.random() * 3);
        //we will print the computer move
        String pc1Choice = "";
        switch (pc1Move) {
            case 0 :
                pc1Choice = "ROCK";
                break;
            case 1 :
                pc1Choice = "PAPER";
                break;
            default://2
                pc1Choice = "SCISSORS";
        }
        System.out.println("Player " + "COMPUTER1" + " picks " + pc1Choice );
        //need to check who wins:
        String winner = "DRAW";
        //0 < 1 < 2 < 0
        if (player1Move < pc1Move) { //player lost in all cases except
            if (player1Move == 0 && pc1Move == 2) { //player ROCK pc
                winner = player1Name;
            } else {
                winner = "computer1";
            }
        } else if (player1Move > pc1Move) { //player wins in all cases except 2 0
            if (player1Move == 2 && pc1Move == 0) { //player ROCK pc
                winner = "computer1";
            } else {
                winner = player1Name;
            }
        } else {
            winner = "DRAW";
        }
        System.out.println("The winner is: " + winner);


    }
}
