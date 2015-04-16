package TicTacToe;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TicTacToeBot extends JFrame{

    private boolean playerWin = false;
    private boolean computerWIn = false;
    private boolean playerTurn = true;
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

    public TicTacToeBot(){
        super("Tic Tak Toe");
        setBounds(450, 200, 400, 400);
        setVisible(true);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        init();
    }

    private void init(){
        initButton();
        JPanel field = new JPanel(new GridLayout(3,3));
        field.setLayout(new GridLayout(3,3));
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
        if(!playerTurn){
            checkForBot();
        }
        b1 = new JButton("");
        b1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                b1.setEnabled(false);
                if(b1.getText().equals("")){
                    if(playerTurn){
                        b1.setText("X");
                        checkToWin();
                        playerTurn = false;
                        step++;
                    }
                }
            }
        });
        b2 = new JButton("");
        b2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                b2.setEnabled(false);
                if(b2.getText().equals("")){
                    if(playerTurn){
                        b2.setText("X");
                        checkToWin();
                        playerTurn = false;
                        step++;
                    }
                }
            }
        });
        b3 = new JButton("");
        b3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                b3.setEnabled(false);
                if(b3.getText().equals("")){
                    if(playerTurn){
                        b3.setText("X");
                        checkToWin();
                        playerTurn = false;
                        step++;
                    }
                }
            }
        });
        b4 = new JButton("");
        b4.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                b4.setEnabled(false);
                if(b4.getText().equals("")){
                    if(playerTurn){
                        b4.setText("X");
                        checkToWin();
                        playerTurn = false;
                        step++;
                    }
                }
            }
        });
        b5 = new JButton("");
        b5.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                b5.setEnabled(false);
                if(b5.getText().equals("")){
                    if(playerTurn){
                        b5.setText("X");
                        checkToWin();
                        playerTurn = false;
                        step++;
                    }
                }
            }
        });
        b6 = new JButton("");
        b6.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                b6.setEnabled(false);
                if(b6.getText().equals("")){
                    if(playerTurn){
                        b6.setText("X");
                        checkToWin();
                        playerTurn = false;
                        step++;
                    }
                }
            }
        });
        b7 = new JButton("");
        b7.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                b7.setEnabled(false);
                if(b7.getText().equals("")){
                    if(playerTurn){
                        b7.setText("X");
                        checkToWin();
                        playerTurn = false;
                        step++;
                    }
                }
            }
        });
        b8 = new JButton("");
        b8.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                b8.setEnabled(false);
                if(b8.getText().equals("")){
                    if(playerTurn){
                        b8.setText("X");
                        checkToWin();
                        playerTurn = false;
                        step++;
                    }
                }
            }
        });
        b9 = new JButton("");
        b9.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                b9.setEnabled(false);
                if(b9.getText().equals("")){
                    if(playerTurn){
                        b9.setText("X");
                        checkToWin();
                        playerTurn = false;
                        step++;
                    }
                }
            }
        });
    }

    private void nextGame(){
        Object[] options = {"Yes", "No"};
        int newGame = JOptionPane.showOptionDialog(new JFrame(), "Player X won\n Congratulation!\n Do you want to start again?",
                "PLAYER X WON!!", JOptionPane.YES_NO_OPTION, JOptionPane.INFORMATION_MESSAGE, null, options, null);
        if(newGame == 0){
            dispose();
            new TicTacToeBot();
        }else{
            dispose();
        }
    }

    private void nextGameC(){
        Object[] options = {"Yes", "No"};
        int newGameC = JOptionPane.showOptionDialog(new JFrame(), "Player O won\n Congratulation!\n Do you want to start again?",
                "PLAYER O WON!!", JOptionPane.YES_NO_OPTION, JOptionPane.INFORMATION_MESSAGE, null, options, null);
        if(newGameC == 0){
            dispose();
            new TicTacToeBot();
        }else{
            dispose();
        }
    }

    private void draw(){
        playerWin = false;
        computerWIn = false;
        Object[] options = {"Yes", "No"};
        int newGameC = JOptionPane.showOptionDialog(new JFrame(), "Draw\n Do you want to start again?",
                "Draw", JOptionPane.YES_NO_OPTION, JOptionPane.INFORMATION_MESSAGE, null, options, null);
        if(newGameC == 0){
            dispose();
            new TicTacToeBot();
        }else{
            dispose();
        }
    }

    private void checkToWin(){

        if(b1.getText().equals("X")){
            if(b4.getText().equals("X")){
                if(b7.getText().equals("X")){
                    playerWin = true;
                    computerWIn = false;
                    nextGame();
                }
            }
        }
        if(b1.getText().equals("X")){
            if(b2.getText().equals("X")){
                if(b3.getText().equals("X")){
                    playerWin = true;
                    computerWIn = false;
                    nextGame();                }
            }
        }
        if(b1.getText().equals("X")){
            if(b5.getText().equals("X")){
                if(b9.getText().equals("X")){
                    playerWin = true;
                    computerWIn = false;
                    nextGame();                }
            }
        }
        if(b2.getText().equals("X")){
            if(b5.getText().equals("X")){
                if(b8.getText().equals("X")){
                    playerWin = true;
                    computerWIn = false;
                    nextGame();                }
            }
        }
        if(b3.getText().equals("X")){
            if(b6.getText().equals("X")){
                if(b9.getText().equals("X")){
                    playerWin = true;
                    computerWIn = false;
                    nextGame();                }
            }
        }
        if(b3.getText().equals("X")){
            if(b5.getText().equals("X")){
                if(b7.getText().equals("X")){
                    playerWin = true;
                    computerWIn = false;
                    nextGame();                }
            }
        }
        if(b4.getText().equals("X")){
            if(b5.getText().equals("X")){
                if(b6.getText().equals("X")){
                    playerWin = true;
                    computerWIn = false;
                    nextGame();                }
            }
        }
        if(b7.getText().equals("X")){
            if(b8.getText().equals("X")){
                if(b9.getText().equals("X")){
                    playerWin = true;
                    computerWIn = false;
                    nextGame();                }
            }
        }
        ///////////////////////////
        if(b1.getText().equals("O")){
            if(b4.getText().equals("O")){
                if(b7.getText().equals("O")){
                    playerWin = false;
                    computerWIn = true;
                    nextGameC();
                }
            }
        }
        if(b1.getText().equals("O")){
            if(b2.getText().equals("O")){
                if(b3.getText().equals("O")){
                    playerWin = false;
                    computerWIn = true;
                    nextGameC();
                }
            }
        }
        if(b1.getText().equals("O")){
            if(b5.getText().equals("O")){
                if(b9.getText().equals("O")){
                    playerWin = false;
                    computerWIn = true;
                    nextGameC();
                }
            }
        }
        if(b2.getText().equals("O")){
            if(b5.getText().equals("O")){
                if(b8.getText().equals("O")){
                    playerWin = false;
                    computerWIn = true;
                    nextGameC();
                }
            }
        }
        if(b3.getText().equals("O")){
            if(b6.getText().equals("O")){
                if(b9.getText().equals("O")){
                    playerWin = false;
                    computerWIn = true;
                    nextGameC();
                }
            }
        }
        if(b3.getText().equals("O")){
            if(b5.getText().equals("O")){
                if(b7.getText().equals("O")){
                    playerWin = false;
                    computerWIn = true;
                    nextGameC();
                }
            }
        }
        if(b4.getText().equals("O")){
            if(b5.getText().equals("O")){
                if(b6.getText().equals("O")){
                    playerWin = false;
                    computerWIn = true;
                    nextGameC();
                }
            }
        }
        if(b7.getText().equals("O")){
            if(b8.getText().equals("O")){
                if(b9.getText().equals("O")){
                    playerWin = false;
                    computerWIn = true;
                    nextGameC();
                }
            }
        }

        if(!b1.isEnabled()&& !b2.isEnabled()&& !b3.isEnabled()&& !b4.isEnabled()&& !b5.isEnabled()&&
                !b6.isEnabled()&& !b7.isEnabled()&& !b8.isEnabled()&& !b9.isEnabled()) {
            draw();
        }

        if(playerWin || computerWIn ){
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

    private void buttonForBot(JButton button){
        if(button.isEnabled()){
            button.setEnabled(false);
            button.setText("O");
            checkToWin();
            playerTurn = true;
        }
    }

    private void checkForBot(){
        if(step == 2){
            buttonForBot(botTurn());
        }
        if(b1.getText().equals("X")){
            if(b4.getText().equals("X")){
                buttonForBot(b7);
            }
        }
        if(b1.getText().equals("X")){
            if(b7.getText().equals("X")){
                buttonForBot(b4);
            }
        }
        if(b7.getText().equals("X")){
            if(b4.getText().equals("X")){
                buttonForBot(b1);
            }
        }
        if(b2.getText().equals("X")){
            if(b5.getText().equals("X")){
                buttonForBot(b8);
            }
        }
        if(b2.getText().equals("X")){
            if(b8.getText().equals("X")){
                buttonForBot(b5);
            }
        }
        if(b8.getText().equals("X")){
            if(b5.getText().equals("X")){
                buttonForBot(b2);
            }
        }
        if(b3.getText().equals("X")){
            if(b6.getText().equals("X")){
                buttonForBot(b9);
            }
        }
        if(b3.getText().equals("X")){
            if(b9.getText().equals("X")){
                buttonForBot(b6);
            }
        }
        if(b9.getText().equals("X")){
            if(b6.getText().equals("X")){
                buttonForBot(b3);
            }
        }
        if(b1.getText().equals("X")){
            if(b2.getText().equals("X")){
                buttonForBot(b3);
            }
        }
        if(b3.getText().equals("X")){
            if(b2.getText().equals("X")){
                buttonForBot(b1);
            }
        }
        if(b1.getText().equals("X")){
            if(b3.getText().equals("X")){
                buttonForBot(b2);
            }
        }
        if(b4.getText().equals("X")){
            if(b5.getText().equals("X")){
                buttonForBot(b6);
            }
        }
        if(b6.getText().equals("X")){
            if(b5.getText().equals("X")){
                buttonForBot(b4);
            }
        }
        if(b4.getText().equals("X")){
            if(b6.getText().equals("X")){
                buttonForBot(b5);
            }
        }
        if(b7.getText().equals("X")){
            if(b8.getText().equals("X")){
                buttonForBot(b9);
            }
        }
        if(b9.getText().equals("X")){
            if(b8.getText().equals("X")){
                buttonForBot(b7);
            }
        }
        if(b7.getText().equals("X")){
            if(b9.getText().equals("X")){
                buttonForBot(b8);
            }
        }
        if(b1.getText().equals("X")){
            if(b5.getText().equals("X")){
                buttonForBot(b9);
            }
        }
        if(b1.getText().equals("X")){
            if(b9.getText().equals("X")){
                buttonForBot(b5);
            }
        }
        if(b9.getText().equals("X")){
            if(b5.getText().equals("X")){
                buttonForBot(b1);
            }
        }
        if(b3.getText().equals("X")){
            if(b5.getText().equals("X")){
                buttonForBot(b7);
            }
        }
        if(b5.getText().equals("X")){
            if(b7.getText().equals("X")){
                buttonForBot(b3);
            }
        }
        if(b7.getText().equals("X")){
            if(b3.getText().equals("X")){
                buttonForBot(b5);
            }
        }
    }

    private JButton botTurn(){
        JButton[] buttons = {b1,b2,b3,b4,b5,b6,b7,b8,b9};
        int value = (int) (Math.random()*9);
        return buttons[value];
    }
}
