package classes;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.Random;

public class ChestWindow extends JFrame {
    private final JButton[] buttons;
    private final Random random;
    private boolean[] hasPrize;

    public ChestWindow() {
        // Initialize the chest window
        super("Chest Window");
        setSize(800, 600);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setLocationRelativeTo(null);

        // Add some components to the window
        JPanel panel = new JPanel(new GridLayout(3, 3));
        getContentPane().add(panel);

        // Add nine buttons with images
        ImageIcon buttonIcon = new ImageIcon("D:\\Bluetooth\\chestchance.png");
        buttons = new JButton[9];
        random = new Random();
        hasPrize = new boolean[9];
        int prizeCount = 2; // Number of buttons with prize
        int index;

        // Randomly assign prize to buttons
        while (prizeCount > 0) {
            index = random.nextInt(9);
            if (!hasPrize[index]) {
                hasPrize[index] = true;
                prizeCount--;
            }
        }

        // Create buttons and add to panel
        for (int i = 0; i < buttons.length; i++) {
            buttons[i] = new JButton(buttonIcon);
            buttons[i].addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                    int confirm = JOptionPane.showConfirmDialog(null, "آیا میخواهید در این صندوق را باز کنید؟");
                    if (confirm == JOptionPane.YES_OPTION) {
                        JButton button = (JButton) e.getSource();
                        int index = -1;
                        for (int i = 0; i < buttons.length; i++) {
                            if (buttons[i] == button) {
                                index = i;
                                break;
                            }
                        }
                        if (hasPrize[index]) {
                            JOptionPane.showMessageDialog(null, "شما 100 سکه برنده شدید!");
                        } else {
                            JOptionPane.showMessageDialog(null, "ریدی.");
                        }
                    }
                }
            });
            panel.add(buttons[i]);
        }

        // Add a close button
        JButton closeButton = new JButton("Close");
        closeButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                dispose();
            }
        });
        getContentPane().add(closeButton, BorderLayout.SOUTH);
    }
}
