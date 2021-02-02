package View;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import Controller.Controller;
import java.awt.event.ActionListener;

public class CenterPanel extends JPanel
{
    private JButton[][] buttons;
    private Controller controller;


    /**
     * Constructor CenterPanel
     * @param controller
     */
    public CenterPanel(Controller controller)
    {
        this.controller = controller;
        buttons = new JButton[10][10];
        addButtons();
    }

    /**
     * Method to add buttons to the centerPanel
     */
    private void addButtons()
    {
        GridLayout layout = new GridLayout(10, 10,1,1);
        ActionListener listener = new CenterPanel.ButtonActionListeners();
        setLayout(layout);
        for (int y = 0; y < 10; y++) {
            for (int x = 0; x < 10; x++) {
                buttons[y][x] = new JButton(" ");
                add(buttons[y][x]);
                buttons[y][x].addActionListener(listener);
            }
        }
    }

    /**
     * Resets the buttons in centerPanel
     */
    public void reset()
    {
        for(int i = 0; i < 10; i++)
        {
            for (int j = 0; j<10; j++)
            {
                buttons[i][j].setEnabled(true);
                buttons[i][j].setText(" ");
            }
        }
    }

    class ButtonActionListeners implements ActionListener
    {

        public void actionPerformed(ActionEvent e)
        {
            JButton button = (JButton) e.getSource();
            for (int i = 0; i < 10; i++)
            {
                for (int j = 0; j < 10; j++)
                {
                    if (buttons[i][j].equals(button))
                    {
                        buttons[i][j].setEnabled(false);
                        if(controller.fireAt(i, j))
                        {
                            buttons[i][j].setText("Hit");
                        }
                        break;
                    }
                }
            }
            controller.winCondition();
        }
    }
}
