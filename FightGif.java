package classes;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.io.File;
import java.io.IOException;

public class FightGif {
    JFrame introFrame;
    FightGif(){
        introFrame=new JFrame();
        try {
            introFrame.setContentPane(new JLabel(new ImageIcon(ImageIO.read(new File("image\\beforeintro.png")))));
        } catch (IOException e) {
            e.printStackTrace();
        }
        introFrame.pack();
        JDialog loadingDialog = new JDialog(introFrame, "Loading...", true);
        loadingDialog.setUndecorated(true); // remove window decorations
        loadingDialog.setSize(Toolkit.getDefaultToolkit().getScreenSize()); // set size to screen size
        loadingDialog.setLocationRelativeTo(null); // center the dialog
        loadingDialog.setLayout(new BorderLayout());
        ImageIcon loadingImage = new ImageIcon("D:\\Bluetooth\\giffight2.gif");
        JLabel loadingLabel = new JLabel(loadingImage, SwingConstants.CENTER);
        loadingDialog.add(loadingLabel, BorderLayout.CENTER);


        // Add action listener to show the loading dialog and start the timer

        SwingUtilities.invokeLater(() -> {
            loadingDialog.setVisible(true); // show the loading dialog on the EDT
            introFrame.dispose();
            Value.Start=true;
        });
        Timer timer = new Timer(10200, timerEvent -> {
            loadingDialog.setVisible(false); // hide the loading dialog
        });
        timer.setRepeats(false); // stop the timer after one execution
        timer.start();
    }
}
