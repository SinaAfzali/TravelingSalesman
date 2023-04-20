package classes;
import java.awt.*;
import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import javax.swing.*;

import javazoom.jl.decoder.JavaLayerException;
import javazoom.jl.player.Player;
public class Music {
    public static JFrame frame5;
     FileInputStream fis;
     BufferedInputStream bis;
    String music;
     Player player;
     long pauseloc;
     long total;
     String Fileloc;
     Button btnStop;
     Button btnPlay;

    public  String filepath;

    public Music(String filepath) {
        music=filepath;
        this.filepath=filepath;
        Frame_main();
        btnPlay.addActionListener((e)->{
            change();
        });
        btnStop.addActionListener((e)->{
            if (btnStop.getLabel()=="قطع کردن صدا"){stop();}
            else {
                change2();
                btnStop.setLabel("قطع کردن صدا");
                btnStop.setBackground(new Color(255,0,0));
            }
        });
    }

    public void play(String path) {
        if(fis==null){
            try {
                fis = new FileInputStream(new File(path));
                bis = new BufferedInputStream(fis);
                player = new Player(bis);
                total = fis.available();
            } catch (FileNotFoundException | JavaLayerException ex) {
            } catch (IOException ex) {
            }
        }else {
            try {
                fis = new FileInputStream(new File(path));
                fis.skip(total-pauseloc);
            } catch (IOException ex) {

            }
            bis = new BufferedInputStream(fis);
            try {
                player = new Player(bis);
            } catch (Exception  ex) {
            }
        }
        new Thread(){
            @Override
            public void run() {
                try {
                    if(bis !=null){
                        player.play();
                    }
                } catch (JavaLayerException ex) {
                    System.err.println(ex.getMessage());
                }
            }
        }.start();
    }
    public void change() {
        if (player!=null) {
            player.close();
            music = Methods.Change_Music();
               fis = null;
        }
            play(music);
            if(player.isComplete()==true)player=null;
    }
    public void change2() {
        if (player!=null) {
            player.close();
        }
        play(music);
    }

    public void stop(){
        if(player !=null){
            try {
                pauseloc = fis.available();
                player.close();
            } catch (IOException ex) {
            }
            btnStop.setLabel("وصل کردن صدا");
            btnStop.setBackground(Color.GREEN);
        }
    }


    public void Frame_main() {
        frame5 = new JFrame("موسیقی");
        frame5.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame5.setLocationRelativeTo(null);
        frame5.setLayout(null);
        frame5.setResizable(false);
        frame5.setBounds(630,270,250, 220);
        frame5.setVisible(false);
        btnPlay = new Button("تغییر موسیقی");
        btnPlay.setFont(new Font("serif",Font.BOLD,24));
        btnStop = new Button("قطع کردن صدا");
        btnStop.setFont(new Font("serif",Font.BOLD,24));
        btnPlay.setBounds(50, 40, 150, 40);
        btnStop.setBounds(50, 110, 150, 40);
        btnPlay.setBackground(Color.CYAN);
        btnStop.setBackground(new Color(255,0,0));
        frame5.add(btnPlay);
        frame5.add(btnStop);
    }

}