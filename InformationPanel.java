package classes;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class InformationPanel extends JPanel implements ActionListener {

    private static final int PANEL_WIDTH = 800;
    private static final int PANEL_HEIGHT = 350;
    private static final int ANIMATION_SPEED = 1;
    private static final int MESSAGE_DELAY = 3000;

    private String producerName;
    private String dateCreated;
    private int currentY;

    private Timer timer;
    private boolean messageDisplayed;

    static String names="";
    static String date="";
    static String numberPhone1="";
    static String numberPhone2="";
    static String email1="";
    static String email2="";

    public InformationPanel() {
        this.producerName = producerName;
        this.dateCreated = dateCreated;
        currentY = -480;

        setPreferredSize(new Dimension(PANEL_WIDTH, PANEL_HEIGHT));
        setBackground(Color.WHITE);

        setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));

        /// Create the image label and add it to the panel
        ImageIcon imageIcon = new ImageIcon("D:\\Bluetooth\\us.png");
        Image image = imageIcon.getImage().getScaledInstance(500, 200, Image.SCALE_SMOOTH);
        JLabel imageLabel = new JLabel(new ImageIcon(image));
        imageLabel.setAlignmentX(Component.CENTER_ALIGNMENT);
        add(imageLabel);


        // Add some vertical spacing between the image and the text
        add(Box.createRigidArea(new Dimension(0, 20)));

        timer = new Timer(ANIMATION_SPEED+20, this);
        timer.start();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (currentY >= 200) {
            currentY= -480;
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
        currentY +=ANIMATION_SPEED;
        repaint();
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.setFont(new Font("Arial", Font.BOLD, 32));
        g.setColor(Color.BLACK);
        g.drawString(names, 50, currentY + 240);
        g.drawString(date, 50, currentY + 290);
        g.drawString(numberPhone1, 50, currentY + 330);
        g.drawString(numberPhone2, 50, currentY + 370);
        g.drawString(email1, 50, currentY + 410);
        g.drawString(email2, 50, currentY + 450);
    }

}
