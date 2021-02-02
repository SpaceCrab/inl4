package View;

import Controller.Controller;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SouthPanel extends JPanel implements ActionListener
{
    private Controller controller;
    private JButton btnRestart, btnHighscore;
    private JLabel labelCount;

    public SouthPanel(Controller controller)
    {
        this.controller = controller;
        setupButtons();
    }

    public void setupButtons()
    {
        ActionListener listener = new ButtonActionListeners();
        btnRestart = new JButton("Restart");
        add(btnRestart);
        btnRestart.addActionListener(listener);

        btnHighscore = new JButton("Show highscore");
        add(btnHighscore);
        btnHighscore.addActionListener(listener);

        labelCount = new JLabel();
        add(labelCount);


    }
        @Override
        public void actionPerformed(ActionEvent e){
        if(e.getActionCommand().equals(Buttons.btnHighscore)){

        }
        else if(e.getActionCommand().equals(Buttons.btnRestart)){

        }
    }

    class ButtonActionListeners implements ActionListener
    {

        public void actionPerformed(ActionEvent e)
        {
            if (e.getSource() == btnRestart)
            {
                System.out.println("Restart");
                controller.reset();
            }
            else if (e.getSource()== btnHighscore)
            {
                System.out.println("Highscore");
                showHighscore();
            }

        }
    }

    public void showHighscore()
    {
      controller.showHighscore();
    }

    public void roundInc(int roundCount)
    {
        labelCount.setText("Total shots fired: " + String.valueOf(roundCount));
    }
    public void reset(){
        labelCount.setText("0");
    }

}
