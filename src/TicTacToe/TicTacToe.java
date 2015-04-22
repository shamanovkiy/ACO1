package TicTacToe;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TicTacToe extends JFrame {
    private boolean playerWin = false;
    private boolean computerWIn = false;
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
                        button.setText("X");
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

    private void nextGame(){
        Object[] options = {"Yes", "No"};
        int newGame = JOptionPane.showOptionDialog(new JFrame(), "Player X won\n Congratulation!\n Do you want to start again?",
                "PLAYER X WON!!", JOptionPane.YES_NO_OPTION, JOptionPane.INFORMATION_MESSAGE, null, options, null);
        if(newGame == 0){
            dispose();
            new TicTacToe();
        }else{
            dispose();
            System.exit(-1);
        }
    }

    private void nextGameC(){
        Object[] options = {"Yes", "No"};
        int newGameC = JOptionPane.showOptionDialog(new JFrame(), "Player O won\n Congratulation!\n Do you want to start again?",
                "PLAYER O WON!!", JOptionPane.YES_NO_OPTION, JOptionPane.INFORMATION_MESSAGE, null, options, null);
        if(newGameC == 0){
            dispose();
            new TicTacToe();
        }else{
            dispose();
            System.exit(-1);
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
            new TicTacToe();
        }else{
            dispose();
            System.exit(-1);
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
}
