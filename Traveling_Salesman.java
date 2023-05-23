package classes;
import javax.imageio.ImageIO;
import javax.swing.*;
import java.io.File;
import java.io.IOException;

public class Traveling_Salesman {

    public static void main(String[] args) throws IOException {
        JFrame frame = new JFrame("welcome");
        try {
            frame.setContentPane(new JLabel(new ImageIcon(ImageIO.read(new File("image\\beforeintro.png")))));
        } catch (IOException e) {
            e.printStackTrace();
        }
        frame.pack();
        frame.setBounds(-5,-30,1550,880);
        frame.setVisible(true);
        try {
            Thread.sleep(7000);
        } catch (Exception e) {
            e.printStackTrace();
        }
        frame.setVisible(false);
        Game game=Game.getInstance();

    }
}