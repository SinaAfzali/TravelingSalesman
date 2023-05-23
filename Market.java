package classes;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class Market extends JFrame {
    private final JRadioButton buyButton;

    static String text1="";
    static String text2="";
    static String text3="";
    static String text4="";
    static String text5="";
    static String text6="";
    static String text7="";
    static String text8="";
    static String text9="";
    static String text10="";
    static String text11="";
    static String text12="";
    static String text13="";
    static String text14="";
    static String text15="";
    static String text16="";
    static String text17="";
    static String text18="";
    static String text19="";
    static String text20="";
    static String text21="";
    static String text22="";
    static String text23="";
    static String text24="";
    static String text25="";
    static String text26="";
    static String text27="";
    static String text28="";
    static String text29="";
    static String text30="";
    static String text31="";
    static String text32="";
    static String text33="";
    static String text34="";
    static String text35="";
    static String text36="";
    static String text37="";
    static String text38="";


    public Market() {


        if (Value.language==1)text37="بستن";
        else text37="Close";

        setTitle("Market");
        setSize(800, 600);
        setLocationRelativeTo(null); // center the window on screen

        // Create a JLabel with the background image;
        ImageIcon backgroundImage = new ImageIcon("image\\shop2.png");
        JLabel background = new JLabel(backgroundImage);
        background.setLayout(new BorderLayout());

        // Add margin to the panel
        JPanel panel = new JPanel(new GridLayout(6, 2, 10, 10));
        panel.setBorder(BorderFactory.createEmptyBorder(20, 20, 20, 20)); // add margin around the panel
        background.add(panel, BorderLayout.CENTER);

        // Add buy/sell radio buttons
        ButtonGroup buySellGroup = new ButtonGroup();
        if (Value.language==1)text1="خرید";
        else text1="Buy";
        if (Value.language==1)text2="فروش";
        else text2="Sell";
        buyButton = new JRadioButton(text1, true);
        JRadioButton sellButton = new JRadioButton(text2, false);
        buySellGroup.add(buyButton);
        buySellGroup.add(sellButton);
        JPanel buySellPanel = new JPanel();
        buySellPanel.add(buyButton);
        buySellPanel.add(sellButton);
        background.add(buySellPanel, BorderLayout.NORTH);

        // Add shield button with image
        ImageIcon shieldIcon = new ImageIcon("image\\shield.png");
        JButton shieldButton = new JButton(shieldIcon);
        shieldButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                // Ask for confirmation before proceeding
                int confirmation = JOptionPane.showConfirmDialog(null, text3+text4, "Confirmation", JOptionPane.YES_NO_OPTION);
                if (confirmation == JOptionPane.YES_OPTION) {
                    String action = buyButton.isSelected() ? text5 : text6;
                    String item = text7;
                    // Add code for buying/selling shield based on the selected action

                    if (action==text5||(action==text6&&Value.getPlayer()==1&&Value.getShield_player1()>0)) {
                        String message = text8 + text9 + item + action + "\n" + text10;
                        JOptionPane.showMessageDialog(null, message);
                    }
                    else if (action==text6&&Value.getPlayer()==2&&Value.getShield_player2()>0) {
                        String message = text8 + text9 + item + action + "\n" + text10;
                        JOptionPane.showMessageDialog(null, message);
                    }
                    else if (action==text6&&Value.getPlayer()==3&&Value.getShield_player3()>0) {
                        String message = text8 + text9 + item + action + "\n" + text10;
                        JOptionPane.showMessageDialog(null, message);
                    }
                    else if (action==text6&&Value.getPlayer()==4&&Value.getShield_player4()>0) {
                        String message = text8 + text9 + item + action + "\n" + text10;
                        JOptionPane.showMessageDialog(null, message);
                    }
                    else {
                        JOptionPane.showMessageDialog(null, text11);
                    }



                    if (Value.getPlayer()==1) {
                        if (action == text5) {
                            Value.setMoney_Player1(Value.getMoney_Player1() - 160);
                            Value.setPower_Player1(Value.getPower_Player1()+40);
                            Value.setShield_player1(Value.getShield_player1()+1);
                        }
                        if (action == text6&&Value.getShield_player1()>0) {
                            Value.setMoney_Player1(Value.getMoney_Player1() + 120);
                            Value.setPower_Player1(Value.getPower_Player1()-40);
                            Value.setShield_player1(Value.getShield_player1()-1);
                        }
                    }
                    if (Value.getPlayer()==2) {
                        if (action == text5) {
                            Value.setMoney_Player2(Value.getMoney_Player2() - 160);
                            Value.setPower_Player2(Value.getPower_Player2()+40);
                            Value.setShield_player2(Value.getShield_player2()+1);
                        }
                        if (action == text6&&Value.getShield_player2()>0) {
                            Value.setMoney_Player2(Value.getMoney_Player2() + 120);
                            Value.setPower_Player2(Value.getPower_Player2()-40);
                            Value.setShield_player2(Value.getShield_player2()-1);
                        }
                    }
                    if (Value.getPlayer()==3) {
                        if (action == text5) {
                            Value.setMoney_Player3(Value.getMoney_Player3() - 160);
                            Value.setPower_Player3(Value.getPower_Player3()+40);
                            Value.setShield_player3(Value.getShield_player3()+1);
                        }
                        if (action == text6&&Value.getShield_player3()>0) {
                            Value.setMoney_Player3(Value.getMoney_Player3() + 120);
                            Value.setPower_Player3(Value.getPower_Player3()-40);
                            Value.setShield_player3(Value.getShield_player3()-1);
                        }
                    }
                    if (Value.getPlayer()==4) {
                        if (action == text5) {
                            Value.setMoney_Player4(Value.getMoney_Player4() - 160);
                            Value.setPower_Player4(Value.getPower_Player4()+40);
                            Value.setShield_player4(Value.getShield_player4()+1);
                        }
                        if (action == text6&&Value.getShield_player4()>0) {
                            Value.setMoney_Player4(Value.getMoney_Player4() + 120);
                            Value.setPower_Player4(Value.getPower_Player4()-40);
                            Value.setShield_player4(Value.getShield_player4()-1);
                        }
                    }

                }
            }
        });

        shieldButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                shieldButton.setBackground(new Color(70, 132, 206)); // set the background color to yellow when the mouse enters
            }

            public void mouseExited(java.awt.event.MouseEvent evt) {
                shieldButton.setBackground(UIManager.getColor("control")); // set the background color to the default color when the mouse exits
            }
        });


        panel.add(shieldButton);

        // Add sword button with image
        ImageIcon swordIcon = new ImageIcon("image\\sword.png");
        JButton swordButton = new JButton(swordIcon);
        swordButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                // Ask for confirmation before proceeding
                int confirmation = JOptionPane.showConfirmDialog(null, text12+text13, "Confirmation", JOptionPane.YES_NO_OPTION);
                if (confirmation == JOptionPane.YES_OPTION) {
                    String action = buyButton.isSelected() ? text5 : text6;
                    String item = text14;
                    // Add code for buying/selling sword based on the selected action


                    if (action==text5||(action==text6&&Value.getPlayer()==1&&Value.getSword_player1()>0)) {
                        String message = text8+ text9 + item + action  +"\n"+text15;
                        JOptionPane.showMessageDialog(null, message);
                    }
                    else if (action==text6&&Value.getPlayer()==2&&Value.getSword_player2()>0) {
                        String message = text8+ text9 + item + action  +"\n"+text15;
                        JOptionPane.showMessageDialog(null, message);
                    }
                    else if (action==text6&&Value.getPlayer()==3&&Value.getSword_player3()>0) {
                        String message = text8+ text9 + item + action  +"\n"+text15;
                        JOptionPane.showMessageDialog(null, message);
                    }
                    else if (action==text6&&Value.getPlayer()==4&&Value.getSword_player4()>0) {
                        String message = text8+ text9 + item + action  +"\n"+text15;
                        JOptionPane.showMessageDialog(null, message);
                    }
                    else {
                        JOptionPane.showMessageDialog(null, text16);
                    }


                    if (Value.getPlayer()==1) {
                        if (action == text5) {
                            Value.setMoney_Player1(Value.getMoney_Player1() - 100);
                            Value.setPower_Player1(Value.getPower_Player1()+25);
                            Value.setSword_player1(Value.getSword_player1()+1);
                        }
                        if (action == text6&&Value.getSword_player1()>0) {
                            Value.setMoney_Player1(Value.getMoney_Player1() + 75);
                            Value.setPower_Player1(Value.getPower_Player1()-25);
                            Value.setSword_player1(Value.getSword_player1()-1);
                        }
                    }
                    if (Value.getPlayer()==2) {
                        if (action == text5) {
                            Value.setMoney_Player2(Value.getMoney_Player2() - 100);
                            Value.setPower_Player2(Value.getPower_Player2()+25);
                            Value.setSword_player2(Value.getSword_player2()+1);
                        }
                        if (action == text6&&Value.getSword_player2()>0) {
                            Value.setMoney_Player2(Value.getMoney_Player2() + 75);
                            Value.setPower_Player2(Value.getPower_Player2()-25);
                            Value.setSword_player2(Value.getSword_player2()-1);
                        }
                    }
                    if (Value.getPlayer()==3) {
                        if (action == text5) {
                            Value.setMoney_Player3(Value.getMoney_Player3() - 100);
                            Value.setPower_Player3(Value.getPower_Player3()+25);
                            Value.setSword_player3(Value.getSword_player3()+1);
                        }
                        if (action == text6&&Value.getSword_player3()>0) {
                            Value.setMoney_Player3(Value.getMoney_Player3() + 75);
                            Value.setPower_Player3(Value.getPower_Player3()-25);
                            Value.setSword_player3(Value.getSword_player3()-1);
                        }
                    }
                    if (Value.getPlayer()==4) {
                        if (action == text5) {
                            Value.setMoney_Player4(Value.getMoney_Player4() - 100);
                            Value.setPower_Player4(Value.getPower_Player4()+25);
                            Value.setSword_player4(Value.getSword_player4()+1);
                        }
                        if (action == text6&&Value.getSword_player4()>0) {
                            Value.setMoney_Player4(Value.getMoney_Player4() + 75);
                            Value.setPower_Player4(Value.getPower_Player4()-25);
                            Value.setSword_player4(Value.getSword_player4()-1);
                        }
                    }


                }
            }
        });

        swordButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                swordButton.setBackground(new Color(70, 132, 206)); // set the background color to yellow when the mouse enters
            }

            public void mouseExited(java.awt.event.MouseEvent evt) {
                swordButton.setBackground(UIManager.getColor("control")); // set the background color to the default color when the mouse exits
            }
        });


        panel.add(swordButton);

        // Add armor button with image
        ImageIcon armorIcon = new ImageIcon("image\\armor.png");
        JButton armorButton = new JButton(armorIcon);
        armorButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                // Ask for confirmation before proceeding
                int confirmation = JOptionPane.showConfirmDialog(null, text17+text18, "Confirmation", JOptionPane.YES_NO_OPTION);
                if (confirmation == JOptionPane.YES_OPTION) {
                    String action = buyButton.isSelected() ? text5 : text6;
                    String item = text19;
                    // Add code for buying/selling armor based on the selected action



                    if (action==text5||(action==text6&&Value.getPlayer()==1&&Value.getArmor_player1()>0)) {
                        String message = text8+ text9 + item + action  +"\n"+text20;
                        JOptionPane.showMessageDialog(null, message);
                    }
                    else if (action==text6&&Value.getPlayer()==2&&Value.getArmor_player2()>0) {
                        String message = text8+ text9 + item + action  +"\n"+text20;
                        JOptionPane.showMessageDialog(null, message);
                    }
                    else if (action==text6&&Value.getPlayer()==3&&Value.getArmor_player3()>0) {
                        String message = text8+ text9 + item + action  +"\n"+text20;
                        JOptionPane.showMessageDialog(null, message);
                    }
                    else if (action==text6&&Value.getPlayer()==4&&Value.getArmor_player4()>0) {
                        String message = text8+ text9 + item + action  +"\n"+text20;
                        JOptionPane.showMessageDialog(null, message);
                    }
                    else {
                        JOptionPane.showMessageDialog(null, text21);
                    }


                    if (Value.getPlayer()==1) {
                        if (action == text5) {
                            Value.setMoney_Player1(Value.getMoney_Player1() - 120);
                            Value.setPower_Player1(Value.getPower_Player1()+30);
                            Value.setArmor_player1(Value.getArmor_player1()+1);
                        }
                        if (action == text6&&Value.getArmor_player1()>0) {
                            Value.setMoney_Player1(Value.getMoney_Player1() + 90);
                            Value.setPower_Player1(Value.getPower_Player1()-30);
                            Value.setArmor_player1(Value.getArmor_player1()-1);
                        }
                    }
                    if (Value.getPlayer()==2) {
                        if (action == text5) {
                            Value.setMoney_Player2(Value.getMoney_Player2() - 120);
                            Value.setPower_Player2(Value.getPower_Player2()+30);
                            Value.setArmor_player2(Value.getArmor_player2()+1);
                        }
                        if (action == text6&&Value.getArmor_player2()>0) {
                            Value.setMoney_Player2(Value.getMoney_Player2() + 90);
                            Value.setPower_Player2(Value.getPower_Player2()-30);
                            Value.setArmor_player2(Value.getArmor_player2()-1);
                        }
                    }
                    if (Value.getPlayer()==3) {
                        if (action == text5) {
                            Value.setMoney_Player3(Value.getMoney_Player3() - 120);
                            Value.setPower_Player3(Value.getPower_Player3()+30);
                            Value.setArmor_player3(Value.getArmor_player3()+1);
                        }
                        if (action == text6&&Value.getArmor_player3()>0) {
                            Value.setMoney_Player3(Value.getMoney_Player3() + 90);
                            Value.setPower_Player3(Value.getPower_Player3()-30);
                            Value.setArmor_player3(Value.getArmor_player3()-1);
                        }
                    }
                    if (Value.getPlayer()==4) {
                        if (action == text5) {
                            Value.setMoney_Player4(Value.getMoney_Player4() - 120);
                            Value.setPower_Player4(Value.getPower_Player4()+30);
                            Value.setArmor_player4(Value.getArmor_player4()+1);
                        }
                        if (action == text6&&Value.getArmor_player4()>0) {
                            Value.setMoney_Player4(Value.getMoney_Player4() + 90);
                            Value.setPower_Player4(Value.getPower_Player4()-30);
                            Value.setArmor_player4(Value.getArmor_player4()-1);
                        }
                    }



                }
            }
        });

        armorButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                armorButton.setBackground(new Color(70, 132, 206)); // set the background color to yellow when the mouse enters
            }

            public void mouseExited(java.awt.event.MouseEvent evt) {
                armorButton.setBackground(UIManager.getColor("control")); // set the background color to the default color when the mouse exits
            }
        });

        panel.add(armorButton);

        // Add food button with image
        ImageIcon foodIcon = new ImageIcon("image\\food.png");
        JButton foodButton = new JButton(foodIcon);
        foodButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                // Ask for confirmation before proceeding
                int confirmation = JOptionPane.showConfirmDialog(null, text22+text23, "Confirmation", JOptionPane.YES_NO_OPTION);
                if (confirmation == JOptionPane.YES_OPTION) {
                    String action = buyButton.isSelected() ? text5 : text6;
                    String item = text24;
                    // Add code for buying/selling food based on the selected action



                    if (action==text5||(action==text6&&Value.getPlayer()==1&&Value.getFood_player1()>0)) {
                        String message = text8+ text9 + item + action  +text25;
                        JOptionPane.showMessageDialog(null, message);
                    }
                    else if (action==text6&&Value.getPlayer()==2&&Value.getFood_player2()>0) {
                        String message = text8+ text9 + item + action  +text25;
                        JOptionPane.showMessageDialog(null, message);
                    }
                    else if (action==text6&&Value.getPlayer()==3&&Value.getFood_player3()>0) {
                        String message = text8+ text9 + item + action  +text25;
                        JOptionPane.showMessageDialog(null, message);
                    }
                    else if (action==text6&&Value.getPlayer()==4&&Value.getFood_player4()>0) {
                        String message = text8+ text9 + item + action  +text25;
                        JOptionPane.showMessageDialog(null, message);
                    }
                    else {
                        JOptionPane.showMessageDialog(null, text26);
                    }



                    if (Value.getPlayer()==1) {
                        if (action == text5) {
                            Value.setMoney_Player1(Value.getMoney_Player1() - 80);
                            Value.setPower_Player1(Value.getPower_Player1()+20);
                            Value.setFood_player1(Value.getFood_player1()+1);
                        }
                        if (action == text6&&Value.getFood_player1()>0) {
                            Value.setMoney_Player1(Value.getMoney_Player1() + 60);
                            Value.setPower_Player1(Value.getPower_Player1()-20);
                            Value.setFood_player1(Value.getFood_player1()-1);
                        }
                    }
                    if (Value.getPlayer()==2) {
                        if (action == text5) {
                            Value.setMoney_Player2(Value.getMoney_Player2() - 80);
                            Value.setPower_Player2(Value.getPower_Player2()+20);
                            Value.setFood_player2(Value.getFood_player2()+1);
                        }
                        if (action == text6&&Value.getFood_player2()>0) {
                            Value.setMoney_Player2(Value.getMoney_Player2() + 60);
                            Value.setPower_Player2(Value.getPower_Player2()-20);
                            Value.setFood_player2(Value.getFood_player2()-1);
                        }
                    }
                    if (Value.getPlayer()==3) {
                        if (action == text5) {
                            Value.setMoney_Player3(Value.getMoney_Player3() - 80);
                            Value.setPower_Player3(Value.getPower_Player3()+20);
                            Value.setFood_player3(Value.getFood_player3()+1);
                        }
                        if (action == text6&&Value.getFood_player3()>0) {
                            Value.setMoney_Player3(Value.getMoney_Player3() + 60);
                            Value.setPower_Player3(Value.getPower_Player3()-20);
                            Value.setFood_player3(Value.getFood_player3()-1);
                        }
                    }
                    if (Value.getPlayer()==4) {
                        if (action == text5) {
                            Value.setMoney_Player4(Value.getMoney_Player4() - 80);
                            Value.setPower_Player4(Value.getPower_Player4()+20);
                            Value.setFood_player4(Value.getFood_player4()+1);
                        }
                        if (action == text6&&Value.getFood_player4()>0) {
                            Value.setMoney_Player4(Value.getMoney_Player4() + 60);
                            Value.setPower_Player4(Value.getPower_Player4()-20);
                            Value.setFood_player4(Value.getFood_player4()-1);
                        }
                    }


                }
            }
        });
        foodButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                foodButton.setBackground(new Color(70, 132, 206)); // set the background color to yellow when the mouse enters
            }

            public void mouseExited(java.awt.event.MouseEvent evt) {
                foodButton.setBackground(UIManager.getColor("control")); // set the background color to the default color when the mouse exits
            }
        });

        panel.add(foodButton);

        // Add potion button with image
        ImageIcon potionIcon = new ImageIcon("image\\potion.png");
        JButton potionButton = new JButton(potionIcon);
        potionButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                // Ask for confirmation before proceeding
                int confirmation = JOptionPane.showConfirmDialog(null, text27+text18, "Confirmation", JOptionPane.YES_NO_OPTION);
                if (confirmation == JOptionPane.YES_OPTION) {
                    String action = buyButton.isSelected() ? text5 : text6;
                    String item = text28;
                    // Add code for buying/selling potion based on the selected action



                    if (action==text5||(action==text6&&Value.getPlayer()==1&&Value.getPotion_player1()>0)) {
                        String message = text8+ text9 + item + action  +"\n"+text20;
                        JOptionPane.showMessageDialog(null, message);
                    }
                    else if (action==text6&&Value.getPlayer()==2&&Value.getPotion_player2()>0) {
                        String message = text8+ text9 + item + action  +"\n"+text20;
                        JOptionPane.showMessageDialog(null, message);
                    }
                    else if (action==text6&&Value.getPlayer()==3&&Value.getPotion_player3()>0) {
                        String message = text8+ text9 + item + action  +"\n"+text20;
                        JOptionPane.showMessageDialog(null, message);
                    }
                    else if (action==text6&&Value.getPlayer()==4&&Value.getPotion_player4()>0) {
                        String message = text8+ text9 + item + action  +"\n"+text20;
                        JOptionPane.showMessageDialog(null, message);
                    }
                    else {
                        JOptionPane.showMessageDialog(null, text38);
                    }



                    if (Value.getPlayer()==1) {
                        if (action == text5) {
                            Value.setMoney_Player1(Value.getMoney_Player1() - 120);
                            Value.setPower_Player1(Value.getPower_Player1()+30);
                            Value.setPotion_player1(Value.getPotion_player1()+1);
                        }
                        if (action == text6&&Value.getPotion_player1()>0) {
                            Value.setMoney_Player1(Value.getMoney_Player1() + 90);
                            Value.setPower_Player1(Value.getPower_Player1()-30);
                            Value.setPotion_player1(Value.getPotion_player1()-1);
                        }
                    }
                    if (Value.getPlayer()==2) {
                        if (action == text5) {
                            Value.setMoney_Player2(Value.getMoney_Player2() - 120);
                            Value.setPower_Player2(Value.getPower_Player2()+30);
                            Value.setPotion_player2(Value.getPotion_player2()+1);
                        }
                        if (action == text6&&Value.getPotion_player2()>0) {
                            Value.setMoney_Player2(Value.getMoney_Player2() + 90);
                            Value.setPower_Player2(Value.getPower_Player2()-30);
                            Value.setPotion_player2(Value.getPotion_player2()-1);
                        }
                    }
                    if (Value.getPlayer()==3) {
                        if (action == text5) {
                            Value.setMoney_Player3(Value.getMoney_Player3() - 120);
                            Value.setPower_Player3(Value.getPower_Player3()+30);
                            Value.setPotion_player3(Value.getPotion_player3()+1);
                        }
                        if (action == text6&&Value.getPotion_player3()>0) {
                            Value.setMoney_Player3(Value.getMoney_Player3() + 90);
                            Value.setPower_Player3(Value.getPower_Player3()-30);
                            Value.setPotion_player3(Value.getPotion_player3()-1);
                        }
                    }
                    if (Value.getPlayer()==4) {
                        if (action == text5) {
                            Value.setMoney_Player4(Value.getMoney_Player4() - 120);
                            Value.setPower_Player4(Value.getPower_Player4()+30);
                            Value.setPotion_player4(Value.getPotion_player4()+1);
                        }
                        if (action == text6&&Value.getPotion_player4()>0) {
                            Value.setMoney_Player4(Value.getMoney_Player4() + 90);
                            Value.setPower_Player4(Value.getPower_Player4()-30);
                            Value.setPotion_player4(Value.getPotion_player4()-1);
                        }
                    }
                }
            }
        });

        potionButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                potionButton.setBackground(new Color(70, 132, 206)); // set the background color to yellow when the mouse enters
            }

            public void mouseExited(java.awt.event.MouseEvent evt) {
                potionButton.setBackground(UIManager.getColor("control")); // set the background color to the default color when the mouse exits
            }
        });

        panel.add(potionButton);

        // Add book button with image
        ImageIcon bookIcon = new ImageIcon("image\\book.png");
        JButton bookButton = new JButton(bookIcon);
        bookButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                // Ask for confirmation before proceeding
                int confirmation = JOptionPane.showConfirmDialog(null, text29+text30, "Confirmation", JOptionPane.YES_NO_OPTION);
                if (confirmation == JOptionPane.YES_OPTION) {
                    String action = buyButton.isSelected() ? text5 :  text6;
                    String item = text31;
                    // Add code for buying/selling book based on the selected action


                    if (action==text5||(action==text6&&Value.getPlayer()==1&&Value.getBook_player1()>0)) {
                        String message = text8+ text9 + item + action  +"\n"+text32;
                        JOptionPane.showMessageDialog(null, message);
                    }
                    else if (action==text6&&Value.getPlayer()==2&&Value.getBook_player2()>0) {
                        String message = text8+ text9 + item + action  +"\n"+text32;
                        JOptionPane.showMessageDialog(null, message);
                    }
                    else if (action==text6&&Value.getPlayer()==3&&Value.getBook_player3()>0) {
                        String message = text8+ text9 + item + action  +"\n"+text32;
                        JOptionPane.showMessageDialog(null, message);
                    }
                    else if (action==text6&&Value.getPlayer()==4&&Value.getBook_player4()>0) {
                        String message = text8+ text9 + item + action  +"\n"+text32;
                        JOptionPane.showMessageDialog(null, message);
                    }
                    else {
                        JOptionPane.showMessageDialog(null, text33);
                    }




                    if (Value.getPlayer()==1) {
                        if (action == text5) {
                            Value.setMoney_Player1(Value.getMoney_Player1() - 200);
                            Value.setPower_Player1(Value.getPower_Player1()+50);
                            Value.setBook_player1(Value.getBook_player1()+1);
                        }
                        if (action == text6&&Value.getBook_player1()>0) {
                            Value.setMoney_Player1(Value.getMoney_Player1() + 150);
                            Value.setPower_Player1(Value.getPower_Player1()-50);
                            Value.setBook_player1(Value.getBook_player1()-1);
                        }
                    }
                    if (Value.getPlayer()==2) {
                        if (action == text5) {
                            Value.setMoney_Player2(Value.getMoney_Player2() - 200);
                            Value.setPower_Player2(Value.getPower_Player2()+50);
                            Value.setBook_player2(Value.getBook_player2()+1);
                        }
                        if (action == text6&&Value.getBook_player2()>0) {
                            Value.setMoney_Player2(Value.getMoney_Player2() + 150);
                            Value.setPower_Player2(Value.getPower_Player2()-50);
                            Value.setBook_player2(Value.getBook_player2()-1);
                        }
                    }
                    if (Value.getPlayer()==3) {
                        if (action == text5) {
                            Value.setMoney_Player3(Value.getMoney_Player3() - 200);
                            Value.setPower_Player3(Value.getPower_Player3()+50);
                            Value.setBook_player3(Value.getBook_player3()+1);
                        }
                        if (action == text6&&Value.getBook_player3()>0) {
                            Value.setMoney_Player3(Value.getMoney_Player3() + 150);
                            Value.setPower_Player3(Value.getPower_Player3()-50);
                            Value.setBook_player3(Value.getBook_player3()-1);
                        }
                    }
                    if (Value.getPlayer()==4) {
                        if (action == text5) {
                            Value.setMoney_Player4(Value.getMoney_Player4() - 200);
                            Value.setPower_Player4(Value.getPower_Player4()+50);
                            Value.setBook_player4(Value.getBook_player4()+1);
                        }
                        if (action == text6&&Value.getBook_player4()>0) {
                            Value.setMoney_Player4(Value.getMoney_Player4() + 150);
                            Value.setPower_Player4(Value.getPower_Player4()-50);
                            Value.setBook_player4(Value.getBook_player4()-1);
                        }
                    }



                }
            }
        });
        bookButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                bookButton.setBackground(new Color(70, 132, 206)); // set the background color to yellow when the mouse enters
            }

            public void mouseExited(java.awt.event.MouseEvent evt) {
                bookButton.setBackground(UIManager.getColor("control")); // set the background color to the default color when the mouse exits
            }
        });

        panel.add(bookButton);

        // Add bow button with image
        ImageIcon bowIcon = new ImageIcon("image\\bow.png");
        JButton bowButton = new JButton(bowIcon);
        bowButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                // Ask for confirmation before proceeding
                int confirmation = JOptionPane.showConfirmDialog(null, text34+text18, "Confirmation", JOptionPane.YES_NO_OPTION);
                if (confirmation == JOptionPane.YES_OPTION) {

                    String action = buyButton.isSelected() ? text5 : text6;
                    String item = text35;
                    // Add code for buying/selling bow based on the selected action

                    if (action.equals(text5) ||(action.equals(text6) && Value.getPlayer()==1&&Value.getBow_player1()>0)) {
                        String message = text8+ text9 + item + action  +"\n"+text20;
                        JOptionPane.showMessageDialog(null, message);

                    }
                    else if (action==text6&&Value.getPlayer()==2&&Value.getBow_player2()>0) {
                        String message = text8+ text9 + item + action  +"\n"+text20;
                        JOptionPane.showMessageDialog(null, message);
                    }
                    else if (action==text6&&Value.getPlayer()==3&&Value.getBow_player3()>0) {
                        String message = text8+ text9 + item + action  +"\n"+text20;
                        JOptionPane.showMessageDialog(null, message);
                    }
                    else if (action==text6&&Value.getPlayer()==4&&Value.getBow_player4()>0) {
                        String message = text8+ text9 + item + action  +"\n"+text20;
                        JOptionPane.showMessageDialog(null, message);
                    }
                    else {
                        String message = text36;
                        JOptionPane.showMessageDialog(null, message);
                    }



                    if (Value.getPlayer()==1) {
                        if (action == text5) {
                            Value.setMoney_Player1(Value.getMoney_Player1() - 120);
                            Value.setPower_Player1(Value.getPower_Player1()+30);
                            Value.setBow_player1(Value.getBow_player1()+1);
                        }
                        if (action == text6&&Value.getBow_player1()>0) {
                            Value.setMoney_Player1(Value.getMoney_Player1() + 90);
                            Value.setPower_Player1(Value.getPower_Player1()-30);
                            Value.setBow_player1(Value.getBow_player1()-1);
                        }
                    }
                    if (Value.getPlayer()==2) {
                        if (action == text5) {
                            Value.setMoney_Player2(Value.getMoney_Player2() - 120);
                            Value.setPower_Player2(Value.getPower_Player2()+30);
                            Value.setBow_player2(Value.getBow_player2()+1);
                        }
                        if (action == text6&&Value.getBow_player2()>0) {
                            Value.setMoney_Player2(Value.getMoney_Player2() + 90);
                            Value.setPower_Player2(Value.getPower_Player2()-30);
                            Value.setBow_player2(Value.getBow_player2()-1);

                        }
                    }
                    if (Value.getPlayer()==3) {
                        if (action == text5) {
                            Value.setMoney_Player3(Value.getMoney_Player3() - 120);
                            Value.setPower_Player3(Value.getPower_Player3()+30);
                            Value.setBow_player3(Value.getBow_player3()+1);
                        }
                        if (action == text6&&Value.getBow_player3()>0) {
                            Value.setMoney_Player3(Value.getMoney_Player3() + 90);
                            Value.setPower_Player3(Value.getPower_Player3()-30);
                            Value.setBow_player3(Value.getBow_player3()-1);
                        }
                    }
                    if (Value.getPlayer()==4) {
                        if (action == text5) {
                            Value.setMoney_Player4(Value.getMoney_Player4() - 120);
                            Value.setPower_Player4(Value.getPower_Player4()+30);
                            Value.setBow_player4(Value.getBow_player4()+1);
                        }
                        if (action == text6&&Value.getBow_player4()>0) {
                            Value.setMoney_Player4(Value.getMoney_Player4() + 90);
                            Value.setPower_Player4(Value.getPower_Player4()-30);
                            Value.setBow_player4(Value.getBow_player4()-1);
                        }
                    }

                }
            }
        });
        bowButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                bowButton.setBackground(new Color(70, 132, 206)); // set the background color to yellow when the mouse enters
            }

            public void mouseExited(java.awt.event.MouseEvent evt) {
                bowButton.setBackground(UIManager.getColor("control")); // set the background color to the default color when the mouse exits
            }
        });
        panel.add(bowButton);

        // Create the loan button and add a listener to open the loan window
        ImageIcon loanIcon = new ImageIcon("image\\loan.png");
        JButton loanButton = new JButton(loanIcon);
        panel.add(loanButton);
        loanButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                LoanWindow loanWindow = new LoanWindow();
                loanWindow.setVisible(true);
            }
        });
        loanButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                loanButton.setBackground(new Color(70, 132, 206)); // set the background color to yellow when the mouse enters
            }

            public void mouseExited(java.awt.event.MouseEvent evt) {
                loanButton.setBackground(UIManager.getColor("control")); // set the background color to the default color when the mouse exits
            }
        });



        // Create the chest button and add a listener to open the loan window
        ImageIcon chestIcon = new ImageIcon("image\\chest.png");
        JButton chestButton = new JButton(chestIcon);
        chestButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                ChestWindow chestWindow = new ChestWindow();
                chestWindow.setVisible(true);
            }
        });

        chestButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                chestButton.setBackground(new Color(70, 132, 206)); // set the background color to yellow when the mouse enters
            }

            public void mouseExited(java.awt.event.MouseEvent evt) {
                chestButton.setBackground(UIManager.getColor("control")); // set the background color to the default color when the mouse exits
            }
        });


        panel.add(chestButton);

        // Add close button with custom style
        JButton closeButton = new JButton(text37);
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