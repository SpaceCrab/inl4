/*
  Author: Christian Heisterkamp
  Id: ah9691
  Study program: DT
*/
package View;

import Controller.Controller;
import javax.swing.*;

public class   MainFrame
{
    private JFrame frame;
    private Controller controller;
    private MainPanel mainpanel;



    public MainFrame(Controller controller)
    {
        this.controller = controller;

        frame = new JFrame("Sinking Ships");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        frame.setSize(600, 600);
        frame.setLocation(300,300);
        frame.setVisible(true);

        mainpanel = new MainPanel(controller);
        frame.add(mainpanel);

    }

    public String gameBoardChoice(String message) {
        return JOptionPane.showInputDialog(frame, message);
    }

    public void roundInc(int roundCount)
    {
        mainpanel.roundInc(roundCount);
    }

    public void reset()
    {
        mainpanel.reset();
    }

}
