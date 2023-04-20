package classes;
import javax.swing.*;
import java.awt.*;

public class LoadingScreen extends JFrame {

    private static final int WIDTH = 400;
    private static final int HEIGHT = 300;

    private final JProgressBar progressBar;
    private final JLabel progressLabel;

    public LoadingScreen() {
        // Create a new progress bar and set its properties
        progressBar = new JProgressBar(0, 100);
        progressBar.setValue(0);
        progressBar.setStringPainted(true);

        // Create a new label to show the progress percentage
        progressLabel = new JLabel("0%", SwingConstants.CENTER);
        progressLabel.setFont(new Font("Arial", Font.PLAIN, 30));

        // Create a new panel and add the progress bar and label to it
        JPanel panel = new JPanel();
        panel.setLayout(new BoxLayout(panel, BoxLayout.PAGE_AXIS));
        panel.add(Box.createRigidArea(new Dimension(0, 100)));
        panel.add(new JLabel(new ImageIcon("D:\\Bluetooth\\gif.gif")));
        panel.add(Box.createRigidArea(new Dimension(0, 50)));
        panel.add(progressBar);
        panel.add(Box.createRigidArea(new Dimension(0, 50)));
        panel.add(progressLabel);
        panel.add(Box.createRigidArea(new Dimension(0, 50)));

        // Set the properties of the loading screen
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setExtendedState(JFrame.MAXIMIZED_BOTH); // set full screen
        setUndecorated(true);
        setContentPane(new JLabel(new ImageIcon("D:\\Bluetooth\\beforeintro.png"))); // add background image to content pane

        // Add the panel with the progress bar and label to the content pane
        getContentPane().add(panel, BorderLayout.CENTER);

        // Set the loading screen to be visible
        setVisible(true);
    }

    // Update the progress bar value and label text
    public void updateProgress(int value) {
        progressBar.setValue(value);
        progressLabel.setText(value + "%");
    }
}
