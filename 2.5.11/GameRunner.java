/**
 * Game of Nim: GameRunner class
 * 
 * Name: Aditi Verma
 * Date: 2/18/21
 * Period: 3
 * APCSA
 * 
 * Preconditions: - pieces are populated through the populate() method from Board class
 *                - Game object is instantiated
 *                - play() method is called from Game class
 * Postconditions: Game is played and scores are printed
 */

public class GameRunner
{
  public static void main(String[] args)
  {
    System.out.println("Welcome to the Game of Nim!");

    Board.populate(); // static method call
    
    Game nim = new Game(); 
    nim.play();
  }
}