import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TestTicTacToe {

    public static void main(String[] args) {
        final TicTacToe ticTacToe = new TicTacToe();
        ticTacToe.setVisible(false);
        final JFrame chose = new JFrame();
        chose.setVisible(true);
        chose.setBounds(500, 300, 200, 100);
        JPanel chosePanel = new JPanel(new GridLayout(1,2));
        JButton c1 = new JButton("1 vs 1");
        JButton c2 = new JButton("1 vs Computer");
        chosePanel.add(c1);
        chosePanel.add(c2);
        chose.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        chose.getContentPane().add(chosePanel);
        c1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                ticTacToe.setVisible(true);
                chose.setVisible(false);
            }
        });
    }
}