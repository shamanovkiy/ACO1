package noteFrame;

import helper.FileHelper;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class MyFrame extends JFrame{

    private JTextArea textArea;
    private JTextField pathField;
    private JButton loadButton;
    private JButton saveButton;
    private JButton createButton;

    public MyFrame(String name){
        super(name);
        setSize(600, 600);
        setVisible(true);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        init();
    }

    private void init(){
        initButtom();
        JPanel panel = new JPanel(new GridLayout(1,3));
        panel.add(loadButton);
        panel.add(saveButton);
        panel.add(createButton);
        getContentPane().add(panel, BorderLayout.SOUTH);

        pathField = new JTextField();
        getContentPane().add(pathField, BorderLayout.NORTH);

        textArea = new JTextArea();
        getContentPane().add(textArea, BorderLayout.CENTER);

    }

    private void initButtom(){
        loadButton = new JButton("Load");
        loadButton.addActionListener(new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    if(new File(pathField.getText()).exists()) {
                        FileInputStream inFile = new FileInputStream(pathField.getText());
                        byte[] str = new byte[inFile.available()];
                        inFile.read(str);
                        textArea.setText(new String(str));
                    }else{
                        JOptionPane.showMessageDialog(new JFrame(), "File not found", "Error", JOptionPane.ERROR_MESSAGE);
                    }
                } catch (IOException e1) {
                    e1.printStackTrace();
                }
            }
        });
        saveButton = new JButton("Save");
        saveButton.addActionListener(new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    FileHelper.writeToFile(new File(pathField.getText()), textArea.getText());
                } catch (IOException e1) {
                    e1.printStackTrace();
                }
            }
        });
        createButton = new JButton("Create file");
        createButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                final JFrame smallFrame = new JFrame("Write file path");
                smallFrame.setSize(300, 200);
                smallFrame.setVisible(true);
                smallFrame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
                JPanel panel2 = new JPanel(new GridLayout(1,1));
                JButton ok = new JButton("Ok");
                panel2.add(ok);
                smallFrame.getContentPane().add(panel2, BorderLayout.SOUTH);
                final JTextField text = new JTextField();
                smallFrame.getContentPane().add(text, BorderLayout.CENTER);
                ok.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        File file = new File(text.getText());
                        try {
                            file.createNewFile();
                        } catch (IOException e1) {
                            e1.printStackTrace();
                        }
                        smallFrame.dispose();
                    }
                });
            }
        });
    }


}
