/**
 * Game of Nim: Game class
 * 
 * Name: Aditi Verma
 * Date: 2/18/21
 * Period: 3
 * APCSA
 * 
 * Preconditions: attributes: player1(Player), player2(Player), playAgain (initiated to true)
 *                constructors: Game()
 *                methods: - play()
 */

import java.util.Scanner;

public class Game
{
    private Player player1;
    private Player player2;
    boolean playAgain = true;

    public Game()
    {
        player1 = new Player();
        player2 = new Player();
    }

    /** PLAY
     * 
     * A method that playes the game of nim
     * 
     */
    public void play()
    {
        // prompts input, checks the input and then changes pieces
        while (playAgain == true)
        {
            // deciddes who goes first randomly
            Player starterPlayer;
            int currentPlayer = (int)(Math.random() + 1);
            if (currentPlayer  == 1)
            {
                starterPlayer = player1;
            }
            else
            {
                starterPlayer = player2;
            }

            // will play the game until pieces equlas 1
            while(Board.getPieces() > 1)
            {
                Scanner sc = new Scanner(System.in);
                System.out.println("There are " + Board.getPieces() + " pieces.");
                System.out.println(starterPlayer.getName() + ", how many pieces would you like to remove?");
                int num = sc.nextInt();
    
                // checks if the input is valid
                while ((num < 1) || (num > Board.getPieces()/2))
                {
                    System.out.println("Invalid input, try again");
                    System.out.println(starterPlayer.getName() + ", how many pieces would you like to remove?");
                    num = sc.nextInt();
                }
                Board.removePieces(num);
    
                // checks if the game ended
                // if yes, then print who won and lost and ask if they want to play again
                if (Board.getPieces() == 1)
                {
                    // determines the loser
                    if (starterPlayer != player1)
                    {
                        player1.addToScore();
                        System.out.println(player1.getName() + " wins!");
                    }
                    else
                    {
                        player2.addToScore();
                        System.out.println(player2.getName() + " wins!");
                    }
                    // display scores
                    System.out.println(player1.getName() + "'s Score: " + player1.getScore());
                    System.out.println(player2.getName() + "'s Score: " + player2.getScore());

                    // ask the player if they want to play again
                    Scanner again = new Scanner(System.in);
                    System.out.println("Do you want to play again? (yes or no): ");
                    String replay = again.nextLine();

                    // checks for valid response
                    if ((replay.equals("yes")) || (replay.equals("Yes")))
                    {
                        playAgain = true;
                        Board.populate();  // if play again = yes then Board.populate()
                        System.out.println("Alright, lets replay!");
                    }
                    else if ((replay.equals("no")) || (replay.equals("No")))
                    {
                        playAgain = false;
                        System.out.println("Have a nice day :)");
                    }
                    else
                    {
                        while (!((replay.equals("yes")) || (replay.equals("Yes")) || (replay.equals("no")) || (replay.equals("No"))))
                        {
                            System.out.println("Invalid response.");
                            System.out.println("Do you want to play again? (yes or no): ");
                            replay = sc.nextLine();
                            if ((replay.equals("yes")) || (replay.equals("Yes")))
                            {
                                playAgain = true;
                                Board.populate();
                                System.out.println("Alright, lets replay!");
                            }
                            else if ((replay.equals("no")) || (replay.equals("No")))
                            {
                                playAgain = false;
                                System.out.println("Have a nice day :)");
                            }
                        }    
                    }                   
                } // end while loop for once the game ends
                // switch players
                if (starterPlayer == player1)
                {
                    starterPlayer = player2;
                }
                else
                {
                    starterPlayer = player1;
                }
            } // end while loop for one round (until pieces equals 1)
        } // end playAgain while loop 
    } // end of play()
}