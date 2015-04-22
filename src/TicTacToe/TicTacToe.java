package TicTacToe;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TicTacToe extends JFrame {
  private final static String X = "X";
  private static final String O = "O";
  public static final String DRAW = "draw";
  public static final String GAME_TITLE = "Tic Tak Toe";
  private boolean playerWin = false;
    private boolean xMove = true;
    private JButton b1;
    private JButton b2;
    private JButton b3;
    private JButton b4;
    private JButton b5;
    private JButton b6;
    private JButton b7;
    private JButton b8;
    private JButton b9;
    private Map<Integer, List<JButton>> winLines;

    public TicTacToe(){
        super(GAME_TITLE);
        setBounds(450, 200, 400, 400);
        setVisible(true);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        init();
        initWinLines();
    }

    private void initWinLines() {
      winLines = new HashMap<Integer, List<JButton>>();
      winLines.put(1, Arrays.asList(b1, b4, b7));
      winLines.put(2, Arrays.asList(b2, b5, b8));
      winLines.put(3, Arrays.asList(b3, b6, b9));
      winLines.put(4, Arrays.asList(b1, b2, b3));
      winLines.put(5, Arrays.asList(b4, b5, b6));
      winLines.put(6, Arrays.asList(b7, b8, b7));
      winLines.put(7, Arrays.asList(b1, b5, b9));
      winLines.put(8, Arrays.asList(b7, b5, b3));
    }

  private void init(){
        initButtons();
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

    private void initButtons(){
        b1 = new JButton();
        addListener(b1);
        b2 = new JButton();
        addListener(b2);
        b3 = new JButton();
        addListener(b3);
        b4 = new JButton();
        addListener(b4);
        b5 = new JButton();
        addListener(b5);
        b6 = new JButton();
        addListener(b6);
        b7 = new JButton();
        addListener(b7);
        b8 = new JButton();
        addListener(b8);
        b9 = new JButton();
        addListener(b9);
    }

    private void addListener(final JButton button){
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                button.setEnabled(false);
                if (button.getText().isEmpty()) {
                    if (xMove) {
                        button.setText(X);
                        checkToWin();
                        xMove = false;
                    } else {
                        button.setText(O);
                        checkToWin();
                        xMove = true;
                    }
                }
            }
        });
    }

    private void finishGame(String winner){
        String[] options = {"Yes", "No"};
        String message;
        if(DRAW.equals(winner)){
          message = "Draw\nDo you want to start again?";
        } else {
          message = String.format("Player %s won\nCongratulation!\nDo you want to start again?", winner);
        }
        int option = JOptionPane.showOptionDialog(new JFrame(), message,
                "Game over", JOptionPane.YES_NO_OPTION, JOptionPane.INFORMATION_MESSAGE, null, options, null);

        if(option == JOptionPane.YES_NO_OPTION){
            dispose();
            new TicTacToe();
        }else{
            dispose();
            System.exit(-1);
        }
    }

    private void checkToWin(){
        if(isLineWin(1)){
            playerWin = true;
            String winner = winLines.get(1).get(0).getText().equals(X) ? X : O;
            finishGame(winner);
        } else if(isLineWin(2)){
            playerWin = true;
            String winner = winLines.get(2).get(0).getText().equals(X) ? X : O;
            finishGame(winner);
        } else if(isLineWin(3)){
            playerWin = true;
            String winner = winLines.get(3).get(0).getText().equals(X) ? X : O;
            finishGame(winner);
        } else if(isLineWin(4)){
            playerWin = true;
            String winner = winLines.get(4).get(0).getText().equals(X) ? X : O;
            finishGame(winner);
        } else if(isLineWin(5)){
            playerWin = true;
            String winner = winLines.get(5).get(0).getText().equals(X) ? X : O;
            finishGame(winner);
        } else if(isLineWin(6)){
            playerWin = true;
            String winner = winLines.get(6).get(0).getText().equals(X) ? X : O;
            finishGame(winner);
        } else if(isLineWin(7)){
            playerWin = true;
            String winner = winLines.get(7).get(0).getText().equals(X) ? X : O;
            finishGame(winner);
        } else if(isLineWin(8)){
            playerWin = true;
            String winner = winLines.get(8).get(0).getText().equals(X) ? X : O;
            finishGame(winner);
        } else if(!b1.isEnabled()&& !b2.isEnabled()&& !b3.isEnabled()&& !b4.isEnabled()&& !b5.isEnabled()&&
                !b6.isEnabled()&& !b7.isEnabled()&& !b8.isEnabled()&& !b9.isEnabled()) {
            finishGame(DRAW);
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

    private boolean isLineWin(int lineNumber) {
      List<JButton> line = winLines.get(lineNumber);
      return !line.get(0).getText().isEmpty() && line.get(0).getText().equals(line.get(1).getText())
        && line.get(0).getText().equals(line.get(2).getText());
    }
}
