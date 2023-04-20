package classes;
import javazoom.jl.player.Player;

import javax.swing.*;
import java.awt.*;

public class Intro {
    public Intro() {
        JFrame introFrame = new JFrame();
        introFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        introFrame.setTitle("Welcome to the Board Game");
        introFrame.setBounds(-10, 0, 3000, 1028);

        JPanel introPanel = new JPanel(new BorderLayout()) {
            // Override the paintComponent method to paint the background image
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);
                ImageIcon backgroundImage = new ImageIcon("D:\\Bluetooth\\salesman.png");
                g.drawImage(backgroundImage.getImage(), -770, -920, null);
            }
        };
        introPanel.setBorder(BorderFactory.createEmptyBorder(50, 90, 50, 150));
        introPanel.setLayout(new BorderLayout());

        JPanel buttonsPanel = new JPanel(new GridLayout(2, 2, 10, 10));
        buttonsPanel.setOpaque(false); // set the panel to be transparent

        JButton startButton = new JButton("شروع بازی");
        startButton.setPreferredSize(new Dimension(250, 70)); // set preferred size
        startButton.setFont(new Font("Arial", Font.BOLD, 45)); // set font size

        startButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                startButton.setBackground(new Color(206, 73, 54)); // set the background color to yellow when the mouse enters
            }

            public void mouseExited(java.awt.event.MouseEvent evt) {
                startButton.setBackground(UIManager.getColor("control")); // set the background color to the default color when the mouse exits
            }
        });

        // Create a dialog for the loading animation
        JDialog loadingDialog = new JDialog(introFrame, "Loading...", true);
        loadingDialog.setUndecorated(true); // remove window decorations
        loadingDialog.setSize(Toolkit.getDefaultToolkit().getScreenSize()); // set size to screen size
        loadingDialog.setLocationRelativeTo(null); // center the dialog
        loadingDialog.setLayout(new BorderLayout());
        ImageIcon loadingImage = new ImageIcon("D:\\Bluetooth\\gif.gif");
        JLabel loadingLabel = new JLabel(loadingImage, SwingConstants.CENTER);
        loadingDialog.add(loadingLabel, BorderLayout.CENTER);

        // Add action listener to show the loading dialog and start the timer
        startButton.addActionListener(e -> {
            SwingUtilities.invokeLater(() -> {
                loadingDialog.setVisible(true); // show the loading dialog on the EDT
                introFrame.dispose();
                Value.Start=true;
            });
            Timer timer = new Timer(5000, timerEvent -> {
                loadingDialog.setVisible(false); // hide the loading dialog
                new Traveling_Salesman(); // show the board game
            });
            timer.setRepeats(false); // stop the timer after one execution
            timer.start();
        });
        buttonsPanel.add(startButton);

        JButton settingsButton = new JButton("تنظیمات");
        settingsButton.setPreferredSize(new Dimension(250, 70)); // set preferred size
        settingsButton.setFont(new Font("Arial", Font.BOLD, 45)); // set font size

        settingsButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                settingsButton.setBackground(new Color(206, 73, 54)); // set the background color to yellow when the mouse enters
            }

            public void mouseExited(java.awt.event.MouseEvent evt) {
                settingsButton.setBackground(UIManager.getColor("control")); // set the background color to the default color when the mouse exits
            }
        });

        settingsButton.addActionListener(e -> new Settings());
        buttonsPanel.add(settingsButton);

        JButton closeButton = new JButton("خروج");
        closeButton.setPreferredSize(new Dimension(250, 70)); // set preferred size
        closeButton.setFont(new Font("Arial", Font.BOLD, 45)); // set font size
        closeButton.addActionListener(e -> {
            JDialog confirmDialog = new JDialog(introFrame, "Confirmation", true);
            confirmDialog.setLayout(new BorderLayout());
            JLabel confirmLabel = new JLabel("آیا میخواهید از برنامه خارج شوید ؟");
            confirmLabel.setFont(new Font("Arial", Font.BOLD, 24));
            confirmLabel.setBorder(BorderFactory.createEmptyBorder(20, 20, 20, 20));
            confirmDialog.add(confirmLabel, BorderLayout.CENTER);

            JPanel confirmButtonPanel = new JPanel(new GridLayout(1, 2, 10, 10));
            confirmButtonPanel.setBorder(BorderFactory.createEmptyBorder(20, 20, 20, 20));

            JButton yesButton = new JButton("بله");
            yesButton.setPreferredSize(new Dimension(120, 50));
            yesButton.setFont(new Font("Arial", Font.BOLD, 20));
            yesButton.addActionListener(yesEvent -> {
                introFrame.dispose();
                confirmDialog.dispose();
                System.exit(0);
            });
            confirmButtonPanel.add(yesButton);

            JButton noButton = new JButton("خیر");
            noButton.setPreferredSize(new Dimension(120, 50));
            noButton.setFont(new Font("Arial", Font.BOLD, 20));
            noButton.addActionListener(noEvent -> confirmDialog.dispose());
            confirmButtonPanel.add(noButton);

            confirmDialog.add(confirmButtonPanel, BorderLayout.PAGE_END);

            confirmDialog.pack();
            confirmDialog.setLocationRelativeTo(introFrame);
            confirmDialog.setVisible(true);
        });
        buttonsPanel.add(closeButton);

        JButton infoButton = new JButton("اطلاعات");
        infoButton.setPreferredSize(new Dimension(250, 70)); // set preferred size
        infoButton.setFont(new Font("Arial", Font.BOLD, 45)); // set font size

        infoButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                infoButton.setBackground(new Color(206, 73, 54)); // set the background color to yellow when the mouse enters
            }

            public void mouseExited(java.awt.event.MouseEvent evt) {
                infoButton.setBackground(UIManager.getColor("control")); // set the background color to the default color when the mouse exits
            }
        });

        infoButton.addActionListener(e -> {
            InformationPanel infoPanel = new InformationPanel("ساسان نیک جو و سینا افضلی", "1402/01/13");
            JOptionPane.showMessageDialog(introFrame, infoPanel);
        });
        buttonsPanel.add(infoButton);

        introPanel.add(buttonsPanel, BorderLayout.PAGE_END);

        introFrame.add(introPanel);
        introFrame.setVisible(true);
    }
}
