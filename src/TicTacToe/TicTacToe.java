package TicTacToe;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TicTacToe extends JFrame {
    private final static String X = "X";
    private boolean playerWin = false;
    private boolean playerTurn = true;
    private JButton b1;
    private JButton b2;
    private JButton b3;
    private JButton b4;
    private JButton b5;
    private JButton b6;
    private JButton b7;
    private JButton b8;
    private JButton b9;

    public TicTacToe(){
        super("Tic Tak Toe");
        setBounds(450, 200, 400, 400);
        setVisible(true);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        init();
    }

    private void init(){
        initButton();
        JPanel field = new JPanel(new GridLayout(3,3));
        field.setLayout(new GridLayout(3, 3));
        field.add(b1);
        field.add(b2);
        field.add(b3);
        field.add(b4);
        field.add(b5);
        field.add(b6);
        field.add(b7);
        field.add(b8);
        field.add(b9);
        getContentPane().add(field, BorderLayout.CENTER);
    }

    private void initButton(){
        b1 = new JButton("");
        actionButton(b1);
        b2 = new JButton("");
        actionButton(b2);
        b3 = new JButton("");
        actionButton(b3);
        b4 = new JButton("");
        actionButton(b4);
        b5 = new JButton("");
        actionButton(b5);
        b6 = new JButton("");
        actionButton(b6);
        b7 = new JButton("");
        actionButton(b7);
        b8 = new JButton("");
        actionButton(b8);
        b9 = new JButton("");
        actionButton(b9);
    }

    private void actionButton(final JButton button){
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                button.setEnabled(false);
                if (button.getText().equals("")) {
                    if (playerTurn) {
                        button.setText(X);
                        checkToWin();
                        playerTurn = false;
                    } else {
                        button.setText("O");
                        checkToWin();
                        playerTurn = true;
                    }
                }
            }
        });
    }

/*

temp = 1 if player X won, -1 if player O won, 0 if draw;

 */
    private void nextGame(int temp){
        Object[] options = {"Yes", "No"};
        Object message;
        if(temp == 1){
            message = "Player X won\n Congratulation!\n Do you want to start again?";
        }else if(temp == -1){
            message = "Player O won\n Congratulation!\n Do you want to start again?";
        }else{
           message = "Draw\n Do you want to start again?";
        }
        int newGame = JOptionPane.showOptionDialog(new JFrame(), message,
                "Game over", JOptionPane.YES_NO_OPTION, JOptionPane.INFORMATION_MESSAGE, null, options, null);

        if(newGame == 0){
            dispose();
            new TicTacToe();
        }else{
            dispose();
            System.exit(-1);
        }
    }

    private void checkToWin(){

        if(b1.getText().equals(b4.getText()) && b1.getText().equals(b7.getText()) && !b1.getText().equals("")){
            playerWin = true;
            if(b1.getText().equals(X)) {
                nextGame(1);
            }else{
                nextGame(-1);
            }
        }
        if(b1.getText().equals(b2.getText()) && b1.getText().equals(b3.getText()) && !b1.getText().equals("")){
            playerWin = true;
            if(b1.getText().equals(X)) {
                nextGame(1);
            }else{
                nextGame(-1);
            }
        }
        if(b1.getText().equals(b5.getText()) && b1.getText().equals(b9.getText()) && !b1.getText().equals("")){
            playerWin = true;
            if(b1.getText().equals(X)) {
                nextGame(1);
            }else{
                nextGame(-1);
            }
        }
        if(b2.getText().equals(b5.getText()) && b2.getText().equals(b8.getText()) && !b2.getText().equals("")){
            playerWin = true;
            if(b2.getText().equals(X)) {
                nextGame(1);
            }else{
                nextGame(-1);
            }
        }
        if(b3.getText().equals(b6.getText()) && b3.getText().equals(b9.getText()) && !b3.getText().equals("")){
            playerWin = true;
            if(b3.getText().equals(X)) {
                nextGame(1);
            }else{
                nextGame(-1);
            }
        }
        if(b3.getText().equals(b5.getText()) && b3.getText().equals(b7.getText()) && !b3.getText().equals("")){
            playerWin = true;
            if(b3.getText().equals(X)) {
                nextGame(1);
            }else{
                nextGame(-1);
            }
        }
        if(b4.getText().equals(b5.getText()) && b4.getText().equals(b6.getText()) && !b4.getText().equals("")){
            playerWin = true;
            if(b4.getText().equals(X)) {
                nextGame(1);
            }else{
                nextGame(-1);
            }
        }
        if(b7.getText().equals(b8.getText()) && b7.getText().equals(b9.getText()) && !b7.getText().equals("")){
            playerWin = true;
            if(b7.getText().equals(X)) {
                nextGame(1);
            }else{
                nextGame(-1);
            }
        }


        if(!b1.isEnabled()&& !b2.isEnabled()&& !b3.isEnabled()&& !b4.isEnabled()&& !b5.isEnabled()&&
                !b6.isEnabled()&& !b7.isEnabled()&& !b8.isEnabled()&& !b9.isEnabled()) {
            playerWin = false;
            nextGame(0);
        }

        if(playerWin){
            b1.setEnabled(false);
            b2.setEnabled(false);
            b3.setEnabled(false);
            b4.setEnabled(false);
            b5.setEnabled(false);
            b6.setEnabled(false);
            b7.setEnabled(false);
            b8.setEnabled(false);
            b9.setEnabled(false);
        }


    }
}
