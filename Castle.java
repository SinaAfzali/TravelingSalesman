package classes;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Castle extends JFrame {

    private JTable playerTable;
    private JScrollPane scrollPane;
    private JLabel chestsLabel,quest_label;
    JTextField codeField;

    public static int status=0;

    static String text1="";
    static String text2="";
    static String text3="";
    static String text4="";
    static String text5="";
    static String text6="";
    static String text7="";
    static String text8="";
    static  String text9="";
    static String text10="";
    static String text11="";
    static String text12="";
    static  String text13="";
    static String text14="";
    static String text15="";
    static String text16="";
    static String text17="";
    static String text18="";
    static String text19="";
    static  String text20="";
    static  String text21="";
    static  String text22="";
    static  String text23="";
    static  String text24="";
    static  String text25="";

    public Castle() {
        // Create the table with player data
        String[] columnNames = {text1, text2, text3, text4};
        Object[][] data = {
                {text5, Value.getPower_Player1(), Value.getMoney_Player1(),Value.getPower_Player1()*5+Value.getMoney_Player1() },
                {text6, Value.getPower_Player2(), Value.getMoney_Player2(), Value.getPower_Player2()*5+Value.getMoney_Player2()},
                {text7,  Value.getPower_Player3(), Value.getMoney_Player3(), Value.getPower_Player3()*5+Value.getMoney_Player3()},
                {text8, Value.getPower_Player4(), Value.getMoney_Player3(), Value.getPower_Player4()*5+Value.getMoney_Player4()},
        };
        playerTable = new JTable(data, columnNames);

        // Add the table to a scroll pane
        scrollPane = new JScrollPane(playerTable);
        // Add a label for the chests codes and a text field to enter new codes
        chestsLabel = new JLabel();
        codeField = new JTextField(10);
        JLabel codeLabel = new JLabel(text9);
        codeLabel.setFont(new Font("serif",Font.ITALIC,18));
        JPanel chestsPanel = new JPanel(new FlowLayout(FlowLayout.RIGHT));
        chestsPanel.add(chestsLabel);
        chestsPanel.add(codeLabel);
        chestsPanel.add(codeField);

        // Add a button to check the code and show a message if the player is the owner of the chest
        JButton checkButton = new JButton(text10);
        checkButton.setBackground(Color.GREEN);

        checkButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {

                String code = codeField.getText();
                long money;
                if (status==61 && Value.getPlayer()==1){
                     money=Methods.Money_Rand2();
                    if (Integer.parseInt(code)==Value.getTreasure1_Diamond_Ring_Code_Player1() && Value.isTreasure1_Diamond_Ring_Status()) {
                        JOptionPane.showMessageDialog(Castle.this, text11 + text12 + money + text13);
                        Value.setMoney_Player1(Value.getMoney_Player1() + money);
                        Value.setTreasure1_Diamond_Ring_Status(false);
                        if (Value.quest == 1) {
                            long power = 2L * Methods.Money_Rand1();
                            JOptionPane.showMessageDialog(Castle.this, text14 + text12 + (3 * money) + text15 + text16 + power);
                            Value.setMoney_Player1(Value.getMoney_Player1() + (3 * money));
                            Value.setPower_Player1(Value.getPower_Player1() + power);
                            Value.change_Quest=true;
                        }
                    }
                    else if (Integer.parseInt(code)==Value.getTreasure2_Jeweled_Sword_Code_Player1() && Value.isTreasure2_Jeweled_Sword_Status()){
                        JOptionPane.showMessageDialog(Castle.this, text17+text12+money+text13);
                        Value.setMoney_Player1(Value.getMoney_Player1()+money);
                        Value.setTreasure2_Jeweled_Sword_Status(false);
                        if (Value.quest == 2) {
                            long power = 2L * Methods.Money_Rand1();
                            JOptionPane.showMessageDialog(Castle.this, text14 + text12 + (3 * money) + text15 + text16 + power);
                            Value.setMoney_Player1(Value.getMoney_Player1() + (3 * money));
                            Value.setPower_Player1(Value.getPower_Player1() + power);
                            Value.change_Quest=true;
                        }
                    }
                    else if (Integer.parseInt(code)==Value.getTreasure3_Golden_Glass_Code_Player1() && Value.isTreasure3_Golden_Glass_Status()){
                        JOptionPane.showMessageDialog(Castle.this, text18+text12+money+text13);
                        Value.setMoney_Player1(Value.getMoney_Player1()+money);
                        Value.setTreasure3_Golden_Glass_Status(false);
                        if (Value.quest == 3) {
                            long power = 2L * Methods.Money_Rand1();
                            JOptionPane.showMessageDialog(Castle.this, text14 + text12 + (3 * money) + text15 + text16 + power);
                            Value.setMoney_Player1(Value.getMoney_Player1() + (3 * money));
                            Value.setPower_Player1(Value.getPower_Player1() + power);
                            Value.change_Quest=true;
                        }
                    }
                    else if (Integer.parseInt(code)==Value.getTreasure4_Glass_Cup_Code_Player1() && Value.isTreasure4_Glass_Cup_Status()){
                        JOptionPane.showMessageDialog(Castle.this, text19+text12+money+text13);
                        Value.setMoney_Player1(Value.getMoney_Player1()+money);
                        Value.setTreasure4_Glass_Cup_Status(false);
                        if (Value.quest == 4) {
                            long power = 2L * Methods.Money_Rand1();
                            JOptionPane.showMessageDialog(Castle.this, text14 + text12 + (3 * money) + text15 + text16 + power);
                            Value.setMoney_Player1(Value.getMoney_Player1() + (3 * money));
                            Value.setPower_Player1(Value.getPower_Player1() + power);
                            Value.change_Quest=true;
                        }
                    }
                    else if (Integer.parseInt(code)==Value.getTreasure5_Wooden_Bow_Code_Player1() && Value.isTreasure5_Wooden_Bow_Status()){
                        JOptionPane.showMessageDialog(Castle.this, text20+text12+money+text13);
                        Value.setMoney_Player1(Value.getMoney_Player1()+money);
                        Value.setTreasure5_Wooden_Bow_Status(false);
                        if (Value.quest == 5) {
                            long power = 2L * Methods.Money_Rand1();
                            JOptionPane.showMessageDialog(Castle.this, text14 + text12 + (3 * money) + text15 + text16 + power);
                            Value.setMoney_Player1(Value.getMoney_Player1() + (3 * money));
                            Value.setPower_Player1(Value.getPower_Player1() + power);
                            Value.change_Quest=true;
                        }
                    }
                    else if (Integer.parseInt(code)==Value.getTreasure6_Steel_Shield_Code_Player1() && Value.isTreasure6_Steel_Shield_Status()){
                        JOptionPane.showMessageDialog(Castle.this, text21+text12+money+text13);
                        Value.setMoney_Player1(Value.getMoney_Player1()+money);
                        Value.setTreasure6_Steel_Shield_Status(false);
                        if (Value.quest == 6) {
                            long power = 2L * Methods.Money_Rand1();
                            JOptionPane.showMessageDialog(Castle.this, text14 + text12 + (3 * money) + text15 + text16 + power);
                            Value.setMoney_Player1(Value.getMoney_Player1() + (3 * money));
                            Value.setPower_Player1(Value.getPower_Player1() + power);
                            Value.change_Quest=true;
                        }
                    }
                    else if (Integer.parseInt(code)==Value.getTreasure7_Golden_Key_Code_Player1() && Value.isTreasure7_Golden_Key_Status()){
                        JOptionPane.showMessageDialog(Castle.this, text22+text12+money+ text13);
                        Value.setMoney_Player1(Value.getMoney_Player1()+money);
                        Value.setTreasure7_Golden_Key_Status(false);
                        if (Value.quest == 7) {
                            long power = 2L * Methods.Money_Rand1();
                            JOptionPane.showMessageDialog(Castle.this, text14 + text12 + (3 * money) + text15 + text16 + power);
                            Value.setMoney_Player1(Value.getMoney_Player1() + (3 * money));
                            Value.setPower_Player1(Value.getPower_Player1() + power);
                            Value.change_Quest=true;
                        }
                    }
                    else if (Integer.parseInt(code)==Value.getTreasure8_Dragon_Scroll_Code_Player1() && Value.isTreasure8_Dragon_Scroll_Status()){
                        JOptionPane.showMessageDialog(Castle.this, text23+text12+money+ text13);
                        Value.setMoney_Player1(Value.getMoney_Player1()+money);
                        Value.setTreasure8_Dragon_Scroll_Status(false);
                        if (Value.quest == 8) {
                            long power = 2L * Methods.Money_Rand1();
                            JOptionPane.showMessageDialog(Castle.this, text14 + text12 + (3 * money) + text15 + text16 + power);
                            Value.setMoney_Player1(Value.getMoney_Player1() + (3 * money));
                            Value.setPower_Player1(Value.getPower_Player1() + power);
                            Value.change_Quest=true;
                        }
                    }
                    else JOptionPane.showMessageDialog(Castle.this, text24);
                }


                if (status==61 && Value.getPlayer()==2){
                    money=Methods.Money_Rand2();
                    if (Integer.parseInt(code)==Value.getTreasure1_Diamond_Ring_Code_Player2() && Value.isTreasure1_Diamond_Ring_Status()){
                        JOptionPane.showMessageDialog(Castle.this, text11 + text12 + money + text13);
                        Value.setMoney_Player2(Value.getMoney_Player2()+money);
                        Value.setTreasure1_Diamond_Ring_Status(false);
                        if (Value.quest == 1) {
                            long power = 2L * Methods.Money_Rand1();
                            JOptionPane.showMessageDialog(Castle.this, text14 + text12 + (3 * money) + text15 + text16 + power);
                            Value.setMoney_Player2(Value.getMoney_Player2() + (3 * money));
                            Value.setPower_Player2(Value.getPower_Player2() + power);
                            Value.change_Quest=true;
                        }
                    }
                    else if (Integer.parseInt(code)==Value.getTreasure2_Jeweled_Sword_Code_Player2() && Value.isTreasure2_Jeweled_Sword_Status()){
                        JOptionPane.showMessageDialog(Castle.this, text17 + text12 + money + text13);
                        Value.setMoney_Player2(Value.getMoney_Player2()+money);
                        Value.setTreasure2_Jeweled_Sword_Status(false);
                        if (Value.quest == 2) {
                            long power = 2L * Methods.Money_Rand1();
                            JOptionPane.showMessageDialog(Castle.this, text14 + text12 + (3 * money) + text15 + text16 + power);
                            Value.setMoney_Player2(Value.getMoney_Player2() + (3 * money));
                            Value.setPower_Player2(Value.getPower_Player2() + power);
                            Value.change_Quest=true;
                        }
                    }
                    else if (Integer.parseInt(code)==Value.getTreasure3_Golden_Glass_Code_Player2() && Value.isTreasure3_Golden_Glass_Status()){
                        JOptionPane.showMessageDialog(Castle.this, text18 + text12 + money + text13);
                        Value.setMoney_Player2(Value.getMoney_Player2()+money);
                        Value.setTreasure3_Golden_Glass_Status(false);
                        if (Value.quest == 3) {
                            long power = 2L * Methods.Money_Rand1();
                            JOptionPane.showMessageDialog(Castle.this, text14 + text12 + (3 * money) + text15 + text16 + power);
                            Value.setMoney_Player2(Value.getMoney_Player2() + (3 * money));
                            Value.setPower_Player2(Value.getPower_Player2() + power);
                            Value.change_Quest=true;
                        }
                    }
                    else if (Integer.parseInt(code)==Value.getTreasure4_Glass_Cup_Code_Player2() && Value.isTreasure4_Glass_Cup_Status()){
                        JOptionPane.showMessageDialog(Castle.this, text19 + text12 + money + text13);
                        Value.setMoney_Player2(Value.getMoney_Player2()+money);
                        Value.setTreasure4_Glass_Cup_Status(false);
                        if (Value.quest == 4) {
                            long power = 2L * Methods.Money_Rand1();
                            JOptionPane.showMessageDialog(Castle.this, text14 + text12 + (3 * money) + text15 + text16 + power);
                            Value.setMoney_Player2(Value.getMoney_Player2() + (3 * money));
                            Value.setPower_Player2(Value.getPower_Player2() + power);
                            Value.change_Quest=true;
                        }
                    }
                    else if (Integer.parseInt(code)==Value.getTreasure5_Wooden_Bow_Code_Player2() && Value.isTreasure5_Wooden_Bow_Status()){
                        JOptionPane.showMessageDialog(Castle.this, text20 + text12 + money + text13);
                        Value.setMoney_Player2(Value.getMoney_Player2()+money);
                        Value.setTreasure5_Wooden_Bow_Status(false);
                        if (Value.quest == 5) {
                            long power = 2L * Methods.Money_Rand1();
                            JOptionPane.showMessageDialog(Castle.this, text14 + text12 + (3 * money) + text15 + text16 + power);
                            Value.setMoney_Player2(Value.getMoney_Player2() + (3 * money));
                            Value.setPower_Player2(Value.getPower_Player2() + power);
                            Value.change_Quest=true;
                        }
                    }
                    else if (Integer.parseInt(code)==Value.getTreasure6_Steel_Shield_Code_Player2() && Value.isTreasure6_Steel_Shield_Status()){
                        JOptionPane.showMessageDialog(Castle.this, text21 + text12 + money + text13);
                        Value.setMoney_Player2(Value.getMoney_Player2()+money);
                        Value.setTreasure6_Steel_Shield_Status(false);
                        if (Value.quest == 6) {
                            long power = 2L * Methods.Money_Rand1();
                            JOptionPane.showMessageDialog(Castle.this, text14 + text12 + (3 * money) + text15 + text16 + power);
                            Value.setMoney_Player2(Value.getMoney_Player2() + (3 * money));
                            Value.setPower_Player2(Value.getPower_Player2() + power);
                            Value.change_Quest=true;
                        }
                    }
                    else if (Integer.parseInt(code)==Value.getTreasure7_Golden_Key_Code_Player2() && Value.isTreasure7_Golden_Key_Status()){
                        JOptionPane.showMessageDialog(Castle.this, text22 + text12 + money + text13);
                        Value.setMoney_Player2(Value.getMoney_Player2()+money);
                        Value.setTreasure7_Golden_Key_Status(false);
                        if (Value.quest == 7) {
                            long power = 2L * Methods.Money_Rand1();
                            JOptionPane.showMessageDialog(Castle.this, text14 + text12 + (3 * money) + text15 + text16 + power);
                            Value.setMoney_Player2(Value.getMoney_Player2() + (3 * money));
                            Value.setPower_Player2(Value.getPower_Player2() + power);
                            Value.change_Quest=true;
                        }
                    }
                    else if (Integer.parseInt(code)==Value.getTreasure8_Dragon_Scroll_Code_Player2() && Value.isTreasure8_Dragon_Scroll_Status()){
                        JOptionPane.showMessageDialog(Castle.this, text23 + text12 + money + text13);
                        Value.setMoney_Player2(Value.getMoney_Player2()+money);
                        Value.setTreasure8_Dragon_Scroll_Status(false);
                        if (Value.quest == 8) {
                            long power = 2L * Methods.Money_Rand1();
                            JOptionPane.showMessageDialog(Castle.this, text14 + text12 + (3 * money) + text15 + text16 + power);
                            Value.setMoney_Player2(Value.getMoney_Player2() + (3 * money));
                            Value.setPower_Player2(Value.getPower_Player2() + power);
                            Value.change_Quest=true;
                        }
                    }
                    else JOptionPane.showMessageDialog(Castle.this, text24);
                }


                if (status==61 && Value.getPlayer()==3){
                    money=Methods.Money_Rand2();
                    if (Integer.parseInt(code)==Value.getTreasure1_Diamond_Ring_Code_Player3() && Value.isTreasure1_Diamond_Ring_Status()){
                        JOptionPane.showMessageDialog(Castle.this, text11 + text12 + money + text13);
                        Value.setMoney_Player3(Value.getMoney_Player3()+money);
                        Value.setTreasure1_Diamond_Ring_Status(false);
                        if (Value.quest == 1) {
                            long power = 2L * Methods.Money_Rand1();
                            JOptionPane.showMessageDialog(Castle.this, text14 + text12 + (3 * money) + text15 + text16 + power);
                            Value.setMoney_Player3(Value.getMoney_Player3() + (3 * money));
                            Value.setPower_Player3(Value.getPower_Player3() + power);
                            Value.change_Quest=true;
                        }
                    }
                    else if (Integer.parseInt(code)==Value.getTreasure2_Jeweled_Sword_Code_Player3() && Value.isTreasure2_Jeweled_Sword_Status()){
                        JOptionPane.showMessageDialog(Castle.this, text17 + text12 + money + text13);
                        Value.setMoney_Player3(Value.getMoney_Player3()+money);
                        Value.setTreasure2_Jeweled_Sword_Status(false);
                        if (Value.quest == 2) {
                            long power = 2L * Methods.Money_Rand1();
                            JOptionPane.showMessageDialog(Castle.this, text14 + text12 + (3 * money) + text15 + text16 + power);
                            Value.setMoney_Player3(Value.getMoney_Player3() + (3 * money));
                            Value.setPower_Player3(Value.getPower_Player3() + power);
                            Value.change_Quest=true;
                        }
                    }
                    else if (Integer.parseInt(code)==Value.getTreasure3_Golden_Glass_Code_Player3() && Value.isTreasure3_Golden_Glass_Status()){
                        JOptionPane.showMessageDialog(Castle.this, text18 + text12 + money + text13);
                        Value.setMoney_Player3(Value.getMoney_Player3()+money);
                        Value.setTreasure3_Golden_Glass_Status(false);
                        if (Value.quest == 3) {
                            long power = 2L * Methods.Money_Rand1();
                            JOptionPane.showMessageDialog(Castle.this, text14 + text12 + (3 * money) + text15 + text16 + power);
                            Value.setMoney_Player3(Value.getMoney_Player3() + (3 * money));
                            Value.setPower_Player3(Value.getPower_Player3() + power);
                            Value.change_Quest=true;
                        }
                    }
                    else if (Integer.parseInt(code)==Value.getTreasure4_Glass_Cup_Code_Player3() && Value.isTreasure4_Glass_Cup_Status()){
                        JOptionPane.showMessageDialog(Castle.this, text19 + text12 + money + text13);
                        Value.setMoney_Player3(Value.getMoney_Player3()+money);
                        Value.setTreasure4_Glass_Cup_Status(false);
                        if (Value.quest == 4) {
                            long power = 2L * Methods.Money_Rand1();
                            JOptionPane.showMessageDialog(Castle.this, text14 + text12 + (3 * money) + text15 + text16 + power);
                            Value.setMoney_Player3(Value.getMoney_Player3() + (3 * money));
                            Value.setPower_Player3(Value.getPower_Player3() + power);
                            Value.change_Quest=true;
                        }
                    }
                    else if (Integer.parseInt(code)==Value.getTreasure5_Wooden_Bow_Code_Player3() && Value.isTreasure5_Wooden_Bow_Status()){
                        JOptionPane.showMessageDialog(Castle.this, text20 + text12 + money + text13);
                        Value.setMoney_Player3(Value.getMoney_Player3()+money);
                        Value.setTreasure5_Wooden_Bow_Status(false);
                        if (Value.quest == 5) {
                            long power = 2L * Methods.Money_Rand1();
                            JOptionPane.showMessageDialog(Castle.this, text14 + text12 + (3 * money) + text15 + text16 + power);
                            Value.setMoney_Player3(Value.getMoney_Player3() + (3 * money));
                            Value.setPower_Player3(Value.getPower_Player3() + power);
                            Value.change_Quest=true;
                        }
                    }
                    else if (Integer.parseInt(code)==Value.getTreasure6_Steel_Shield_Code_Player3() && Value.isTreasure6_Steel_Shield_Status()){
                        JOptionPane.showMessageDialog(Castle.this, text21 + text12 + money + text13);
                        Value.setMoney_Player3(Value.getMoney_Player3()+money);
                        Value.setTreasure6_Steel_Shield_Status(false);
                        if (Value.quest == 6) {
                            long power = 2L * Methods.Money_Rand1();
                            JOptionPane.showMessageDialog(Castle.this, text14 + text12 + (3 * money) + text15 + text16 + power);
                            Value.setMoney_Player3(Value.getMoney_Player3() + (3 * money));
                            Value.setPower_Player3(Value.getPower_Player3() + power);
                            Value.change_Quest=true;
                        }
                    }
                    else if (Integer.parseInt(code)==Value.getTreasure7_Golden_Key_Code_Player3() && Value.isTreasure7_Golden_Key_Status()){
                        JOptionPane.showMessageDialog(Castle.this, text22 + text12 + money + text13);
                        Value.setMoney_Player3(Value.getMoney_Player3()+money);
                        Value.setTreasure7_Golden_Key_Status(false);
                        if (Value.quest == 7) {
                            long power = 2L * Methods.Money_Rand1();
                            JOptionPane.showMessageDialog(Castle.this, text14 + text12 + (3 * money) + text15 + text16 + power);
                            Value.setMoney_Player3(Value.getMoney_Player3() + (3 * money));
                            Value.setPower_Player3(Value.getPower_Player3() + power);
                            Value.change_Quest=true;
                        }
                    }
                    else if (Integer.parseInt(code)==Value.getTreasure8_Dragon_Scroll_Code_Player3() && Value.isTreasure8_Dragon_Scroll_Status()){
                        JOptionPane.showMessageDialog(Castle.this, text23 + text12 + money + text13);
                        Value.setMoney_Player3(Value.getMoney_Player3()+money);
                        Value.setTreasure8_Dragon_Scroll_Status(false);
                        if (Value.quest == 8) {
                            long power = 2L * Methods.Money_Rand1();
                            JOptionPane.showMessageDialog(Castle.this, text14 + text12 + (3 * money) + text15 + text16 + power);
                            Value.setMoney_Player3(Value.getMoney_Player3() + (3 * money));
                            Value.setPower_Player3(Value.getPower_Player3() + power);
                            Value.change_Quest=true;
                        }
                    }
                    else JOptionPane.showMessageDialog(Castle.this, text24);
                }


                if (status==61 && Value.getPlayer()==4){
                    money=Methods.Money_Rand2();
                    if (Integer.parseInt(code)==Value.getTreasure1_Diamond_Ring_Code_Player4() && Value.isTreasure1_Diamond_Ring_Status()){
                        JOptionPane.showMessageDialog(Castle.this, text11 + text12 + money + text13);
                        Value.setMoney_Player4(Value.getMoney_Player4()+money);
                        Value.setTreasure1_Diamond_Ring_Status(false);
                        if (Value.quest == 1) {
                            long power = 2L * Methods.Money_Rand1();
                            JOptionPane.showMessageDialog(Castle.this, text14 + text12 + (3 * money) + text15 + text16 + power);
                            Value.setMoney_Player4(Value.getMoney_Player4() + (3 * money));
                            Value.setPower_Player4(Value.getPower_Player4() + power);
                            Value.change_Quest=true;
                        }
                    }
                    else if (Integer.parseInt(code)==Value.getTreasure2_Jeweled_Sword_Code_Player4() && Value.isTreasure2_Jeweled_Sword_Status()){
                        JOptionPane.showMessageDialog(Castle.this, text17 + text12 + money + text13);
                        Value.setMoney_Player4(Value.getMoney_Player4()+money);
                        Value.setTreasure2_Jeweled_Sword_Status(false);
                        if (Value.quest == 2) {
                            long power = 2L * Methods.Money_Rand1();
                            JOptionPane.showMessageDialog(Castle.this, text14 + text12 + (3 * money) + text15 + text16 + power);
                            Value.setMoney_Player4(Value.getMoney_Player4() + (3 * money));
                            Value.setPower_Player4(Value.getPower_Player4() + power);
                            Value.change_Quest=true;
                        }
                    }
                    else if (Integer.parseInt(code)==Value.getTreasure3_Golden_Glass_Code_Player4() && Value.isTreasure3_Golden_Glass_Status()){
                        JOptionPane.showMessageDialog(Castle.this, text18 + text12 + money + text13);
                        Value.setMoney_Player4(Value.getMoney_Player4()+money);
                        Value.setTreasure3_Golden_Glass_Status(false);
                        if (Value.quest == 3) {
                            long power = 2L * Methods.Money_Rand1();
                            JOptionPane.showMessageDialog(Castle.this, text14 + text12 + (3 * money) + text15 + text16 + power);
                            Value.setMoney_Player4(Value.getMoney_Player4() + (3 * money));
                            Value.setPower_Player4(Value.getPower_Player4() + power);
                            Value.change_Quest=true;
                        }
                    }
                    else if (Integer.parseInt(code)==Value.getTreasure4_Glass_Cup_Code_Player4() && Value.isTreasure4_Glass_Cup_Status()){
                        JOptionPane.showMessageDialog(Castle.this, text19 + text12 + money + text13);
                        Value.setMoney_Player4(Value.getMoney_Player4()+money);
                        Value.setTreasure4_Glass_Cup_Status(false);
                        if (Value.quest == 4) {
                            long power = 2L * Methods.Money_Rand1();
                            JOptionPane.showMessageDialog(Castle.this, text14 + text12 + (3 * money) + text15 + text16 + power);
                            Value.setMoney_Player4(Value.getMoney_Player4() + (3 * money));
                            Value.setPower_Player4(Value.getPower_Player4() + power);
                            Value.change_Quest=true;
                        }
                    }
                    else if (Integer.parseInt(code)==Value.getTreasure5_Wooden_Bow_Code_Player4() && Value.isTreasure5_Wooden_Bow_Status()){
                        JOptionPane.showMessageDialog(Castle.this, text20 + text12 + money + text13);
                        Value.setMoney_Player4(Value.getMoney_Player4()+money);
                        Value.setTreasure5_Wooden_Bow_Status(false);
                        if (Value.quest == 5) {
                            long power = 2L * Methods.Money_Rand1();
                            JOptionPane.showMessageDialog(Castle.this, text14 + text12 + (3 * money) + text15 + text16 + power);
                            Value.setMoney_Player4(Value.getMoney_Player4() + (3 * money));
                            Value.setPower_Player4(Value.getPower_Player4() + power);
                            Value.change_Quest=true;
                        }
                    }
                    else if (Integer.parseInt(code)==Value.getTreasure6_Steel_Shield_Code_Player4() && Value.isTreasure6_Steel_Shield_Status()){
                        JOptionPane.showMessageDialog(Castle.this, text21 + text12 + money + text13);
                        Value.setMoney_Player4(Value.getMoney_Player4()+money);
                        Value.setTreasure6_Steel_Shield_Status(false);
                        if (Value.quest == 6) {
                            long power = 2L * Methods.Money_Rand1();
                            JOptionPane.showMessageDialog(Castle.this, text14 + text12 + (3 * money) + text15 + text16 + power);
                            Value.setMoney_Player4(Value.getMoney_Player4() + (3 * money));
                            Value.setPower_Player4(Value.getPower_Player4() + power);
                            Value.change_Quest=true;
                        }
                    }
                    else if (Integer.parseInt(code)==Value.getTreasure7_Golden_Key_Code_Player4() && Value.isTreasure7_Golden_Key_Status()){
                        JOptionPane.showMessageDialog(Castle.this, text22 + text12 + money + text13);
                        Value.setMoney_Player4(Value.getMoney_Player4()+money);
                        Value.setTreasure7_Golden_Key_Status(false);
                        if (Value.quest == 7) {
                            long power = 2L * Methods.Money_Rand1();
                            JOptionPane.showMessageDialog(Castle.this, text14 + text12 + (3 * money) + text15 + text16 + power);
                            Value.setMoney_Player4(Value.getMoney_Player4() + (3 * money));
                            Value.setPower_Player4(Value.getPower_Player4() + power);
                            Value.change_Quest=true;
                        }
                    }
                    else if (Integer.parseInt(code)==Value.getTreasure8_Dragon_Scroll_Code_Player4() && Value.isTreasure8_Dragon_Scroll_Status()){
                        JOptionPane.showMessageDialog(Castle.this, text23 + text12 + money + text13);
                        Value.setMoney_Player4(Value.getMoney_Player4()+money);
                        Value.setTreasure8_Dragon_Scroll_Status(false);
                        if (Value.quest == 8) {
                            long power = 2L * Methods.Money_Rand1();
                            JOptionPane.showMessageDialog(Castle.this, text14 + text12 + (3 * money) + text15 + text16 + power);
                            Value.setMoney_Player4(Value.getMoney_Player4() + (3 * money));
                            Value.setPower_Player4(Value.getPower_Player4() + power);
                            Value.change_Quest=true;
                        }
                    }
                    else JOptionPane.showMessageDialog(Castle.this, text24);
                }


                if (status!=61)JOptionPane.showMessageDialog(Castle.this, text25);



            }
        });

        JPanel buttonPanel = new JPanel(new FlowLayout(FlowLayout.CENTER));
        buttonPanel.add(checkButton);

        // Create a container panel for the scroll pane and the chests panel
        JPanel container = new JPanel(new BorderLayout());
        container.add(scrollPane, BorderLayout.CENTER);
        container.add(chestsPanel, BorderLayout.NORTH);
        container.add(buttonPanel, BorderLayout.SOUTH);
        container.setBounds(0,50,400,200);
        // Set the size and position of the window
        setSize(400, 400);
        setLocationRelativeTo(null);




        // Add the container panel to the window
        add(container);

        // Set the window to be visible
        setVisible(false);
    }
}
