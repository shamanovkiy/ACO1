package TicTacToe;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TestTicTacToe {

    public static void main(String[] args) {
        new Game();
    }

    private static class Game extends JFrame{
      private JButton humanOpponent = new JButton("1 vs 1");
      private JButton botOpponent = new JButton("1 vs Computer");

      private Game() {
        setVisible(true);
        setBounds(500, 300, 250, 100);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        JPanel panel = new JPanel(new GridLayout(1,2));
        panel.add(humanOpponent);
        panel.add(botOpponent);
        getContentPane().add(panel);

        humanOpponent.addActionListener(new ActionListener() {
          @Override
          public void actionPerformed(ActionEvent e) {
            final TicTacToe ticTacToe = new TicTacToe();
            ticTacToe.setVisible(true);
            setVisible(false);
          }
        });
        botOpponent.addActionListener(new ActionListener() {
          @Override
          public void actionPerformed(ActionEvent e) {
            final TicTacToeBot ticTacToeBot = new TicTacToeBot();
            ticTacToeBot.setVisible(true);
            setVisible(false);
          }
        });
      }
    }

}
