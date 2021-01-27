package View;

import Controller.Controller;
import Model.GameManager;

import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;

public class MainPanel extends JPanel
{
    private JButton[][] buttons;
    private Controller controller;

    public MainPanel()
    {
        this.controller = controller;
        addButtons();
        setupPanel();
    }

    private void addButtons()
    {
        GridLayout layout = new GridLayout(10, 10, 1, 1);
        setLayout(layout);
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
               buttons[i][j] = new JButton(" ");
               add(buttons[i][j]);
               buttons[i][j].addActionListener(this);
            }
        }
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        JButton button = (JButton) e.getSource();
        for (int i = 0; i < 10; i++){
            for (int j = 0; j < 10; j++) {
                if (buttons[i][j].equals(button)) {
                    controller.shoot(i, j);
                    break;
                }
            }
        }
    }
}
