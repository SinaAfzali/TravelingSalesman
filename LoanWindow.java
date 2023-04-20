package classes;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class LoanWindow extends JFrame {

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
        JButton button2 = new JButton("500");
        JButton button3 = new JButton("1000");
        JButton button4 = new JButton("5000");
        JButton button5 = new JButton("10000");
        JButton button6 = new JButton("50000");

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
        JButton closeButton = new JButton("خروج");
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



        // Add a confirmation dialog when the user clicks on a loan budget button
        ActionListener loanButtonListener = new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                JButton sourceButton = (JButton) e.getSource();
                int loanAmount = Integer.parseInt(sourceButton.getText());
                int confirmation = JOptionPane.showConfirmDialog(null, "آیا اطمینان دارید که مبلغ" + loanAmount + "را به عنوان وام بپذیرید ؟");
                if (confirmation == JOptionPane.YES_OPTION) {
                    System.out.println("Loan confirmed");
                    // Update payment label when the user confirms the loan
                    double amountToBePaidBack = loanAmount * 1.2; // assuming a 10% interest rate
                    paymentLabel.setText("شما باید مبلغ" + amountToBePaidBack + " پس بدهید");
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
