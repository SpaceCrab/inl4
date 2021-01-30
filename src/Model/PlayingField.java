package Model;

/****
 * metoder för hantering av spelet
 *  board är en array av squares
 * kontroll samt sparande av highscore
 * val av spelplan
 */
public class PlayingField
{
    Ship[][] shipLocation;
    int size;
    int nbrOfShips;

    public PlayingField(int size, int boardChoice){
        shipLocation = new Ship[size][size];
        this.size = size;
        if(boardChoice == 1){

        }
        else{

        }
        else
        {
            JOptionPane.showMessageDialog(null,"please type 1 or 2");
        }
    }

    public void boardOptionOne(){
        Torpedo torpedoPlacement = new Torpedo();
        Battleship battleshipPlacement = new Battleship();
        Hunter hunterPlacement = new Hunter();
        Submarine submarinePlacement = new Submarine();
        Cruiser cruiserPlacement = new Cruiser();

        //Submarine Placement
        shipLocation[9][1] = submarinePlacement;

        //Torpedo Placement
        shipLocation[1][1] = torpedoPlacement;
        shipLocation[0][1] = torpedoPlacement;

        //Hunter Placement
        shipLocation[5][3] = hunterPlacement;
        shipLocation[4][3] = hunterPlacement;
        shipLocation[3][3] = hunterPlacement;

        //Cruise Placement
        shipLocation[8][8] = cruiserPlacement;
        shipLocation[8][9] = cruiserPlacement;
        shipLocation[8][7] = cruiserPlacement;
        shipLocation[8][6] = cruiserPlacement;

        //Battleship Placement
        shipLocation[3][6] = battleshipPlacement;
        shipLocation[4][6] = battleshipPlacement;
        shipLocation[5][6] = battleshipPlacement;
        shipLocation[6][6] = battleshipPlacement;
        shipLocation[7][6] = battleshipPlacement;

        nbrOfShips = 15;
    }
    public void boardOptionTwo()
    {
        Torpedo torpedoPlacement = new Torpedo();
        Battleship battleshipPlacement = new Battleship();
        Hunter hunterPlacement = new Hunter();
        Submarine submarinePlacement = new Submarine();
        Cruiser cruiserPlacement = new Cruiser();

        //Submarine Placement
        shipLocation[0][10] = submarinePlacement;

        //Torpedo Placement
        shipLocation[3][3] = torpedoPlacement;
        shipLocation[3][4] = torpedoPlacement;

        //Hunter Placement
        shipLocation[1][4] = hunterPlacement;
        shipLocation[1][5] = hunterPlacement;
        shipLocation[1][6] = hunterPlacement;

        //Cruise Placement
        shipLocation[5][4] = cruiserPlacement;
        shipLocation[5][3] = cruiserPlacement;
        shipLocation[5][2] = cruiserPlacement;
        shipLocation[5][1] = cruiserPlacement;

        //Battleship Placement
        shipLocation[5][9] = battleshipPlacement;
        shipLocation[6][9] = battleshipPlacement;
        shipLocation[7][9] = battleshipPlacement;
        shipLocation[8][9] = battleshipPlacement;
        shipLocation[9][9] = battleshipPlacement;

        nbrOfShips = 15;

    }

    /**
     * Tar bort en size från skeppet och returnerar true vid träff,
     * false vid miss
     * @param x
     * @param y
     * @return
     */
    public boolean fireAt(int x, int y)
    {
        if(shipLocation[y][x] != null)
        {
            shipLocation[y][x].setSize(shipLocation[y][x].getSize() - 1);
            String shipType = shipLocation[y][x].toString();

            JOptionPane.showMessageDialog(null,"You hit a " + shipType + "!");

            nbrOfShips--;

            if(shipLocation[y][x].getSize() < 1) JOptionPane.showMessageDialog(null,"You sank a " + shipType + "!");

            return true;
        }
        else    return false;
    }

    public boolean winCondition()
    {
        if (nbrOfShips != 0) return false;
        else return true;
    }


}
