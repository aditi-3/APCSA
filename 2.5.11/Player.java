/**
 * Game of Nim: Player class
 * 
 * Name: Aditi Verma
 * Date: 2/18/21
 * Period: 3
 * APCSA
 * 
 * Preconditions: attributes: name(String), score(int)
 *                constructors: Player()
 *                methods: - getName()
 *                         - getScore()
 *                         - setName()
 *                         - addToScore()
 */


import java.util.Scanner;

public class Player
{
    private String name;
    private int score;

    public Player()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ente your name: ");
        name = sc.nextLine();
        System.out.println("Welcome to the game " + name + "!");
        score = 0;
    }

    /** GETNAME 
     * 
     * A method that allows the user to get the name of a player
     * 
     * @return String - name
     */
    public String getName()
    {
        return name;
    }

    /** GETSCORE
     * 
     * A method that allows the user to get the score of a player
     * 
     * @return Integer - score
     */
    public int getScore()
    {
        return score;
    }

    /** SETNAME
     * 
     * A method that sets the name of a player
     * 
     * @param name - String
     */
    public void setName(String name)
    {
        this.name = name;
    }

    /** ADD TO SCORE
     * 
     * A method that increases tha score by 1
     * 
     */
    public void addToScore()
    {
        score ++;
    }
}