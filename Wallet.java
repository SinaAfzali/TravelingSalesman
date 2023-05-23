package classes;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Wallet extends JFrame{

        private JTable playerTable;
        private JScrollPane scrollPane;

        public Wallet() {
            // Create the table with player data
            String[] columnNames = { "Player",Castle.text2, Castle.text3, Castle.text4 ,Market.text14,Market.text7,Market.text24,Market.text35,Market.text31,Market.text28,Market.text19};
            Object[][] data = {
                    {Castle.text5, Value.getPower_Player1(), Value.getMoney_Player1(),Value.getPower_Player1()*5+Value.getMoney_Player1(),Value.getSword_player1(),Value.getShield_player1(),Value.getFood_player1(),Value.getBow_player1(),Value.getBook_player1(),Value.getPotion_player1(),Value.getArmor_player1()},
                    {Castle.text6, Value.getPower_Player2(), Value.getMoney_Player2(), Value.getPower_Player2()*5+Value.getMoney_Player2(),Value.getSword_player2(),Value.getShield_player2(),Value.getFood_player2(),Value.getBow_player2(),Value.getBook_player2(),Value.getPotion_player2(),Value.getArmor_player2()},
                    {Castle.text7,  Value.getPower_Player3(), Value.getMoney_Player3(), Value.getPower_Player3()*5+Value.getMoney_Player3(),Value.getSword_player3(),Value.getShield_player3(),Value.getFood_player3(),Value.getBow_player3(),Value.getBook_player3(),Value.getPotion_player3(),Value.getArmor_player3()},
                    {Castle.text8, Value.getPower_Player4(), Value.getMoney_Player4(), Value.getPower_Player4()*5+Value.getMoney_Player4(),Value.getSword_player4(),Value.getShield_player4(),Value.getFood_player4(),Value.getBow_player4(),Value.getBook_player4(),Value.getPotion_player4(),Value.getArmor_player4()},
            };
            playerTable = new JTable(data, columnNames);

//            playerTable.getColumnModel().getColumn(1).setPreferredWidth(150);
            // Add the table to a scroll pane
            scrollPane = new JScrollPane(playerTable);
            // Add a label for the chests codes and a text field to enter new codes

            // Add a button to check the code and show a message if the player is the owner of the chest

            // Create a container panel for the scroll pane and the chests panel
            JPanel container = new JPanel(new BorderLayout());
            container.add(scrollPane, BorderLayout.CENTER);
            container.setBounds(0,0,700,180);
            // Set the size and position of the window
            setSize(700, 180);
            setLocationRelativeTo(null);




            // Add the container panel to the window
            add(container);

            // Set the window to be visible
            setVisible(false);

    }

}
