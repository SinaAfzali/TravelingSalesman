package classes;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class InformationPanel extends JPanel implements ActionListener {

    private static final int PANEL_WIDTH = 400;
    private static final int PANEL_HEIGHT = 300;
    private static final int ANIMATION_SPEED = 10;
    private static final int MESSAGE_DELAY = 3000;

    private String producerName;
    private String dateCreated;
    private int currentY;

    private Timer timer;
    private boolean messageDisplayed;

    public InformationPanel(String producerName, String dateCreated) {
        this.producerName = producerName;
        this.dateCreated = dateCreated;
        currentY = -PANEL_HEIGHT;

        setPreferredSize(new Dimension(PANEL_WIDTH, PANEL_HEIGHT));
        setBackground(Color.WHITE);

        setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));

        // Create the image label and add it to the panel
        ImageIcon imageIcon = new ImageIcon("path/to/image.png");
        JLabel imageLabel = new JLabel(imageIcon);
        imageLabel.setAlignmentX(Component.CENTER_ALIGNMENT);
        add(imageLabel);

        // Add some vertical spacing between the image and the text
        add(Box.createRigidArea(new Dimension(0, 20)));

        timer = new Timer(ANIMATION_SPEED, this);
        timer.start();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (currentY >= 0) {
            if (!messageDisplayed) {
                messageDisplayed = true;
                Timer messageTimer = new Timer(MESSAGE_DELAY, new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        messageDisplayed = false;
                    }
                });
                messageTimer.setRepeats(false);
                messageTimer.start();
            }
            return;
        }
        currentY += ANIMATION_SPEED;
        repaint();
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.setFont(new Font("Arial", Font.BOLD, 20));
        g.setColor(Color.BLACK);
        g.drawString("سازنده بازی : " + producerName, 50, currentY + 200);
        g.drawString("ساخته شده در تاریخ  " + dateCreated, 50, currentY + 250);
    }
}
