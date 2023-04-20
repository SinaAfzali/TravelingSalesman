package classes;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;

public class Wallet {
    private JFrame bagFrame;
    private JPanel bagPanel;
    private JTable bagTable;
    private DefaultTableModel bagTableModel;

    public Wallet() {
        bagFrame = new JFrame("Wallet");
        bagFrame.setBounds(750, 0, 400, 400);
        bagFrame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

        bagPanel = new JPanel(new BorderLayout()) {
            // Override the paintComponent method to add a background image
            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);
                ImageIcon bgImage = new ImageIcon(getClass().getResource(""));
                g.drawImage(bgImage.getImage(), 0, 0, getWidth(), getHeight(), null);
            }
        };

        // Create table with columns for item name, power, score, and money
        bagTableModel = new DefaultTableModel(new Object[][]{}, new String[]{"اشیا", "قدرت", "امتیاز", "پول"});
        bagTable = new JTable(bagTableModel);
        JScrollPane scrollPane = new JScrollPane(bagTable);

        bagPanel.add(scrollPane, BorderLayout.CENTER);

        // Create close button
        JButton closeButton = new JButton("خروج");
        closeButton.addActionListener(e -> bagFrame.dispose());
        bagPanel.add(closeButton, BorderLayout.SOUTH);

        bagFrame.add(bagPanel);
        bagFrame.setVisible(true);
    }

    public void addItem(String itemName, int power, int score, int money) {
        bagTableModel.addRow(new Object[]{itemName, power, score, money});
    }
}
