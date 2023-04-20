package classes;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Settings {
    private JFrame settingsFrame;

    public Settings() {
        settingsFrame = new JFrame();
        settingsFrame.setTitle("Settings");
        settingsFrame.setBounds(735, 300, 400, 300);
        settingsFrame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

        JPanel settingsPanel = new JPanel(new BorderLayout());
        settingsPanel.setBorder(BorderFactory.createEmptyBorder(20, 20, 20, 20));

        JLabel settingsLabel = new JLabel("Settings");
        settingsLabel.setFont(new Font("Arial", Font.BOLD, 20));
        settingsPanel.add(settingsLabel, BorderLayout.NORTH);

        JButton closeButton = new JButton("Close");
        closeButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                settingsFrame.dispose();
            }
        });
        settingsPanel.add(closeButton, BorderLayout.SOUTH);

        settingsFrame.add(settingsPanel);
        settingsFrame.setVisible(true);
    }
}


