/**
 * Game of Nim: Board class
 * 
 * Name: Aditi Verma
 * Date: 2/18/21
 * Period: 3
 * APCSA
 * 
 * Preconditions: attributes: pieces(int)
 *                constructors: Board()
 *                methods: - getPieces()
 *                         - removePieces(int numPieces)
 *                         - populate()
 */

import java.lang.Math;

public class Board
{
    private static int pieces;

    /** GET PIECES
     * 
     * A method that returns pieces
     * 
     * @return integer - pieces
     */
    public static int getPieces()
    {
        return pieces;
    }

    /** REMOVE PIECES
     * 
     * A method that removed pieces from the total
     * 
     * @param numPieces - integer
     */
    public static void removePieces(int numPieces)
    {
        pieces -= numPieces;
    }

    /** POPULATE
     * 
     * A method that populates the number of pieces
     * 
     */
    public static void populate()
    {
        pieces = (int)(Math.random()*41 +10);
    }
}