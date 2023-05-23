package classes;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.Random;

public class ChestWindow extends JFrame {
    private final JButton[] buttons;
    private final Random random;
    private boolean[] hasPrize;

    static String text1="";
    static String text2="";
    static String text3="";
    static String text4="";
    static String text5="";
    static String text6="";
    static String text7="";

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
                    int confirm = JOptionPane.showConfirmDialog(null, text1+text2+text3+text4);
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
                            if (Value.getPlayer()==1)Value.setMoney_Player1(Value.getMoney_Player1()+400);
                            else if (Value.getPlayer()==2)Value.setMoney_Player2(Value.getMoney_Player2()+400);
                            else if (Value.getPlayer()==3)Value.setMoney_Player3(Value.getMoney_Player3()+400);
                            else if (Value.getPlayer()==4)Value.setMoney_Player4(Value.getMoney_Player4()+400);
                            JOptionPane.showMessageDialog(null, text5);
                        } else {
                            if (Value.getPlayer()==1)Value.setMoney_Player1(Value.getMoney_Player1()-100);
                            else if (Value.getPlayer()==2)Value.setMoney_Player2(Value.getMoney_Player2()-100);
                            else if (Value.getPlayer()==3)Value.setMoney_Player3(Value.getMoney_Player3()-100);
                            else if (Value.getPlayer()==4)Value.setMoney_Player4(Value.getMoney_Player4()-100);
                            JOptionPane.showMessageDialog(null, text6);
                        }
                    }
                }
            });
            panel.add(buttons[i]);
        }

        // Add a close button
        JButton closeButton = new JButton(text7);
        closeButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                dispose();
            }
        });
        getContentPane().add(closeButton, BorderLayout.SOUTH);
    }
}
