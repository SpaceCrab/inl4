package Model;

/****
 * metoder för hantering av spelet
 *  board är en array av squares
 * kontroll samt sparande av highscore
 * val av spelplan
 */
public class GameManager
{
    private Square[][] board = new Square[10][10];
    private String[][] highscore = new String [10][2];
    private int roundCount;
    private String name;

    public GameManager(){

    }

    public void fireAt(int x, int y)
    {
        board[y][x].setHit(true);

        if (board[y][x].hasShip()); //visa typen av skepp i en dialogruta
        //därefter disablea knappen med motsvarande koordinat

        roundCount++;
    }


}
