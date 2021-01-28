/*
  Author: Christian Heisterkamp
  Id: ah9691
  Study program: DT
*/
package View;

import javax.swing.*;
import java.awt.*;

public class MainFrame
{
    private JFrame frame;
    private JButton[][] button;
    private Controller controller;
    private MainPanel mainpanel;


    public MainFrame(Controller controller)
    {
        this.controller = controller;

        frame = new JFrame("Sinking Ships");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        frame.setSize(600, 600);
        frame.setVisible(true);

        mainpanel = new MainPanel(controller);
    }

}
