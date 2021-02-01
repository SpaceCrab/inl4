/*
  Author: Christian Heisterkamp
  Id: ah9691
  Study program: DT
*/
package Controller;

import Model.Highscore;
import Model.Player;
import Model.PlayingField;
import View.MainFrame;

public class    Controller
{
    private MainFrame mainFrame;
    private PlayingField playingfield;
    private Highscore highscore;
    private Player player;
    private int boardChoice;


    public Controller()
    {
        mainFrame = new MainFrame(this);
        highscore = new Highscore(100);
        reset();
    }

    private int roundCount;
    private String name;

    /**
     * Register shots on ships with coordinates
     * @param x
     * @param y
     */
    public boolean fireAt(int x, int y)
    {
        boolean hit;

        if(playingfield.fireAt(x,y))
        {
            hit = true;
        }
        else
        {
            hit = false;
        }

        roundInc();
        return hit;

    }

    /**
     * Method to let user know they won
     */
    public void winCondition()
    {
        boolean win = playingfield.winCondition();

        if(win)
        {
            showMessage("you win!!!");

            player.setScore(roundCount);
            highscore.addPlayer(player);
            showHighscore();
            reset();
        }

    }

    public void showMessage(String string)
    {
        mainFrame.messagePane(string);
    }

    public void showHighscore()
    {

        showMessage(highscore.toString());
    }


    /**
     * increase amounts of rounds
     */
    public void roundInc()
    {
        roundCount++;
        mainFrame.roundInc(roundCount);
    }

    /**
     * Method to reset the playingfield and make user input name and what playingfield to use
     */
    public void reset()
    {
        boolean whileBadChoice = true;
        while(whileBadChoice)
        {
            try
            {
                boardChoice = Integer.parseInt(mainFrame.dialogPane("type 1 or 2 to choose board layout"));
                whileBadChoice = false;
            }
            catch (NumberFormatException e)
            {
                showMessage("Please type in 1 or 2");
                whileBadChoice = true;
            }
        }

        name = mainFrame.dialogPane("please enter your name: ");
        playingfield = new PlayingField(10,boardChoice, this);
        roundCount = 0;
        player = new Player(name,0);

        mainFrame.reset();

    }
}
