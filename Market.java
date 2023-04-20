package classes;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class Market extends JFrame {
    private final JRadioButton buyButton;

    public Market() {
        setTitle("Market");
        setSize(800, 600);
        setLocationRelativeTo(null); // center the window on screen

        // Create a JLabel with the background image
        ImageIcon backgroundImage = new ImageIcon("D:\\Bluetooth\\shop2.png");
        JLabel background = new JLabel(backgroundImage);
        background.setLayout(new BorderLayout());

        // Add margin to the panel
        JPanel panel = new JPanel(new GridLayout(6, 2, 10, 10));
        panel.setBorder(BorderFactory.createEmptyBorder(20, 20, 20, 20)); // add margin around the panel
        background.add(panel, BorderLayout.CENTER);

        // Add buy/sell radio buttons
        ButtonGroup buySellGroup = new ButtonGroup();
        buyButton = new JRadioButton("خرید", true);
        JRadioButton sellButton = new JRadioButton("فروش", false);
        buySellGroup.add(buyButton);
        buySellGroup.add(sellButton);
        JPanel buySellPanel = new JPanel();
        buySellPanel.add(buyButton);
        buySellPanel.add(sellButton);
        background.add(buySellPanel, BorderLayout.NORTH);

        // Add shield button with image
        ImageIcon shieldIcon = new ImageIcon("D:\\Bluetooth\\shield.png");
        JButton shieldButton = new JButton(shieldIcon);
        shieldButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                // Ask for confirmation before proceeding
                int confirmation = JOptionPane.showConfirmDialog(null, "آیا میخواهید یک سپر بخرید/بفروشید؟\n"+"قیمت خرید:160   قیمت فروش:120", "Confirmation", JOptionPane.YES_NO_OPTION);
                if (confirmation == JOptionPane.YES_OPTION) {
                    String action = buyButton.isSelected() ? "خریدید" : "فروختید";
                    String item = "سپر ";
                    // Add code for buying/selling shield based on the selected action
                    String message = "شما با موفقیت "+ "یک " + item + action  + ".";
                    JOptionPane.showMessageDialog(null, message);

                    if (Value.getPlayer()==1) {
                        if (action == "خریدید") Value.setMoney_Player1(Value.getMoney_Player1() - 160);
                        if (action == "فروختید") Value.setMoney_Player1(Value.getMoney_Player1() + 120);
                    }
                    if (Value.getPlayer()==2) {
                        if (action == "خریدید") Value.setMoney_Player2(Value.getMoney_Player2() - 160);
                        if (action == "فروختید") Value.setMoney_Player2(Value.getMoney_Player2() + 120);
                    }
                    if (Value.getPlayer()==3) {
                        if (action == "خریدید") Value.setMoney_Player3(Value.getMoney_Player3() - 160);
                        if (action == "فروختید") Value.setMoney_Player3(Value.getMoney_Player3() + 120);
                    }
                    if (Value.getPlayer()==4) {
                        if (action == "خریدید") Value.setMoney_Player4(Value.getMoney_Player4() - 160);
                        if (action == "فروختید") Value.setMoney_Player4(Value.getMoney_Player4() + 120);
                    }

                }
            }
        });
        panel.add(shieldButton);

        // Add sword button with image
        ImageIcon swordIcon = new ImageIcon("D:\\Bluetooth\\sword.png");
        JButton swordButton = new JButton(swordIcon);
        swordButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                // Ask for confirmation before proceeding
                int confirmation = JOptionPane.showConfirmDialog(null, "آیا میخواهید یک شمشیر بخرید/بفروشید؟\n"+"قیمت خرید:100   قیمت فروش:75", "Confirmation", JOptionPane.YES_NO_OPTION);
                if (confirmation == JOptionPane.YES_OPTION) {
                    String action = buyButton.isSelected() ? "خریدید" : "فروختید";
                    String item = "شمشیر ";
                    // Add code for buying/selling sword based on the selected action
                    String message = "شما با موفقیت "+ "یک " + item + action  + ".";
                    JOptionPane.showMessageDialog(null, message);

                    if (Value.getPlayer()==1) {
                        if (action == "خریدید") Value.setMoney_Player1(Value.getMoney_Player1() - 100);
                        if (action == "فروختید") Value.setMoney_Player1(Value.getMoney_Player1() + 75);
                    }
                    if (Value.getPlayer()==2) {
                        if (action == "خریدید") Value.setMoney_Player2(Value.getMoney_Player2() - 100);
                        if (action == "فروختید") Value.setMoney_Player2(Value.getMoney_Player2() + 75);
                    }
                    if (Value.getPlayer()==3) {
                        if (action == "خریدید") Value.setMoney_Player3(Value.getMoney_Player3() - 100);
                        if (action == "فروختید") Value.setMoney_Player3(Value.getMoney_Player3() + 75);
                    }
                    if (Value.getPlayer()==4) {
                        if (action == "خریدید") Value.setMoney_Player4(Value.getMoney_Player4() - 100);
                        if (action == "فروختید") Value.setMoney_Player4(Value.getMoney_Player4() + 75);
                    }


                }
            }
        });
        panel.add(swordButton);

        // Add armor button with image
        ImageIcon armorIcon = new ImageIcon("D:\\Bluetooth\\armor.png");
        JButton armorButton = new JButton(armorIcon);
        armorButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                // Ask for confirmation before proceeding
                int confirmation = JOptionPane.showConfirmDialog(null, "آیا میخواهید یک زره بخرید/بفروشید؟\n"+"قیمت خرید:120   قیمت فروش:90", "Confirmation", JOptionPane.YES_NO_OPTION);
                if (confirmation == JOptionPane.YES_OPTION) {
                    String action = buyButton.isSelected() ? "خریدید" : "فروختید";
                    String item = "زره ";
                    // Add code for buying/selling armor based on the selected action
                    String message = "شما با موفقیت "+ "یک " + item + action  + ".";
                    JOptionPane.showMessageDialog(null, message);

                    if (Value.getPlayer()==1) {
                        if (action == "خریدید") Value.setMoney_Player1(Value.getMoney_Player1() - 120);
                        if (action == "فروختید") Value.setMoney_Player1(Value.getMoney_Player1() + 90);
                    }
                    if (Value.getPlayer()==2) {
                        if (action == "خریدید") Value.setMoney_Player2(Value.getMoney_Player2() - 120);
                        if (action == "فروختید") Value.setMoney_Player2(Value.getMoney_Player2() + 90);
                    }
                    if (Value.getPlayer()==3) {
                        if (action == "خریدید") Value.setMoney_Player3(Value.getMoney_Player3() - 120);
                        if (action == "فروختید") Value.setMoney_Player3(Value.getMoney_Player3() + 90);
                    }
                    if (Value.getPlayer()==4) {
                        if (action == "خریدید") Value.setMoney_Player4(Value.getMoney_Player4() - 120);
                        if (action == "فروختید") Value.setMoney_Player4(Value.getMoney_Player4() + 90);
                    }



                }
            }
        });
        panel.add(armorButton);

        // Add food button with image
        ImageIcon foodIcon = new ImageIcon("D:\\Bluetooth\\food.png");
        JButton foodButton = new JButton(foodIcon);
        foodButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                // Ask for confirmation before proceeding
                int confirmation = JOptionPane.showConfirmDialog(null, "آیا میخواهید یک آذوقه بخرید/بفروشید؟\n"+"قیمت خرید:80   قیمت فروش:60", "Confirmation", JOptionPane.YES_NO_OPTION);
                if (confirmation == JOptionPane.YES_OPTION) {
                    String action = buyButton.isSelected() ? "خریدید" : "فروختید";
                    String item = "آذوقه ";
                    // Add code for buying/selling food based on the selected action
                    String message = "شما با موفقیت "+ "یک " + item + action  + ".";
                    JOptionPane.showMessageDialog(null, message);


                    if (Value.getPlayer()==1) {
                        if (action == "خریدید") Value.setMoney_Player1(Value.getMoney_Player1() - 80);
                        if (action == "فروختید") Value.setMoney_Player1(Value.getMoney_Player1() + 60);
                    }
                    if (Value.getPlayer()==2) {
                        if (action == "خریدید") Value.setMoney_Player2(Value.getMoney_Player2() - 80);
                        if (action == "فروختید") Value.setMoney_Player2(Value.getMoney_Player2() + 60);
                    }
                    if (Value.getPlayer()==3) {
                        if (action == "خریدید") Value.setMoney_Player3(Value.getMoney_Player3() - 80);
                        if (action == "فروختید") Value.setMoney_Player3(Value.getMoney_Player3() + 60);
                    }
                    if (Value.getPlayer()==4) {
                        if (action == "خریدید") Value.setMoney_Player4(Value.getMoney_Player4() - 80);
                        if (action == "فروختید") Value.setMoney_Player4(Value.getMoney_Player4() + 60);
                    }


                }
            }
        });
        panel.add(foodButton);

        // Add potion button with image
        ImageIcon potionIcon = new ImageIcon("D:\\Bluetooth\\potion.png");
        JButton potionButton = new JButton(potionIcon);
        potionButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                // Ask for confirmation before proceeding
                int confirmation = JOptionPane.showConfirmDialog(null, "آیا میخواهید یک دارو بخرید/بفروشید؟\n"+"قیمت خرید:120   قیمت فروش:90", "Confirmation", JOptionPane.YES_NO_OPTION);
                if (confirmation == JOptionPane.YES_OPTION) {
                    String action = buyButton.isSelected() ? "خریدید" : "فروختید";
                    String item = "دارو ";
                    // Add code for buying/selling potion based on the selected action
                    String message = "شما با موفقیت "+ "یک " + item + action  + ".";
                    JOptionPane.showMessageDialog(null, message);


                    if (Value.getPlayer()==1) {
                        if (action == "خریدید") Value.setMoney_Player1(Value.getMoney_Player1() - 120);
                        if (action == "فروختید") Value.setMoney_Player1(Value.getMoney_Player1() + 90);
                    }
                    if (Value.getPlayer()==2) {
                        if (action == "خریدید") Value.setMoney_Player2(Value.getMoney_Player2() - 120);
                        if (action == "فروختید") Value.setMoney_Player2(Value.getMoney_Player2() + 90);
                    }
                    if (Value.getPlayer()==3) {
                        if (action == "خریدید") Value.setMoney_Player3(Value.getMoney_Player3() - 120);
                        if (action == "فروختید") Value.setMoney_Player3(Value.getMoney_Player3() + 90);
                    }
                    if (Value.getPlayer()==4) {
                        if (action == "خریدید") Value.setMoney_Player4(Value.getMoney_Player4() - 120);
                        if (action == "فروختید") Value.setMoney_Player4(Value.getMoney_Player4() + 90);
                    }



                }
            }
        });
        panel.add(potionButton);

        // Add book button with image
        ImageIcon bookIcon = new ImageIcon("D:\\Bluetooth\\book.png");
        JButton bookButton = new JButton(bookIcon);
        bookButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                // Ask for confirmation before proceeding
                int confirmation = JOptionPane.showConfirmDialog(null, "آیا میخواهید یک کتاب بخرید؟\n"+"قیمت خرید:300", "Confirmation", JOptionPane.YES_NO_OPTION);
                if (confirmation == JOptionPane.YES_OPTION) {
                    String action = buyButton.isSelected() ? "خریدید" : "خریدید";
                    String item = "کتاب ";
                    // Add code for buying/selling book based on the selected action
                    String message = "شما با موفقیت "+ "یک " + item + action  + ".";
                    JOptionPane.showMessageDialog(null, message);


                    if (Value.getPlayer()==1) {
                        if (action == "خریدید") Value.setMoney_Player1(Value.getMoney_Player1() - 300);
                    }
                    if (Value.getPlayer()==2) {
                        if (action == "خریدید") Value.setMoney_Player2(Value.getMoney_Player2() - 300);
                    }
                    if (Value.getPlayer()==3) {
                        if (action == "خریدید") Value.setMoney_Player3(Value.getMoney_Player3() - 300);
                    }
                    if (Value.getPlayer()==4) {
                        if (action == "خریدید") Value.setMoney_Player4(Value.getMoney_Player4() - 300);
                    }



                }
            }
        });
        panel.add(bookButton);

        // Add bow button with image
        ImageIcon bowIcon = new ImageIcon("D:\\Bluetooth\\bow.png");
        JButton bowButton = new JButton(bowIcon);
        bowButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                // Ask for confirmation before proceeding
                int confirmation = JOptionPane.showConfirmDialog(null, "آیا میخواهید یک کمان بخرید/بفروشید؟\n"+"قیمت خرید:120   قیمت فروش:90", "Confirmation", JOptionPane.YES_NO_OPTION);
                if (confirmation == JOptionPane.YES_OPTION) {
                    String action = buyButton.isSelected() ? "خریدید" : "فروختید";
                    String item = "کمان ";
                    // Add code for buying/selling bow based on the selected action
                    String message = "شما با موفقیت "+ "یک " + item + action  + ".";
                    JOptionPane.showMessageDialog(null, message);

                    if (Value.getPlayer()==1) {
                        if (action == "خریدید") Value.setMoney_Player1(Value.getMoney_Player1() - 120);
                        if (action == "فروختید") Value.setMoney_Player1(Value.getMoney_Player1() + 90);
                    }
                    if (Value.getPlayer()==2) {
                        if (action == "خریدید") Value.setMoney_Player2(Value.getMoney_Player2() - 120);
                        if (action == "فروختید") Value.setMoney_Player2(Value.getMoney_Player2() + 90);
                    }
                    if (Value.getPlayer()==3) {
                        if (action == "خریدید") Value.setMoney_Player3(Value.getMoney_Player3() - 120);
                        if (action == "فروختید") Value.setMoney_Player3(Value.getMoney_Player3() + 90);
                    }
                    if (Value.getPlayer()==4) {
                        if (action == "خریدید") Value.setMoney_Player4(Value.getMoney_Player4() - 120);
                        if (action == "فروختید") Value.setMoney_Player4(Value.getMoney_Player4() + 90);
                    }




                }
            }
        });
        panel.add(bowButton);

        // Create the loan button and add a listener to open the loan window
        ImageIcon loanIcon = new ImageIcon("D:\\Bluetooth\\loan.png");
        JButton loanButton = new JButton(loanIcon);
        panel.add(loanButton);
        loanButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                LoanWindow loanWindow = new LoanWindow();
                loanWindow.setVisible(true);
            }
        });

        // Create the chest button and add a listener to open the loan window
        ImageIcon chestIcon = new ImageIcon("D:\\Bluetooth\\chest.png");
        JButton chestButton = new JButton(chestIcon);
        chestButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                ChestWindow chestWindow = new ChestWindow();
                chestWindow.setVisible(true);
            }
        });
        panel.add(chestButton);

        // Add close button with custom style
        JButton closeButton = new JButton("خروج");
        closeButton.setForeground(Color.BLACK);
        closeButton.setBackground(new Color(0, 150, 136));
        closeButton.setFont(new Font("Arial", Font.BOLD, 16));
        closeButton.setBorder(BorderFactory.createEmptyBorder(10, 20, 10, 20));
        closeButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                dispose();
            }
        });
        panel.add(closeButton);

        // Set background color and margin for panel
        panel.setBackground(new Color(255, 255, 255, 0));
        panel.setBorder(BorderFactory.createEmptyBorder(50, 50, 50, 50));

        setContentPane(background);
        setVisible(true);
    }
}