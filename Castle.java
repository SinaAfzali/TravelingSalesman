package classes;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Castle extends JFrame {

    private JTable playerTable;
    private JScrollPane scrollPane;
    private JLabel chestsLabel;
    JTextField codeField;

    public static int status=0;

    public Castle() {
        // Create the table with player data
        String[] columnNames = {"نام بازیکن", "قدرت", "پول", "امتیاز"};
        Object[][] data = {
                {"بازیکن 1       ", Value.getPower_Player1(), Value.getMoney_Player1(),Value.getPower_Player1()*5+Value.getMoney_Player1() },
                {"بازیکن 2       ", Value.getPower_Player2(), Value.getMoney_Player2(), Value.getPower_Player2()*5+Value.getMoney_Player2()},
                {"بازیکن 3       ",  Value.getPower_Player3(), Value.getMoney_Player3(), Value.getPower_Player3()*5+Value.getMoney_Player3()},
                {"بازیکن 4       ", Value.getPower_Player4(), Value.getMoney_Player3(), Value.getPower_Player4()*5+Value.getMoney_Player4()},
        };
        playerTable = new JTable(data, columnNames);

        // Add the table to a scroll pane
        scrollPane = new JScrollPane(playerTable);
        // Add a label for the chests codes and a text field to enter new codes
        chestsLabel = new JLabel();
        codeField = new JTextField(10);
        JLabel codeLabel = new JLabel("کد گنج را وارد کنید");
        codeLabel.setFont(new Font("serif",Font.ITALIC,18));
        JPanel chestsPanel = new JPanel(new FlowLayout(FlowLayout.RIGHT));
        chestsPanel.add(chestsLabel);
        chestsPanel.add(codeLabel);
        chestsPanel.add(codeField);

        // Add a button to check the code and show a message if the player is the owner of the chest
        JButton checkButton = new JButton("بررسی کد");
        checkButton.setBackground(Color.GREEN);

        checkButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {

                String code = codeField.getText();
                int money;
                if (status==61 && Value.getPlayer()==1){
                     money=Methods.Money_Rand2();
                    if (Integer.parseInt(code)==Value.getTreasure1_Diamond_Ring_Code_Player1() && Value.isTreasure1_Diamond_Ring_Status()){
                        JOptionPane.showMessageDialog(Castle.this, "شما گنج انگشتر الماس را پیدا کردید\n"+"پاداش شما : "+money+"سکه ");
                        Value.setMoney_Player1(Value.getMoney_Player1()+money);
                        Value.setTreasure1_Diamond_Ring_Status(false);
                    }
                    else if (Integer.parseInt(code)==Value.getTreasure2_Jeweled_Sword_Code_Player1() && Value.isTreasure2_Jeweled_Sword_Status()){
                        JOptionPane.showMessageDialog(Castle.this, "شما گنج شمشیر جواهر نشان را پیدا کردید\n"+"پاداش شما : "+money+"سکه ");
                        Value.setMoney_Player1(Value.getMoney_Player1()+money);
                        Value.setTreasure2_Jeweled_Sword_Status(false);
                    }
                    else if (Integer.parseInt(code)==Value.getTreasure3_Golden_Glass_Code_Player1() && Value.isTreasure3_Golden_Glass_Status()){
                        JOptionPane.showMessageDialog(Castle.this, "شما گنج لیوان طلایی را پیدا کردید\n"+"پاداش شما : "+money+"سکه ");
                        Value.setMoney_Player1(Value.getMoney_Player1()+money);
                        Value.setTreasure3_Golden_Glass_Status(false);
                    }
                    else if (Integer.parseInt(code)==Value.getTreasure4_Glass_Cup_Code_Player1() && Value.isTreasure4_Glass_Cup_Status()){
                        JOptionPane.showMessageDialog(Castle.this, "شما گنج جام شیشه ای را پیدا کردید\n"+"پاداش شما : "+money+"سکه ");
                        Value.setMoney_Player1(Value.getMoney_Player1()+money);
                        Value.setTreasure4_Glass_Cup_Status(false);
                    }
                    else if (Integer.parseInt(code)==Value.getTreasure5_Wooden_Bow_Code_Player1() && Value.isTreasure5_Wooden_Bow_Status()){
                        JOptionPane.showMessageDialog(Castle.this, "شما گنج کمان چوبی را پیدا کردید\n"+"پاداش شما : "+money+"سکه ");
                        Value.setMoney_Player1(Value.getMoney_Player1()+money);
                        Value.setTreasure5_Wooden_Bow_Status(false);
                    }
                    else if (Integer.parseInt(code)==Value.getTreasure6_Steel_Shield_Code_Player1() && Value.isTreasure6_Steel_Shield_Status()){
                        JOptionPane.showMessageDialog(Castle.this, "شما گنج سپر پولادین را پیدا کردید\n"+"پاداش شما : "+money+"سکه ");
                        Value.setMoney_Player1(Value.getMoney_Player1()+money);
                        Value.setTreasure6_Steel_Shield_Status(false);
                    }
                    else if (Integer.parseInt(code)==Value.getTreasure7_Golden_Key_Code_Player1() && Value.isTreasure7_Golden_Key_Status()){
                        JOptionPane.showMessageDialog(Castle.this, "شما گنج کلید زرین را پیدا کردید\n"+"پاداش شما : "+money+"سکه ");
                        Value.setMoney_Player1(Value.getMoney_Player1()+money);
                        Value.setTreasure7_Golden_Key_Status(false);
                    }
                    else if (Integer.parseInt(code)==Value.getTreasure8_Dragon_Scroll_Code_Player1() && Value.isTreasure8_Dragon_Scroll_Status()){
                        JOptionPane.showMessageDialog(Castle.this, "شما گنج طومار اژدها را پیدا کردید\n"+"پاداش شما : "+money+"سکه ");
                        Value.setMoney_Player1(Value.getMoney_Player1()+money);
                        Value.setTreasure8_Dragon_Scroll_Status(false);
                    }
                    else JOptionPane.showMessageDialog(Castle.this, "کد نامعتبراست!");
                }


                if (status==61 && Value.getPlayer()==2){
                    money=Methods.Money_Rand2();
                    if (Integer.parseInt(code)==Value.getTreasure1_Diamond_Ring_Code_Player2() && Value.isTreasure1_Diamond_Ring_Status()){
                        JOptionPane.showMessageDialog(Castle.this, "شما گنج انگشتر الماس را پیدا کردید\n"+"پاداش شما : "+money+"سکه ");
                        Value.setMoney_Player2(Value.getMoney_Player2()+money);
                        Value.setTreasure1_Diamond_Ring_Status(false);
                    }
                    else if (Integer.parseInt(code)==Value.getTreasure2_Jeweled_Sword_Code_Player2() && Value.isTreasure2_Jeweled_Sword_Status()){
                        JOptionPane.showMessageDialog(Castle.this, "شما گنج شمشیر جواهر نشان را پیدا کردید\n"+"پاداش شما : "+money+"سکه ");
                        Value.setMoney_Player2(Value.getMoney_Player2()+money);
                        Value.setTreasure2_Jeweled_Sword_Status(false);
                    }
                    else if (Integer.parseInt(code)==Value.getTreasure3_Golden_Glass_Code_Player2() && Value.isTreasure3_Golden_Glass_Status()){
                        JOptionPane.showMessageDialog(Castle.this, "شما گنج لیوان طلایی را پیدا کردید\n"+"پاداش شما : "+money+"سکه ");
                        Value.setMoney_Player2(Value.getMoney_Player2()+money);
                        Value.setTreasure3_Golden_Glass_Status(false);
                    }
                    else if (Integer.parseInt(code)==Value.getTreasure4_Glass_Cup_Code_Player2() && Value.isTreasure4_Glass_Cup_Status()){
                        JOptionPane.showMessageDialog(Castle.this, "شما گنج جام شیشه ای را پیدا کردید\n"+"پاداش شما : "+money+"سکه ");
                        Value.setMoney_Player2(Value.getMoney_Player2()+money);
                        Value.setTreasure4_Glass_Cup_Status(false);
                    }
                    else if (Integer.parseInt(code)==Value.getTreasure5_Wooden_Bow_Code_Player2() && Value.isTreasure5_Wooden_Bow_Status()){
                        JOptionPane.showMessageDialog(Castle.this, "شما گنج کمان چوبی را پیدا کردید\n"+"پاداش شما : "+money+"سکه ");
                        Value.setMoney_Player2(Value.getMoney_Player2()+money);
                        Value.setTreasure5_Wooden_Bow_Status(false);
                    }
                    else if (Integer.parseInt(code)==Value.getTreasure6_Steel_Shield_Code_Player2() && Value.isTreasure6_Steel_Shield_Status()){
                        JOptionPane.showMessageDialog(Castle.this, "شما گنج سپر پولادین را پیدا کردید\n"+"پاداش شما : "+money+"سکه ");
                        Value.setMoney_Player2(Value.getMoney_Player2()+money);
                        Value.setTreasure6_Steel_Shield_Status(false);
                    }
                    else if (Integer.parseInt(code)==Value.getTreasure7_Golden_Key_Code_Player2() && Value.isTreasure7_Golden_Key_Status()){
                        JOptionPane.showMessageDialog(Castle.this, "شما گنج کلید زرین را پیدا کردید\n"+"پاداش شما : "+money+"سکه ");
                        Value.setMoney_Player2(Value.getMoney_Player2()+money);
                        Value.setTreasure7_Golden_Key_Status(false);
                    }
                    else if (Integer.parseInt(code)==Value.getTreasure8_Dragon_Scroll_Code_Player2() && Value.isTreasure8_Dragon_Scroll_Status()){
                        JOptionPane.showMessageDialog(Castle.this, "شما گنج طومار اژدها را پیدا کردید\n"+"پاداش شما : "+money+"سکه ");
                        Value.setMoney_Player2(Value.getMoney_Player2()+money);
                        Value.setTreasure8_Dragon_Scroll_Status(false);
                    }
                    else JOptionPane.showMessageDialog(Castle.this, "کد نامعتبراست!");
                }


                if (status==61 && Value.getPlayer()==3){
                    money=Methods.Money_Rand2();
                    if (Integer.parseInt(code)==Value.getTreasure1_Diamond_Ring_Code_Player3() && Value.isTreasure1_Diamond_Ring_Status()){
                        JOptionPane.showMessageDialog(Castle.this, "شما گنج انگشتر الماس را پیدا کردید\n"+"پاداش شما : "+money+"سکه ");
                        Value.setMoney_Player3(Value.getMoney_Player3()+money);
                        Value.setTreasure1_Diamond_Ring_Status(false);
                    }
                    else if (Integer.parseInt(code)==Value.getTreasure2_Jeweled_Sword_Code_Player3() && Value.isTreasure2_Jeweled_Sword_Status()){
                        JOptionPane.showMessageDialog(Castle.this, "شما گنج شمشیر جواهر نشان را پیدا کردید\n"+"پاداش شما : "+money+"سکه ");
                        Value.setMoney_Player3(Value.getMoney_Player3()+money);
                        Value.setTreasure2_Jeweled_Sword_Status(false);
                    }
                    else if (Integer.parseInt(code)==Value.getTreasure3_Golden_Glass_Code_Player3() && Value.isTreasure3_Golden_Glass_Status()){
                        JOptionPane.showMessageDialog(Castle.this, "شما گنج لیوان طلایی را پیدا کردید\n"+"پاداش شما : "+money+"سکه ");
                        Value.setMoney_Player3(Value.getMoney_Player3()+money);
                        Value.setTreasure3_Golden_Glass_Status(false);
                    }
                    else if (Integer.parseInt(code)==Value.getTreasure4_Glass_Cup_Code_Player3() && Value.isTreasure4_Glass_Cup_Status()){
                        JOptionPane.showMessageDialog(Castle.this, "شما گنج جام شیشه ای را پیدا کردید\n"+"پاداش شما : "+money+"سکه ");
                        Value.setMoney_Player3(Value.getMoney_Player3()+money);
                        Value.setTreasure4_Glass_Cup_Status(false);
                    }
                    else if (Integer.parseInt(code)==Value.getTreasure5_Wooden_Bow_Code_Player3() && Value.isTreasure5_Wooden_Bow_Status()){
                        JOptionPane.showMessageDialog(Castle.this, "شما گنج کمان چوبی را پیدا کردید\n"+"پاداش شما : "+money+"سکه ");
                        Value.setMoney_Player3(Value.getMoney_Player3()+money);
                        Value.setTreasure5_Wooden_Bow_Status(false);
                    }
                    else if (Integer.parseInt(code)==Value.getTreasure6_Steel_Shield_Code_Player3() && Value.isTreasure6_Steel_Shield_Status()){
                        JOptionPane.showMessageDialog(Castle.this, "شما گنج سپر پولادین را پیدا کردید\n"+"پاداش شما : "+money+"سکه ");
                        Value.setMoney_Player3(Value.getMoney_Player3()+money);
                        Value.setTreasure6_Steel_Shield_Status(false);
                    }
                    else if (Integer.parseInt(code)==Value.getTreasure7_Golden_Key_Code_Player3() && Value.isTreasure7_Golden_Key_Status()){
                        JOptionPane.showMessageDialog(Castle.this, "شما گنج کلید زرین را پیدا کردید\n"+"پاداش شما : "+money+"سکه ");
                        Value.setMoney_Player3(Value.getMoney_Player3()+money);
                        Value.setTreasure7_Golden_Key_Status(false);
                    }
                    else if (Integer.parseInt(code)==Value.getTreasure8_Dragon_Scroll_Code_Player3() && Value.isTreasure8_Dragon_Scroll_Status()){
                        JOptionPane.showMessageDialog(Castle.this, "شما گنج طومار اژدها را پیدا کردید\n"+"پاداش شما : "+money+"سکه ");
                        Value.setMoney_Player3(Value.getMoney_Player3()+money);
                        Value.setTreasure8_Dragon_Scroll_Status(false);
                    }
                    else JOptionPane.showMessageDialog(Castle.this, "کد نامعتبراست!");
                }


                if (status==61 && Value.getPlayer()==4){
                    money=Methods.Money_Rand2();
                    if (Integer.parseInt(code)==Value.getTreasure1_Diamond_Ring_Code_Player4() && Value.isTreasure1_Diamond_Ring_Status()){
                        JOptionPane.showMessageDialog(Castle.this, "شما گنج انگشتر الماس را پیدا کردید\n"+"پاداش شما : "+money+"سکه ");
                        Value.setMoney_Player4(Value.getMoney_Player4()+money);
                        Value.setTreasure1_Diamond_Ring_Status(false);
                    }
                    else if (Integer.parseInt(code)==Value.getTreasure2_Jeweled_Sword_Code_Player4() && Value.isTreasure2_Jeweled_Sword_Status()){
                        JOptionPane.showMessageDialog(Castle.this, "شما گنج شمشیر جواهر نشان را پیدا کردید\n"+"پاداش شما : "+money+"سکه ");
                        Value.setMoney_Player4(Value.getMoney_Player4()+money);
                        Value.setTreasure2_Jeweled_Sword_Status(false);
                    }
                    else if (Integer.parseInt(code)==Value.getTreasure3_Golden_Glass_Code_Player4() && Value.isTreasure3_Golden_Glass_Status()){
                        JOptionPane.showMessageDialog(Castle.this, "شما گنج لیوان طلایی را پیدا کردید\n"+"پاداش شما : "+money+"سکه ");
                        Value.setMoney_Player4(Value.getMoney_Player4()+money);
                        Value.setTreasure3_Golden_Glass_Status(false);
                    }
                    else if (Integer.parseInt(code)==Value.getTreasure4_Glass_Cup_Code_Player4() && Value.isTreasure4_Glass_Cup_Status()){
                        JOptionPane.showMessageDialog(Castle.this, "شما گنج جام شیشه ای را پیدا کردید\n"+"پاداش شما : "+money+"سکه ");
                        Value.setMoney_Player4(Value.getMoney_Player4()+money);
                        Value.setTreasure4_Glass_Cup_Status(false);
                    }
                    else if (Integer.parseInt(code)==Value.getTreasure5_Wooden_Bow_Code_Player4() && Value.isTreasure5_Wooden_Bow_Status()){
                        JOptionPane.showMessageDialog(Castle.this, "شما گنج کمان چوبی را پیدا کردید\n"+"پاداش شما : "+money+"سکه ");
                        Value.setMoney_Player4(Value.getMoney_Player4()+money);
                        Value.setTreasure5_Wooden_Bow_Status(false);
                    }
                    else if (Integer.parseInt(code)==Value.getTreasure6_Steel_Shield_Code_Player4() && Value.isTreasure6_Steel_Shield_Status()){
                        JOptionPane.showMessageDialog(Castle.this, "شما گنج سپر پولادین را پیدا کردید\n"+"پاداش شما : "+money+"سکه ");
                        Value.setMoney_Player4(Value.getMoney_Player4()+money);
                        Value.setTreasure6_Steel_Shield_Status(false);
                    }
                    else if (Integer.parseInt(code)==Value.getTreasure7_Golden_Key_Code_Player4() && Value.isTreasure7_Golden_Key_Status()){
                        JOptionPane.showMessageDialog(Castle.this, "شما گنج کلید زرین را پیدا کردید\n"+"پاداش شما : "+money+"سکه ");
                        Value.setMoney_Player4(Value.getMoney_Player4()+money);
                        Value.setTreasure7_Golden_Key_Status(false);
                    }
                    else if (Integer.parseInt(code)==Value.getTreasure8_Dragon_Scroll_Code_Player4() && Value.isTreasure8_Dragon_Scroll_Status()){
                        JOptionPane.showMessageDialog(Castle.this, "شما گنج طومار اژدها را پیدا کردید\n"+"پاداش شما : "+money+"سکه ");
                        Value.setMoney_Player4(Value.getMoney_Player4()+money);
                        Value.setTreasure8_Dragon_Scroll_Status(false);
                    }
                    else JOptionPane.showMessageDialog(Castle.this, "کد نامعتبراست!");
                }


                if (status!=61)JOptionPane.showMessageDialog(Castle.this, "عملیات مجاز نیست!!");



            }
        });



        JPanel buttonPanel = new JPanel(new FlowLayout(FlowLayout.CENTER));
        buttonPanel.add(checkButton);

        // Create a container panel for the scroll pane and the chests panel
        JPanel container = new JPanel(new BorderLayout());
        container.add(scrollPane, BorderLayout.CENTER);
        container.add(chestsPanel, BorderLayout.NORTH);
        container.add(buttonPanel, BorderLayout.SOUTH);

        // Set the size and position of the window
        setSize(400, 400);
        setLocationRelativeTo(null);

        // Add the container panel to the window
        add(container);

        // Set the window to be visible
        setVisible(true);
    }
}
