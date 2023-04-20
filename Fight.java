package classes;
import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Fight extends JFrame {

    private JPanel contentPane;
    private JLabel player1Label, player2Label, resultLabel;
    private JTextField player1Field, player2Field;
    private JButton fightButton, closeButton;

    private JLabel player1NewPowerLabel, player2NewPowerLabel;

    public Fight() {
        setTitle("Fight Window");
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setBounds(100, 100, 400, 250);
        contentPane = new JPanel();
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        setContentPane(contentPane);
        contentPane.setLayout(null);

        player1Label = new JLabel("بازیکن 1");
        player1Label.setBounds(10, 25, 100, 20);
        contentPane.add(player1Label);

        player1Field = new JTextField();
        player1Field.setBounds(120, 25, 100, 20);
        contentPane.add(player1Field);

        player2Label = new JLabel("بازیکن 2");
        player2Label.setBounds(10, 60, 100, 20);
        contentPane.add(player2Label);

        player2Field = new JTextField();
        player2Field.setBounds(120, 60, 100, 20);
        contentPane.add(player2Field);

        fightButton = new JButton("بجنگید");
        fightButton.setBounds(10, 100, 100, 30);
        contentPane.add(fightButton);

        resultLabel = new JLabel();
        resultLabel.setBounds(10, 150, 200, 20);
        contentPane.add(resultLabel);

        closeButton = new JButton("خروج");
        closeButton.setBounds(120, 100, 100, 30);
        contentPane.add(closeButton);

        // add action listener to the fight button
        fightButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // disable the fight button and text fields during the animation
                fightButton.setEnabled(false);
                player1Field.setEnabled(false);
                player2Field.setEnabled(false);

                // add the following code to show the GIF
                JLabel gifLabel = new JLabel(new ImageIcon("loading.gif"));
                gifLabel.setBounds(230, 10, 150, 150);
                contentPane.add(gifLabel);

                // start the timer to update the result label every 1000 milliseconds for 7 seconds
                Timer timer = new Timer(1000, new ActionListener() {
                    int count = 7;

                    @Override
                    public void actionPerformed(ActionEvent e) {
                        if (count == 0) {
                            // stop the timer and enable the fight button and text fields
                            ((Timer) e.getSource()).stop();
                            fightButton.setEnabled(true);
                            //player1Field.setEnabled(true);
                            //player2Field.setEnabled(true);

                            // show the final result
                            int player1Power = Integer.parseInt(player1Field.getText());
                            int player2Power = Integer.parseInt(player2Field.getText());

                            // add the following code after resultLabel initialization
                            player1NewPowerLabel = new JLabel();
                            player1NewPowerLabel.setBounds(10, 180, 200, 20);
                            contentPane.add(player1NewPowerLabel);

                            player2NewPowerLabel = new JLabel();
                            player2NewPowerLabel.setBounds(150, 180, 200, 20);
                            contentPane.add(player2NewPowerLabel);


                            if (player1Power > player2Power) {
                                // update player 1 label
                                player1NewPowerLabel.setText("قدرت جدید بازیکن 1: " + (player1Power - player2Power));
                                // update player 2 label
                                player2NewPowerLabel.setText("قدرت جدید بازیکن 2: 0");
                            } else if (player2Power > player1Power) {
                                // update player 1 label
                                player1NewPowerLabel.setText("قدرت جدید بازیکن 1: 0");
                                // update player 2 label
                                player2NewPowerLabel.setText("قدرت جدید بازیکن 2: " + (player2Power - player1Power));
                            } else {
                                // update both labels
                                player1NewPowerLabel.setText("قدرت جدید بازیکن 1: 0");
                                player2NewPowerLabel.setText("قدرت جدید بازیکن 2: 0");
                            }
                        } else {
                            // show the countdown message
                            resultLabel.setText("نبر خاتمه پیدا خواهد کرد در " + count + " ثانیه...");
                            count--;
                        }
                    }
                });
                timer.start();
            }
        });

        // add action listener to the close button
        closeButton.addActionListener(e -> dispose());

        setVisible(true);
    }
}
