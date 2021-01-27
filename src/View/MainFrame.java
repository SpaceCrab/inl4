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

    public MainFrame()
    {
        JFrame frame = new JFrame("Sinking Ships");
        JButton button;
        frame.setLayout(new GridLayout(10, 10, 1, 1));

        for (int i = 0; i < 100; i++)
        {
            button = new JButton();
            button.setPreferredSize(new Dimension(100, 110));
            frame.add(button);
        }
        frame.setSize(600, 600);
        frame.setVisible(true);
    }
}
