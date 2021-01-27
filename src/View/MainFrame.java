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
    JPanel

    public MainFrame()
    {
        frame = new JFrame("Sinking Ships");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        frame.setLayout(new GridLayout(10, 10, 1, 1));
        button = new JButton[10][10];
        for (int i = 0; i < 100; i++)
        {
            button.setPreferredSize(new Dimension(100, 110));
            frame.add(button);
        }

        frame.setSize(600, 600);
        frame.setVisible(true);
    }

}
