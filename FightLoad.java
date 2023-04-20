package classes;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class FightLoad extends JFrame {
    public FightLoad() {
        setTitle("Loading");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 300, 200);

        JLabel label = new JLabel(new ImageIcon("D:\\Bluetooth\\diffight.gif"));
        add(label);

        Timer timer = new Timer(10000, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                dispose();
                new Fight();
            }
        });
        timer.start();

        setVisible(true);
    }

}
