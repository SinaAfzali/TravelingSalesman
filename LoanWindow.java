package classes;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class LoanWindow extends JFrame {

    static String text1="";
    static String text2="";
    static String text3="";
    static String text4="";
    static String text5="";
    static String text6="";

    public LoanWindow() {
        // Initialize the loan window
        super("Loan Window");

        // Set background image
        JLabel background = new JLabel(new ImageIcon("background.png"));
        background.setLayout(new BorderLayout());
        setContentPane(background);

        // Set window size, close operation, and location
        setSize(800, 600);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setLocationRelativeTo(null);

        // Add some components to the window
        JPanel panel = new JPanel(new GridLayout(3, 3));
        panel.setOpaque(false);
        getContentPane().add(panel, BorderLayout.CENTER);

        // Add six buttons for different loan budgets
        JButton button1 = new JButton("100");
        JButton button2 = new JButton("200");
        JButton button3 = new JButton("300");
        JButton button4 = new JButton("400");
        JButton button5 = new JButton("500");
        JButton button6 = new JButton("1000");

        // Set button fonts and colors
        Font buttonFont = new Font("Arial", Font.BOLD, 24);
        Color buttonColor = new Color(41, 128, 185);
        button1.setFont(buttonFont);
        button2.setFont(buttonFont);
        button3.setFont(buttonFont);
        button4.setFont(buttonFont);
        button5.setFont(buttonFont);
        button6.setFont(buttonFont);
        button1.setForeground(buttonColor);
        button2.setForeground(buttonColor);
        button3.setForeground(buttonColor);
        button4.setForeground(buttonColor);
        button5.setForeground(buttonColor);
        button6.setForeground(buttonColor);

        // Add buttons to panel
        panel.add(button1);
        panel.add(button2);
        panel.add(button3);
        panel.add(button4);
        panel.add(button5);
        panel.add(button6);

        // Add a close button
        JButton closeButton = new JButton(text1);
        closeButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                dispose();
            }
        });
        closeButton.setFont(buttonFont);
        closeButton.setForeground(buttonColor);
        panel.add(closeButton);


        // Add labels for loan description and amount to be paid back
        JLabel paymentLabel = new JLabel();

// Set fonts and colors
        Font labelFont = new Font("Arial", Font.BOLD, 15); // Increase font size to 30
        paymentLabel.setFont(labelFont);
        Color labelColor = new Color(41, 128, 185);
        paymentLabel.setForeground(labelColor);

// Add labels to panel
        panel.add(paymentLabel);

        paymentLabel.setFont(new Font("serif",Font.BOLD,18));

        // Add a confirmation dialog when the user clicks on a loan budget button
        ActionListener loanButtonListener = new ActionListener() {
            public void actionPerformed(ActionEvent e) {

                if (Value.getLean_player1()==-2)Value.setLean_player1(-1);
                if (Value.getLean_player2()==-2)Value.setLean_player2(-1);
                if (Value.getLean_player3()==-2)Value.setLean_player3(-1);
                if (Value.getLean_player4()==-2)Value.setLean_player4(-1);

                JButton sourceButton = (JButton) e.getSource();
                int loanAmount = Integer.parseInt(sourceButton.getText());
                int confirmation = JOptionPane.showConfirmDialog(null, text2 + loanAmount + text3);

                    if (confirmation == JOptionPane.YES_OPTION) {
                        // Update payment label when the user confirms the loan
                            if (Value.getPlayer() == 1) {
                                if (Value.getLean_player1() == 0) {
                                Value.setMoney_Player1(Value.getMoney_Player1() + loanAmount);
                                Value.setLean_player1(1);
                                Value.setMoney_Lean((long) (loanAmount * 1.2));
                                    double amountToBePaidBack = loanAmount * 1.2; // assuming a 10% interest rate
                                    paymentLabel.setText(text4 + amountToBePaidBack + text5);
                            } else  paymentLabel.setText(text6);
                        }
                        else if (Value.getPlayer() == 2) {
                            if (Value.getLean_player2()==0) {
                                Value.setMoney_Player2(Value.getMoney_Player2() + loanAmount);
                                Value.setLean_player2(1);
                                Value.setMoney_Lean((long) (loanAmount * 1.2));
                                double amountToBePaidBack = loanAmount * 1.2; // assuming a 10% interest rate
                                paymentLabel.setText(text4 + amountToBePaidBack + text5);
                            } else  paymentLabel.setText(text6);
                        }
                        else if (Value.getPlayer() == 3) {
                            if (Value.getLean_player3()==0) {
                                Value.setMoney_Player3(Value.getMoney_Player3() + loanAmount);
                                Value.setLean_player3(1);
                                Value.setMoney_Lean((long) (loanAmount * 1.2));
                                double amountToBePaidBack = loanAmount * 1.2; // assuming a 10% interest rate
                                paymentLabel.setText(text4 + amountToBePaidBack + text5);
                            } else  paymentLabel.setText(text6);
                        }
                        if (Value.getPlayer() == 4) {
                            if (Value.getLean_player4()==0) {
                                Value.setMoney_Player4(Value.getMoney_Player4() + loanAmount);
                                Value.setLean_player4(1);
                                Value.setMoney_Lean((long) (loanAmount * 1.2));
                                double amountToBePaidBack = loanAmount * 1.2; // assuming a 10% interest rate
                                paymentLabel.setText(text4 + amountToBePaidBack + text5);
                            } else  paymentLabel.setText(text6);
                        }

                    }
            }
        };

        button1.addActionListener(loanButtonListener);
        button2.addActionListener(loanButtonListener);
        button3.addActionListener(loanButtonListener);
        button4.addActionListener(loanButtonListener);
        button5.addActionListener(loanButtonListener);
        button6.addActionListener(loanButtonListener);
        
        
        
        



        // Make the window visible
        setVisible(true);
    }
}
