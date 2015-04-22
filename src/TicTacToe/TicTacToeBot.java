package TicTacToe;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.*;

public class TicTacToeBot extends JFrame {

    private static final String X = "X";
    private boolean playerWin = false;
    private int step = 1;
    private JButton b1;
    private JButton b2;
    private JButton b3;
    private JButton b4;
    private JButton b5;
    private JButton b6;
    private JButton b7;
    private JButton b8;
    private JButton b9;

    public TicTacToeBot() {
        super("Tic Tak Toe");
        setBounds(450, 200, 400, 400);
        setVisible(true);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        init();
    }

    private void init() {
        initButton();
        JPanel field = new JPanel(new GridLayout(3, 3));
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

    private void initButton() {
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
                button.setText(X);
                step++;
                checkToWin();
                checkForBot();
            }
        });
    }

    /*

    temp = 1 if player X won, -1 if computer won, 0 if draw;

     */
    private void nextGame(int temp){
        Object[] options = {"Yes", "No"};
        Object message;
        if(temp == 1){
            message = "Player X won\n Congratulation!\n Do you want to start again?";
        }else if(temp == -1){
            message = "Computer Won!\n Do you want to start again?";
        }else{
            message = "Draw\n Do you want to start again?";
        }
        int newGame = JOptionPane.showOptionDialog(new JFrame(), message,
                "Game over", JOptionPane.YES_NO_OPTION, JOptionPane.INFORMATION_MESSAGE, null, options, null);

        if(newGame == 0){
            dispose();
            new TicTacToeBot();
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

    private void buttonForBot(JButton button) {
        if (button.isEnabled()) {
            if (button.getText().equals("")) {
                button.setEnabled(false);
                button.setText("O");
                checkToWin();
                step++;
            }
        }
    }

    private void pB1() {
        if (b1.getText().equals(X)) {
            if (b4.getText().equals(X) && b7.isEnabled()) {
                buttonForBot(b7);
            } else if (b7.getText().equals(X) && b4.isEnabled()) {
                buttonForBot(b4);
            } else if (b2.getText().equals(X) && b3.isEnabled()) {
                buttonForBot(b3);
            } else if (b3.getText().equals(X) && b2.isEnabled()) {
                buttonForBot(b2);
            } else if (b5.getText().equals(X) && b9.isEnabled()) {
                buttonForBot(b9);
            } else if (b9.getText().equals(X) && b5.isEnabled()) {
                buttonForBot(b5);
            }
            else {
                pB5();
            }
        } else {
            pB5();
        }
    }

    private void pB2() {
        if (b2.getText().equals(X)) {
            if (b3.getText().equals(X) && b1.isEnabled()) {
                buttonForBot(b1);
            } else if (b1.getText().equals(X) && b3.isEnabled()) {
                buttonForBot(b3);
            } else if (b5.getText().equals(X) && b8.isEnabled()) {
                buttonForBot(b8);
            } else if (b8.getText().equals(X) && b5.isEnabled()) {
                buttonForBot(b5);
            }
            else {
                pB4();
            }
        }else {
            pB4();
        }
    }

    private void pB3() {
        if (b3.getText().equals(X)) {
            if (b1.getText().equals(X) && b2.isEnabled()) {
                buttonForBot(b2);
            } else if (b2.getText().equals(X) && b1.isEnabled()) {
                buttonForBot(b1);
            } else if (b6.getText().equals(X) && b9.isEnabled()) {
                buttonForBot(b9);
            } else if (b9.getText().equals(X) && b6.isEnabled()) {
                buttonForBot(b6);
            } else if (b5.getText().equals(X) && b7.isEnabled()) {
                buttonForBot(b7);
            } else if (b7.getText().equals(X) && b5.isEnabled()) {
                buttonForBot(b5);
            }
            else{
                pB7();
            }
        }else{
            pB7();
        }
    }

    private void pB4() {
        if (b4.getText().equals(X)) {
            if (b5.getText().equals(X) && b6.isEnabled()) {
                buttonForBot(b6);
            } else if (b6.getText().equals(X) && b5.isEnabled()) {
                buttonForBot(b5);
            } else if (b7.getText().equals(X) && b1.isEnabled()) {
                buttonForBot(b1);
            } else if (b1.getText().equals(X) && b7.isEnabled()) {
                buttonForBot(b7);
            }
            else {
                pB6();
            }
        }else {
            pB6();
        }
    }

    private void pB5() {
        if (b5.getText().equals(X)) {
            if (b2.getText().equals(X) && b8.isEnabled()) {
                buttonForBot(b8);
            } else if (b8.getText().equals(X) && b2.isEnabled()) {
                buttonForBot(b2);
            } else if (b4.getText().equals(X) && b6.isEnabled()) {
                buttonForBot(b6);
            } else if (b6.getText().equals(X) && b4.isEnabled()) {
                buttonForBot(b4);
            } else if (b3.getText().equals(X) && b7.isEnabled()) {
                buttonForBot(b7);
            } else if (b7.getText().equals(X) && b3.isEnabled()) {
                buttonForBot(b3);
            } else if (b1.getText().equals(X) && b9.isEnabled()) {
                buttonForBot(b9);
            } else if (b9.getText().equals(X) && b1.isEnabled()) {
                buttonForBot(b1);
            }
            else {
                pB3();
            }
        }else {
            pB3();
        }
    }

    private void pB6() {
        if (b6.getText().equals(X)) {
            if (b3.getText().equals(X) && b9.isEnabled()) {
                buttonForBot(b9);
            } else if (b9.getText().equals(X) && b3.isEnabled()) {
                buttonForBot(b3);
            } else if (b4.getText().equals(X) && b5.isEnabled()) {
                buttonForBot(b5);
            } else if (b5.getText().equals(X) && b4.isEnabled()) {
                buttonForBot(b4);
            }
            else {
                pB8();
            }
        }else {
            pB8();
        }
    }

    private void pB7() {
        if (b7.getText().equals(X)) {
            if (b1.getText().equals(X) && b4.isEnabled()) {
                buttonForBot(b4);
            } else if (b4.getText().equals(X) && b1.isEnabled()) {
                buttonForBot(b1);
            } else if (b3.getText().equals(X) && b5.isEnabled()) {
                buttonForBot(b5);
            } else if (b5.getText().equals(X) && b3.isEnabled()) {
                buttonForBot(b3);
            } else if (b8.getText().equals(X) && b9.isEnabled()) {
                buttonForBot(b9);
            } else if (b9.getText().equals(X) && b8.isEnabled()) {
                buttonForBot(b8);
            }
            else {
                pB9();
            }
        }else {
            pB9();
        }
    }

    private void pB8() {
        if (b8.getText().equals(X)) {
            if (b7.getText().equals(X) && b9.isEnabled()) {
                buttonForBot(b9);
            } else if (b9.getText().equals(X) && b7.isEnabled()) {
                buttonForBot(b7);
            } else if (b2.getText().equals(X) && b5.isEnabled()) {
                buttonForBot(b5);
            } else if (b5.getText().equals(X) && b2.isEnabled()) {
                buttonForBot(b2);
            }
            else {
                buttonForBot(botTurn());
            }
        }else {
            buttonForBot(botTurn());
        }
    }

    private void pB9() {
        if (b9.getText().equals(X)) {
            if (b7.getText().equals(X) && b8.isEnabled()) {
                buttonForBot(b8);
            } else if (b8.getText().equals(X) && b7.isEnabled()) {
                buttonForBot(b7);
            } else if (b1.getText().equals(X) && b5.isEnabled()) {
                buttonForBot(b5);
            } else if (b5.getText().equals(X) && b1.isEnabled()) {
                buttonForBot(b1);
            } else if (b3.getText().equals(X) && b6.isEnabled()) {
                buttonForBot(b6);
            } else if (b6.getText().equals(X) && b3.isEnabled()) {
                buttonForBot(b3);
            }
            else {
                pB2();
            }
        }else {
            pB2();
        }
    }

    private void checkForBot() {
        if (step == 2) {
            buttonForBot(botTurn());
            return;
        }
        pB1();
    }

    private JButton botTurn() {
        JButton[] buttons = {b1, b2, b3, b4, b5, b6, b7, b8, b9};
        java.util.List<JButton> buttonList = new ArrayList<JButton>();
        for (int i = 0; i < buttons.length; i++) {
            if (buttons[i].isEnabled()) {
                buttonList.add(buttons[i]);
            }
        }
        if (buttonList.size() == 0) {
            return b1;
        }
        return buttonList.get((int) (Math.random() * buttonList.size()));
    }
}

