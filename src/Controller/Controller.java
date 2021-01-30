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

import javax.swing.*;
import java.util.PrimitiveIterator;

public class    Controller
{
    private Controller controller;
    private MainFrame mainFrame;
    private PlayingField playingfield;
    private Highscore highscore;
    private Player player;
    private int boardChoice;


    public Controller()
    {
        mainFrame = new MainFrame(this);
        playingfield = new PlayingField(10,1);
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
        boolean hit = playingfield.fireAt(x,y);
        roundInc();
        winCondition();
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
            JOptionPane.showMessageDialog(null,"You won!");
            player.setScore(roundCount);
            highscore.addPlayer(player);
            showHighscore();
            reset();
        }

    }

    public void showHighscore()
    {
        JOptionPane.showMessageDialog(null, highscore.toString());
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
                boardChoice = Integer.parseInt(JOptionPane.showInputDialog(null,"Input the layout you want to play(1 or 2)" ));
                whileBadChoice = false;
            }
            catch (NumberFormatException e)
            {
                JOptionPane.showMessageDialog(null,"Please enter 1 or 2");
                whileBadChoice = true;
            }
        }


        name = JOptionPane.showInputDialog("Enter your name: ");

        mainFrame.reset();
        playingfield = new PlayingField(10,boardChoice);
        roundCount = 0;
        player = new Player(name,0);
    }
}
