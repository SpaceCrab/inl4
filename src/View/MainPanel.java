package View;

import Controller.Controller;

import javax.swing.*;
import javax.swing.border.Border;
import javax.swing.border.CompoundBorder;
import java.awt.*;

public class MainPanel extends JPanel
{

    private SouthPanel southPanel;
    private CenterPanel centerPanel;
    private Controller controller;

    public MainPanel(Controller controller)
    {
        this.controller = controller;
        setupPanel();
    }

    private void setupPanel()
    {
        BorderLayout layout = new BorderLayout();
        setLayout(layout);
        Border border = this.getBorder();
        Border borderMargin = BorderFactory.createEmptyBorder(8,8,8,8);
        setBorder(new CompoundBorder(border, borderMargin));

        southPanel = new SouthPanel(controller);
        add(southPanel, BorderLayout.SOUTH);

        centerPanel = new CenterPanel(controller);
        add(centerPanel, BorderLayout.CENTER);
    }

    public void roundInc(int roundCount)
    {
        southPanel.roundInc(roundCount);
    }

    public void reset()
    {
       southPanel.reset();
       centerPanel.reset();
    }

}
