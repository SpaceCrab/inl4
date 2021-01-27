/*
  Author: Christian Heisterkamp
  Id: ah9691
  Study program: DT
*/
package Controller;


import Model.Square;
import View.MainFrame;

public class Controller
{
    public Controller(){
        MainFrame mainFrame = new MainFrame();
    }

    private Square[][] board = new Square[10][10];
    private String[][] highscore = new String [10][2];
    private int roundCount;
    private String name;

}
