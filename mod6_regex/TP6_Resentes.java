package w10_gui;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.regex.*;

public class TP6_Resentes extends JFrame implements ActionListener {

    private JTextField txtFirst, txtSecond;
    private JLabel lblResult;
    private JButton btnCheck, btnClear;

    public TP6_Resentes() {
        // Set frame properties
        setTitle("Pattern and Matcher");
        setSize(300, 150);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new FlowLayout());

        // Create components
        txtFirst = new JTextField(16);
        txtSecond = new JTextField(15);
        btnCheck = new JButton("CHECK");
        btnClear = new JButton("Clear");
        lblResult = new JLabel("");

        // Add action listener to button
        btnCheck.addActionListener(this);
        btnClear.addActionListener((ActionEvent e) -> {
            clearTextFields();
        });

        // Add components to frame
        add(new JLabel("First word: "));
        add(txtFirst);
        add(new JLabel("Second word: "));
        add(txtSecond);
        add(btnCheck);
        add(btnClear);
        add(lblResult);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        //event handler  
        lblResult.setForeground(Color.BLACK);
        try {
            String firstWord = txtFirst.getText();
            String secondWord = txtSecond.getText();
            
            //validate(firstWord);
            check_if_rhymePM(firstWord, secondWord);

            //clearTextFields();
        } catch (NumberFormatException ex) {
            lblResult.setText("Invalid input!");
        }
    }

    public boolean check_if_rhyme(String word1, String word2) {
        boolean result;
        int length = word1.length(); //g l a m 
        String sub = word1.substring(length - 2, length);
        String regex = "[a-zA-Z]{1,2}" + sub;

        result = word2.matches(regex);
        return result;
    }

    public boolean check_if_rhymePM(String word1, String word2) {
        boolean result;
        int length = word1.length(); //g l a m 
        String sub = word1.substring(length - 2, length);
        //System.out.println(sub);
        String regex = "[a-zA-Z]{1,2}" + sub; //"[a-zA-Z]{1,2}am"
        
        Pattern p = Pattern.compile(regex);
        Matcher match = p.matcher(word2);

        Pattern pNum = Pattern.compile("[0-9]");
        Matcher mNum1 = pNum.matcher(word1);
        Matcher mNum2 = pNum.matcher(word2);

        if (mNum1.find() || mNum2.find()) {
            lblResult.setText("Only letters are allowed, sorry.");
            lblResult.setForeground(Color.RED);
        } else if (!word2.matches("[a-zA-Z]*" + sub)) {
            lblResult.setText(word1 + " does not rhyme with " + word2);
        } else {
            if (match.matches()) {
                lblResult.setText(word1 + " rhymes with " + word2);
            } else {
                lblResult.setText("I'm not sure! Sorry!");
            }
        }

        result = match.matches();
        return result;
    }

    public boolean validate(String username_input) {

        Pattern p = Pattern.compile("^[a-zA-Z0-9@#$_]{6,8}$"); //create a regex
        Matcher match = p.matcher(username_input); //create Matcher obj
        boolean result = match.matches();
        if(!result){
            lblResult.setText("Invalid username.");
            lblResult.setForeground(Color.red);
        }else
            lblResult.setText("Valid username.");
        return result;
    }

    public void clearTextFields() {
        txtFirst.setText("");
        txtSecond.setText("");
        lblResult.setText("");
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            new TP6_Resentes().setVisible(true);
        });
    }
}

/*
SwingUtilities.invokeLater() places the code 
in the FIFO Queue of the event-dispatch thread (EDT), 
so it will be executed from the EDT whenever it has 
finished the other tasks it was doing.
 */
