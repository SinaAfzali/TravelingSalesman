package classes;
import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Fight extends JFrame {

    private JPanel contentPane;
    private JLabel player1Label, player2Label, resultLabel;
    private JTextField player1Field, player2Field;

    private JButton fightButton, closeButton;

    private JLabel player1NewPowerLabel, player2NewPowerLabel;

    public Fight(int p1,int p2,long pow1,long pow2,long money1,long money2) {

        long point1=(pow1*5)+money1;
        long point2=(pow2*5)+money2;


        setTitle("Fight Window");
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setBounds(580, 250, 400, 250);

        contentPane=new JPanel(new GridLayout(10,10)){
            protected void paintComponent(Graphics g){
                super.paintComponent(g);
                ImageIcon backgroundImage = new ImageIcon("D:\\Programming\\intellij\\Traveling_Salesman\\image\\afterfight.jpg");
                g.drawImage(backgroundImage.getImage(),0,0,null);
            }
        };

        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        setContentPane(contentPane);
        contentPane.setLayout(null);

        player1Label = new JLabel("بازیکن "+p1);
        player1Label.setForeground (Color.white);
        player1Label.setBounds(10, 25, 100, 20);
        player1Label.setFont(new Font("serif",Font.BOLD,24));
        contentPane.add(player1Label);

        player1Field = new JTextField(""+point1);
        player1Field.setBounds(120, 25, 100, 20);
        player1Field.setEditable(false);
        contentPane.add(player1Field);

        player2Label = new JLabel("بازیکن "+p2);
        player2Label.setBounds(10, 60, 100, 20);
        player2Label.setForeground (Color.white);
        player2Label.setFont(new Font("serif",Font.BOLD,24));
        contentPane.add(player2Label);

        player2Field = new JTextField(""+point2);
        player2Field.setBounds(120, 60, 100, 20);
        player2Field.setEditable(false);
        contentPane.add(player2Field);


        resultLabel = new JLabel();
        resultLabel.setBounds(10, 130, 400, 40);
        contentPane.add(resultLabel);

        resultLabel.setFont(new Font("serif",Font.BOLD,32));
        if (point1>=point2){
            Value.win_Fight=p1;
            resultLabel.setText("بازیکن "+p1+" برنده شد           ");
        }
        else {
            resultLabel.setText("بازیکن "+p2+" برنده شد           ");
            Value.win_Fight=p2;
        }
        resultLabel.setForeground(Color.white);

        setVisible(true);
        try {
            Thread.sleep(3000);
        } catch (Exception e) {
        }
        setVisible(false);
    }
}
