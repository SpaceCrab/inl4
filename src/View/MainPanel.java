package View;

import javax.swing.*;
import java.awt.*;

public class MainPanel extends JPanel
{
    JButton[][] buttons;

    public MainPanel()
    {
        addButtons();
    }

    private void addButtons()
    {
        GridLayout layout = new GridLayout(size, size);
        setLayout(layout);
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                buttons[i][j] = new JButton(" ");
                add(buttons[i][j]);
                buttons[i][j].addActionListener(this);
            }
        }
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        JButton button = (JButton) e.getSource();
        for (int i = 0; i < size; i++){
            for (int j = 0; j < size; j++) {
                if (buttons[i][j].equals(button)) {
                    controller.shoot(i, j);
                    break;
                }
            }
        }
    }
}
