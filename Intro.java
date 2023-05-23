package classes;
import javazoom.jl.player.Player;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;

public class Intro {

    String quastion="آیا میخواهید از برنامه خارج شوید ؟";
    String input_Text="";

    String yes="بله";
    String no="خیر";
    static String new_music="";

    static String music_text="";
    static String title_setting="";
    String change_charText="";
    String char_text="";
    static String close_setting="";
    String language_text="";


    JFrame introFrame = new JFrame();
    JPanel introPanel;
    JPanel buttonsPanel;
    JButton startButton;
    JButton closeButton;
    JButton settingsButton;
    JButton infoButton;
    JButton loadButton;
    JDialog optionDialog;
    JButton newButton;
    JButton quitButton;
    JButton singleButton=new JButton("تک نفره");
    JButton twoButton=new JButton("دو نفره");
    JButton threeButton=new JButton("سه نفره");
    JButton fourButton=new JButton("چهار نفره");
    public Intro() {


        introFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        introFrame.setTitle("Welcome to the Game");
        introFrame.setBounds(-10, 0, 3000, 1028);

         introPanel = new JPanel(new BorderLayout()) {
            // Override the paintComponent method to paint the background image
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);
                ImageIcon backgroundImage = new ImageIcon("image\\salesman.png");
                g.drawImage(backgroundImage.getImage(), -770, -920, null);
            }
        };
        introPanel.setBorder(BorderFactory.createEmptyBorder(50, 90, 50, 150));
        introPanel.setLayout(new BorderLayout());

        buttonsPanel = new JPanel(new GridLayout(2, 2, 10, 10));
        buttonsPanel.setOpaque(false); // set the panel to be transparent

        startButton = new JButton("Start Game");
        startButton.setFocusPainted(false);
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
        ImageIcon loadingImage = new ImageIcon("image\\gif.gif");
        JLabel loadingLabel = new JLabel(loadingImage, SwingConstants.CENTER);
        loadingDialog.add(loadingLabel, BorderLayout.CENTER);

        loadButton=new JButton("بازی قبلی");
        optionDialog=new JDialog(introFrame,"گزینه ها",true);
        newButton=new JButton("بازی جدید");
        quitButton=new JButton("خروج");
        loadButton.setFont(new Font("serif",Font.BOLD,24));
        newButton.setFont(new Font("serif",Font.BOLD,24));
        quitButton.setFont(new Font("serif",Font.BOLD,24));



        startButton.addActionListener(e -> {
         JPanel optionsPanel=new JPanel(new GridLayout(3,1));
         optionsPanel.add(newButton);
         optionsPanel.add(loadButton);
         optionsPanel.add(quitButton);
         optionDialog.add(optionsPanel);

         optionDialog.setSize(300,200);
         optionDialog.setLocationRelativeTo(introFrame);
         optionDialog.setVisible(true);
        });

        // Add action listener to show the loading dialog and start the timer
        loadButton.addActionListener(e -> {
            SwingUtilities.invokeLater(() -> {
                loadingDialog.setVisible(true); // show the loading dialog on the EDT
                introFrame.dispose();
            });
            Timer timer = new Timer(5800, timerEvent -> {
                loadingDialog.setVisible(false); // hide the loading dialog
            });
            timer.setRepeats(false); // stop the timer after one execution
            timer.start();
            Value.setLoad(true);
            new Traveling_Salesman();
        });

        newButton.addActionListener(e -> {

            JDialog optionsDialog = new JDialog(introFrame, "گزینه ها", true);
            JPanel optionsPanel = new JPanel(new GridLayout(4, 1));

            // Create four buttons
            singleButton.setFont(new Font("serif",Font.BOLD,24));
            singleButton.setFocusPainted(false);
            singleButton.addActionListener(e1 -> {
                Value.setNumber_player(1);
                SwingUtilities.invokeLater(() -> {
                    loadingDialog.setVisible(true); // show the loading dialog on the EDT
                    introFrame.dispose();
                    Value.Start=true;
                });
                Timer timer = new Timer(5000, timerEvent -> {
                    loadingDialog.setVisible(false); // hide the loading dialog
                });
                timer.setRepeats(false); // stop the timer after one execution
                timer.start();
                new Traveling_Salesman(); // show the board game
            });
            singleButton.addMouseListener(new java.awt.event.MouseAdapter() {
                public void mouseEntered(java.awt.event.MouseEvent evt) {
                    singleButton.setBackground(Color.CYAN); // set the background color to yellow when the mouse enters
                }

                public void mouseExited(java.awt.event.MouseEvent evt) {
                    singleButton.setBackground(UIManager.getColor("control")); // set the background color to the default color when the mouse exits
                }
            });
            twoButton.setFont(new Font("serif",Font.BOLD,24));
            twoButton.setFocusPainted(false);
            twoButton.addActionListener(e2 -> {
                Value.setNumber_player(2);
                SwingUtilities.invokeLater(() -> {
                    loadingDialog.setVisible(true); // show the loading dialog on the EDT
                    introFrame.dispose();
                    Value.Start=true;
                });
                Timer timer = new Timer(5000, timerEvent -> {
                    loadingDialog.setVisible(false); // hide the loading dialog
                });
                timer.setRepeats(false); // stop the timer after one execution
                timer.start();
                new Traveling_Salesman(); // show the board game

            });
            twoButton.addMouseListener(new java.awt.event.MouseAdapter() {
                public void mouseEntered(java.awt.event.MouseEvent evt) {
                    twoButton.setBackground(Color.CYAN); // set the background color to yellow when the mouse enters
                }

                public void mouseExited(java.awt.event.MouseEvent evt) {
                    twoButton.setBackground(UIManager.getColor("control")); // set the background color to the default color when the mouse exits
                }
            });
            threeButton.setFont(new Font("serif",Font.BOLD,24));
            threeButton.setFocusPainted(false);
            threeButton.addActionListener(e3 -> {
                Value.setNumber_player(3);
                SwingUtilities.invokeLater(() -> {
                    loadingDialog.setVisible(true); // show the loading dialog on the EDT
                    introFrame.dispose();
                    Value.Start=true;
                });
                Timer timer = new Timer(5000, timerEvent -> {
                    loadingDialog.setVisible(false); // hide the loading dialog
                });
                timer.setRepeats(false); // stop the timer after one execution
                timer.start();
                new Traveling_Salesman(); // show the board game
            });
            threeButton.addMouseListener(new java.awt.event.MouseAdapter() {
                public void mouseEntered(java.awt.event.MouseEvent evt) {
                    threeButton.setBackground(Color.CYAN); // set the background color to yellow when the mouse enters
                }

                public void mouseExited(java.awt.event.MouseEvent evt) {
                    threeButton.setBackground(UIManager.getColor("control")); // set the background color to the default color when the mouse exits
                }
            });
            fourButton.setFont(new Font("serif",Font.BOLD,24));
            fourButton.setFocusPainted(false);
            fourButton.addActionListener(e4 -> {
                Value.setNumber_player(4);
                SwingUtilities.invokeLater(() -> {
                    loadingDialog.setVisible(true); // show the loading dialog on the EDT
                    introFrame.dispose();
                    Value.Start=true;
                });
                Timer timer = new Timer(5000, timerEvent -> {
                    loadingDialog.setVisible(false); // hide the loading dialog
                });
                timer.setRepeats(false); // stop the timer after one execution
                timer.start();
                new Traveling_Salesman(); // show the board game
            });
            fourButton.addMouseListener(new java.awt.event.MouseAdapter() {
                public void mouseEntered(java.awt.event.MouseEvent evt) {
                    fourButton.setBackground(Color.CYAN); // set the background color to yellow when the mouse enters
                }

                public void mouseExited(java.awt.event.MouseEvent evt) {
                    fourButton.setBackground(UIManager.getColor("control")); // set the background color to the default color when the mouse exits
                }
            });
            // Add the buttons to the panel
            optionsPanel.add(singleButton);
            optionsPanel.add(twoButton);
            optionsPanel.add(threeButton);
            optionsPanel.add(fourButton);

            // Add the panel to the dialog and show it
            optionsDialog.add(optionsPanel);
            optionsDialog.setSize(300, 200);
            optionsDialog.setLocationRelativeTo(introFrame);
            optionsDialog.setVisible(true);



        });




        quitButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                optionDialog.setVisible(false);
            }
        });


        newButton.setFocusPainted(false);
        loadButton.setFocusPainted(false);
        quitButton.setFocusPainted(false);
        newButton.setBackground(Color.GREEN);
        loadButton.setBackground(Color.WHITE);
        quitButton.setBackground(Color.RED);




        buttonsPanel.add(startButton);



        closeButton = new JButton("Close");
        closeButton.setPreferredSize(new Dimension(250, 70)); // set preferred size
        closeButton.setFont(new Font("Arial", Font.BOLD, 45)); // set font size
        closeButton.setFocusPainted(false);
        closeButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                closeButton.setBackground(new Color(206, 73, 54)); // set the background color to yellow when the mouse enters
            }

            public void mouseExited(java.awt.event.MouseEvent evt) {
                closeButton.setBackground(UIManager.getColor("control")); // set the background color to the default color when the mouse exits
            }
        });

        closeButton.addActionListener(e -> {
            JDialog confirmDialog = new JDialog(introFrame, "Confirmation", true);
            confirmDialog.setLayout(new BorderLayout());
            JLabel confirmLabel = new JLabel(quastion);
            confirmLabel.setFont(new Font("Arial", Font.BOLD, 24));
            confirmLabel.setBorder(BorderFactory.createEmptyBorder(20, 20, 20, 20));
            confirmDialog.add(confirmLabel, BorderLayout.CENTER);

            JPanel confirmButtonPanel = new JPanel(new GridLayout(1, 2, 10, 10));
            confirmButtonPanel.setBorder(BorderFactory.createEmptyBorder(20, 20, 20, 20));

            JButton yesButton = new JButton(yes);
            yesButton.setPreferredSize(new Dimension(120, 50));
            yesButton.setFont(new Font("Arial", Font.BOLD, 20));
            yesButton.addActionListener(yesEvent -> {
                introFrame.dispose();
                confirmDialog.dispose();
                System.exit(0);
            });
            confirmButtonPanel.add(yesButton);

            JButton noButton = new JButton(no);
            noButton.setPreferredSize(new Dimension(120, 50));
            noButton.setFont(new Font("Arial", Font.BOLD, 20));
            noButton.addActionListener(noEvent -> confirmDialog.dispose());
            confirmButtonPanel.add(noButton);

            confirmDialog.add(confirmButtonPanel, BorderLayout.PAGE_END);

            confirmDialog.pack();
            confirmDialog.setLocationRelativeTo(introFrame);
            confirmDialog.setVisible(true);
            yesButton.setFocusPainted(false);
            noButton.setFocusPainted(false);
        });
        buttonsPanel.add(closeButton);

        infoButton = new JButton("Information");
        infoButton.setPreferredSize(new Dimension(250, 70)); // set preferred size
        infoButton.setFont(new Font("Arial", Font.BOLD, 45)); // set font size
        infoButton.setFocusPainted(false);

        infoButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                infoButton.setBackground(new Color(206, 73, 54)); // set the background color to yellow when the mouse enters
            }

            public void mouseExited(java.awt.event.MouseEvent evt) {
                infoButton.setBackground(UIManager.getColor("control")); // set the background color to the default color when the mouse exits
            }
        });






        settingsButton = new JButton("Setting");
        settingsButton.setPreferredSize(new Dimension(250, 70)); // set preferred size
        settingsButton.setFont(new Font("Arial", Font.BOLD, 45)); // set font size
        settingsButton.setFocusPainted(false);
        settingsButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                settingsButton.setBackground(new Color(206, 73, 54)); // set the background color to yellow when the mouse enters
            }

            public void mouseExited(java.awt.event.MouseEvent evt) {
                settingsButton.setBackground(UIManager.getColor("control")); // set the background color to the default color when the mouse exits
            }
        });

        settingsButton.addActionListener(e -> {
            // Create the new window
            JDialog settingsDialog = new JDialog(introFrame, title_setting, true);
            JPanel settingsPanel = new JPanel(new GridLayout(4, 1));

            // Create the four buttons
            JButton musicButton = new JButton(music_text);
            JButton themeButton = new JButton(char_text);
            themeButton.addActionListener(event -> {
                // Create the new window
                JDialog themeDialog = new JDialog(introFrame, change_charText, true);
                JPanel themePanel = new JPanel(new GridLayout(4, 2));

                // Create the eight buttons to show the different themes
                JButton themeButton1 = new JButton();
                themeButton1.setIcon(new ImageIcon("image\\m1.png"));
                JButton themeButton2 = new JButton();
                themeButton2.setIcon(new ImageIcon("image\\m2.png"));
                JButton themeButton3 = new JButton();
                themeButton3.setIcon(new ImageIcon("image\\m3.png"));
                JButton themeButton4 = new JButton();
                themeButton4.setIcon(new ImageIcon("image\\m4.png"));
                JButton themeButton5 = new JButton();
                themeButton5.setIcon(new ImageIcon("image\\m5.png"));
                JButton themeButton6 = new JButton();
                themeButton6.setIcon(new ImageIcon("image\\m6.png"));


                // Add action listeners to each theme button
                themeButton1.addActionListener(e1 -> {
                    // Perform action for theme 1 button
                    themeButton1.setBorder(BorderFactory.createLineBorder(Color.red, 6));
                    themeButton2.setBorder(BorderFactory.createLineBorder(Color.black, 2));
                    themeButton3.setBorder(BorderFactory.createLineBorder(Color.black, 2));
                    themeButton4.setBorder(BorderFactory.createLineBorder(Color.black, 2));
                    themeButton5.setBorder(BorderFactory.createLineBorder(Color.black, 2));
                    themeButton6.setBorder(BorderFactory.createLineBorder(Color.black, 2));
                    Value.setCharacter(1);
                });
                themeButton2.addActionListener(e2 -> {
                    // Perform action for theme 2 button
                    themeButton1.setBorder(BorderFactory.createLineBorder(Color.black, 2));
                    themeButton2.setBorder(BorderFactory.createLineBorder(Color.red, 6));
                    themeButton3.setBorder(BorderFactory.createLineBorder(Color.black, 2));
                    themeButton4.setBorder(BorderFactory.createLineBorder(Color.black, 2));
                    themeButton5.setBorder(BorderFactory.createLineBorder(Color.black, 2));
                    themeButton6.setBorder(BorderFactory.createLineBorder(Color.black, 2));
                    Value.setCharacter(2);
                });
                themeButton3.addActionListener(e3 -> {
                    // Perform action for theme 3 button
                    themeButton1.setBorder(BorderFactory.createLineBorder(Color.black, 2));
                    themeButton2.setBorder(BorderFactory.createLineBorder(Color.black, 2));
                    themeButton3.setBorder(BorderFactory.createLineBorder(Color.red, 6));
                    themeButton4.setBorder(BorderFactory.createLineBorder(Color.black, 2));
                    themeButton5.setBorder(BorderFactory.createLineBorder(Color.black, 2));
                    themeButton6.setBorder(BorderFactory.createLineBorder(Color.black, 2));
                    Value.setCharacter(3);
                });
                themeButton4.addActionListener(e4 -> {
                    // Perform action for theme 4 button
                    themeButton1.setBorder(BorderFactory.createLineBorder(Color.black, 2));
                    themeButton2.setBorder(BorderFactory.createLineBorder(Color.black, 2));
                    themeButton3.setBorder(BorderFactory.createLineBorder(Color.black, 2));
                    themeButton4.setBorder(BorderFactory.createLineBorder(Color.red, 6));
                    themeButton5.setBorder(BorderFactory.createLineBorder(Color.black, 2));
                    themeButton6.setBorder(BorderFactory.createLineBorder(Color.black, 2));
                    Value.setCharacter(4);
                });
                themeButton5.addActionListener(e5 -> {
                    // Perform action for theme 5 button
                    themeButton1.setBorder(BorderFactory.createLineBorder(Color.black, 2));
                    themeButton2.setBorder(BorderFactory.createLineBorder(Color.black, 2));
                    themeButton3.setBorder(BorderFactory.createLineBorder(Color.black, 2));
                    themeButton4.setBorder(BorderFactory.createLineBorder(Color.black, 2));
                    themeButton5.setBorder(BorderFactory.createLineBorder(Color.red, 6));
                    themeButton6.setBorder(BorderFactory.createLineBorder(Color.black, 2));
                    Value.setCharacter(5);
                });
                themeButton6.addActionListener(e6 -> {
                    // Perform action for theme 6 button
                    themeButton1.setBorder(BorderFactory.createLineBorder(Color.black, 2));
                    themeButton2.setBorder(BorderFactory.createLineBorder(Color.black, 2));
                    themeButton3.setBorder(BorderFactory.createLineBorder(Color.black, 2));
                    themeButton4.setBorder(BorderFactory.createLineBorder(Color.black, 2));
                    themeButton5.setBorder(BorderFactory.createLineBorder(Color.black, 2));
                    themeButton6.setBorder(BorderFactory.createLineBorder(Color.red, 6));
                    Value.setCharacter(6);
                });

                // Create the close button for the theme dialog
                JButton themeCloseButton = new JButton(close_setting);
                themeCloseButton.addActionListener(event1 -> {
                    themeDialog.dispose(); // close the dialog
                });

                // Add the theme buttons and close button to the panel
                themePanel.add(themeButton1);
                themePanel.add(themeButton2);
                themePanel.add(themeButton3);
                themePanel.add(themeButton4);
                themePanel.add(themeButton5);
                themePanel.add(themeButton6);
                themePanel.add(themeCloseButton);

                // Add the panel to the dialog and show it
                themeDialog.add(themePanel);
                themeDialog.setSize(400, 300);
                themeDialog.setLocationRelativeTo(introFrame);
                themeDialog.setVisible(true);
            });





            JButton languageButton = new JButton(language_text);
            JButton closeButton2 = new JButton(close_setting);

            // Add action listeners to each button
            musicButton.addActionListener(event -> {
                // Perform action for music button
                new_music = JOptionPane.showInputDialog(input_Text);
                File music=new File(new_music);
                if (new_music.contains("mp3") && music.isFile()) {
                    Value.change_music = true;
                }

            });
            themeButton.addActionListener(event -> {

            });
            languageButton.addActionListener(event -> {
                JDialog settingsDialog2 = new JDialog((Frame) null, Intro.title_setting, true);
                JPanel settingsPanel2 = new JPanel(new GridLayout(3, 1));


                JButton persianButton = new JButton();
                JButton englishButton = new JButton();
                JButton closeButton3 = new JButton(close_setting);


                String persian="";
                if (Value.language==1)persian="فارسی";
                else persian="Persian";
                persianButton.setText(persian);
                String english="";
                if (Value.language==1)english="انگلیسی";
                else if (Value.language==2)english="English";
                englishButton.setText(english);

                if (Value.language==1)persianButton.setBackground(Color.CYAN);
                else englishButton.setBackground(Color.CYAN);

                // Add action listeners to each button
                persianButton.addActionListener(event2 -> {
                    Value.language=1;
                   Value.change_language=true;
                   persianButton.setBackground(Color.CYAN);
                   englishButton.setBackground(null);
                    String persian2="";
                    if (Value.language==1)persian2="فارسی";
                    else persian2="Persian";
                    persianButton.setText(persian2);
                    String english2="";
                    if (Value.language==1)english2="انگلیسی";
                    else if (Value.language==2)english2="English";
                    englishButton.setText(english2);
                    settingsDialog.setTitle(title_setting);
                    musicButton.setText(music_text);
                    themeButton.setText(char_text);
                    languageButton.setText(language_text);
                    closeButton2.setText(close_setting);
                    closeButton3.setText(close_setting);
                });
                englishButton.addActionListener(event2 -> {
                   Value.language=2;
                   Value.change_language=true;
                   englishButton.setBackground(Color.CYAN);
                   persianButton.setBackground(null);
                    String persian2="";
                    if (Value.language==1)persian2="فارسی";
                    else persian2="Persian";
                    persianButton.setText(persian2);
                    String english2="";
                    if (Value.language==1)english2="انگلیسی";
                    else if (Value.language==2)english2="English";
                    englishButton.setText(english2);
                    settingsDialog.setTitle(title_setting);
                    musicButton.setText(music_text);
                    themeButton.setText(char_text);
                    languageButton.setText(language_text);
                    closeButton2.setText(close_setting);
                    closeButton3.setText(close_setting);
                });
                closeButton3.addActionListener(event2 -> {
                    settingsDialog2.dispose();
                });
                closeButton3.addMouseListener(new java.awt.event.MouseAdapter() {
                    public void mouseEntered(java.awt.event.MouseEvent evt) {
                        closeButton3.setBackground(Color.red); // set the background color to yellow when the mouse enters
                    }

                    public void mouseExited(java.awt.event.MouseEvent evt) {
                        closeButton3.setBackground(UIManager.getColor("control")); // set the background color to the default color when the mouse exits
                    }
                });



                // Add the buttons to the panel
                settingsPanel2.add(persianButton);
                settingsPanel2.add(englishButton);
                settingsPanel2.add(closeButton3);

                persianButton.setFocusPainted(false);
                englishButton.setFocusPainted(false);
                closeButton3.setFocusPainted(false);

                persianButton.setFont(new Font("serif",Font.BOLD,24));
                englishButton.setFont(new Font("serif",Font.BOLD,24));
                closeButton3.setFont(new Font("serif",Font.BOLD,24));

                settingsDialog2.add(settingsPanel2);
                settingsDialog2.setSize(300, 200);
                settingsDialog2.setLocationRelativeTo(null);
                settingsDialog2.setVisible(true);

            });

            closeButton2.addActionListener(event -> {
                settingsDialog.dispose();
            });

            // Add the buttons to the panel
            settingsPanel.add(musicButton);
            settingsPanel.add(themeButton);
            settingsPanel.add(languageButton);
            settingsPanel.add(closeButton2);

            musicButton.setFocusPainted(false);
            themeButton.setFocusPainted(false);
            languageButton.setFocusPainted(false);
            closeButton2.setFocusPainted(false);

            musicButton.setFont(new Font("serif",Font.BOLD,24));
            themeButton.setFont(new Font("serif",Font.BOLD,24));
            languageButton.setFont(new Font("serif",Font.BOLD,24));
            closeButton2.setFont(new Font("serif",Font.BOLD,24));

            musicButton.addMouseListener(new java.awt.event.MouseAdapter() {
                public void mouseEntered(java.awt.event.MouseEvent evt) {
                    musicButton.setBackground(Color.green); // set the background color to yellow when the mouse enters
                }

                public void mouseExited(java.awt.event.MouseEvent evt) {
                    musicButton.setBackground(UIManager.getColor("control")); // set the background color to the default color when the mouse exits
                }
            });
            themeButton.addMouseListener(new java.awt.event.MouseAdapter() {
                public void mouseEntered(java.awt.event.MouseEvent evt) {
                    themeButton.setBackground(Color.green); // set the background color to yellow when the mouse enters
                }

                public void mouseExited(java.awt.event.MouseEvent evt) {
                    themeButton.setBackground(UIManager.getColor("control")); // set the background color to the default color when the mouse exits
                }
            });
            languageButton.addMouseListener(new java.awt.event.MouseAdapter() {
                public void mouseEntered(java.awt.event.MouseEvent evt) {
                    languageButton.setBackground(Color.green); // set the background color to yellow when the mouse enters
                }

                public void mouseExited(java.awt.event.MouseEvent evt) {
                    languageButton.setBackground(UIManager.getColor("control")); // set the background color to the default color when the mouse exits
                }
            });
            closeButton2.addMouseListener(new java.awt.event.MouseAdapter() {
                public void mouseEntered(java.awt.event.MouseEvent evt) {
                    closeButton2.setBackground(Color.red); // set the background color to yellow when the mouse enters
                }

                public void mouseExited(java.awt.event.MouseEvent evt) {
                    closeButton2.setBackground(UIManager.getColor("control")); // set the background color to the default color when the mouse exits
                }
            });

            // Add the panel to the dialog and show it
            settingsDialog.add(settingsPanel);
            settingsDialog.setSize(300, 200);
            settingsDialog.setLocationRelativeTo(introFrame);
            settingsDialog.setVisible(true);
        });






        buttonsPanel.add(settingsButton);

        infoButton.addActionListener(e -> {
            InformationPanel infoPanel = new InformationPanel();
            JOptionPane.showMessageDialog(introFrame, infoPanel);
        });
        buttonsPanel.add(infoButton);

        introPanel.add(buttonsPanel, BorderLayout.PAGE_END);

        introFrame.add(introPanel);
        introFrame.setVisible(true);






    }
}
