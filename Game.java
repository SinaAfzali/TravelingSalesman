package classes;

import javax.swing.*;
import java.awt.*;
import java.io.IOException;

public class Game {
    private static Game instance;

    static {
        try {
            instance = new Game();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }


    public static Game getInstance() {
        return instance;
    }



    Intro intro;

    private Game() throws IOException {


        UIManager.put("OptionPane.messageFont", new Font("serif", Font.BOLD, 24));
        UIManager.put("OptionPane.background", new Color(0, 0, 0, 255));
        String Address_Image_Player1 = "image\\p1.png";
        String Address_Image_Player2 = "image\\p2.png";
        String Address_Image_Player3 = "image\\p3.png";
        String Address_Image_Player4 = "image\\p4.png";




        int quest = 0;
        int st=0;
        int st2=0;
        int[] Treasure_single_code = new int[8];
        long sleep = 0;
        boolean move_single = true;
        boolean Start_game = false;
        int[] paste = new int[7];
        int[] paste2 = new int[121];
        final long Total_Time = 1201000;
        long Time_Player = 30100;
        long Time_Player2 = 0;
        long Start_Time_Player = 0;
        long Time_Now = 0;
        long Start_Time = System.currentTimeMillis();
        long Elapsed_Time = 0;
        long Total_Time2=0;
        long Remaining_Time = 0;
        long Time_Now_Player = 0;
        long Elapsed_Time_Player = 0;
        long Remaining_Time_Player = 0;
        long Second_Player = 0;
        long Remaining_Time1 = 0;
        long Remaining_Time1_Player = 0;
        long Minutes = 5;
        long Second = 5;
        long Time = 0;
        long penalty = 0;
        Player Player1 = new Player();
        Player Player2 = new Player();
        Player Player3 = new Player();
        Player Player4 = new Player();
        intro=new Intro();
        intro.introFrame.setVisible(true);
        Single_Player Single_Player = new Single_Player();
        Market market = new Market();
        market.setVisible(false);
        Castle castle = new Castle();
        castle.setVisible(false);
        Single_Player Single_player = new Single_Player();
        Single_player.frame.setVisible(false);
        String[] Quests = new String[8];
        int[] quests = new int[8];
        Quests[0] = "شما باید گنج انگشتر الماس را پیدا کنید     ";
        Quests[1] = "شما باید گنج شمشیر جواهر نشان را پیدا کن    ";
        Quests[2] = "شما باید گنج لیوان طلایی را پیدا کنید     ";
        Quests[3] = "شما باید گنج جام شیشه ای را پیدا کنید     ";
        Quests[4] = "شما باید گنج کمان چوبی را پیدا کنید     ";
        Quests[5] = "شما باید گنج سپر پولادین را پیدا کنید     ";
        Quests[6] = "شما باید گنج کلید زرین را پیدا کنید     ";
        Quests[7] = "شما باید گنج طومار اژدها را پیدا کنید     ";




        quest = Methods.Quest_Rand();
        quests[0] = quest;


        for(int i=0;i<12;i++){
            for (int j=0;j<11;j++){
                Player1.cells[i][j].setFocusPainted(false);
                Player2.cells[i][j].setFocusPainted(false);
                Player3.cells[i][j].setFocusPainted(false);
                Player4.cells[i][j].setFocusPainted(false);
                Single_player.cells[i][j].setFocusPainted(false);
            }
        }


            for (int i = 0; i < 11; i++) {
            Player1.cells[0][i].setBorder(BorderFactory.createLineBorder(new Color(12, 132, 197, 255), 2));
            Player2.cells[0][i].setBorder(BorderFactory.createLineBorder(new Color(12, 132, 197, 255), 2));
            Player3.cells[0][i].setBorder(BorderFactory.createLineBorder(new Color(12, 132, 197, 255), 2));
            Player4.cells[0][i].setBorder(BorderFactory.createLineBorder(new Color(12, 132, 197, 255), 2));
            Single_player.cells[0][i].setBorder(BorderFactory.createLineBorder(new Color(12, 132, 197, 255), 2));
        }

        Player1.SetColorBackground(0, 2, new Color(12, 132, 197, 255));
        Player1.SetColorBackground(0, 8, new Color(12, 132, 197, 255));

        Player2.SetColorBackground(0, 2, new Color(12, 132, 197, 255));
        Player2.SetColorBackground(0, 8, new Color(12, 132, 197, 255));

        Player3.SetColorBackground(0, 2, new Color(12, 132, 197, 255));
        Player3.SetColorBackground(0, 8, new Color(12, 132, 197, 255));

        Player4.SetColorBackground(0, 2, new Color(12, 132, 197, 255));
        Player4.SetColorBackground(0, 8, new Color(12, 132, 197, 255));

        Single_player.SetColorBackground(0, 2, new Color(12, 132, 197, 255));
        Single_player.SetColorBackground(0, 8, new Color(12, 132, 197, 255));


        int []image_cells_player1=new int[121];
        int []image_cells_player2=new int[121];
        int []image_cells_player3=new int[121];
        int []image_cells_player4=new int[121];
        int []image_cells_single=new int[121];

        for (int i=0;i<121;i++){
            image_cells_single[i]=-1;
            image_cells_player1[i]=-1;
            image_cells_player2[i]=-1;
            image_cells_player3[i]=-1;
            image_cells_player4[i]=-1;
        }

        for (int i = 1; i < 12; i++) {
            for (int j = 0; j < 11; j++) {
                Player2.SetColorBackground(i, j, Color.GREEN);
            }
        }
        for (int i = 1; i < 12; i++) {
            for (int j = 0; j < 11; j++) {
                Player3.SetColorBackground(i, j, Color.pink);
            }
        }
        for (int i = 1; i < 12; i++) {
            for (int j = 0; j < 11; j++) {
                Player4.SetColorBackground(i, j, Color.MAGENTA);
            }
        }
        for (int i = 1; i < 12; i++) {
            for (int j = 0; j < 11; j++) {
                Single_player.SetColorBackground(i, j, Color.GREEN);
            }
        }





        Player1.label4.setText("زمان بازی:  ");
        Player1.label3.setText("زمان شما:  ");
        Player2.label4.setText("زمان بازی:  ");
        Player2.label3.setText("زمان شما:  ");
        Player3.label4.setText("زمان بازی:  ");
        Player3.label3.setText("زمان شما:  ");
        Player4.label4.setText("زمان بازی:  ");
        Player4.label3.setText("زمان شما:  ");
        Single_player.label4.setText("زمان بازی:  ");
        Single_player.label3.setText("زمان شما:  ");


        Player1.cells[0][7].setFont(new Font("serif", Font.BOLD, 24));
        Player1.cells[0][6].setFont(new Font("serif", Font.BOLD, 32));
        Player1.cells[0][5].setFont(new Font("serif", Font.BOLD, 24));
        Player1.cells[0][4].setFont(new Font("serif", Font.BOLD, 20));
        Player2.cells[0][7].setFont(new Font("serif", Font.BOLD, 24));
        Player2.cells[0][6].setFont(new Font("serif", Font.BOLD, 32));
        Player2.cells[0][5].setFont(new Font("serif", Font.BOLD, 24));
        Player2.cells[0][4].setFont(new Font("serif", Font.BOLD, 20));
        Player3.cells[0][7].setFont(new Font("serif", Font.BOLD, 24));
        Player3.cells[0][6].setFont(new Font("serif", Font.BOLD, 32));
        Player3.cells[0][5].setFont(new Font("serif", Font.BOLD, 24));
        Player3.cells[0][4].setFont(new Font("serif", Font.BOLD, 20));
        Player4.cells[0][7].setFont(new Font("serif", Font.BOLD, 24));
        Player4.cells[0][6].setFont(new Font("serif", Font.BOLD, 32));
        Player4.cells[0][5].setFont(new Font("serif", Font.BOLD, 24));
        Player4.cells[0][4].setFont(new Font("serif", Font.BOLD, 20));
        Single_player.cells[0][7].setFont(new Font("serif", Font.BOLD, 24));
        Single_player.cells[0][6].setFont(new Font("serif", Font.BOLD, 32));
        Single_player.cells[0][5].setFont(new Font("serif", Font.BOLD, 24));
        Single_player.cells[0][4].setFont(new Font("serif", Font.BOLD, 20));


        Player1.SetImageIcon(0, 10, Address_Image_Player1);
        Player2.SetImageIcon(0, 10, Address_Image_Player2);
        Player3.SetImageIcon(0, 10, Address_Image_Player3);
        Player4.SetImageIcon(0, 10, Address_Image_Player4);
        Single_player.SetImageIcon(0, 10, Address_Image_Player2);


        Player1.SetImageIcon(Methods.Row_Number(Value.getMarket1()), Methods.Column_Number(Value.getMarket1()), Player1.getAddress_Image_Market());
        Player1.SetImageIcon(Methods.Row_Number(Value.getMarket2()), Methods.Column_Number(Value.getMarket2()), Player1.getAddress_Image_Market());
        Player1.SetImageIcon(Methods.Row_Number(Value.getMarket3()), Methods.Column_Number(Value.getMarket3()), Player1.getAddress_Image_Market());
        Player1.SetImageIcon(Methods.Row_Number(Value.getMarket4()), Methods.Column_Number(Value.getMarket4()), Player1.getAddress_Image_Market());
        Player1.SetImageIcon(Methods.Row_Number(Value.getMarket5()), Methods.Column_Number(Value.getMarket5()), Player1.getAddress_Image_Market());
        Player1.SetImageIcon(Methods.Row_Number(Value.getMarket6()), Methods.Column_Number(Value.getMarket6()), Player1.getAddress_Image_Market());


        Player2.SetImageIcon(Methods.Row_Number(Value.getMarket1()), Methods.Column_Number(Value.getMarket1()), Player1.getAddress_Image_Market());
        Player2.SetImageIcon(Methods.Row_Number(Value.getMarket2()), Methods.Column_Number(Value.getMarket2()), Player1.getAddress_Image_Market());
        Player2.SetImageIcon(Methods.Row_Number(Value.getMarket3()), Methods.Column_Number(Value.getMarket3()), Player1.getAddress_Image_Market());
        Player2.SetImageIcon(Methods.Row_Number(Value.getMarket4()), Methods.Column_Number(Value.getMarket4()), Player1.getAddress_Image_Market());
        Player2.SetImageIcon(Methods.Row_Number(Value.getMarket5()), Methods.Column_Number(Value.getMarket5()), Player1.getAddress_Image_Market());
        Player2.SetImageIcon(Methods.Row_Number(Value.getMarket6()), Methods.Column_Number(Value.getMarket6()), Player1.getAddress_Image_Market());


        Player3.SetImageIcon(Methods.Row_Number(Value.getMarket1()), Methods.Column_Number(Value.getMarket1()), Player1.getAddress_Image_Market());
        Player3.SetImageIcon(Methods.Row_Number(Value.getMarket2()), Methods.Column_Number(Value.getMarket2()), Player1.getAddress_Image_Market());
        Player3.SetImageIcon(Methods.Row_Number(Value.getMarket3()), Methods.Column_Number(Value.getMarket3()), Player1.getAddress_Image_Market());
        Player3.SetImageIcon(Methods.Row_Number(Value.getMarket4()), Methods.Column_Number(Value.getMarket4()), Player1.getAddress_Image_Market());
        Player3.SetImageIcon(Methods.Row_Number(Value.getMarket5()), Methods.Column_Number(Value.getMarket5()), Player1.getAddress_Image_Market());
        Player3.SetImageIcon(Methods.Row_Number(Value.getMarket6()), Methods.Column_Number(Value.getMarket6()), Player1.getAddress_Image_Market());


        Player4.SetImageIcon(Methods.Row_Number(Value.getMarket1()), Methods.Column_Number(Value.getMarket1()), Player1.getAddress_Image_Market());
        Player4.SetImageIcon(Methods.Row_Number(Value.getMarket2()), Methods.Column_Number(Value.getMarket2()), Player1.getAddress_Image_Market());
        Player4.SetImageIcon(Methods.Row_Number(Value.getMarket3()), Methods.Column_Number(Value.getMarket3()), Player1.getAddress_Image_Market());
        Player4.SetImageIcon(Methods.Row_Number(Value.getMarket4()), Methods.Column_Number(Value.getMarket4()), Player1.getAddress_Image_Market());
        Player4.SetImageIcon(Methods.Row_Number(Value.getMarket5()), Methods.Column_Number(Value.getMarket5()), Player1.getAddress_Image_Market());
        Player4.SetImageIcon(Methods.Row_Number(Value.getMarket6()), Methods.Column_Number(Value.getMarket6()), Player1.getAddress_Image_Market());


        Single_player.SetImageIcon(Methods.Row_Number(Value.getMarket1()), Methods.Column_Number(Value.getMarket1()), Player1.getAddress_Image_Market());
        Single_player.SetImageIcon(Methods.Row_Number(Value.getMarket2()), Methods.Column_Number(Value.getMarket2()), Player1.getAddress_Image_Market());
        Single_player.SetImageIcon(Methods.Row_Number(Value.getMarket3()), Methods.Column_Number(Value.getMarket3()), Player1.getAddress_Image_Market());
        Single_player.SetImageIcon(Methods.Row_Number(Value.getMarket4()), Methods.Column_Number(Value.getMarket4()), Player1.getAddress_Image_Market());
        Single_player.SetImageIcon(Methods.Row_Number(Value.getMarket5()), Methods.Column_Number(Value.getMarket5()), Player1.getAddress_Image_Market());
        Single_player.SetImageIcon(Methods.Row_Number(Value.getMarket6()), Methods.Column_Number(Value.getMarket6()), Player1.getAddress_Image_Market());


        Music music = new Music("music\\1.mp3");
        music.change();
        Music.frame5.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);

        Player1.SetImageIcon(0, 3, "image\\money.png");
        Player2.SetImageIcon(0, 3, "image\\money.png");
        Player3.SetImageIcon(0, 3, "image\\money.png");
        Player4.SetImageIcon(0, 3, "image\\money.png");
        Single_player.SetImageIcon(0, 3, "image\\money.png");


        int[] saved = new int[220];
        int[] load = new int[220];

        long x5 = 0;
        long y5 = 0;

        boolean playing=true;

        int fx=0;
        String text1="";
        String text2="";
        String text3="";
        String text4="";
        String text5="";
        String text6="";
        String text7="";
        String text8="";
        String text9="";
        String text10="";
        String text11="";
        String text12="";
        String text13="";
        String text14="";
        String text15="";
        String text16="";
        String text17="";
        String text18="";
        String text19="";
        String text20="";
        String text21="";
        String text22="";
        String text23="";
        String text24="";
        String text25="";
        String text26="";
        String text27="";
        String text28="";
        String text29="";



        while (true) {








            if (Player1.getCurrent_Location() > 0) {
                Player1.cells[0][0].setIcon(null);
                Player1.cells[0][0].setText(text4);
                Player1.cells[0][0].setFont(new Font("serif", Font.BOLD, 24));
            }
            if (Player2.getCurrent_Location() > 0) {
                Player2.cells[0][0].setIcon(null);
                Player2.cells[0][0].setText(text4);
                Player2.cells[0][0].setFont(new Font("serif", Font.BOLD, 24));
            }
            if (Player3.getCurrent_Location() > 0) {
                Player3.cells[0][0].setIcon(null);
                Player3.cells[0][0].setText(text4);
                Player3.cells[0][0].setFont(new Font("serif", Font.BOLD, 24));
            }
            if (Player4.getCurrent_Location() > 0) {
                Player4.cells[0][0].setIcon(null);
                Player4.cells[0][0].setText(text4);
                Player4.cells[0][0].setFont(new Font("serif", Font.BOLD, 24));
            }
            if (Single_player.getCurrent_Location() > 0) {
                Single_player.cells[0][0].setIcon(null);
                Single_player.cells[0][0].setText(text4);
                Single_player.cells[0][0].setFont(new Font("serif", Font.BOLD, 24));
            }



















            if (Value.getCharacter()==1) {
                Player1.SetImageIcon(Methods.Row_Number(Player1.getCurrent_Location()), Methods.Column_Number(Player1.getCurrent_Location()), Player1.getAddress_Image_Piece1());
                Player2.SetImageIcon(Methods.Row_Number(Player2.getCurrent_Location()), Methods.Column_Number(Player2.getCurrent_Location()), Player2.getAddress_Image_Piece1());
                Player3.SetImageIcon(Methods.Row_Number(Player3.getCurrent_Location()), Methods.Column_Number(Player3.getCurrent_Location()), Player3.getAddress_Image_Piece1());
                Player4.SetImageIcon(Methods.Row_Number(Player4.getCurrent_Location()), Methods.Column_Number(Player4.getCurrent_Location()), Player4.getAddress_Image_Piece1());
                Single_player.SetImageIcon(Methods.Row_Number(Single_player.getCurrent_Location()), Methods.Column_Number(Single_player.getCurrent_Location()), Single_Player.getAddress_Image_Piece1());
            }
            if (Value.getCharacter()==2) {
                Player1.SetImageIcon(Methods.Row_Number(Player1.getCurrent_Location()), Methods.Column_Number(Player1.getCurrent_Location()), Player1.getAddress_Image_Piece2());
                Player2.SetImageIcon(Methods.Row_Number(Player2.getCurrent_Location()), Methods.Column_Number(Player2.getCurrent_Location()), Player2.getAddress_Image_Piece2());
                Player3.SetImageIcon(Methods.Row_Number(Player3.getCurrent_Location()), Methods.Column_Number(Player3.getCurrent_Location()), Player3.getAddress_Image_Piece2());
                Player4.SetImageIcon(Methods.Row_Number(Player4.getCurrent_Location()), Methods.Column_Number(Player4.getCurrent_Location()), Player4.getAddress_Image_Piece2());
                Single_player.SetImageIcon(Methods.Row_Number(Single_player.getCurrent_Location()), Methods.Column_Number(Single_player.getCurrent_Location()), Single_Player.getAddress_Image_Piece2());
            }
            if (Value.getCharacter()==3) {
                Player1.SetImageIcon(Methods.Row_Number(Player1.getCurrent_Location()), Methods.Column_Number(Player1.getCurrent_Location()), Player1.getAddress_Image_Piece3());
                Player2.SetImageIcon(Methods.Row_Number(Player2.getCurrent_Location()), Methods.Column_Number(Player2.getCurrent_Location()), Player2.getAddress_Image_Piece3());
                Player3.SetImageIcon(Methods.Row_Number(Player3.getCurrent_Location()), Methods.Column_Number(Player3.getCurrent_Location()), Player3.getAddress_Image_Piece3());
                Player4.SetImageIcon(Methods.Row_Number(Player4.getCurrent_Location()), Methods.Column_Number(Player4.getCurrent_Location()), Player4.getAddress_Image_Piece3());
                Single_player.SetImageIcon(Methods.Row_Number(Single_player.getCurrent_Location()), Methods.Column_Number(Single_player.getCurrent_Location()), Single_Player.getAddress_Image_Piece3());
            }
            if (Value.getCharacter()==4) {
                Player1.SetImageIcon(Methods.Row_Number(Player1.getCurrent_Location()), Methods.Column_Number(Player1.getCurrent_Location()), Player1.getAddress_Image_Piece4());
                Player2.SetImageIcon(Methods.Row_Number(Player2.getCurrent_Location()), Methods.Column_Number(Player2.getCurrent_Location()), Player2.getAddress_Image_Piece4());
                Player3.SetImageIcon(Methods.Row_Number(Player3.getCurrent_Location()), Methods.Column_Number(Player3.getCurrent_Location()), Player3.getAddress_Image_Piece4());
                Player4.SetImageIcon(Methods.Row_Number(Player4.getCurrent_Location()), Methods.Column_Number(Player4.getCurrent_Location()), Player4.getAddress_Image_Piece4());
                Single_player.SetImageIcon(Methods.Row_Number(Single_player.getCurrent_Location()), Methods.Column_Number(Single_player.getCurrent_Location()), Single_Player.getAddress_Image_Piece4());
            }
            if (Value.getCharacter()==5) {
                Player1.SetImageIcon(Methods.Row_Number(Player1.getCurrent_Location()), Methods.Column_Number(Player1.getCurrent_Location()), Player1.getAddress_Image_Piece5());
                Player2.SetImageIcon(Methods.Row_Number(Player2.getCurrent_Location()), Methods.Column_Number(Player2.getCurrent_Location()), Player2.getAddress_Image_Piece5());
                Player3.SetImageIcon(Methods.Row_Number(Player3.getCurrent_Location()), Methods.Column_Number(Player3.getCurrent_Location()), Player3.getAddress_Image_Piece5());
                Player4.SetImageIcon(Methods.Row_Number(Player4.getCurrent_Location()), Methods.Column_Number(Player4.getCurrent_Location()), Player4.getAddress_Image_Piece5());
                Single_player.SetImageIcon(Methods.Row_Number(Single_player.getCurrent_Location()), Methods.Column_Number(Single_player.getCurrent_Location()), Single_Player.getAddress_Image_Piece5());
            }
            if (Value.getCharacter()==6) {
                Player1.SetImageIcon(Methods.Row_Number(Player1.getCurrent_Location()), Methods.Column_Number(Player1.getCurrent_Location()), Player1.getAddress_Image_Piece6());
                Player2.SetImageIcon(Methods.Row_Number(Player2.getCurrent_Location()), Methods.Column_Number(Player2.getCurrent_Location()), Player2.getAddress_Image_Piece6());
                Player3.SetImageIcon(Methods.Row_Number(Player3.getCurrent_Location()), Methods.Column_Number(Player3.getCurrent_Location()), Player3.getAddress_Image_Piece6());
                Player4.SetImageIcon(Methods.Row_Number(Player4.getCurrent_Location()), Methods.Column_Number(Player4.getCurrent_Location()), Player4.getAddress_Image_Piece6());
                Single_player.SetImageIcon(Methods.Row_Number(Single_player.getCurrent_Location()), Methods.Column_Number(Single_player.getCurrent_Location()), Single_Player.getAddress_Image_Piece6());
            }











            if (Value.Start) {

                Player1.SetImageIcon(Methods.Row_Number(Value.getWall1()), Methods.Column_Number(Value.getWall1()), Player1.getAddress_Image_Wall());
                Player1.SetImageIcon(Methods.Row_Number(Value.getWall2()), Methods.Column_Number(Value.getWall2()), Player1.getAddress_Image_Wall());
                Player1.SetImageIcon(Methods.Row_Number(Value.getWall3()), Methods.Column_Number(Value.getWall3()), Player1.getAddress_Image_Wall());
                Player1.SetImageIcon(Methods.Row_Number(Value.getWall4()), Methods.Column_Number(Value.getWall4()), Player1.getAddress_Image_Wall());
                Player1.SetImageIcon(Methods.Row_Number(Value.getWall5()), Methods.Column_Number(Value.getWall5()), Player1.getAddress_Image_Wall());
                Player1.SetImageIcon(Methods.Row_Number(Value.getWall6()), Methods.Column_Number(Value.getWall6()), Player1.getAddress_Image_Wall());
                Player1.SetImageIcon(Methods.Row_Number(Value.getWall7()), Methods.Column_Number(Value.getWall7()), Player1.getAddress_Image_Wall());
                Player1.SetImageIcon(Methods.Row_Number(Value.getWall8()), Methods.Column_Number(Value.getWall8()), Player1.getAddress_Image_Wall());

                Player2.SetImageIcon(Methods.Row_Number(Value.getWall1()), Methods.Column_Number(Value.getWall1()), Player1.getAddress_Image_Wall());
                Player2.SetImageIcon(Methods.Row_Number(Value.getWall2()), Methods.Column_Number(Value.getWall2()), Player1.getAddress_Image_Wall());
                Player2.SetImageIcon(Methods.Row_Number(Value.getWall3()), Methods.Column_Number(Value.getWall3()), Player1.getAddress_Image_Wall());
                Player2.SetImageIcon(Methods.Row_Number(Value.getWall4()), Methods.Column_Number(Value.getWall4()), Player1.getAddress_Image_Wall());
                Player2.SetImageIcon(Methods.Row_Number(Value.getWall5()), Methods.Column_Number(Value.getWall5()), Player1.getAddress_Image_Wall());
                Player2.SetImageIcon(Methods.Row_Number(Value.getWall6()), Methods.Column_Number(Value.getWall6()), Player1.getAddress_Image_Wall());
                Player2.SetImageIcon(Methods.Row_Number(Value.getWall7()), Methods.Column_Number(Value.getWall7()), Player1.getAddress_Image_Wall());
                Player2.SetImageIcon(Methods.Row_Number(Value.getWall8()), Methods.Column_Number(Value.getWall8()), Player1.getAddress_Image_Wall());


                Player3.SetImageIcon(Methods.Row_Number(Value.getWall1()), Methods.Column_Number(Value.getWall1()), Player1.getAddress_Image_Wall());
                Player3.SetImageIcon(Methods.Row_Number(Value.getWall2()), Methods.Column_Number(Value.getWall2()), Player1.getAddress_Image_Wall());
                Player3.SetImageIcon(Methods.Row_Number(Value.getWall3()), Methods.Column_Number(Value.getWall3()), Player1.getAddress_Image_Wall());
                Player3.SetImageIcon(Methods.Row_Number(Value.getWall4()), Methods.Column_Number(Value.getWall4()), Player1.getAddress_Image_Wall());
                Player3.SetImageIcon(Methods.Row_Number(Value.getWall5()), Methods.Column_Number(Value.getWall5()), Player1.getAddress_Image_Wall());
                Player3.SetImageIcon(Methods.Row_Number(Value.getWall6()), Methods.Column_Number(Value.getWall6()), Player1.getAddress_Image_Wall());
                Player3.SetImageIcon(Methods.Row_Number(Value.getWall7()), Methods.Column_Number(Value.getWall7()), Player1.getAddress_Image_Wall());
                Player3.SetImageIcon(Methods.Row_Number(Value.getWall8()), Methods.Column_Number(Value.getWall8()), Player1.getAddress_Image_Wall());

                Player4.SetImageIcon(Methods.Row_Number(Value.getWall1()), Methods.Column_Number(Value.getWall1()), Player1.getAddress_Image_Wall());
                Player4.SetImageIcon(Methods.Row_Number(Value.getWall2()), Methods.Column_Number(Value.getWall2()), Player1.getAddress_Image_Wall());
                Player4.SetImageIcon(Methods.Row_Number(Value.getWall3()), Methods.Column_Number(Value.getWall3()), Player1.getAddress_Image_Wall());
                Player4.SetImageIcon(Methods.Row_Number(Value.getWall4()), Methods.Column_Number(Value.getWall4()), Player1.getAddress_Image_Wall());
                Player4.SetImageIcon(Methods.Row_Number(Value.getWall5()), Methods.Column_Number(Value.getWall5()), Player1.getAddress_Image_Wall());
                Player4.SetImageIcon(Methods.Row_Number(Value.getWall6()), Methods.Column_Number(Value.getWall6()), Player1.getAddress_Image_Wall());
                Player4.SetImageIcon(Methods.Row_Number(Value.getWall7()), Methods.Column_Number(Value.getWall7()), Player1.getAddress_Image_Wall());
                Player4.SetImageIcon(Methods.Row_Number(Value.getWall8()), Methods.Column_Number(Value.getWall8()), Player1.getAddress_Image_Wall());


                Single_player.SetImageIcon(Methods.Row_Number(Value.getWall1()), Methods.Column_Number(Value.getWall1()), Player1.getAddress_Image_Wall());
                Single_player.SetImageIcon(Methods.Row_Number(Value.getWall2()), Methods.Column_Number(Value.getWall2()), Player1.getAddress_Image_Wall());
                Single_player.SetImageIcon(Methods.Row_Number(Value.getWall3()), Methods.Column_Number(Value.getWall3()), Player1.getAddress_Image_Wall());
                Single_player.SetImageIcon(Methods.Row_Number(Value.getWall4()), Methods.Column_Number(Value.getWall4()), Player1.getAddress_Image_Wall());
                Single_player.SetImageIcon(Methods.Row_Number(Value.getWall5()), Methods.Column_Number(Value.getWall5()), Player1.getAddress_Image_Wall());
                Single_player.SetImageIcon(Methods.Row_Number(Value.getWall6()), Methods.Column_Number(Value.getWall6()), Player1.getAddress_Image_Wall());
                Single_player.SetImageIcon(Methods.Row_Number(Value.getWall7()), Methods.Column_Number(Value.getWall7()), Player1.getAddress_Image_Wall());
                Single_player.SetImageIcon(Methods.Row_Number(Value.getWall8()), Methods.Column_Number(Value.getWall8()), Player1.getAddress_Image_Wall());


            }



            if (Value.getPlayer() == 6 && Value.Start) {
                if (Start_game) {
                    try {
                        Thread.sleep(1500);
                    } catch (Exception e) {
                    }
                    if (st==0){
                        Time_Player+=6000;
                        st=1;
                    }
                }
                for (int i = 0; i < 7; i++) {
                    paste[i] = 0;
                }
                Player2.frame.setVisible(false);
                Start_game = true;
                Player1.frame.setVisible(true);
                Player2.Permission_To_Dice = true;
                Start_Time_Player = System.currentTimeMillis();
                Value.setPlayer(1);
                Value.game_loaded=false;
            }

            if (Value.getPlayer() == 7) {
                try {
                    Thread.sleep(1500);
                } catch (Exception e) {
                }
                for (int i = 0; i < 7; i++) {
                    paste[i] = 0;
                }
                Player1.frame.setVisible(false);
                Player1.Permission_To_Dice = true;
                if (Value.getNumber_player() >= 2) {
                    Player2.frame.setVisible(true);
                    Value.setPlayer(2);
                }
                if (Value.getNumber_player() == 1) {
                    Single_player.frame.setVisible(true);
                    Single_player.Dice = Methods.DiceRand();
                    Value.setPlayer(5);
                }
                Value.game_loaded=false;
                Start_Time_Player = System.currentTimeMillis();
            }


            if (Value.getPlayer() == 8) {
                try {
                    Thread.sleep(1500);
                } catch (Exception e) {
                }
                for (int i = 0; i < 7; i++) {
                    paste[i] = 0;
                }
                Player2.frame.setVisible(false);
                Player2.Permission_To_Dice = true;
                if (Value.getNumber_player() == 2) {
                    Player1.frame.setVisible(true);
                    Value.setPlayer(1);
                }
                if (Value.getNumber_player() >= 3) {
                    Player3.frame.setVisible(true);
                    Value.setPlayer(3);
                }
                Value.game_loaded=false;
                Start_Time_Player = System.currentTimeMillis();
            }


            if (Value.getPlayer() == 9) {
                try {
                    Thread.sleep(1500);
                } catch (Exception e) {
                }
                for (int i = 0; i < 7; i++) {
                    paste[i] = 0;
                }
                Player3.frame.setVisible(false);
                Player3.Permission_To_Dice = true;
                if (Value.getNumber_player() == 4) {
                    Player4.frame.setVisible(true);
                    Value.setPlayer(4);
                }
                if (Value.getNumber_player() == 3) {
                    Player1.frame.setVisible(true);
                    Value.setPlayer(1);
                }
                Value.game_loaded=false;
                Start_Time_Player = System.currentTimeMillis();
            }


            if (Value.getPlayer() == 10) {
                try {
                    Thread.sleep(1500);
                } catch (Exception e) {
                }
                for (int i = 0; i < 7; i++) {
                    paste[i] = 0;
                }
                Player4.frame.setVisible(false);
                Player4.Permission_To_Dice = true;
                Player1.frame.setVisible(true);
                Value.setPlayer(1);
                Value.game_loaded=false;
                Start_Time_Player = System.currentTimeMillis();
            }

            if (Value.getPlayer() == 11) {
                try {
                    Thread.sleep(1500);
                } catch (Exception e) {
                }
                for (int i = 0; i < 7; i++) {
                    paste[i] = 0;
                }
                Single_player.frame.setVisible(false);
                Player1.frame.setVisible(true);
                Value.setPlayer(1);
                Value.game_loaded=false;
                Start_Time_Player = System.currentTimeMillis();
            }


















            if (Value.change_language && Value.language==2){
                intro.infoButton.setText("Information");
                intro.settingsButton.setText("Setting");
                intro.closeButton.setText("Close");
                intro.startButton.setText("Start Game");
                intro.optionDialog.setTitle("Options");
                intro.newButton.setText("New Game");
                intro.loadButton.setText("Load Game");
                intro.quitButton.setText("Close");
                intro.singleButton.setText("Single Player");
                intro.twoButton.setText("Two Player");
                intro.threeButton.setText("Three Player");
                intro.fourButton.setText("Four Player");
                intro.quastion="Do you want to exit the program?";
                intro.yes="Yes";
                intro.no="No";
                InformationPanel.names="Game creators: Sina Afzali and Sasan Nikjoo";
                InformationPanel.date="Production date : 2/4/2023";
                InformationPanel.numberPhone1="Phone number: 09331788813";
                InformationPanel.numberPhone2="Phone number: 09398918333";
                InformationPanel.email1="Email address: sinaafzali1382tj@gmail.com";
                InformationPanel.email2="Email address: sasannikjo83@gmail.com";
                intro.input_Text="Enter the full address of the music you want";
                Intro.music_text ="Music";
                Intro.title_setting ="Setting";
                intro.char_text="Character";
                intro.change_charText="Select Charecter";
                intro.language_text="Language";
                Intro.close_setting ="Close";
                Player1.label4.setText(" game time");
                Player1.label3.setText(" Your time");
                Player2.label4.setText(" game time");
                Player2.label3.setText(" Your time");
                Player3.label4.setText(" game time");
                Player3.label3.setText(" Your time");
                Player4.label4.setText(" game time");
                Player4.label3.setText(" Your time");
                Single_player.label4.setText(" game time");
                Single_player.label3.setText(" Your time");
                Music.text1="Turn off";
                Music.text2="Connect";
                Music.text3=" Change";
                Music.title="Music";
                Quests[0] = "You must find the treasure of the diamond ring";
                Quests[1] = "You have to find the treasure of the Sword of Jewel Nash";
                Quests[2] = "You must find the treasure of the golden cup";
                Quests[3] = "You must find the treasure of the glass cup";
                Quests[4] = "You must find the treasure of the wooden bow";
                Quests[5] = "You must find the treasure of the steel shield";
                Quests[6] = "You have to find the golden key treasure";
                Quests[7] = "You must find the treasure of the dragon scroll";
                text1="Player loan amount  ";
                text2="deducted";
                text3="Lean";
                text4="Mission";
                text5="penalty coin";
                text6="Yes";
                text7="Now not";
                text8="This place is a store\n Do you want to visit it?";
                text9="Store";
                text10="I realized";
                text11="Congratulations!! \nYou have found a valuable and old object\nThat's why we give you ";
                text12=" We reward coins";
                text13="missing object";
                text14="Wow!! \n robbers from you";
                text15= "coins were stolen";
                text16="robbing!!";
                text17="Great!!\n You found a treasure \n Now you have to deliver it to the castle\n Remember the following code \n and record it when you deliver it.\n Treasure code : ";
                text18="Treasure";
                text19="You found the diamond treasure\n";
                text20="Your reward: ";
                text21="coin";
                text22="You have found the treasure of the jeweled sword sword\n";
                text23="You have found the treasure of the golden cup\n";
                text24="You found the treasure of the glass cup\n";
                text25="You found the wooden bow treasure\n";
                text26="You found the steel shield treasure\n";
                text27="You have found the golden key treasure\n";
                text28="You have found the dragon scroll treasure\n";
                text29="The code is invalid!";
                Castle.text1="Player Name";
                Castle.text2="Power";
                Castle.text3="Money";
                Castle.text4="Score";
                Castle.text5="   player 1";
                Castle.text6="   player 2";
                Castle.text7="   player 3";
                Castle.text8="   player 4";
                Castle.text9="Enter the treasure code";
                Castle.text10="Check Code";
                Castle.text11=text19;
                Castle.text12=text20;
                Castle.text13=text21;
                Castle.text14="You have successfully completed the mission!\n";
                Castle.text15="Coin \n";
                Castle.text16="Increasing power: ";
                Castle.text17=text22;
                Castle.text18=text23;
                Castle.text19=text24;
                Castle.text20=text25;
                Castle.text21=text26;
                Castle.text22=text27;
                Castle.text23=text28;
                Castle.text24="The code is invalid!";
                Castle.text25="Operation not allowed!!";
                Market.text1="Buy";
                Market.text2="Sell";
                Market.text3="Do you want to buy/sell a shield?\n";
                Market.text4="Purchase price: 160, selling price: 120";
                Market.text5="you bought";
                Market.text6="sold";
                Market.text7="Shield";
                Market.text8="You successfully";
                Market.text9="One ";
                Market.text10="Power increase/decrease: 40";
                Market.text11="You have no shield to sell!";
                Market.text12="Do you want to buy/sell a sword?\n";
                Market.text13="Purchase price: 100, selling price: 75";
                Market.text14="Sword ";
                Market.text15="Power increase/decrease: 25";
                Market.text16="You have no sword to sell!";
                Market.text17="Do you want to buy/sell an armor?\n";
                Market.text18="Purchase price: 120, selling price: 90";
                Market.text19="Armor";
                Market.text20="Power increase/decrease: 30";
                Market.text21="You have no armor to sell!";
                Market.text22="Do you want to buy/sell a food?\n";
                Market.text23="Purchase price: 80, selling price: 60";
                Market.text24="Food";
                Market.text25="Power increase/decrease: 20";
                Market.text26="You have no foods to sell!";
                Market.text27="Do you want to buy/sell a Potion?\n";
                Market.text28="Potion";
                Market.text29="Do you want to buy/sell a book?\n";
                Market.text30="Purchase price: 200, selling price: 150";
                Market.text31="Book ";
                Market.text32="Power increase/decrease: 50";
                Market.text33="You don't have a book to sell!";
                Market.text34="Do you want to buy/sell a bow?\n";
                Market.text35="Bow";
                Market.text36="You have no bow to sell!";
                Market.text37="Close";
                Market.text38="You have no medicine to sell!";
                ChestWindow.text1="Do you want to open this chest?\n";
                ChestWindow.text2="Opening fee: 100 coins\n";
                ChestWindow.text3="Two of the houses have 500 coins \n";
                ChestWindow.text4="But the rest of the houses are absurd!";
                ChestWindow.text5="You won 500 coins!";
                ChestWindow.text6="Empty!";
                ChestWindow.text7="coming back";
                LoanWindow.text1="Close";
                LoanWindow.text2="Are you sure that the amount";
                LoanWindow.text3="Accept as a loan?";
                LoanWindow.text4="You must amount";
                LoanWindow.text5=" Return it ";
                LoanWindow.text6="You have a current loan";
                Value.change_language=false;
            }
            if (Value.change_language && Value.language==1){
                intro.infoButton.setText("اطلاعات");
                intro.settingsButton.setText("تنظیمات");
                intro.closeButton.setText("خروج");
                intro.startButton.setText("شروع بازی");
                intro.optionDialog.setTitle("گزینه ها");
                intro.newButton.setText("بازی جدید");
                intro.loadButton.setText("بازی قبلی");
                intro.quitButton.setText("خروج");
                intro.singleButton.setText("تک نفره");
                intro.twoButton.setText("دو نفره");
                intro.threeButton.setText("سه نفره");
                intro.fourButton.setText("چهار نفره");
                intro.quastion="آیا میخواهید از برنامه خارج شوید ؟";
                intro.yes="بله";
                intro.no="خیر";
                InformationPanel.names="سازندگان بازی : سینا افضلی و ساسان نیک جو";
                InformationPanel.date="تاریخ ساخت : ۱۴۰۲/۰۱/۱۳";
                InformationPanel.numberPhone1="شماره تلفن : ۰۹۳۳۱۷۸۸۸۱۳";
                InformationPanel.numberPhone2="شماره تلفن : ۰۹۳۹۸۹۱۸۳۳۳";
                InformationPanel.email1="آدرس ایمیل : sinaafzali1382tj@gmail.com";
                InformationPanel.email2="آدرس ایمیل : sasannikjo83@gmail.com";
                intro.input_Text="آدرس کامل موسیقی مدنظر خود را وارد کنید";
                Intro.music_text ="موسیقی";
                Intro.title_setting ="تنظیمات";
                intro.char_text="کاراکتر";
                intro.change_charText="انتخاب کاراکتر";
                intro.language_text="زبان";
                Intro.close_setting ="بستن";
                Player1.label4.setText("زمان بازی:  ");
                Player1.label3.setText("زمان شما:  ");
                Player2.label4.setText("زمان بازی:  ");
                Player2.label3.setText("زمان شما:  ");
                Player3.label4.setText("زمان بازی:  ");
                Player3.label3.setText("زمان شما:  ");
                Player4.label4.setText("زمان بازی:  ");
                Player4.label3.setText("زمان شما:  ");
                Single_player.label4.setText("زمان بازی:  ");
                Single_player.label3.setText("زمان شما:  ");
                Music.text1="قطع کردن صدا";
                Music.text2="وصل کردن صدا";
                Music.text3="تغییر موسیقی";
                Music.title="موسیقی";
                Quests[0] = "شما باید گنج انگشتر الماس را پیدا کنید     ";
                Quests[1] = "شما باید گنج شمشیر جواهر نشان را پیدا کن    ";
                Quests[2] = "شما باید گنج لیوان طلایی را پیدا کنید     ";
                Quests[3] = "شما باید گنج جام شیشه ای را پیدا کنید     ";
                Quests[4] = "شما باید گنج کمان چوبی را پیدا کنید     ";
                Quests[5] = "شما باید گنج سپر پولادین را پیدا کنید     ";
                Quests[6] = "شما باید گنج کلید زرین را پیدا کنید     ";
                Quests[7] = "شما باید گنج طومار اژدها را پیدا کنید     ";
                text1="   مبلغ وام بازیکن";
                text2= "کسر گردید";
                text3="وام";
                text4="ماموریت";
                text5="  سکه جریمه";
                text6="آره";
                text7="فعلا نه";
                text8="این مکان یک فروشگاه است\n آیا میخواهید به آن سر بزنید؟";
                text9="فروشگاه";
                text10="متوجه شدم";
                text11="تبریک!!                      \n شما یک شیء باارزش و قدیمی راپیدا کرده اید\n  به همین دلیل ما به شما ";
                text12=" سکه پاداش می دهیم";
                text13="شیء گم شده";
                text14="وای!!                    \n  خفتگیرها از شما ";
                text15= " سکه دزدیدند ";
                text16="خفتگیری!!";
                text17="بسیار عالی!!\n شما یک گنج پیدا کردید \n حال باید آن را به قلعه تحویل دهید\n کد زیر را به خاطر بسپارید \n و هنگام تحویل آن را ثبت کنید.\n کد گنج : ";
                text18="گنج";
                text19="شما گنج انگشتر الماس را پیدا کردید\n";
                text20="پاداش شما : ";
                text21="سکه ";
                text22="شما گنج شمشیر جواهر نشان را پیدا کردید\n";
                text23="شما گنج لیوان طلایی را پیدا کردید\n";
                text24="شما گنج جام شیشه ای را پیدا کردید\n";
                text25="شما گنج کمان چوبی را پیدا کردید\n";
                text26="شما گنج سپر پولادین را پیدا کردید\n";
                text27="شما گنج کلید زرین را پیدا کردید\n";
                text28="شما گنج طومار اژدها را پیدا کردید\n";
                text29="کد نامعتبراست!";
                Castle.text1="نام بازیکن";
                Castle.text2="قدرت";
                Castle.text3="پول";
                Castle.text4="امتیاز";
                Castle.text5="بازیکن 1       ";
                Castle.text6="بازیکن 2       ";
                Castle.text7="بازیکن 3       ";
                Castle.text8="بازیکن 4       ";
                Castle.text9="کد گنج را وارد کنید";
                Castle.text10="بررسی کد";
                Castle.text11=text19;
                Castle.text12=text20;
                Castle.text13=text21;
                Castle.text14="شما ماموریت را با موفقیت انجام دادید!\n";
                Castle.text15="سکه \n";
                Castle.text16="افزایش قدرت : ";
                Castle.text17=text22;
                Castle.text18=text23;
                Castle.text19=text24;
                Castle.text20=text25;
                Castle.text21=text26;
                Castle.text22=text27;
                Castle.text23=text28;
                Castle.text24="کد نامعتبراست!";
                Castle.text25="عملیات مجاز نیست!!";
                Market.text1="خرید";
                Market.text2="فروش";
                Market.text3="آیا میخواهید یک سپر بخرید/بفروشید؟\n";
                Market.text4="قیمت خرید:160   قیمت فروش:120";
                Market.text5="خریدید";
                Market.text6="فروختید";
                Market.text7="سپر ";
                Market.text8="شما با موفقیت ";
                Market.text9="یک ";
                Market.text10="افزایش/کاهش قدرت : 40";
                Market.text11=" شما سپری برای فروش ندارید!";
                Market.text12="آیا میخواهید یک شمشیر بخرید/بفروشید؟\n";
                Market.text13="قیمت خرید:100   قیمت فروش:75";
                Market.text14="شمشیر ";
                Market.text15="افزایش/کاهش قدرت : 25";
                Market.text16=" شما شمشیری برای فروش ندارید!";
                Market.text17="آیا میخواهید یک زره بخرید/بفروشید؟\n";
                Market.text18="قیمت خرید:120   قیمت فروش:90";
                Market.text19="زره ";
                Market.text20="افزایش/کاهش قدرت : 30";
                Market.text21=" شما زره ای برای فروش ندارید!";
                Market.text22="آیا میخواهید یک آذوقه بخرید/بفروشید؟\n";
                Market.text23="قیمت خرید:80   قیمت فروش:60";
                Market.text24="آذوقه ";
                Market.text25="\n"+"افزایش/کاهش قدرت : 20";
                Market.text26=" شما آذوقه ای برای فروش ندارید!";
                Market.text27="آیا میخواهید یک دارو بخرید/بفروشید؟\n";
                Market.text28="دارو ";
                Market.text29="آیا میخواهید یک کتاب بخرید/بفروشید؟\n";
                Market.text30="قیمت خرید:200   قیمت فروش:150";
                Market.text31="کتاب ";
                Market.text32="افزایش/کاهش قدرت : 50";
                Market.text33=" شما کتابی برای فروش ندارید!";
                Market.text34="آیا میخواهید یک کمان بخرید/بفروشید؟\n";
                Market.text35="کمان ";
                Market.text36=" شما کمانی برای فروش ندارید!";
                Market.text37="خروج";
                Market.text38=" شما دارویی برای فروش ندارید!";
                ChestWindow.text1="آیا میخواهید در این صندوق را باز کنید؟\n";
                ChestWindow.text2="هزینه باز کردن : 100 سکه\n";
                ChestWindow.text3="دوتا از خانه ها 500 سکه دارند \n";
                ChestWindow.text4="اما بقیه خانه ها پوچ هستند!";
                ChestWindow.text5="شما 500 سکه برنده شدید!";
                ChestWindow.text6="پوچ!";
                ChestWindow.text7="بازگشت";
                LoanWindow.text1="خروج";
                LoanWindow.text2="آیا اطمینان دارید که مبلغ";
                LoanWindow.text3="را به عنوان وام بپذیرید ؟";
                LoanWindow.text4="شما باید مبلغ";
                LoanWindow.text5=" پس بدهید ";
                LoanWindow.text6="شما یک وام جاری دارید";
                Value.change_language=false;
            }




            if (Value.getNumber_player()==1||Value.getNumber_player()==2){
                Value.setMoney_Player3(0);
                Value.setMoney_Player4(0);
            }
            else if (Value.getNumber_player()==3){
                Value.setMoney_Player4(0);
            }

            fx++;
            if (fx>10000) {
                if (music.player.isComplete()) {
                    music.player.close();
                    playing = false;
                }

                if (Value.change_music) {
                    music.music = Intro.new_music;
                    music.change2();
                    Value.change_music = false;
                }
                if (!playing) {
                    music.music = Methods.Change_Music();
                    music.change();
                    playing = true;
                }
                fx=0;
            }

            if (Value.isSave() ||(Value.autoSave&&Second%5==0)) {
                if (Value.Start) saved[0] = 0;
                else saved[0] = 1;
                saved[1] = Value.getPlayer();
                saved[2] = Value.quest;
                saved[3] = Value.getNumber_player();
                saved[4] = Value.getShield_player1();
                saved[5] = Value.getShield_player2();
                saved[6] = Value.getShield_player3();
                saved[7] = Value.getShield_player4();
                saved[8] = Value.getSword_player1();
                saved[9] = Value.getSword_player2();
                saved[10] = Value.getSword_player3();
                saved[11] = Value.getSword_player4();
                saved[12] = Value.getArmor_player1();
                saved[13] = Value.getArmor_player2();
                saved[14] = Value.getArmor_player3();
                saved[15] = Value.getArmor_player4();
                saved[16] = Value.getFood_player1();
                saved[17] = Value.getFood_player2();
                saved[18] = Value.getFood_player3();
                saved[19] = Value.getFood_player4();
                saved[20] = Value.getPotion_player1();
                saved[21] = Value.getPotion_player2();
                saved[22] = Value.getPotion_player3();
                saved[23] = Value.getPotion_player4();
                saved[24] = Value.getBook_player1();
                saved[25] = Value.getBook_player2();
                saved[26] = Value.getBook_player3();
                saved[27] = Value.getBook_player4();
                saved[28] = Value.getBow_player1();
                saved[29] = Value.getBow_player2();
                saved[30] = Value.getBow_player3();
                saved[31] = Value.getBow_player4();
                saved[32] = (int) Value.getMoney_Player1();
                saved[33] = (int) Value.getMoney_Player2();
                saved[34] = (int) Value.getMoney_Player3();
                saved[35] = (int) Value.getMoney_Player4();
                saved[36] = (int) Value.getPower_Player1();
                saved[37] = (int) Value.getPower_Player2();
                saved[38] = (int) Value.getPower_Player3();
                saved[39] = (int) Value.getPower_Player4();
                saved[40] = Value.getLean_player1();
                saved[41] = Value.getLean_player2();
                saved[42] = Value.getLean_player3();
                saved[43] = Value.getLean_player4();
                saved[44] = (int) Value.getMoney_Lean();
                saved[45] = Value.getTreasure1_Diamond_Ring();
                saved[46] = Value.getTreasure2_Jeweled_Sword();
                saved[47] = Value.getTreasure3_Golden_Glass();
                saved[48] = Value.getTreasure4_Glass_Cup();
                saved[49] = Value.getTreasure5_Wooden_Bow();
                saved[50] = Value.getTreasure6_Steel_Shield();
                saved[51] = Value.getTreasure7_Golden_Key();
                saved[52] = Value.getTreasure8_Dragon_Scroll();
                if (Value.isTreasure1_Diamond_Ring_Status()) saved[53] = 0;
                else saved[53] = 1;
                if (Value.isTreasure2_Jeweled_Sword_Status()) saved[54] = 0;
                else saved[54] = 1;
                if (Value.isTreasure3_Golden_Glass_Status()) saved[55] = 0;
                else saved[55] = 1;
                if (Value.isTreasure4_Glass_Cup_Status()) saved[56] = 0;
                else saved[56] = 1;
                if (Value.isTreasure5_Wooden_Bow_Status()) saved[57] = 0;
                else saved[57] = 1;
                if (Value.isTreasure6_Steel_Shield_Status()) saved[58] = 0;
                else saved[58] = 1;
                if (Value.isTreasure7_Golden_Key_Status()) saved[59] = 0;
                else saved[59] = 1;
                if (Value.isTreasure8_Dragon_Scroll_Status()) saved[60] = 0;
                else saved[60] = 1;
                saved[61] = Value.getMarket1();
                saved[62] = Value.getMarket2();
                saved[63] = Value.getMarket3();
                saved[64] = Value.getMarket4();
                saved[65] = Value.getMarket5();
                saved[66] = Value.getMarket6();
                saved[67] = Value.getTrap1();
                saved[68] = Value.getTrap2();
                saved[69] = Value.getTrap3();
                saved[70] = Value.getTrap4();
                saved[71] = Value.getTrap5();
                saved[72] = Value.getTrap6();
                saved[73] = Value.getWall1();
                saved[74] = Value.getWall2();
                saved[75] = Value.getWall3();
                saved[76] = Value.getWall4();
                saved[77] = Value.getWall5();
                saved[78] = Value.getWall6();
                saved[79] = Value.getWall7();
                saved[80] = Value.getWall8();
                saved[81] = Value.getTreasure1_Diamond_Ring_Code_Player1();
                saved[82] = Value.getTreasure1_Diamond_Ring_Code_Player2();
                saved[83] = Value.getTreasure1_Diamond_Ring_Code_Player3();
                saved[84] = Value.getTreasure1_Diamond_Ring_Code_Player4();
                saved[85] = Value.getTreasure2_Jeweled_Sword_Code_Player1();
                saved[86] = Value.getTreasure2_Jeweled_Sword_Code_Player2();
                saved[87] = Value.getTreasure2_Jeweled_Sword_Code_Player3();
                saved[88] = Value.getTreasure2_Jeweled_Sword_Code_Player4();
                saved[89] = Value.getTreasure3_Golden_Glass_Code_Player1();
                saved[90] = Value.getTreasure3_Golden_Glass_Code_Player2();
                saved[91] = Value.getTreasure3_Golden_Glass_Code_Player3();
                saved[92] = Value.getTreasure3_Golden_Glass_Code_Player4();
                saved[93] = Value.getTreasure4_Glass_Cup_Code_Player1();
                saved[94] = Value.getTreasure4_Glass_Cup_Code_Player2();
                saved[95] = Value.getTreasure4_Glass_Cup_Code_Player3();
                saved[96] = Value.getTreasure4_Glass_Cup_Code_Player4();
                saved[97] = Value.getTreasure5_Wooden_Bow_Code_Player1();
                saved[98] = Value.getTreasure5_Wooden_Bow_Code_Player2();
                saved[99] = Value.getTreasure5_Wooden_Bow_Code_Player3();
                saved[100] = Value.getTreasure5_Wooden_Bow_Code_Player4();
                saved[101] = Value.getTreasure6_Steel_Shield_Code_Player1();
                saved[102] = Value.getTreasure6_Steel_Shield_Code_Player2();
                saved[103] = Value.getTreasure6_Steel_Shield_Code_Player3();
                saved[104] = Value.getTreasure6_Steel_Shield_Code_Player4();
                saved[105] = Value.getTreasure7_Golden_Key_Code_Player1();
                saved[106] = Value.getTreasure7_Golden_Key_Code_Player2();
                saved[107] = Value.getTreasure7_Golden_Key_Code_Player3();
                saved[108] = Value.getTreasure7_Golden_Key_Code_Player4();
                saved[109] = Value.getTreasure8_Dragon_Scroll_Code_Player1();
                saved[110] = Value.getTreasure8_Dragon_Scroll_Code_Player2();
                saved[111] = Value.getTreasure8_Dragon_Scroll_Code_Player3();
                saved[112] = Value.getTreasure8_Dragon_Scroll_Code_Player4();
                saved[113] = Value.getLost_Object1();
                saved[114] = Value.getLost_Object2();
                saved[115] = Value.getLost_Object3();
                saved[116] = Value.getLost_Object4();
                saved[117] = Value.getLost_Object5();
                saved[118] = Value.getLost_Object6();
                saved[119] = Value.getLost_Object7();
                saved[120] = Value.getLost_Object8();
                saved[121] = Value.getLost_Object9();
                saved[122] = Value.getLost_Object10();
                saved[123] = Value.getLost_Object11();
                saved[124] = Value.getLost_Object12();
                saved[125] = Value.getLost_Object13();
                saved[126] = Value.getLost_Object14();
                saved[127] = Value.getLost_Object15();
                saved[128] = Value.getLost_Object16();
                if (Value.isObject1()) saved[129] = 0;
                else saved[129] = 1;
                if (Value.isObject2()) saved[130] = 0;
                else saved[130] = 1;
                if (Value.isObject3()) saved[131] = 0;
                else saved[131] = 1;
                if (Value.isObject4()) saved[132] = 0;
                else saved[132] = 1;
                if (Value.isObject5()) saved[133] = 0;
                else saved[133] = 1;
                if (Value.isObject6()) saved[134] = 0;
                else saved[134] = 1;
                if (Value.isObject7()) saved[135] = 0;
                else saved[135] = 1;
                if (Value.isObject8()) saved[136] = 0;
                else saved[136] = 1;
                if (Value.isObject9()) saved[137] = 0;
                else saved[137] = 1;
                if (Value.isObject10()) saved[138] = 0;
                else saved[138] = 1;
                if (Value.isObject11()) saved[139] = 0;
                else saved[139] = 1;
                if (Value.isObject12()) saved[140] = 0;
                else saved[140] = 1;
                if (Value.isObject13()) saved[141] = 0;
                else saved[141] = 1;
                if (Value.isObject14()) saved[142] = 0;
                else saved[142] = 1;
                if (Value.isObject15()) saved[143] = 0;
                else saved[143] = 1;
                if (Value.isObject16()) saved[144] = 0;
                else saved[144] = 1;
                saved[145] = Treasure_single_code[0];
                saved[146] = Treasure_single_code[1];
                saved[147] = Treasure_single_code[2];
                saved[148] = Treasure_single_code[3];
                saved[149] = Treasure_single_code[4];
                saved[150] = Treasure_single_code[5];
                saved[151] = Treasure_single_code[6];
                saved[152] = Treasure_single_code[7];
                if (move_single) saved[153] = 0;
                else saved[153] = 1;
                if (Start_game) saved[154] = 0;
                else saved[154] = 1;
                saved[155] = paste[0];
                saved[156] = paste[1];
                saved[157] = paste[2];
                saved[158] = paste[3];
                saved[159] = paste[4];
                saved[160] = paste[5];
                saved[161] = paste[6];
                saved[162] = (int) Start_Time;
                saved[163] = (int) Start_Time_Player;
                saved[164] = (int) Time_Now;
                saved[165] = (int) Time_Now_Player;
                saved[166] = (int) Elapsed_Time;
                saved[167] = (int) Elapsed_Time_Player;
                saved[168] = (int) Remaining_Time;
                saved[169] = (int) Remaining_Time1;
                saved[170] = (int) Remaining_Time_Player;
                saved[171] = (int) Remaining_Time1_Player;
                saved[172] = (int) Minutes;
                saved[173] = (int) Second;
                saved[174] = (int) Time;
                saved[175] = (int) penalty;
                saved[176] = (int) x5;
                saved[177] = (int) y5;
                saved[178] = Single_player.Dice;
                saved[179] = Player1.getDice();
                saved[180] = Player2.getDice();
                saved[181] = Player3.getDice();
                saved[182] = Player4.getDice();
                saved[183] = Player1.getCurrent_Location();
                saved[184] = Player2.getCurrent_Location();
                saved[185] = Player3.getCurrent_Location();
                saved[186] = Player4.getCurrent_Location();
                saved[187] = Single_player.getCurrent_Location();
                saved[188] = Player1.getTarget_Location();
                saved[189] = Player2.getTarget_Location();
                saved[190] = Player3.getTarget_Location();
                saved[191] = Player4.getTarget_Location();
                saved[192] = Single_player.getTarget_Location();
                saved[193] = Player1.getChange_Dice();
                saved[194] = Player2.getChange_Dice();
                saved[195] = Player3.getChange_Dice();
                saved[196] = Player4.getChange_Dice();
                saved[197] = Single_player.getChange_Dice();
                if (Player1.Permission_To_Dice) saved[198] = 0;
                else saved[198] = 1;
                if (Player2.Permission_To_Dice) saved[199] = 0;
                else saved[199] = 1;
                if (Player3.Permission_To_Dice) saved[200] = 0;
                else saved[200] = 1;
                if (Player4.Permission_To_Dice) saved[201] = 0;
                else saved[201] = 1;
                saved[202]=Value.getCharacter();
                saved[203]=Value.language;
                new SaveGame("saved1.txt", saved);
                new SaveGame("saved2.txt", paste2);
                new SaveGame("saved3.txt",image_cells_player1);
                new SaveGame("saved4.txt",image_cells_player2);
                new SaveGame("saved5.txt",image_cells_player3);
                new SaveGame("saved6.txt",image_cells_player4);
                new SaveGame("saved7.txt",image_cells_single);
                Value.setSave(false);
            }


            if (Value.isLoad()) {
                new LoadGame("saved1.txt", load);
                new LoadGame("saved2.txt", paste2);
                new LoadGame("saved3.txt",image_cells_player1);
                new LoadGame("saved4.txt",image_cells_player2);
                new LoadGame("saved5.txt",image_cells_player3);
                new LoadGame("saved6.txt",image_cells_player4);
                new LoadGame("saved7.txt",image_cells_single);

                for (int i=0;i<121;i++){
                    switch (image_cells_player1[i])
                    {
                        case 0:
                            Player1.SetImageIcon(Methods.Row_Number(i+1),Methods.Column_Number(i+1),Player1.getAddress_Image_Empty());
                            break;
                        case 1:
                            Player1.SetImageIcon(Methods.Row_Number(i+1),Methods.Column_Number(i+1),Player1.getAddress_Image_Market());
                            break;
                        case 2:
                            Player1.SetImageIcon(Methods.Row_Number(i+1),Methods.Column_Number(i+1),Player1.getAddress_Image_Lost_Object());
                            break;
                        case 3:
                            Player1.SetImageIcon(Methods.Row_Number(i+1),Methods.Column_Number(i+1),Player1.getAddress_Image_Trap());
                            break;
                        case 4:
                            Player1.SetImageIcon(Methods.Row_Number(i+1),Methods.Column_Number(i+1),Player1.getAddress_Image_Treasure());
                            break;
                    }
                    switch (image_cells_player2[i])
                    {
                        case 0:
                            Player2.SetImageIcon(Methods.Row_Number(i+1),Methods.Column_Number(i+1),Player1.getAddress_Image_Empty());
                            break;
                        case 1:
                            Player2.SetImageIcon(Methods.Row_Number(i+1),Methods.Column_Number(i+1),Player1.getAddress_Image_Market());
                            break;
                        case 2:
                            Player2.SetImageIcon(Methods.Row_Number(i+1),Methods.Column_Number(i+1),Player1.getAddress_Image_Lost_Object());
                            break;
                        case 3:
                            Player2.SetImageIcon(Methods.Row_Number(i+1),Methods.Column_Number(i+1),Player1.getAddress_Image_Trap());
                            break;
                        case 4:
                            Player2.SetImageIcon(Methods.Row_Number(i+1),Methods.Column_Number(i+1),Player1.getAddress_Image_Treasure());
                            break;
                    }
                    switch (image_cells_player3[i])
                    {
                        case 0:
                            Player3.SetImageIcon(Methods.Row_Number(i+1),Methods.Column_Number(i+1),Player1.getAddress_Image_Empty());
                            break;
                        case 1:
                            Player3.SetImageIcon(Methods.Row_Number(i+1),Methods.Column_Number(i+1),Player1.getAddress_Image_Market());
                            break;
                        case 2:
                            Player3.SetImageIcon(Methods.Row_Number(i+1),Methods.Column_Number(i+1),Player1.getAddress_Image_Lost_Object());
                            break;
                        case 3:
                            Player3.SetImageIcon(Methods.Row_Number(i+1),Methods.Column_Number(i+1),Player1.getAddress_Image_Trap());
                            break;
                        case 4:
                            Player3.SetImageIcon(Methods.Row_Number(i+1),Methods.Column_Number(i+1),Player1.getAddress_Image_Treasure());
                            break;
                    }
                    switch (image_cells_player4[i])
                    {
                        case 0:
                            Player4.SetImageIcon(Methods.Row_Number(i+1),Methods.Column_Number(i+1),Player1.getAddress_Image_Empty());
                            break;
                        case 1:
                            Player4.SetImageIcon(Methods.Row_Number(i+1),Methods.Column_Number(i+1),Player1.getAddress_Image_Market());
                            break;
                        case 2:
                            Player4.SetImageIcon(Methods.Row_Number(i+1),Methods.Column_Number(i+1),Player1.getAddress_Image_Lost_Object());
                            break;
                        case 3:
                            Player4.SetImageIcon(Methods.Row_Number(i+1),Methods.Column_Number(i+1),Player1.getAddress_Image_Trap());
                            break;
                        case 4:
                            Player4.SetImageIcon(Methods.Row_Number(i+1),Methods.Column_Number(i+1),Player1.getAddress_Image_Treasure());
                            break;
                    }
                    switch (image_cells_single[i])
                    {
                        case 0:
                            Single_player.SetImageIcon(Methods.Row_Number(i+1),Methods.Column_Number(i+1),Player1.getAddress_Image_Empty());
                            break;
                        case 1:
                            Single_player.SetImageIcon(Methods.Row_Number(i+1),Methods.Column_Number(i+1),Player1.getAddress_Image_Market());
                            break;
                        case 2:
                            Single_player.SetImageIcon(Methods.Row_Number(i+1),Methods.Column_Number(i+1),Player1.getAddress_Image_Lost_Object());
                            break;
                        case 3:
                            Single_player.SetImageIcon(Methods.Row_Number(i+1),Methods.Column_Number(i+1),Player1.getAddress_Image_Trap());
                            break;
                        case 4:
                            Single_player.SetImageIcon(Methods.Row_Number(i+1),Methods.Column_Number(i+1),Player1.getAddress_Image_Treasure());
                            break;
                    }
                }

                if (load[0] == 0) Value.Start = true;
                else Value.Start = false;
                Value.setPlayer(load[1]);
                Value.quest = load[2];
                quest = load[2];
                Value.setNumber_player(load[3]);
                Value.setShield_player1(load[4]);
                Value.setShield_player2(load[5]);
                Value.setShield_player2(load[6]);
                Value.setShield_player2(load[7]);
                Value.setSword_player1(load[8]);
                Value.setSword_player2(load[9]);
                Value.setSword_player3(load[10]);
                Value.setSword_player4(load[11]);
                Value.setArmor_player1(load[12]);
                Value.setArmor_player2(load[13]);
                Value.setArmor_player3(load[14]);
                Value.setArmor_player4(load[15]);
                Value.setFood_player1(load[16]);
                Value.setFood_player2(load[17]);
                Value.setFood_player3(load[18]);
                Value.setFood_player4(load[19]);
                Value.setPotion_player1(load[20]);
                Value.setPotion_player2(load[21]);
                Value.setPotion_player3(load[22]);
                Value.setPotion_player4(load[23]);
                Value.setBook_player1(load[24]);
                Value.setBook_player2(load[25]);
                Value.setBook_player3(load[26]);
                Value.setBook_player4(load[27]);
                Value.setBow_player1(load[28]);
                Value.setBow_player2(load[29]);
                Value.setBow_player3(load[30]);
                Value.setBow_player4(load[31]);
                Value.setMoney_Player1(load[32]);
                Value.setMoney_Player2(load[33]);
                Value.setMoney_Player3(load[34]);
                Value.setMoney_Player4(load[35]);
                Value.setPower_Player1(load[36]);
                Value.setPower_Player2(load[37]);
                Value.setPower_Player3(load[38]);
                Value.setPower_Player4(load[39]);
                Value.setLean_player1(load[40]);
                Value.setLean_player2(load[41]);
                Value.setLean_player3(load[42]);
                Value.setLean_player4(load[43]);
                Value.setMoney_Lean(load[44]);
                Value.setTreasure1_Diamond_Ring(load[45]);
                Value.setTreasure2_Jeweled_Sword(load[46]);
                Value.setTreasure3_Golden_Glass(load[47]);
                Value.setTreasure4_Glass_Cup(load[48]);
                Value.setTreasure5_Wooden_Bow(load[49]);
                Value.setTreasure6_Steel_Shield(load[50]);
                Value.setTreasure7_Golden_Key(load[51]);
                Value.setTreasure8_Dragon_Scroll(load[52]);
                if (load[53] == 0) Value.setTreasure1_Diamond_Ring_Status(true);
                else Value.setTreasure1_Diamond_Ring_Status(false);
                if (load[54] == 0) Value.setTreasure2_Jeweled_Sword_Status(true);
                else Value.setTreasure2_Jeweled_Sword_Status(false);
                if (load[55] == 0) Value.setTreasure3_Golden_Glass_Status(true);
                else Value.setTreasure3_Golden_Glass_Status(false);
                if (load[56] == 0) Value.setTreasure4_Glass_Cup_Status(true);
                else Value.setTreasure4_Glass_Cup_Status(false);
                if (load[57] == 0) Value.setTreasure5_Wooden_Bow_Status(true);
                else Value.setTreasure5_Wooden_Bow_Status(false);
                if (load[58] == 0) Value.setTreasure6_Steel_Shield_Status(true);
                else Value.setTreasure6_Steel_Shield_Status(false);
                if (load[59] == 0) Value.setTreasure7_Golden_Key_Status(true);
                else Value.setTreasure7_Golden_Key_Status(false);
                if (load[60] == 0) Value.setTreasure8_Dragon_Scroll_Status(true);
                else Value.setTreasure8_Dragon_Scroll_Status(false);
                Value.setMarket1(load[61]);
                Value.setMarket2(load[62]);
                Value.setMarket3(load[63]);
                Value.setMarket4(load[64]);
                Value.setMarket5(load[65]);
                Value.setMarket6(load[66]);
                Value.setTrap1(load[67]);
                Value.setTrap2(load[68]);
                Value.setTrap3(load[69]);
                Value.setTrap4(load[70]);
                Value.setTrap5(load[71]);
                Value.setTrap6(load[72]);
                Value.setWall1(load[73]);
                Value.setWall2(load[74]);
                Value.setWall3(load[75]);
                Value.setWall4(load[76]);
                Value.setWall5(load[77]);
                Value.setWall6(load[78]);
                Value.setWall7(load[79]);
                Value.setWall8(load[80]);
                Value.setTreasure1_Diamond_Ring_Code_Player1(load[81]);
                Value.setTreasure1_Diamond_Ring_Code_Player2(load[82]);
                Value.setTreasure1_Diamond_Ring_Code_Player3(load[83]);
                Value.setTreasure1_Diamond_Ring_Code_Player4(load[84]);
                Value.setTreasure2_Jeweled_Sword_Code_Player1(load[85]);
                Value.setTreasure2_Jeweled_Sword_Code_Player2(load[86]);
                Value.setTreasure2_Jeweled_Sword_Code_Player3(load[87]);
                Value.setTreasure2_Jeweled_Sword_Code_Player4(load[88]);
                Value.setTreasure3_Golden_Glass_Code_Player1(load[89]);
                Value.setTreasure3_Golden_Glass_Code_Player2(load[90]);
                Value.setTreasure3_Golden_Glass_Code_Player3(load[91]);
                Value.setTreasure3_Golden_Glass_Code_Player4(load[92]);
                Value.setTreasure4_Glass_Cup_Code_Player1(load[93]);
                Value.setTreasure4_Glass_Cup_Code_Player2(load[94]);
                Value.setTreasure4_Glass_Cup_Code_Player3(load[95]);
                Value.setTreasure4_Glass_Cup_Code_Player4(load[96]);
                Value.setTreasure5_Wooden_Bow_Code_Player1(load[97]);
                Value.setTreasure5_Wooden_Bow_Code_Player2(load[98]);
                Value.setTreasure5_Wooden_Bow_Code_Player3(load[99]);
                Value.setTreasure5_Wooden_Bow_Code_Player4(load[100]);
                Value.setTreasure6_Steel_Shield_Code_Player1(load[101]);
                Value.setTreasure6_Steel_Shield_Code_Player2(load[102]);
                Value.setTreasure6_Steel_Shield_Code_Player3(load[103]);
                Value.setTreasure6_Steel_Shield_Code_Player4(load[104]);
                Value.setTreasure7_Golden_Key_Code_Player1(load[105]);
                Value.setTreasure7_Golden_Key_Code_Player2(load[106]);
                Value.setTreasure7_Golden_Key_Code_Player3(load[107]);
                Value.setTreasure7_Golden_Key_Code_Player4(load[108]);
                Value.setTreasure8_Dragon_Scroll_Code_Player1(load[109]);
                Value.setTreasure8_Dragon_Scroll_Code_Player2(load[110]);
                Value.setTreasure8_Dragon_Scroll_Code_Player3(load[111]);
                Value.setTreasure8_Dragon_Scroll_Code_Player4(load[112]);
                Value.setLost_Object1(load[113]);
                Value.setLost_Object2(load[114]);
                Value.setLost_Object3(load[115]);
                Value.setLost_Object4(load[116]);
                Value.setLost_Object5(load[117]);
                Value.setLost_Object6(load[118]);
                Value.setLost_Object7(load[119]);
                Value.setLost_Object8(load[120]);
                Value.setLost_Object9(load[121]);
                Value.setLost_Object10(load[122]);
                Value.setLost_Object11(load[123]);
                Value.setLost_Object12(load[124]);
                Value.setLost_Object13(load[125]);
                Value.setLost_Object14(load[126]);
                Value.setLost_Object15(load[127]);
                Value.setLost_Object16(load[128]);
                if (load[129] == 0) Value.setObject1(true);
                else Value.setObject1(false);
                if (load[130] == 0) Value.setObject2(true);
                else Value.setObject2(false);
                if (load[131] == 0) Value.setObject3(true);
                else Value.setObject3(false);
                if (load[132] == 0) Value.setObject4(true);
                else Value.setObject4(false);
                if (load[133] == 0) Value.setObject5(true);
                else Value.setObject5(false);
                if (load[134] == 0) Value.setObject6(true);
                else Value.setObject6(false);
                if (load[135] == 0) Value.setObject7(true);
                else Value.setObject7(false);
                if (load[136] == 0) Value.setObject8(true);
                else Value.setObject8(false);
                if (load[137] == 0) Value.setObject9(true);
                else Value.setObject9(false);
                if (load[138] == 0) Value.setObject10(true);
                else Value.setObject10(false);
                if (load[139] == 0) Value.setObject11(true);
                else Value.setObject11(false);
                if (load[140] == 0) Value.setObject12(true);
                else Value.setObject12(false);
                if (load[141] == 0) Value.setObject13(true);
                else Value.setObject13(false);
                if (load[142] == 0) Value.setObject14(true);
                else Value.setObject14(false);
                if (load[143] == 0) Value.setObject15(true);
                else Value.setObject15(false);
                if (load[144] == 0) Value.setObject16(true);
                else Value.setObject16(false);
                Treasure_single_code[0] = load[145];
                Treasure_single_code[1] = load[146];
                Treasure_single_code[2] = load[147];
                Treasure_single_code[3] = load[148];
                Treasure_single_code[4] = load[149];
                Treasure_single_code[5] = load[150];
                Treasure_single_code[6] = load[151];
                Treasure_single_code[7] = load[152];
                if (load[153] == 0) move_single = true;
                else move_single = false;
                if (load[154] == 0) Start_game = true;
                else Start_game = false;
                paste[0] = load[155];
                paste[1] = load[156];
                paste[2] = load[157];
                paste[3] = load[158];
                paste[4] = load[159];
                paste[5] = load[160];
                paste[6] = load[161];
                Start_Time = load[162];
                Start_Time_Player = load[163];
                Time_Now = load[164];
                Time_Now_Player = load[165];
                Elapsed_Time = load[166];
                Elapsed_Time_Player = load[167];
                Remaining_Time = load[168];
                Remaining_Time1 = load[169];
                Remaining_Time_Player = load[170];
                Remaining_Time1_Player = load[171];
                Minutes = load[172];
                Second = load[173];
                Time = load[174];
                penalty = load[175];
                x5 = load[176];
                y5 = load[177];
                Single_player.Dice = load[178];
                Player1.setDice(load[179]);
                Player2.setDice(load[180]);
                Player3.setDice(load[181]);
                Player4.setDice(load[182]);
                Player1.setCurrent_Location(load[183]);
                Player2.setCurrent_Location(load[184]);
                Player3.setCurrent_Location(load[185]);
                Player4.setCurrent_Location(load[186]);
                Single_player.setCurrent_Location(load[187]);
                Player1.setTarget_Location(load[188]);
                Player2.setTarget_Location(load[189]);
                Player3.setTarget_Location(load[190]);
                Player4.setTarget_Location(load[191]);
                Single_player.setTarget_Location(load[192]);
                Player1.setChange_Dice(load[193]);
                Player2.setChange_Dice(load[194]);
                Player3.setChange_Dice(load[195]);
                Player4.setChange_Dice(load[196]);
                Single_player.setChange_Dice(load[197]);
                if (load[198] == 0) Player1.Permission_To_Dice = true;
                else Player1.Permission_To_Dice = false;
                if (load[199] == 0) Player2.Permission_To_Dice = true;
                else Player2.Permission_To_Dice = false;
                if (load[200] == 0) Player3.Permission_To_Dice = true;
                else Player3.Permission_To_Dice = false;
                if (load[201] == 0) Player4.Permission_To_Dice = true;
                else Player4.Permission_To_Dice = false;
                Value.setCharacter(load[202]);
                Value.language=load[203];
                Value.game=2;
                Value.game_loaded=true;
                Start_Time=System.currentTimeMillis();
                Total_Time2=Remaining_Time+6000;
                Start_Time_Player=System.currentTimeMillis();
                Time_Player2=Remaining_Time_Player+6000;
                Value.setLoad(false);
                Player1.frame.setVisible(true);
            }


            if (Value.getLean_player1() == -1 && Minutes > 3) {
                Value.setLean_player1(0);
                x5 = System.currentTimeMillis();
            }
            if (Value.getLean_player2() == -1 && Minutes > 3) {
                Value.setLean_player2(0);
                x5 = System.currentTimeMillis();
            }
            if (Value.getLean_player3() == -1 && Minutes > 3) {
                Value.setLean_player3(0);
                x5 = System.currentTimeMillis();
            }
            if (Value.getLean_player4() == -1 && Minutes > 3) {
                Value.setLean_player4(0);
                x5 = System.currentTimeMillis();
            }


            if (Value.getLean_player1() > 0) {
                y5 = System.currentTimeMillis();
                if (Value.getLean_player1() == 1 && (y5 - x5 >= 180000)) {
                    new ShowMessage(text1 + Value.getLean_player1() +text2, text3, 3000);
                    Value.setMoney_Player1(Value.getMoney_Player1() - Value.getMoney_Lean());
                    Value.setLean_player1(-2);
                    Value.setMoney_Lean(0);
                }
            }
            if (Value.getLean_player2() > 0) {
                y5 = System.currentTimeMillis();
                if (Value.getLean_player2() == 1 && (y5 - x5 >= 180000)) {
                    new ShowMessage(text1 + Value.getLean_player2() +text2, text3, 3000);
                    Value.setMoney_Player2(Value.getMoney_Player2() - Value.getMoney_Lean());
                    Value.setLean_player2(-2);
                    Value.setMoney_Lean(0);
                }
            }
            if (Value.getLean_player3() > 0) {
                y5 = System.currentTimeMillis();
                if (Value.getLean_player3() == 1 && (y5 - x5 >= 180000)) {
                    new ShowMessage(text1 + Value.getLean_player3() + text2, text3, 3000);
                    Value.setMoney_Player3(Value.getMoney_Player3() - Value.getMoney_Lean());
                    Value.setLean_player3(-2);
                    Value.setMoney_Lean(0);
                }
            }
            if (Value.getLean_player4() > 0) {
                y5 = System.currentTimeMillis();
                if (Value.getLean_player4() == 1 && (y5 - x5 >= 180000)) {
                    new ShowMessage(text1 + Value.getLean_player4() + text2, text3, 3000);
                    Value.setMoney_Player4(Value.getMoney_Player4() - Value.getMoney_Lean());
                    Value.setLean_player4(-2);
                    Value.setMoney_Lean(0);
                }
            }


            if (Value.viewQuest) {
                JOptionPane.showMessageDialog(null,Quests[quest-1]);
                Value.viewQuest = false;
            }

            Value.quest = quest;


            if (Value.change_Quest) {
                while (true) {
                    int x = Methods.Quest_Rand();
                    int y = 0;
                    for (int i = 0; i < 8; i++) {
                        if (quests[i] != x) y++;
                    }
                    if (y == 8) {
                        quest = x;
                        break;
                    } else if (y == 0) System.exit(1);
                    else continue;
                }
                Value.change_Quest = false;
            }


            if (Value.getPlayer() == 1) Castle.status = Player1.getCurrent_Location();
            if (Value.getPlayer() == 2) Castle.status = Player2.getCurrent_Location();
            if (Value.getPlayer() == 3) Castle.status = Player3.getCurrent_Location();
            if (Value.getPlayer() == 4) Castle.status = Player4.getCurrent_Location();


            if (Player1.getCurrent_Location() != 61) Player1.SetImageIcon(6, 5, Player1.getAddress_Image_Castle());
            if (Player2.getCurrent_Location() != 61) Player2.SetImageIcon(6, 5, Player1.getAddress_Image_Castle());
            if (Player3.getCurrent_Location() != 61) Player3.SetImageIcon(6, 5, Player1.getAddress_Image_Castle());
            if (Player4.getCurrent_Location() != 61) Player4.SetImageIcon(6, 5, Player1.getAddress_Image_Castle());
            if (Single_player.getCurrent_Location() != 61) Single_player.SetImageIcon(6, 5, Player1.getAddress_Image_Castle());








            sleep++;
            if (!move_single) {
                move_single = true;
                Single_player.Dice -= 1;
                if (Value.getPlayer() == 3) {
                    try {
                        Thread.sleep(1500);
                    } catch (Exception e) {
                    }
                }
            }




            switch (Player1.getDice()) {
                case 0:
                    Player1.SetImageIcon(0, 1, Player1.getAddress_Image_Dice());
                    break;
                case 1:
                    Player1.SetImageIcon(0, 1, Player1.getAddress_Image_Dice1());
                    break;
                case 2:
                    Player1.SetImageIcon(0, 1, Player1.getAddress_Image_Dice2());
                    break;
                case 3:
                    Player1.SetImageIcon(0, 1, Player1.getAddress_Image_Dice3());
                    break;
                case 4:
                    Player1.SetImageIcon(0, 1, Player1.getAddress_Image_Dice4());
                    break;
                case 5:
                    Player1.SetImageIcon(0, 1, Player1.getAddress_Image_Dice5());
                    break;
                case 6:
                    Player1.SetImageIcon(0, 1, Player1.getAddress_Image_Dice6());
                    break;
            }


            switch (Player2.getDice()) {
                case 0:
                    Player2.SetImageIcon(0, 1, Player2.getAddress_Image_Dice());
                    break;
                case 1:
                    Player2.SetImageIcon(0, 1, Player2.getAddress_Image_Dice1());
                    break;
                case 2:
                    Player2.SetImageIcon(0, 1, Player2.getAddress_Image_Dice2());
                    break;
                case 3:
                    Player2.SetImageIcon(0, 1, Player2.getAddress_Image_Dice3());
                    break;
                case 4:
                    Player2.SetImageIcon(0, 1, Player2.getAddress_Image_Dice4());
                    break;
                case 5:
                    Player2.SetImageIcon(0, 1, Player2.getAddress_Image_Dice5());
                    break;
                case 6:
                    Player2.SetImageIcon(0, 1, Player2.getAddress_Image_Dice6());
                    break;
            }

            switch (Player3.getDice()) {
                case 0:
                    Player3.SetImageIcon(0, 1, Player3.getAddress_Image_Dice());
                    break;
                case 1:
                    Player3.SetImageIcon(0, 1, Player3.getAddress_Image_Dice1());
                    break;
                case 2:
                    Player3.SetImageIcon(0, 1, Player3.getAddress_Image_Dice2());
                    break;
                case 3:
                    Player3.SetImageIcon(0, 1, Player3.getAddress_Image_Dice3());
                    break;
                case 4:
                    Player3.SetImageIcon(0, 1, Player3.getAddress_Image_Dice4());
                    break;
                case 5:
                    Player3.SetImageIcon(0, 1, Player3.getAddress_Image_Dice5());
                    break;
                case 6:
                    Player3.SetImageIcon(0, 1, Player3.getAddress_Image_Dice6());
                    break;
            }

            switch (Player4.getDice()) {
                case 0:
                    Player4.SetImageIcon(0, 1, Player4.getAddress_Image_Dice());
                    break;
                case 1:
                    Player4.SetImageIcon(0, 1, Player4.getAddress_Image_Dice1());
                    break;
                case 2:
                    Player4.SetImageIcon(0, 1, Player4.getAddress_Image_Dice2());
                    break;
                case 3:
                    Player4.SetImageIcon(0, 1, Player4.getAddress_Image_Dice3());
                    break;
                case 4:
                    Player4.SetImageIcon(0, 1, Player4.getAddress_Image_Dice4());
                    break;
                case 5:
                    Player4.SetImageIcon(0, 1, Player4.getAddress_Image_Dice5());
                    break;
                case 6:
                    Player4.SetImageIcon(0, 1, Player4.getAddress_Image_Dice6());
                    break;
            }


            switch (Single_player.Dice) {
                case 0:
                    Single_player.SetImageIcon(0, 1, Single_player.getAddress_Image_Dice());
                    break;
                case 1:
                    Single_player.SetImageIcon(0, 1, Single_player.getAddress_Image_Dice1());
                    break;
                case 2:
                    Single_player.SetImageIcon(0, 1, Single_player.getAddress_Image_Dice2());
                    break;
                case 3:
                    Single_player.SetImageIcon(0, 1, Single_player.getAddress_Image_Dice3());
                    break;
                case 4:
                    Single_player.SetImageIcon(0, 1, Single_player.getAddress_Image_Dice4());
                    break;
                case 5:
                    Single_player.SetImageIcon(0, 1, Single_player.getAddress_Image_Dice5());
                    break;
                case 6:
                    Single_player.SetImageIcon(0, 1, Single_player.getAddress_Image_Dice6());
                    break;
            }


            Player1.SetTextButton(Second_Player, Remaining_Time1_Player, Second, Minutes);
            Player2.SetTextButton(Second_Player, Remaining_Time1_Player, Second, Minutes);
            Player3.SetTextButton(Second_Player, Remaining_Time1_Player, Second, Minutes);
            Player4.SetTextButton(Second_Player, Remaining_Time1_Player, Second, Minutes);
            Single_player.SetTextButton(Second_Player, Remaining_Time1_Player, Second, Minutes);

            if (Value.game==1) {
                Time_Now = System.currentTimeMillis();
                Elapsed_Time = (Time_Now - Start_Time);
                Remaining_Time = Total_Time - Elapsed_Time;
                Minutes = Remaining_Time / 60000;
                Second = (Remaining_Time / 1000) - (Minutes * 60);
            }
            else if (Value.game==2){
                Time_Now = System.currentTimeMillis();
                Elapsed_Time = (Time_Now - Start_Time);
                Remaining_Time = Total_Time2 - Elapsed_Time;
                Minutes = Remaining_Time / 60000;
                Second = (Remaining_Time / 1000) - (Minutes * 60);
            }
            if (Time != Second && Minutes > 0) {
                if (Minutes > 9 && Second > 9) {
                    Player1.textField1.setText("" + Minutes + " : " + Second);
                    Player2.textField1.setText("" + Minutes + " : " + Second);
                    Player3.textField1.setText("" + Minutes + " : " + Second);
                    Player4.textField1.setText("" + Minutes + " : " + Second);
                    Single_player.textField1.setText("" + Minutes + " : " + Second);
                }
                if (Minutes < 10 && Second > 9) {
                    Player1.textField1.setText("" + "0" + Minutes + " : " + Second);
                    Player2.textField1.setText("" + "0" + Minutes + " : " + Second);
                    Player3.textField1.setText("" + "0" + Minutes + " : " + Second);
                    Player4.textField1.setText("" + "0" + Minutes + " : " + Second);
                    Single_player.textField1.setText("" + "0" + Minutes + " : " + Second);
                }
                if (Minutes < 10 && Second < 10) {
                    Player1.textField1.setText("" + "0" + Minutes + " : " + "0" + Second);
                    Player2.textField1.setText("" + "0" + Minutes + " : " + "0" + Second);
                    Player3.textField1.setText("" + "0" + Minutes + " : " + "0" + Second);
                    Player4.textField1.setText("" + "0" + Minutes + " : " + "0" + Second);
                    Single_player.textField1.setText("" + "0" + Minutes + " : " + "0" + Second);
                }
                if (Minutes > 9 && Second < 10) {
                    Player1.textField1.setText("" + Minutes + " : " + "0" + Second);
                    Player2.textField1.setText("" + Minutes + " : " + "0" + Second);
                    Single_player.textField1.setText("" + Minutes + " : " + "0" + Second);
                }
                Time = Second;

            }

            if (Minutes == 0) {
                if (Remaining_Time % 137 == 0) Remaining_Time1 = Remaining_Time % 100;
                if (Second > 9 && Remaining_Time1 > 9) {
                    Player1.textField1.setText("" + Second + " : " + Remaining_Time1);
                    Player2.textField1.setText("" + Second + " : " + Remaining_Time1);
                    Player3.textField1.setText("" + Second + " : " + Remaining_Time1);
                    Player4.textField1.setText("" + Second + " : " + Remaining_Time1);
                    Single_player.textField1.setText("" + Second + " : " + Remaining_Time1);
                }
                if (Second < 10 && Remaining_Time1 > 9) {
                    Player1.textField1.setText("" + "0" + Second + " : " + Remaining_Time1);
                    Player2.textField1.setText("" + "0" + Second + " : " + Remaining_Time1);
                    Player3.textField1.setText("" + "0" + Second + " : " + Remaining_Time1);
                    Player4.textField1.setText("" + "0" + Second + " : " + Remaining_Time1);
                    Single_player.textField1.setText("" + "0" + Second + " : " + Remaining_Time1);
                }
                if (Second < 10 && Remaining_Time1 < 10) {
                    Player1.textField1.setText("" + "0" + Second + " : " + "0" + Remaining_Time1);
                    Player2.textField1.setText("" + "0" + Second + " : " + "0" + Remaining_Time1);
                    Player3.textField1.setText("" + "0" + Second + " : " + "0" + Remaining_Time1);
                    Player4.textField1.setText("" + "0" + Second + " : " + "0" + Remaining_Time1);
                    Single_player.textField1.setText("" + "0" + Second + " : " + "0" + Remaining_Time1);
                }
                if (Second > 9 && Remaining_Time1 < 10) {
                    Player1.textField1.setText("" + Second + " : " + "0" + Remaining_Time1);
                    Player2.textField1.setText("" + Second + " : " + "0" + Remaining_Time1);
                    Player3.textField1.setText("" + Second + " : " + "0" + Remaining_Time1);
                    Player4.textField1.setText("" + Second + " : " + "0" + Remaining_Time1);
                    Single_player.textField1.setText("     " + Second + " : " + "0" + Remaining_Time1);
                }
                int x = 15;
                if (Second < 40) x = 10;
                if (Second < 20) x = 5;
                if (Second < 5) x = 2;
                if ((Remaining_Time / 100) % x == 0) {
                    Player1.textField1.setBackground(Color.white);
                    Player2.textField1.setBackground(Color.white);
                    Player3.textField1.setBackground(Color.white);
                    Player4.textField1.setBackground(Color.white);
                    Single_player.textField1.setBackground(Color.white);
                } else {
                    Player1.textField1.setBackground(Color.red);
                    Player2.textField1.setBackground(Color.red);
                    Player3.textField1.setBackground(Color.red);
                    Player4.textField1.setBackground(Color.red);
                    Single_player.textField1.setBackground(Color.red);
                }
            }
            if (Minutes == 0 && Second == 0) {
                long point1=(Value.getPower_Player1()*5)+Value.getMoney_Player1();
                long point2=(Value.getPower_Player2()*5)+Value.getMoney_Player2();
                long point3=(Value.getPower_Player3()*5)+Value.getMoney_Player3();
                long point4=(Value.getPower_Player4()*5)+Value.getMoney_Player4();
                int number=0;
                if (point1>=point2&&point1>=point3&&point1>=point4)number=1;
                else if (point2>=point1&&point2>=point3&&point2>=point4)number=2;
                else if (point3>=point1&&point3>=point2&&point3>=point4)number=3;
                else if (point4>=point1&&point4>=point2&&point4>=point3)number=4;
                String message="";
                if (Value.language==1)message=" بازیکن"+number+"برنده شد ";
                else message="player "+number+" won";
                String title="";
                if (Value.language==1)title="پایان بازی";
                else title="End Game";
                new ShowMessage(message,title,10000);
                System.exit(1);
            }


            //player1

            if (Value.getPlayer() == 1) {

                if (!Value.game_loaded) {
                    if (st2==0){
                        Start_Time=System.currentTimeMillis();
                        st2=1;
                    }
                    Time_Now_Player = System.currentTimeMillis();
                    Elapsed_Time_Player = (Time_Now_Player - Start_Time_Player);
                    Remaining_Time_Player = Time_Player - Elapsed_Time_Player;
                    Second_Player = (Remaining_Time_Player / 1000);
                }
                else {
                    Time_Now_Player = System.currentTimeMillis();
                    Elapsed_Time_Player = (Time_Now_Player - Start_Time_Player);
                    Remaining_Time_Player = Time_Player2 - Elapsed_Time_Player;
                    Second_Player = (Remaining_Time_Player / 1000);
                }
                if (Second_Player >= 0 || Remaining_Time1_Player >= 0) {
                    if (Remaining_Time_Player % 137 == 0) Remaining_Time1_Player = Remaining_Time_Player % 100;
                    if (Second_Player > 9 && Remaining_Time1_Player > 9) {
                        Player1.textField2.setText("    " + Second_Player + " : " + Remaining_Time1_Player);
                    }
                    if (Second_Player < 10 && Remaining_Time1_Player > 9) {
                        Player1.textField2.setText("    " + "0" + Second_Player + " : " + Remaining_Time1_Player);
                    }
                    if (Second_Player < 10 && Remaining_Time1_Player < 10) {
                        Player1.textField2.setText("    " + "0" + Second_Player + " : " + "0" + Remaining_Time1_Player);
                    }
                    if (Second_Player > 9 && Remaining_Time1_Player < 10) {
                        Player1.textField2.setText("    " + Second_Player + " : " + "0" + Remaining_Time1_Player);
                    }
                }
                if (Second_Player < 0 && Remaining_Time1_Player < 0) {
                    penalty = -2 * (Second_Player);
                    Player1.textField2.setText("" + penalty + text5);
                }


                if (!Player1.Permission_To_Dice) {

                    if (Player1.getDice() > 0)
                        Player1.SetHighlight(Player1.getCurrent_Location(), paste, Color.CYAN, 8);

                    if (Player1.getChange_Dice() == 1) {
                        Player1.SetHighlight(Player1.getCurrent_Location(), paste, Color.BLACK, 2);

                        paste[Player1.getDice()] = Player1.getCurrent_Location();

                        if (Player1.getCurrent_Location() > 0) {
                            if (Methods.Check_Market(Player1.getCurrent_Location())) {
                                image_cells_player1[Player1.getCurrent_Location()-1]=1;
                                Player1.SetImageIcon(Methods.Row_Number(Player1.getCurrent_Location()), Methods.Column_Number(Player1.getCurrent_Location()), Player1.getAddress_Image_Market());
                            } else if (Methods.Check_Lost_Object(Player1.getCurrent_Location())) {
                                image_cells_player1[Player1.getCurrent_Location()-1]=2;
                                Player1.SetImageIcon(Methods.Row_Number(Player1.getCurrent_Location()), Methods.Column_Number(Player1.getCurrent_Location()), Player1.getAddress_Image_Lost_Object());
                            } else if (Methods.Check_Trap(Player1.getCurrent_Location())) {
                                image_cells_player1[Player1.getCurrent_Location()-1]=3;
                                Player1.SetImageIcon(Methods.Row_Number(Player1.getCurrent_Location()), Methods.Column_Number(Player1.getCurrent_Location()), Player1.getAddress_Image_Trap());
                            } else if (Methods.Check_Treasure(Player1.getCurrent_Location()) > 0 && Methods.Check_Treasure(Player1.getCurrent_Location()) < 9) {
                                image_cells_player1[Player1.getCurrent_Location()-1]=4;
                                Player1.SetImageIcon(Methods.Row_Number(Player1.getCurrent_Location()), Methods.Column_Number(Player1.getCurrent_Location()), Player1.getAddress_Image_Treasure());
                            } else {
                                image_cells_player1[Player1.getCurrent_Location()-1]=0;
                                Player1.SetImageIcon(Methods.Row_Number(Player1.getCurrent_Location()), Methods.Column_Number(Player1.getCurrent_Location()), Player1.getAddress_Image_Empty());
                            }

                        }
                        Player1.setCurrent_Location(Player1.getTarget_Location());

                        //Castle
                        if (Player1.getCurrent_Location() == 61) {
                        }


                        //Market

                        if (Methods.Check_Market(Player1.getCurrent_Location())) {
                            Object[] options = {text6, text7};
                            int a = JOptionPane.showOptionDialog(null, text8, text9,
                                    JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE,
                                    null, options, null);
                            if (a == JOptionPane.YES_OPTION) {
                                market.setVisible(true);
                            }
                        }

                        //Lost Object

                        if (Methods.Check_Lost_Object(Player1.getCurrent_Location())) {
                            if (Methods.Find_Object(Player1.getCurrent_Location()) > 0) {
                                int x = Methods.Money_Rand1();
                                Object[] options = {text10};
                                JOptionPane.showOptionDialog(null, text11 + x + text12, text13,
                                        JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE,
                                        null, options, null);
                                Value.setMoney_Player1(Value.getMoney_Player1() + x);
                            }
                            switch (Methods.Find_Object(Player1.getCurrent_Location())) {
                                case 1:
                                    Value.setObject1(false);
                                    break;
                                case 2:
                                    Value.setObject2(false);
                                    break;
                                case 3:
                                    Value.setObject3(false);
                                    break;
                                case 4:
                                    Value.setObject4(false);
                                    break;
                                case 5:
                                    Value.setObject5(false);
                                    break;
                                case 6:
                                    Value.setObject6(false);
                                    break;
                                case 7:
                                    Value.setObject7(false);
                                    break;
                                case 8:
                                    Value.setObject8(false);
                                    break;
                                case 9:
                                    Value.setObject9(false);
                                    break;
                                case 10:
                                    Value.setObject10(false);
                                    break;
                                case 11:
                                    Value.setObject11(false);
                                    break;
                                case 12:
                                    Value.setObject12(false);
                                    break;
                                case 13:
                                    Value.setObject13(false);
                                    break;
                                case 14:
                                    Value.setObject14(false);
                                    break;
                                case 15:
                                    Value.setObject15(false);
                                    break;
                                case 16:
                                    Value.setObject16(false);
                                    break;

                            }

                        }

                        //Trap

                        if (Methods.Check_Trap(Player1.getCurrent_Location())) {
                            int x = Methods.Money_Rand1();
                            Object[] options = {text10};
                            JOptionPane.showOptionDialog(null, text14 + x +text15, text16,
                                    JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE,
                                    null, options, null);
                            Value.setMoney_Player1(Value.getMoney_Player1() - x);
                        }

                        //Treasure

                        if (Methods.Check_Treasure(Player1.getCurrent_Location()) > 0) {
                            int y = Methods.Check_Treasure(Player1.getCurrent_Location());
                            int x = 0;
                            switch (y) {
                                case 1:
                                    x = Value.getTreasure1_Diamond_Ring_Code_Player1();
                                    break;
                                case 2:
                                    x = Value.getTreasure2_Jeweled_Sword_Code_Player1();
                                    break;
                                case 3:
                                    x = Value.getTreasure3_Golden_Glass_Code_Player1();
                                    break;
                                case 4:
                                    x = Value.getTreasure4_Glass_Cup_Code_Player1();
                                    break;
                                case 5:
                                    x = Value.getTreasure5_Wooden_Bow_Code_Player1();
                                    break;
                                case 6:
                                    x = Value.getTreasure6_Steel_Shield_Code_Player1();
                                    break;
                                case 7:
                                    x = Value.getTreasure7_Golden_Key_Code_Player1();
                                    break;
                                case 8:
                                    x = Value.getTreasure8_Dragon_Scroll_Code_Player1();
                                    break;
                            }
                            Object[] options = {text10};
                            JOptionPane.showOptionDialog(null, text17 + x, text18,
                                    JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE,
                                    null, options, null);

                        } else {
                        }


                        if (Player1.getCurrent_Location() == Single_player.getCurrent_Location() && (Player1.getCurrent_Location()!=0&&Single_player.getCurrent_Location()!=0)) {
                            new FightGif();
                            try {
                                Thread.sleep(10200);
                            } catch (Exception e) {
                            }
                            new Fight(1, 2, Value.getPower_Player1(), Value.getPower_Player2(), Value.getMoney_Player1(), Value.getMoney_Player2());
                            if (Value.win_Fight == 1) {

                                long x = Value.getPower_Player1() - Value.getPower_Player2();
                                if (x < 0) x *= -1;
                                if (x != 0) {
                                    x /= (Value.getPower_Player1() + Value.getPower_Player2());
                                }
                                x *= Value.getMoney_Player2();
                                Value.setMoney_Player1(Value.getMoney_Player1() + x);
                                Value.setMoney_Player2(Value.getMoney_Player2() - x);
                                Value.setPower_Player1(Value.getPower_Player1() - Value.getPower_Player2());
                                Value.setPower_Player2(0);

                                if (Methods.Check_Market(Single_player.getCurrent_Location())) {
                                    image_cells_single[Single_player.getCurrent_Location()-1]=1;
                                    Single_player.SetImageIcon(Methods.Row_Number(Single_player.getCurrent_Location()), Methods.Column_Number(Single_player.getCurrent_Location()), Single_player.getAddress_Image_Market());
                                } else if (Methods.Check_Lost_Object(Single_player.getCurrent_Location())) {
                                    image_cells_single[Single_player.getCurrent_Location()-1]=2;
                                    Single_player.SetImageIcon(Methods.Row_Number(Single_player.getCurrent_Location()), Methods.Column_Number(Single_player.getCurrent_Location()), Single_player.getAddress_Image_Lost_Object());
                                } else if (Methods.Check_Trap(Single_player.getCurrent_Location())) {
                                    image_cells_single[Single_player.getCurrent_Location()-1]=3;
                                    Single_player.SetImageIcon(Methods.Row_Number(Single_player.getCurrent_Location()), Methods.Column_Number(Single_player.getCurrent_Location()), Single_player.getAddress_Image_Trap());
                                } else if (Methods.Check_Treasure(Single_player.getCurrent_Location()) > 0 && Methods.Check_Treasure(Single_player.getCurrent_Location()) < 9) {
                                    image_cells_single[Single_player.getCurrent_Location()-1]=4;
                                    Single_player.SetImageIcon(Methods.Row_Number(Single_player.getCurrent_Location()), Methods.Column_Number(Single_player.getCurrent_Location()), Single_player.getAddress_Image_Treasure());
                                } else {
                                    image_cells_single[Single_player.getCurrent_Location()-1]=0;
                                    Single_player.SetImageIcon(Methods.Row_Number(Single_player.getCurrent_Location()), Methods.Column_Number(Single_player.getCurrent_Location()), Single_player.getAddress_Image_Empty());
                                }
                                Single_player.setCurrent_Location(0);
                            } else {

                                long x = Value.getPower_Player1() - Value.getPower_Player2();
                                if (x < 0) x *= -1;
                                if (x != 0) {
                                    x /= (Value.getPower_Player1() + Value.getPower_Player2());
                                }
                                x *= Value.getMoney_Player1();
                                Value.setMoney_Player2(Value.getMoney_Player2() + x);
                                Value.setMoney_Player1(Value.getMoney_Player1() - x);
                                Value.setPower_Player2(Value.getPower_Player2() - Value.getPower_Player1());
                                Value.setPower_Player1(0);
                                Player1.setDice(0);

                                if (Methods.Check_Market(Player1.getCurrent_Location())) {
                                    image_cells_player1[Player1.getCurrent_Location()-1]=1;
                                    Player1.SetImageIcon(Methods.Row_Number(Player1.getCurrent_Location()), Methods.Column_Number(Player1.getCurrent_Location()), Player1.getAddress_Image_Market());
                                } else if (Methods.Check_Lost_Object(Player1.getCurrent_Location())) {
                                    image_cells_player1[Player1.getCurrent_Location()-1]=2;
                                    Player1.SetImageIcon(Methods.Row_Number(Player1.getCurrent_Location()), Methods.Column_Number(Player1.getCurrent_Location()), Player1.getAddress_Image_Lost_Object());
                                } else if (Methods.Check_Trap(Player1.getCurrent_Location())) {
                                    image_cells_player1[Player1.getCurrent_Location()-1]=3;
                                    Player1.SetImageIcon(Methods.Row_Number(Player1.getCurrent_Location()), Methods.Column_Number(Player1.getCurrent_Location()), Player1.getAddress_Image_Trap());
                                } else if (Methods.Check_Treasure(Player1.getCurrent_Location()) > 0 && Methods.Check_Treasure(Player1.getCurrent_Location()) < 9) {
                                    image_cells_player1[Player1.getCurrent_Location()-1]=4;
                                    Player1.SetImageIcon(Methods.Row_Number(Player1.getCurrent_Location()), Methods.Column_Number(Player1.getCurrent_Location()), Player1.getAddress_Image_Treasure());
                                } else {
                                    image_cells_player1[Player1.getCurrent_Location()-1]=0;
                                    Player1.SetImageIcon(Methods.Row_Number(Player1.getCurrent_Location()), Methods.Column_Number(Player1.getCurrent_Location()), Player1.getAddress_Image_Empty());
                                }
                                Player1.setCurrent_Location(0);
                            }
                        }


                        if (Player1.getCurrent_Location() == Player2.getCurrent_Location()&& (Player1.getCurrent_Location()!=0&&Player2.getCurrent_Location()!=0)) {
                            new FightGif();
                            try {
                                Thread.sleep(10200);
                            } catch (Exception e) {
                            }
                            new Fight(1, 2, Value.getPower_Player1(), Value.getPower_Player2(), Value.getMoney_Player1(), Value.getMoney_Player2());

                            if (Value.win_Fight == 1) {

                                long x = Value.getPower_Player1() - Value.getPower_Player2();
                                if (x < 0) x *= -1;
                                if (x != 0) {
                                    x /= (Value.getPower_Player1() + Value.getPower_Player2());
                                }
                                x *= Value.getMoney_Player2();
                                Value.setMoney_Player1(Value.getMoney_Player1() + x);
                                Value.setMoney_Player2(Value.getMoney_Player2() - x);
                                Value.setPower_Player1(Value.getPower_Player1() - Value.getPower_Player2());
                                Value.setPower_Player2(0);

                                if (Methods.Check_Market(Player2.getCurrent_Location())) {
                                    image_cells_player2[Player2.getCurrent_Location()-1]=1;
                                    Player2.SetImageIcon(Methods.Row_Number(Player2.getCurrent_Location()), Methods.Column_Number(Player2.getCurrent_Location()), Player2.getAddress_Image_Market());
                                } else if (Methods.Check_Lost_Object(Player2.getCurrent_Location())) {
                                    image_cells_player2[Player2.getCurrent_Location()-1]=2;
                                    Player2.SetImageIcon(Methods.Row_Number(Player2.getCurrent_Location()), Methods.Column_Number(Player2.getCurrent_Location()), Player2.getAddress_Image_Lost_Object());
                                } else if (Methods.Check_Trap(Player2.getCurrent_Location())) {
                                    image_cells_player2[Player2.getCurrent_Location()-1]=3;
                                    Player2.SetImageIcon(Methods.Row_Number(Player2.getCurrent_Location()), Methods.Column_Number(Player2.getCurrent_Location()), Player2.getAddress_Image_Trap());
                                } else if (Methods.Check_Treasure(Player2.getCurrent_Location()) > 0 && Methods.Check_Treasure(Player2.getCurrent_Location()) < 9) {
                                    image_cells_player2[Player2.getCurrent_Location()-1]=4;
                                    Player2.SetImageIcon(Methods.Row_Number(Player2.getCurrent_Location()), Methods.Column_Number(Player2.getCurrent_Location()), Player2.getAddress_Image_Treasure());
                                } else {
                                    image_cells_player2[Player2.getCurrent_Location()-1]=0;
                                    Player2.SetImageIcon(Methods.Row_Number(Player2.getCurrent_Location()), Methods.Column_Number(Player2.getCurrent_Location()), Player2.getAddress_Image_Empty());
                                }
                                Player2.setCurrent_Location(0);
                            } else {

                                long x = Value.getPower_Player1() - Value.getPower_Player2();
                                if (x < 0) x *= -1;
                                if (x != 0) {
                                    x /= (Value.getPower_Player1() + Value.getPower_Player2());
                                }
                                x *= Value.getMoney_Player1();
                                Value.setMoney_Player2(Value.getMoney_Player2() + x);
                                Value.setMoney_Player1(Value.getMoney_Player1() - x);
                                Value.setPower_Player2(Value.getPower_Player2() - Value.getPower_Player1());
                                Value.setPower_Player1(0);
                                Player1.setDice(0);

                                if (Methods.Check_Market(Player1.getCurrent_Location())) {
                                    image_cells_player1[Player1.getCurrent_Location()-1]=1;
                                    Player1.SetImageIcon(Methods.Row_Number(Player1.getCurrent_Location()), Methods.Column_Number(Player1.getCurrent_Location()), Player1.getAddress_Image_Market());
                                } else if (Methods.Check_Lost_Object(Player1.getCurrent_Location())) {
                                    image_cells_player1[Player1.getCurrent_Location()-1]=2;
                                    Player1.SetImageIcon(Methods.Row_Number(Player1.getCurrent_Location()), Methods.Column_Number(Player1.getCurrent_Location()), Player1.getAddress_Image_Lost_Object());
                                } else if (Methods.Check_Trap(Player1.getCurrent_Location())) {
                                    image_cells_player1[Player1.getCurrent_Location()-1]=3;
                                    Player1.SetImageIcon(Methods.Row_Number(Player1.getCurrent_Location()), Methods.Column_Number(Player1.getCurrent_Location()), Player1.getAddress_Image_Trap());
                                } else if (Methods.Check_Treasure(Player1.getCurrent_Location()) > 0 && Methods.Check_Treasure(Player1.getCurrent_Location()) < 9) {
                                    image_cells_player1[Player1.getCurrent_Location()-1]=4;
                                    Player1.SetImageIcon(Methods.Row_Number(Player1.getCurrent_Location()), Methods.Column_Number(Player1.getCurrent_Location()), Player1.getAddress_Image_Treasure());
                                } else {
                                    image_cells_player1[Player1.getCurrent_Location()-1]=0;
                                    Player1.SetImageIcon(Methods.Row_Number(Player1.getCurrent_Location()), Methods.Column_Number(Player1.getCurrent_Location()), Player1.getAddress_Image_Empty());
                                }
                                Player1.setCurrent_Location(0);
                            }
                        }


                        if (Player1.getCurrent_Location() == Player3.getCurrent_Location()&& (Player1.getCurrent_Location()!=0&&Player3.getCurrent_Location()!=0)) {
                            new FightGif();
                            try {
                                Thread.sleep(10200);
                            } catch (Exception e) {
                            }
                            new Fight(1, 3, Value.getPower_Player1(), Value.getPower_Player3(), Value.getMoney_Player1(), Value.getMoney_Player3());

                            if (Value.win_Fight == 1) {

                                long x = Value.getPower_Player1() - Value.getPower_Player3();
                                if (x < 0) x *= -1;
                                if (x != 0) {
                                    x /= (Value.getPower_Player1() + Value.getPower_Player3());
                                }
                                x *= Value.getMoney_Player3();
                                Value.setMoney_Player1(Value.getMoney_Player1() + x);
                                Value.setMoney_Player3(Value.getMoney_Player3() - x);
                                Value.setPower_Player1(Value.getPower_Player1() - Value.getPower_Player3());
                                Value.setPower_Player3(0);

                                if (Methods.Check_Market(Player3.getCurrent_Location())) {
                                    image_cells_player3[Player3.getCurrent_Location()-1]=1;
                                    Player3.SetImageIcon(Methods.Row_Number(Player3.getCurrent_Location()), Methods.Column_Number(Player3.getCurrent_Location()), Player3.getAddress_Image_Market());
                                } else if (Methods.Check_Lost_Object(Player3.getCurrent_Location())) {
                                    image_cells_player3[Player3.getCurrent_Location()-1]=2;
                                    Player3.SetImageIcon(Methods.Row_Number(Player3.getCurrent_Location()), Methods.Column_Number(Player3.getCurrent_Location()), Player3.getAddress_Image_Lost_Object());
                                } else if (Methods.Check_Trap(Player3.getCurrent_Location())) {
                                    image_cells_player3[Player3.getCurrent_Location()-1]=3;
                                    Player3.SetImageIcon(Methods.Row_Number(Player3.getCurrent_Location()), Methods.Column_Number(Player3.getCurrent_Location()), Player3.getAddress_Image_Trap());
                                } else if (Methods.Check_Treasure(Player3.getCurrent_Location()) > 0 && Methods.Check_Treasure(Player3.getCurrent_Location()) < 9) {
                                    image_cells_player3[Player3.getCurrent_Location()-1]=4;
                                    Player3.SetImageIcon(Methods.Row_Number(Player3.getCurrent_Location()), Methods.Column_Number(Player3.getCurrent_Location()), Player3.getAddress_Image_Treasure());
                                } else {
                                    image_cells_player3[Player3.getCurrent_Location()-1]=0;
                                    Player3.SetImageIcon(Methods.Row_Number(Player3.getCurrent_Location()), Methods.Column_Number(Player3.getCurrent_Location()), Player3.getAddress_Image_Empty());
                                }
                                Player3.setCurrent_Location(0);
                            } else {
                                long x = Value.getPower_Player1() - Value.getPower_Player3();
                                if (x < 0) x *= -1;
                                if (x != 0) {
                                    x /= (Value.getPower_Player1() + Value.getPower_Player3());
                                }
                                x *= Value.getMoney_Player1();
                                Value.setMoney_Player3(Value.getMoney_Player3() + x);
                                Value.setMoney_Player1(Value.getMoney_Player1() - x);
                                Value.setPower_Player3(Value.getPower_Player3() - Value.getPower_Player1());
                                Value.setPower_Player1(0);
                                Player1.setDice(0);

                                if (Methods.Check_Market(Player1.getCurrent_Location())) {
                                    image_cells_player1[Player1.getCurrent_Location()-1]=1;
                                    Player1.SetImageIcon(Methods.Row_Number(Player1.getCurrent_Location()), Methods.Column_Number(Player1.getCurrent_Location()), Player1.getAddress_Image_Market());
                                } else if (Methods.Check_Lost_Object(Player1.getCurrent_Location())) {
                                    image_cells_player1[Player1.getCurrent_Location()-1]=2;
                                    Player1.SetImageIcon(Methods.Row_Number(Player1.getCurrent_Location()), Methods.Column_Number(Player1.getCurrent_Location()), Player1.getAddress_Image_Lost_Object());
                                } else if (Methods.Check_Trap(Player1.getCurrent_Location())) {
                                    image_cells_player1[Player1.getCurrent_Location()-1]=3;
                                    Player1.SetImageIcon(Methods.Row_Number(Player1.getCurrent_Location()), Methods.Column_Number(Player1.getCurrent_Location()), Player1.getAddress_Image_Trap());
                                } else if (Methods.Check_Treasure(Player1.getCurrent_Location()) > 0 && Methods.Check_Treasure(Player1.getCurrent_Location()) < 9) {
                                    image_cells_player1[Player1.getCurrent_Location()-1]=4;
                                    Player1.SetImageIcon(Methods.Row_Number(Player1.getCurrent_Location()), Methods.Column_Number(Player1.getCurrent_Location()), Player1.getAddress_Image_Treasure());
                                } else {
                                    image_cells_player1[Player1.getCurrent_Location()-1]=0;
                                    Player1.SetImageIcon(Methods.Row_Number(Player1.getCurrent_Location()), Methods.Column_Number(Player1.getCurrent_Location()), Player1.getAddress_Image_Empty());
                                }
                                Player1.setCurrent_Location(0);
                            }

                        }


                        if (Player1.getCurrent_Location() == Player4.getCurrent_Location()&& (Player1.getCurrent_Location()!=0&&Player4.getCurrent_Location()!=0)) {
                            new FightGif();
                            try {
                                Thread.sleep(10200);
                            } catch (Exception e) {
                            }
                            new Fight(1, 4, Value.getPower_Player1(), Value.getPower_Player4(), Value.getMoney_Player1(), Value.getMoney_Player4());

                            if (Value.win_Fight == 1) {

                                long x = Value.getPower_Player1() - Value.getPower_Player4();
                                if (x < 0) x *= -1;
                                if (x != 0) {
                                    x /= (Value.getPower_Player1() + Value.getPower_Player4());
                                }
                                x *= Value.getMoney_Player4();
                                Value.setMoney_Player1(Value.getMoney_Player1() + x);
                                Value.setMoney_Player4(Value.getMoney_Player4() - x);
                                Value.setPower_Player1(Value.getPower_Player1() - Value.getPower_Player4());
                                Value.setPower_Player4(0);


                                if (Methods.Check_Market(Player4.getCurrent_Location())) {
                                    image_cells_player4[Player4.getCurrent_Location()-1]=1;
                                    Player4.SetImageIcon(Methods.Row_Number(Player4.getCurrent_Location()), Methods.Column_Number(Player4.getCurrent_Location()), Player4.getAddress_Image_Market());
                                } else if (Methods.Check_Lost_Object(Player4.getCurrent_Location())) {
                                    image_cells_player4[Player4.getCurrent_Location()-1]=2;
                                    Player4.SetImageIcon(Methods.Row_Number(Player4.getCurrent_Location()), Methods.Column_Number(Player4.getCurrent_Location()), Player4.getAddress_Image_Lost_Object());
                                } else if (Methods.Check_Trap(Player4.getCurrent_Location())) {
                                    image_cells_player4[Player4.getCurrent_Location()-1]=3;
                                    Player4.SetImageIcon(Methods.Row_Number(Player4.getCurrent_Location()), Methods.Column_Number(Player4.getCurrent_Location()), Player4.getAddress_Image_Trap());
                                } else if (Methods.Check_Treasure(Player4.getCurrent_Location()) > 0 && Methods.Check_Treasure(Player4.getCurrent_Location()) < 9) {
                                    image_cells_player4[Player4.getCurrent_Location()-1]=4;
                                    Player4.SetImageIcon(Methods.Row_Number(Player4.getCurrent_Location()), Methods.Column_Number(Player4.getCurrent_Location()), Player4.getAddress_Image_Treasure());
                                } else {
                                    image_cells_player4[Player4.getCurrent_Location()-1]=0;
                                    Player4.SetImageIcon(Methods.Row_Number(Player4.getCurrent_Location()), Methods.Column_Number(Player4.getCurrent_Location()), Player4.getAddress_Image_Empty());
                                }
                                Player4.setCurrent_Location(0);
                            } else {

                                long x = Value.getPower_Player1() - Value.getPower_Player4();
                                if (x < 0) x *= -1;
                                if (x != 0) {
                                    x /= (Value.getPower_Player1() + Value.getPower_Player4());
                                }
                                x *= Value.getMoney_Player1();
                                Value.setMoney_Player4(Value.getMoney_Player4() + x);
                                Value.setMoney_Player1(Value.getMoney_Player1() - x);
                                Value.setPower_Player4(Value.getPower_Player4() - Value.getPower_Player1());
                                Value.setPower_Player1(0);
                                Player1.setDice(0);

                                if (Methods.Check_Market(Player1.getCurrent_Location())) {
                                    image_cells_player1[Player1.getCurrent_Location()-1]=1;
                                    Player1.SetImageIcon(Methods.Row_Number(Player1.getCurrent_Location()), Methods.Column_Number(Player1.getCurrent_Location()), Player1.getAddress_Image_Market());
                                } else if (Methods.Check_Lost_Object(Player1.getCurrent_Location())) {
                                    image_cells_player1[Player1.getCurrent_Location()-1]=2;
                                    Player1.SetImageIcon(Methods.Row_Number(Player1.getCurrent_Location()), Methods.Column_Number(Player1.getCurrent_Location()), Player1.getAddress_Image_Lost_Object());
                                } else if (Methods.Check_Trap(Player1.getCurrent_Location())) {
                                    image_cells_player1[Player1.getCurrent_Location()-1]=3;
                                    Player1.SetImageIcon(Methods.Row_Number(Player1.getCurrent_Location()), Methods.Column_Number(Player1.getCurrent_Location()), Player1.getAddress_Image_Trap());
                                } else if (Methods.Check_Treasure(Player1.getCurrent_Location()) > 0 && Methods.Check_Treasure(Player1.getCurrent_Location()) < 9) {
                                    image_cells_player1[Player1.getCurrent_Location()-1]=4;
                                    Player1.SetImageIcon(Methods.Row_Number(Player1.getCurrent_Location()), Methods.Column_Number(Player1.getCurrent_Location()), Player1.getAddress_Image_Treasure());
                                } else {
                                    image_cells_player1[Player1.getCurrent_Location()-1]=0;
                                    Player1.SetImageIcon(Methods.Row_Number(Player1.getCurrent_Location()), Methods.Column_Number(Player1.getCurrent_Location()), Player1.getAddress_Image_Empty());
                                }
                                Player1.setCurrent_Location(0);
                            }

                        }


                        Player1.setChange_Dice(0);

                    }
                    if (Player1.getDice() == 0 && !market.isVisible()) {
                        Value.setPlayer(7);
                        Value.setMoney_Player1(Value.getMoney_Player1() - penalty);
                        penalty = 0;
                        for (int i = 0; i < 7; i++) {
                            paste[i] = 0;
                        }
                    }
                }

            }


            //player2


            if (Value.getPlayer() == 2) {


                if (!Value.game_loaded) {
                    Time_Now_Player = System.currentTimeMillis();
                    Elapsed_Time_Player = (Time_Now_Player - Start_Time_Player);
                    Remaining_Time_Player = Time_Player - Elapsed_Time_Player;
                    Second_Player = (Remaining_Time_Player / 1000);
                }
                else {
                    Time_Now_Player = System.currentTimeMillis();
                    Elapsed_Time_Player = (Time_Now_Player - Start_Time_Player);
                    Remaining_Time_Player = Time_Player2 - Elapsed_Time_Player;
                    Second_Player = (Remaining_Time_Player / 1000);
                }
                if (Second_Player >= 0 || Remaining_Time1_Player >= 0) {
                    if (Remaining_Time_Player % 137 == 0) Remaining_Time1_Player = Remaining_Time_Player % 100;
                    if (Second_Player > 9 && Remaining_Time1_Player > 9) {
                        Player2.textField2.setText("    " + Second_Player + " : " + Remaining_Time1_Player);
                    }
                    if (Second_Player < 10 && Remaining_Time1_Player > 9) {
                        Player2.textField2.setText("    " + "0" + Second_Player + " : " + Remaining_Time1_Player);
                    }
                    if (Second_Player < 10 && Remaining_Time1_Player < 10) {
                        Player2.textField2.setText("    " + "0" + Second_Player + " : " + "0" + Remaining_Time1_Player);
                    }
                    if (Second_Player > 9 && Remaining_Time1_Player < 10) {
                        Player2.textField2.setText("    " + Second_Player + " : " + "0" + Remaining_Time1_Player);
                    }
                }
                if (Remaining_Time1_Player < 0 && Second_Player < 0) {
                    penalty = -2 * (Second_Player);
                    Player2.textField2.setText("" + penalty + text5);
                }


                if (!Player2.Permission_To_Dice) {

                    Player2.SetHighlight(Player2.getCurrent_Location(), paste, Color.CYAN, 8);


                    if (Player2.getChange_Dice() == 1) {
                        Player2.SetHighlight(Player2.getCurrent_Location(), paste, Color.BLACK, 2);

                        paste[Player2.getDice()] = Player2.getCurrent_Location();

                        if (Player2.getCurrent_Location() > 0) {
                            if (Methods.Check_Market(Player2.getCurrent_Location())) {
                                image_cells_player2[Player2.getCurrent_Location()-1]=1;
                                Player2.SetImageIcon(Methods.Row_Number(Player2.getCurrent_Location()), Methods.Column_Number(Player2.getCurrent_Location()), Player2.getAddress_Image_Market());
                            } else if (Methods.Check_Lost_Object(Player2.getCurrent_Location())) {
                                image_cells_player2[Player2.getCurrent_Location()-1]=2;
                                Player2.SetImageIcon(Methods.Row_Number(Player2.getCurrent_Location()), Methods.Column_Number(Player2.getCurrent_Location()), Player2.getAddress_Image_Lost_Object());
                            } else if (Methods.Check_Trap(Player2.getCurrent_Location())) {
                                image_cells_player2[Player2.getCurrent_Location()-1]=3;
                                Player2.SetImageIcon(Methods.Row_Number(Player2.getCurrent_Location()), Methods.Column_Number(Player2.getCurrent_Location()), Player2.getAddress_Image_Trap());
                            } else if (Methods.Check_Treasure(Player2.getCurrent_Location()) > 0 && Methods.Check_Treasure(Player2.getCurrent_Location()) < 9) {
                                image_cells_player2[Player2.getCurrent_Location()-1]=4;
                                Player2.SetImageIcon(Methods.Row_Number(Player2.getCurrent_Location()), Methods.Column_Number(Player2.getCurrent_Location()), Player2.getAddress_Image_Treasure());
                            } else {
                                image_cells_player2[Player2.getCurrent_Location()-1]=0;
                                Player2.SetImageIcon(Methods.Row_Number(Player2.getCurrent_Location()), Methods.Column_Number(Player2.getCurrent_Location()), Player2.getAddress_Image_Empty());
                            }
                        }

                        Player2.setCurrent_Location(Player2.getTarget_Location());


                        //Castle
                        if (Player2.getCurrent_Location() == 61) {


                        }

                        //Market

                        if (Methods.Check_Market(Player2.getCurrent_Location())) {
                            Object[] options = {text6, text7};
                            int b = JOptionPane.showOptionDialog(null, text8, text9,
                                    JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE,
                                    null, options, null);
                            if (b == JOptionPane.YES_OPTION) {
                                market.setVisible(true);
                            }
                        }


                        //Lost Object
                        if (Methods.Check_Lost_Object(Player2.getCurrent_Location())) {
                            if (Methods.Find_Object(Player2.getCurrent_Location()) > 0) {
                                int x = Methods.Money_Rand1();
                                Object[] options = {text10};
                                int b = JOptionPane.showOptionDialog(null, text11 + x + text12, text13,
                                        JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE,
                                        null, options, null);
                                Value.setMoney_Player2(Value.getMoney_Player2() + x);
                            }
                            switch (Methods.Find_Object(Player2.getCurrent_Location())) {
                                case 1:
                                    Value.setObject1(false);
                                    break;
                                case 2:
                                    Value.setObject2(false);
                                    break;
                                case 3:
                                    Value.setObject3(false);
                                    break;
                                case 4:
                                    Value.setObject4(false);
                                    break;
                                case 5:
                                    Value.setObject5(false);
                                    break;
                                case 6:
                                    Value.setObject6(false);
                                    break;
                                case 7:
                                    Value.setObject7(false);
                                    break;
                                case 8:
                                    Value.setObject8(false);
                                    break;
                                case 9:
                                    Value.setObject9(false);
                                    break;
                                case 10:
                                    Value.setObject10(false);
                                    break;
                                case 11:
                                    Value.setObject11(false);
                                    break;
                                case 12:
                                    Value.setObject12(false);
                                    break;
                                case 13:
                                    Value.setObject13(false);
                                    break;
                                case 14:
                                    Value.setObject14(false);
                                    break;
                                case 15:
                                    Value.setObject15(false);
                                    break;
                                case 16:
                                    Value.setObject16(false);
                                    break;

                            }

                        }

                        //Trap

                        if (Methods.Check_Trap(Player2.getCurrent_Location())) {
                            int x = Methods.Money_Rand1();
                            Object[] options2 = {text10};
                            int b = JOptionPane.showOptionDialog(null, text14 + x + text15, text16,
                                    JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE,
                                    null, options2, null);
                            Value.setMoney_Player2(Value.getMoney_Player2() - x);
                        }

                        //Treasure

                        if (Methods.Check_Treasure(Player2.getCurrent_Location()) > 0) {
                            int f = Methods.Check_Treasure(Player2.getCurrent_Location());
                            int w = 0;
                            switch (f) {
                                case 1:
                                    w = Value.getTreasure1_Diamond_Ring_Code_Player2();
                                    break;
                                case 2:
                                    w = Value.getTreasure2_Jeweled_Sword_Code_Player2();
                                    break;
                                case 3:
                                    w = Value.getTreasure3_Golden_Glass_Code_Player2();
                                    break;
                                case 4:
                                    w = Value.getTreasure4_Glass_Cup_Code_Player2();
                                    break;
                                case 5:
                                    w = Value.getTreasure5_Wooden_Bow_Code_Player2();
                                    break;
                                case 6:
                                    w = Value.getTreasure6_Steel_Shield_Code_Player2();
                                    break;
                                case 7:
                                    w = Value.getTreasure7_Golden_Key_Code_Player2();
                                    break;
                                case 8:
                                    w = Value.getTreasure8_Dragon_Scroll_Code_Player2();
                                    break;
                            }
                            Object[] options2 = {text10};
                            int b = JOptionPane.showOptionDialog(null, text17 + w, text18,
                                    JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE,
                                    null, options2, null);

                        } else {
                        }


                        if (Player2.getCurrent_Location() == Player1.getCurrent_Location()&& (Player2.getCurrent_Location()!=0&&Player1.getCurrent_Location()!=0)) {
                            new FightGif();
                            try {
                                Thread.sleep(10200);
                            } catch (Exception e) {
                            }
                            new Fight(2, 1, Value.getPower_Player2(), Value.getPower_Player1(), Value.getMoney_Player2(), Value.getMoney_Player1());

                            if (Value.win_Fight == 2) {

                                long x = Value.getPower_Player1() - Value.getPower_Player2();
                                if (x < 0) x *= -1;
                                if (x != 0) {
                                    x /= (Value.getPower_Player1() + Value.getPower_Player2());
                                }
                                x *= Value.getMoney_Player1();
                                Value.setMoney_Player2(Value.getMoney_Player2() + x);
                                Value.setMoney_Player1(Value.getMoney_Player1() - x);
                                Value.setPower_Player2(Value.getPower_Player2() - Value.getPower_Player1());
                                Value.setPower_Player1(0);

                                if (Methods.Check_Market(Player1.getCurrent_Location())) {
                                    image_cells_player1[Player1.getCurrent_Location()-1]=1;
                                    Player1.SetImageIcon(Methods.Row_Number(Player1.getCurrent_Location()), Methods.Column_Number(Player1.getCurrent_Location()), Player1.getAddress_Image_Market());
                                } else if (Methods.Check_Lost_Object(Player1.getCurrent_Location())) {
                                    image_cells_player1[Player1.getCurrent_Location()-1]=2;
                                    Player1.SetImageIcon(Methods.Row_Number(Player1.getCurrent_Location()), Methods.Column_Number(Player1.getCurrent_Location()), Player1.getAddress_Image_Lost_Object());
                                } else if (Methods.Check_Trap(Player1.getCurrent_Location())) {
                                    image_cells_player1[Player1.getCurrent_Location()-1]=3;
                                    Player1.SetImageIcon(Methods.Row_Number(Player1.getCurrent_Location()), Methods.Column_Number(Player1.getCurrent_Location()), Player1.getAddress_Image_Trap());
                                } else if (Methods.Check_Treasure(Player1.getCurrent_Location()) > 0 && Methods.Check_Treasure(Player1.getCurrent_Location()) < 9) {
                                    image_cells_player1[Player1.getCurrent_Location()-1]=4;
                                    Player1.SetImageIcon(Methods.Row_Number(Player1.getCurrent_Location()), Methods.Column_Number(Player1.getCurrent_Location()), Player1.getAddress_Image_Treasure());
                                } else {
                                    image_cells_player1[Player1.getCurrent_Location()-1]=0;
                                    Player1.SetImageIcon(Methods.Row_Number(Player1.getCurrent_Location()), Methods.Column_Number(Player1.getCurrent_Location()), Player1.getAddress_Image_Empty());
                                }
                                Player1.setCurrent_Location(0);
                            } else {

                                long x = Value.getPower_Player1() - Value.getPower_Player2();
                                if (x < 0) x *= -1;
                                if (x != 0) {
                                    x /= (Value.getPower_Player1() + Value.getPower_Player2());
                                }
                                x *= Value.getMoney_Player2();
                                Value.setMoney_Player1(Value.getMoney_Player1() + x);
                                Value.setMoney_Player2(Value.getMoney_Player2() - x);
                                Value.setPower_Player1(Value.getPower_Player1() - Value.getPower_Player2());
                                Value.setPower_Player2(0);
                                Player2.setDice(0);

                                if (Methods.Check_Market(Player2.getCurrent_Location())) {
                                    image_cells_player2[Player2.getCurrent_Location()-1]=1;
                                    Player2.SetImageIcon(Methods.Row_Number(Player2.getCurrent_Location()), Methods.Column_Number(Player2.getCurrent_Location()), Player2.getAddress_Image_Market());
                                } else if (Methods.Check_Lost_Object(Player2.getCurrent_Location())) {
                                    image_cells_player2[Player2.getCurrent_Location()-1]=2;
                                    Player2.SetImageIcon(Methods.Row_Number(Player2.getCurrent_Location()), Methods.Column_Number(Player2.getCurrent_Location()), Player2.getAddress_Image_Lost_Object());
                                } else if (Methods.Check_Trap(Player2.getCurrent_Location())) {
                                    image_cells_player2[Player2.getCurrent_Location()-1]=3;
                                    Player2.SetImageIcon(Methods.Row_Number(Player2.getCurrent_Location()), Methods.Column_Number(Player2.getCurrent_Location()), Player2.getAddress_Image_Trap());
                                } else if (Methods.Check_Treasure(Player2.getCurrent_Location()) > 0 && Methods.Check_Treasure(Player2.getCurrent_Location()) < 9) {
                                    image_cells_player2[Player2.getCurrent_Location()-1]=4;
                                    Player2.SetImageIcon(Methods.Row_Number(Player2.getCurrent_Location()), Methods.Column_Number(Player2.getCurrent_Location()), Player2.getAddress_Image_Treasure());
                                } else {
                                    image_cells_player2[Player2.getCurrent_Location()-1]=0;
                                    Player2.SetImageIcon(Methods.Row_Number(Player2.getCurrent_Location()), Methods.Column_Number(Player2.getCurrent_Location()), Player2.getAddress_Image_Empty());
                                }
                                Player2.setCurrent_Location(0);
                            }


                        }


                        if (Player2.getCurrent_Location() == Player3.getCurrent_Location()&& (Player2.getCurrent_Location()!=0&&Player3.getCurrent_Location()!=0)) {
                            new FightGif();
                            try {
                                Thread.sleep(10200);
                            } catch (Exception e) {
                            }
                            new Fight(2, 3, Value.getPower_Player2(), Value.getPower_Player3(), Value.getMoney_Player2(), Value.getMoney_Player3());

                            if (Value.win_Fight == 2) {

                                long x = Value.getPower_Player3() - Value.getPower_Player2();
                                if (x < 0) x *= -1;
                                if (x != 0) {
                                    x /= (Value.getPower_Player3() + Value.getPower_Player2());
                                }
                                x *= Value.getMoney_Player3();
                                Value.setMoney_Player2(Value.getMoney_Player2() + x);
                                Value.setMoney_Player3(Value.getMoney_Player3() - x);
                                Value.setPower_Player2(Value.getPower_Player2() - Value.getPower_Player1());
                                Value.setPower_Player3(0);


                                if (Methods.Check_Market(Player3.getCurrent_Location())) {
                                    image_cells_player3[Player3.getCurrent_Location()-1]=1;
                                    Player3.SetImageIcon(Methods.Row_Number(Player3.getCurrent_Location()), Methods.Column_Number(Player3.getCurrent_Location()), Player3.getAddress_Image_Market());
                                } else if (Methods.Check_Lost_Object(Player3.getCurrent_Location())) {
                                    image_cells_player3[Player3.getCurrent_Location()-1]=2;
                                    Player3.SetImageIcon(Methods.Row_Number(Player3.getCurrent_Location()), Methods.Column_Number(Player3.getCurrent_Location()), Player3.getAddress_Image_Lost_Object());
                                } else if (Methods.Check_Trap(Player3.getCurrent_Location())) {
                                    image_cells_player3[Player3.getCurrent_Location()-1]=3;
                                    Player3.SetImageIcon(Methods.Row_Number(Player3.getCurrent_Location()), Methods.Column_Number(Player3.getCurrent_Location()), Player3.getAddress_Image_Trap());
                                } else if (Methods.Check_Treasure(Player3.getCurrent_Location()) > 0 && Methods.Check_Treasure(Player3.getCurrent_Location()) < 9) {
                                    image_cells_player3[Player3.getCurrent_Location()-1]=4;
                                    Player3.SetImageIcon(Methods.Row_Number(Player3.getCurrent_Location()), Methods.Column_Number(Player3.getCurrent_Location()), Player3.getAddress_Image_Treasure());
                                } else {
                                    image_cells_player3[Player3.getCurrent_Location()-1]=0;
                                    Player3.SetImageIcon(Methods.Row_Number(Player3.getCurrent_Location()), Methods.Column_Number(Player3.getCurrent_Location()), Player3.getAddress_Image_Empty());
                                }
                                Player3.setCurrent_Location(0);
                            } else {

                                long x = Value.getPower_Player3() - Value.getPower_Player2();
                                if (x < 0) x *= -1;
                                if (x != 0) {
                                    x /= (Value.getPower_Player3() + Value.getPower_Player2());
                                }
                                x *= Value.getMoney_Player2();
                                Value.setMoney_Player3(Value.getMoney_Player3() + x);
                                Value.setMoney_Player2(Value.getMoney_Player2() - x);
                                Value.setPower_Player3(Value.getPower_Player3() - Value.getPower_Player2());
                                Value.setPower_Player2(0);
                                Player2.setDice(0);

                                if (Methods.Check_Market(Player2.getCurrent_Location())) {
                                    image_cells_player2[Player2.getCurrent_Location()-1]=1;
                                    Player2.SetImageIcon(Methods.Row_Number(Player2.getCurrent_Location()), Methods.Column_Number(Player2.getCurrent_Location()), Player2.getAddress_Image_Market());
                                } else if (Methods.Check_Lost_Object(Player2.getCurrent_Location())) {
                                    image_cells_player2[Player2.getCurrent_Location()-1]=2;
                                    Player2.SetImageIcon(Methods.Row_Number(Player2.getCurrent_Location()), Methods.Column_Number(Player2.getCurrent_Location()), Player2.getAddress_Image_Lost_Object());
                                } else if (Methods.Check_Trap(Player2.getCurrent_Location())) {
                                    image_cells_player2[Player2.getCurrent_Location()-1]=3;
                                    Player2.SetImageIcon(Methods.Row_Number(Player2.getCurrent_Location()), Methods.Column_Number(Player2.getCurrent_Location()), Player2.getAddress_Image_Trap());
                                } else if (Methods.Check_Treasure(Player2.getCurrent_Location()) > 0 && Methods.Check_Treasure(Player2.getCurrent_Location()) < 9) {
                                    image_cells_player2[Player2.getCurrent_Location()-1]=4;
                                    Player2.SetImageIcon(Methods.Row_Number(Player2.getCurrent_Location()), Methods.Column_Number(Player2.getCurrent_Location()), Player2.getAddress_Image_Treasure());
                                } else {
                                    image_cells_player2[Player2.getCurrent_Location()-1]=0;
                                    Player2.SetImageIcon(Methods.Row_Number(Player2.getCurrent_Location()), Methods.Column_Number(Player2.getCurrent_Location()), Player2.getAddress_Image_Empty());
                                }
                                Player2.setCurrent_Location(0);
                            }


                        }


                        if (Player2.getCurrent_Location() == Player4.getCurrent_Location()&& (Player2.getCurrent_Location()!=0&&Player4.getCurrent_Location()!=0)) {
                            new FightGif();
                            try {
                                Thread.sleep(10200);
                            } catch (Exception e) {
                            }
                            new Fight(2, 4, Value.getPower_Player2(), Value.getPower_Player4(), Value.getMoney_Player2(), Value.getMoney_Player4());

                            if (Value.win_Fight == 2) {

                                long x = Value.getPower_Player4() - Value.getPower_Player2();
                                if (x < 0) x *= -1;
                                if (x != 0) {
                                    x /= (Value.getPower_Player4() + Value.getPower_Player2());
                                }
                                x *= Value.getMoney_Player4();
                                Value.setMoney_Player2(Value.getMoney_Player2() + x);
                                Value.setMoney_Player4(Value.getMoney_Player4() - x);
                                Value.setPower_Player2(Value.getPower_Player2() - Value.getPower_Player1());
                                Value.setPower_Player4(0);


                                if (Methods.Check_Market(Player4.getCurrent_Location())) {
                                    image_cells_player4[Player4.getCurrent_Location()-1]=1;
                                    Player4.SetImageIcon(Methods.Row_Number(Player4.getCurrent_Location()), Methods.Column_Number(Player4.getCurrent_Location()), Player4.getAddress_Image_Market());
                                } else if (Methods.Check_Lost_Object(Player4.getCurrent_Location())) {
                                    image_cells_player4[Player4.getCurrent_Location()-1]=2;
                                    Player4.SetImageIcon(Methods.Row_Number(Player4.getCurrent_Location()), Methods.Column_Number(Player4.getCurrent_Location()), Player4.getAddress_Image_Lost_Object());
                                } else if (Methods.Check_Trap(Player4.getCurrent_Location())) {
                                    image_cells_player4[Player4.getCurrent_Location()-1]=3;
                                    Player4.SetImageIcon(Methods.Row_Number(Player4.getCurrent_Location()), Methods.Column_Number(Player4.getCurrent_Location()), Player4.getAddress_Image_Trap());
                                } else if (Methods.Check_Treasure(Player4.getCurrent_Location()) > 0 && Methods.Check_Treasure(Player4.getCurrent_Location()) < 9) {
                                    image_cells_player4[Player4.getCurrent_Location()-1]=4;
                                    Player4.SetImageIcon(Methods.Row_Number(Player4.getCurrent_Location()), Methods.Column_Number(Player4.getCurrent_Location()), Player4.getAddress_Image_Treasure());
                                } else {
                                    image_cells_player4[Player4.getCurrent_Location()-1]=0;
                                    Player4.SetImageIcon(Methods.Row_Number(Player4.getCurrent_Location()), Methods.Column_Number(Player4.getCurrent_Location()), Player4.getAddress_Image_Empty());
                                }
                                Player4.setCurrent_Location(0);
                            } else {

                                long x = Value.getPower_Player4() - Value.getPower_Player2();
                                if (x < 0) x *= -1;
                                if (x != 0) {
                                    x /= (Value.getPower_Player4() + Value.getPower_Player2());
                                }
                                x *= Value.getMoney_Player2();
                                Value.setMoney_Player4(Value.getMoney_Player4() + x);
                                Value.setMoney_Player2(Value.getMoney_Player2() - x);
                                Value.setPower_Player4(Value.getPower_Player4() - Value.getPower_Player2());
                                Value.setPower_Player2(0);
                                Player2.setDice(0);

                                if (Methods.Check_Market(Player2.getCurrent_Location())) {
                                    image_cells_player2[Player2.getCurrent_Location()-1]=1;
                                    Player2.SetImageIcon(Methods.Row_Number(Player2.getCurrent_Location()), Methods.Column_Number(Player2.getCurrent_Location()), Player2.getAddress_Image_Market());
                                } else if (Methods.Check_Lost_Object(Player2.getCurrent_Location())) {
                                    image_cells_player2[Player2.getCurrent_Location()-1]=2;
                                    Player2.SetImageIcon(Methods.Row_Number(Player2.getCurrent_Location()), Methods.Column_Number(Player2.getCurrent_Location()), Player2.getAddress_Image_Lost_Object());
                                } else if (Methods.Check_Trap(Player2.getCurrent_Location())) {
                                    image_cells_player2[Player2.getCurrent_Location()-1]=3;
                                    Player2.SetImageIcon(Methods.Row_Number(Player2.getCurrent_Location()), Methods.Column_Number(Player2.getCurrent_Location()), Player2.getAddress_Image_Trap());
                                } else if (Methods.Check_Treasure(Player2.getCurrent_Location()) > 0 && Methods.Check_Treasure(Player2.getCurrent_Location()) < 9) {
                                    image_cells_player2[Player2.getCurrent_Location()-1]=4;
                                    Player2.SetImageIcon(Methods.Row_Number(Player2.getCurrent_Location()), Methods.Column_Number(Player2.getCurrent_Location()), Player2.getAddress_Image_Treasure());
                                } else {
                                    image_cells_player2[Player2.getCurrent_Location()-1]=0;
                                    Player2.SetImageIcon(Methods.Row_Number(Player2.getCurrent_Location()), Methods.Column_Number(Player2.getCurrent_Location()), Player2.getAddress_Image_Empty());
                                }
                                Player2.setCurrent_Location(0);
                            }


                        }


                        Player2.setChange_Dice(0);
                    }
                    if (Player2.getDice() == 0 && !market.isVisible()) {
                        Value.setPlayer(8);
                        Value.setMoney_Player2(Value.getMoney_Player2() - penalty);
                        penalty = 0;
                        for (int i = 0; i < 7; i++) {
                            paste[i] = 0;
                        }
                    }

                }
            }


            //player3


            if (Value.getPlayer() == 3) {


                if (!Value.game_loaded) {
                    Time_Now_Player = System.currentTimeMillis();
                    Elapsed_Time_Player = (Time_Now_Player - Start_Time_Player);
                    Remaining_Time_Player = Time_Player - Elapsed_Time_Player;
                    Second_Player = (Remaining_Time_Player / 1000);
                }
                else {
                    Time_Now_Player = System.currentTimeMillis();
                    Elapsed_Time_Player = (Time_Now_Player - Start_Time_Player);
                    Remaining_Time_Player = Time_Player2 - Elapsed_Time_Player;
                    Second_Player = (Remaining_Time_Player / 1000);
                }
                if (Second_Player >= 0 || Remaining_Time1_Player >= 0) {
                    if (Remaining_Time_Player % 137 == 0) Remaining_Time1_Player = Remaining_Time_Player % 100;
                    if (Second_Player > 9 && Remaining_Time1_Player > 9) {
                        Player3.textField2.setText("    " + Second_Player + " : " + Remaining_Time1_Player);
                    }
                    if (Second_Player < 10 && Remaining_Time1_Player > 9) {
                        Player3.textField2.setText("    " + "0" + Second_Player + " : " + Remaining_Time1_Player);
                    }
                    if (Second_Player < 10 && Remaining_Time1_Player < 10) {
                        Player3.textField2.setText("    " + "0" + Second_Player + " : " + "0" + Remaining_Time1_Player);
                    }
                    if (Second_Player > 9 && Remaining_Time1_Player < 10) {
                        Player3.textField2.setText("    " + Second_Player + " : " + "0" + Remaining_Time1_Player);
                    }
                }
                if (Second_Player < 0 && Remaining_Time1_Player < 0) {
                    penalty = -2 * (Second_Player);
                    Player3.textField2.setText("" + penalty + text5);
                }


                if (!Player3.Permission_To_Dice) {

                    if (Player3.getDice() > 0)
                        Player3.SetHighlight(Player3.getCurrent_Location(), paste, Color.CYAN, 8);

                    if (Player3.getChange_Dice() == 1) {
                        Player3.SetHighlight(Player3.getCurrent_Location(), paste, Color.BLACK, 2);

                        paste[Player3.getDice()] = Player3.getCurrent_Location();

                        if (Player3.getCurrent_Location() > 0) {
                            if (Methods.Check_Market(Player3.getCurrent_Location())) {
                                image_cells_player3[Player3.getCurrent_Location()-1]=1;
                                Player3.SetImageIcon(Methods.Row_Number(Player3.getCurrent_Location()), Methods.Column_Number(Player3.getCurrent_Location()), Player3.getAddress_Image_Market());
                            } else if (Methods.Check_Lost_Object(Player3.getCurrent_Location())) {
                                image_cells_player3[Player3.getCurrent_Location()-1]=2;
                                Player3.SetImageIcon(Methods.Row_Number(Player3.getCurrent_Location()), Methods.Column_Number(Player3.getCurrent_Location()), Player3.getAddress_Image_Lost_Object());
                            } else if (Methods.Check_Trap(Player3.getCurrent_Location())) {
                                image_cells_player3[Player3.getCurrent_Location()-1]=3;
                                Player3.SetImageIcon(Methods.Row_Number(Player3.getCurrent_Location()), Methods.Column_Number(Player3.getCurrent_Location()), Player3.getAddress_Image_Trap());
                            } else if (Methods.Check_Treasure(Player3.getCurrent_Location()) > 0 && Methods.Check_Treasure(Player3.getCurrent_Location()) < 9) {
                                image_cells_player3[Player3.getCurrent_Location()-1]=4;
                                Player3.SetImageIcon(Methods.Row_Number(Player3.getCurrent_Location()), Methods.Column_Number(Player3.getCurrent_Location()), Player3.getAddress_Image_Treasure());
                            } else {
                                image_cells_player3[Player3.getCurrent_Location()-1]=0;
                                Player3.SetImageIcon(Methods.Row_Number(Player3.getCurrent_Location()), Methods.Column_Number(Player3.getCurrent_Location()), Player3.getAddress_Image_Empty());
                            }

                        }
                        Player3.setCurrent_Location(Player3.getTarget_Location());


                        //Market

                        if (Methods.Check_Market(Player3.getCurrent_Location())) {
                            Object[] options = {text6, text7};
                            int a = JOptionPane.showOptionDialog(null, text8, text9,
                                    JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE,
                                    null, options, null);
                            if (a == JOptionPane.YES_OPTION) {
                                market.setVisible(true);
                            }
                        }

                        //Lost Object

                        if (Methods.Check_Lost_Object(Player3.getCurrent_Location())) {
                            if (Methods.Find_Object(Player3.getCurrent_Location()) > 0) {
                                int x = Methods.Money_Rand1();
                                Object[] options = {text10};
                                int a = JOptionPane.showOptionDialog(null, text11 + x + text12, text13,
                                        JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE,
                                        null, options, null);
                                Value.setMoney_Player3(Value.getMoney_Player3() + x);
                            }
                            switch (Methods.Find_Object(Player3.getCurrent_Location())) {
                                case 1:
                                    Value.setObject1(false);
                                    break;
                                case 2:
                                    Value.setObject2(false);
                                    break;
                                case 3:
                                    Value.setObject3(false);
                                    break;
                                case 4:
                                    Value.setObject4(false);
                                    break;
                                case 5:
                                    Value.setObject5(false);
                                    break;
                                case 6:
                                    Value.setObject6(false);
                                    break;
                                case 7:
                                    Value.setObject7(false);
                                    break;
                                case 8:
                                    Value.setObject8(false);
                                    break;
                                case 9:
                                    Value.setObject9(false);
                                    break;
                                case 10:
                                    Value.setObject10(false);
                                    break;
                                case 11:
                                    Value.setObject11(false);
                                    break;
                                case 12:
                                    Value.setObject12(false);
                                    break;
                                case 13:
                                    Value.setObject13(false);
                                    break;
                                case 14:
                                    Value.setObject14(false);
                                    break;
                                case 15:
                                    Value.setObject15(false);
                                    break;
                                case 16:
                                    Value.setObject16(false);
                                    break;

                            }

                        }

                        //Trap

                        if (Methods.Check_Trap(Player3.getCurrent_Location())) {
                            int x = Methods.Money_Rand1();
                            Object[] options = {text10};
                            JOptionPane.showOptionDialog(null, text14 + x + text15, text16,
                                    JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE,
                                    null, options, null);
                            Value.setMoney_Player3(Value.getMoney_Player3() - x);
                        }

                        //Treasure

                        if (Methods.Check_Treasure(Player3.getCurrent_Location()) > 0) {
                            int y = Methods.Check_Treasure(Player3.getCurrent_Location());
                            int x = 0;
                            switch (y) {
                                case 1:
                                    x = Value.getTreasure1_Diamond_Ring_Code_Player3();
                                    break;
                                case 2:
                                    x = Value.getTreasure2_Jeweled_Sword_Code_Player3();
                                    break;
                                case 3:
                                    x = Value.getTreasure3_Golden_Glass_Code_Player3();
                                    break;
                                case 4:
                                    x = Value.getTreasure4_Glass_Cup_Code_Player3();
                                    break;
                                case 5:
                                    x = Value.getTreasure5_Wooden_Bow_Code_Player3();
                                    break;
                                case 6:
                                    x = Value.getTreasure6_Steel_Shield_Code_Player3();
                                    break;
                                case 7:
                                    x = Value.getTreasure7_Golden_Key_Code_Player3();
                                    break;
                                case 8:
                                    x = Value.getTreasure8_Dragon_Scroll_Code_Player3();
                                    break;
                            }
                            Object[] options = {text10};
                            JOptionPane.showOptionDialog(null, text17 + x, text18,
                                    JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE,
                                    null, options, null);

                        } else {
                        }


                        if (Player3.getCurrent_Location() == Player2.getCurrent_Location()&& (Player3.getCurrent_Location()!=0&&Player2.getCurrent_Location()!=0)) {
                            new FightGif();
                            try {
                                Thread.sleep(10200);
                            } catch (Exception e) {
                            }
                            new Fight(3, 2, Value.getPower_Player3(), Value.getPower_Player2(), Value.getMoney_Player3(), Value.getMoney_Player2());

                            if (Value.win_Fight == 3) {

                                long x = Value.getPower_Player3() - Value.getPower_Player2();
                                if (x < 0) x *= -1;
                                if (x != 0) {
                                    x /= (Value.getPower_Player3() + Value.getPower_Player2());
                                }
                                x *= Value.getMoney_Player2();
                                Value.setMoney_Player3(Value.getMoney_Player3() + x);
                                Value.setMoney_Player2(Value.getMoney_Player2() - x);
                                Value.setPower_Player3(Value.getPower_Player3() - Value.getPower_Player2());
                                Value.setPower_Player3(0);

                                if (Methods.Check_Market(Player2.getCurrent_Location())) {
                                    image_cells_player2[Player2.getCurrent_Location()-1]=1;
                                    Player2.SetImageIcon(Methods.Row_Number(Player2.getCurrent_Location()), Methods.Column_Number(Player2.getCurrent_Location()), Player2.getAddress_Image_Market());
                                } else if (Methods.Check_Lost_Object(Player2.getCurrent_Location())) {
                                    image_cells_player2[Player2.getCurrent_Location()-1]=2;
                                    Player2.SetImageIcon(Methods.Row_Number(Player2.getCurrent_Location()), Methods.Column_Number(Player2.getCurrent_Location()), Player2.getAddress_Image_Lost_Object());
                                } else if (Methods.Check_Trap(Player2.getCurrent_Location())) {
                                    image_cells_player2[Player2.getCurrent_Location()-1]=3;
                                    Player2.SetImageIcon(Methods.Row_Number(Player2.getCurrent_Location()), Methods.Column_Number(Player2.getCurrent_Location()), Player2.getAddress_Image_Trap());
                                } else if (Methods.Check_Treasure(Player2.getCurrent_Location()) > 0 && Methods.Check_Treasure(Player2.getCurrent_Location()) < 9) {
                                    image_cells_player2[Player2.getCurrent_Location()-1]=4;
                                    Player2.SetImageIcon(Methods.Row_Number(Player2.getCurrent_Location()), Methods.Column_Number(Player2.getCurrent_Location()), Player2.getAddress_Image_Treasure());
                                } else {
                                    image_cells_player2[Player2.getCurrent_Location()-1]=0;
                                    Player2.SetImageIcon(Methods.Row_Number(Player2.getCurrent_Location()), Methods.Column_Number(Player2.getCurrent_Location()), Player2.getAddress_Image_Empty());
                                }
                                Player2.setCurrent_Location(0);
                            } else {

                                long x = Value.getPower_Player3() - Value.getPower_Player2();
                                if (x < 0) x *= -1;
                                if (x != 0) {
                                    x /= (Value.getPower_Player3() + Value.getPower_Player2());
                                }
                                x *= Value.getMoney_Player3();
                                Value.setMoney_Player2(Value.getMoney_Player2() + x);
                                Value.setMoney_Player3(Value.getMoney_Player3() - x);
                                Value.setPower_Player2(Value.getPower_Player2() - Value.getPower_Player3());
                                Value.setPower_Player3(0);
                                Player3.setDice(0);

                                if (Methods.Check_Market(Player3.getCurrent_Location())) {
                                    image_cells_player3[Player3.getCurrent_Location()-1]=1;
                                    Player3.SetImageIcon(Methods.Row_Number(Player3.getCurrent_Location()), Methods.Column_Number(Player3.getCurrent_Location()), Player3.getAddress_Image_Market());
                                } else if (Methods.Check_Lost_Object(Player3.getCurrent_Location())) {
                                    image_cells_player3[Player3.getCurrent_Location()-1]=2;
                                    Player3.SetImageIcon(Methods.Row_Number(Player3.getCurrent_Location()), Methods.Column_Number(Player3.getCurrent_Location()), Player3.getAddress_Image_Lost_Object());
                                } else if (Methods.Check_Trap(Player3.getCurrent_Location())) {
                                    image_cells_player3[Player3.getCurrent_Location()-1]=3;
                                    Player3.SetImageIcon(Methods.Row_Number(Player3.getCurrent_Location()), Methods.Column_Number(Player3.getCurrent_Location()), Player3.getAddress_Image_Trap());
                                } else if (Methods.Check_Treasure(Player3.getCurrent_Location()) > 0 && Methods.Check_Treasure(Player3.getCurrent_Location()) < 9) {
                                    image_cells_player3[Player3.getCurrent_Location()-1]=4;
                                    Player3.SetImageIcon(Methods.Row_Number(Player3.getCurrent_Location()), Methods.Column_Number(Player3.getCurrent_Location()), Player3.getAddress_Image_Treasure());
                                } else {
                                    image_cells_player3[Player3.getCurrent_Location()-1]=0;
                                    Player3.SetImageIcon(Methods.Row_Number(Player3.getCurrent_Location()), Methods.Column_Number(Player3.getCurrent_Location()), Player3.getAddress_Image_Empty());
                                }
                                Player3.setCurrent_Location(0);
                            }


                        }


                        if (Player3.getCurrent_Location() == Player1.getCurrent_Location()&& (Player3.getCurrent_Location()!=0&&Player1.getCurrent_Location()!=0)) {
                            new FightGif();
                            try {
                                Thread.sleep(10200);
                            } catch (Exception e) {
                            }
                            new Fight(3, 1, Value.getPower_Player3(), Value.getPower_Player1(), Value.getMoney_Player3(), Value.getMoney_Player1());

                            if (Value.win_Fight == 3) {

                                long x = Value.getPower_Player3() - Value.getPower_Player1();
                                if (x < 0) x *= -1;
                                if (x != 0) {
                                    x /= (Value.getPower_Player3() + Value.getPower_Player1());
                                }
                                x *= Value.getMoney_Player1();
                                Value.setMoney_Player3(Value.getMoney_Player3() + x);
                                Value.setMoney_Player1(Value.getMoney_Player1() - x);
                                Value.setPower_Player3(Value.getPower_Player3() - Value.getPower_Player1());
                                Value.setPower_Player1(0);

                                if (Methods.Check_Market(Player1.getCurrent_Location())) {
                                    image_cells_player1[Player1.getCurrent_Location()-1]=1;
                                    Player1.SetImageIcon(Methods.Row_Number(Player1.getCurrent_Location()), Methods.Column_Number(Player1.getCurrent_Location()), Player1.getAddress_Image_Market());
                                } else if (Methods.Check_Lost_Object(Player1.getCurrent_Location())) {
                                    image_cells_player1[Player1.getCurrent_Location()-1]=2;
                                    Player1.SetImageIcon(Methods.Row_Number(Player1.getCurrent_Location()), Methods.Column_Number(Player1.getCurrent_Location()), Player1.getAddress_Image_Lost_Object());
                                } else if (Methods.Check_Trap(Player1.getCurrent_Location())) {
                                    image_cells_player1[Player1.getCurrent_Location()-1]=3;
                                    Player1.SetImageIcon(Methods.Row_Number(Player1.getCurrent_Location()), Methods.Column_Number(Player1.getCurrent_Location()), Player1.getAddress_Image_Trap());
                                } else if (Methods.Check_Treasure(Player1.getCurrent_Location()) > 0 && Methods.Check_Treasure(Player1.getCurrent_Location()) < 9) {
                                    image_cells_player1[Player1.getCurrent_Location()-1]=4;
                                    Player1.SetImageIcon(Methods.Row_Number(Player1.getCurrent_Location()), Methods.Column_Number(Player1.getCurrent_Location()), Player1.getAddress_Image_Treasure());
                                } else {
                                    image_cells_player1[Player1.getCurrent_Location()-1]=0;
                                    Player1.SetImageIcon(Methods.Row_Number(Player1.getCurrent_Location()), Methods.Column_Number(Player1.getCurrent_Location()), Player1.getAddress_Image_Empty());
                                }
                                Player1.setCurrent_Location(0);
                            } else {

                                long x = Value.getPower_Player3() - Value.getPower_Player1();
                                if (x < 0) x *= -1;
                                if (x != 0) {
                                    x /= (Value.getPower_Player3() + Value.getPower_Player1());
                                }
                                x *= Value.getMoney_Player3();
                                Value.setMoney_Player1(Value.getMoney_Player1() + x);
                                Value.setMoney_Player3(Value.getMoney_Player3() - x);
                                Value.setPower_Player1(Value.getPower_Player1() - Value.getPower_Player3());
                                Value.setPower_Player3(0);
                                Player3.setDice(0);

                                if (Methods.Check_Market(Player3.getCurrent_Location())) {
                                    image_cells_player3[Player3.getCurrent_Location()-1]=1;
                                    Player3.SetImageIcon(Methods.Row_Number(Player3.getCurrent_Location()), Methods.Column_Number(Player3.getCurrent_Location()), Player3.getAddress_Image_Market());
                                } else if (Methods.Check_Lost_Object(Player3.getCurrent_Location())) {
                                    image_cells_player3[Player3.getCurrent_Location()-1]=2;
                                    Player3.SetImageIcon(Methods.Row_Number(Player3.getCurrent_Location()), Methods.Column_Number(Player3.getCurrent_Location()), Player3.getAddress_Image_Lost_Object());
                                } else if (Methods.Check_Trap(Player3.getCurrent_Location())) {
                                    image_cells_player3[Player3.getCurrent_Location()-1]=3;
                                    Player3.SetImageIcon(Methods.Row_Number(Player3.getCurrent_Location()), Methods.Column_Number(Player3.getCurrent_Location()), Player3.getAddress_Image_Trap());
                                } else if (Methods.Check_Treasure(Player3.getCurrent_Location()) > 0 && Methods.Check_Treasure(Player3.getCurrent_Location()) < 9) {
                                    image_cells_player3[Player3.getCurrent_Location()-1]=4;
                                    Player3.SetImageIcon(Methods.Row_Number(Player3.getCurrent_Location()), Methods.Column_Number(Player3.getCurrent_Location()), Player3.getAddress_Image_Treasure());
                                } else {
                                    image_cells_player3[Player3.getCurrent_Location()-1]=0;
                                    Player3.SetImageIcon(Methods.Row_Number(Player3.getCurrent_Location()), Methods.Column_Number(Player3.getCurrent_Location()), Player3.getAddress_Image_Empty());
                                }
                                Player3.setCurrent_Location(0);
                            }


                        }


                        if (Player3.getCurrent_Location() == Player4.getCurrent_Location()&& (Player3.getCurrent_Location()!=0&&Player4.getCurrent_Location()!=0)) {
                            new FightGif();
                            try {
                                Thread.sleep(10200);
                            } catch (Exception e) {
                            }
                            new Fight(3, 4, Value.getPower_Player3(), Value.getPower_Player4(), Value.getMoney_Player3(), Value.getMoney_Player4());

                            if (Value.win_Fight == 3) {

                                long x = Value.getPower_Player3() - Value.getPower_Player4();
                                if (x < 0) x *= -1;
                                if (x != 0) {
                                    x /= (Value.getPower_Player3() + Value.getPower_Player4());
                                }
                                x *= Value.getMoney_Player4();
                                Value.setMoney_Player3(Value.getMoney_Player3() + x);
                                Value.setMoney_Player4(Value.getMoney_Player4() - x);
                                Value.setPower_Player3(Value.getPower_Player3() - Value.getPower_Player4());
                                Value.setPower_Player4(0);


                                if (Methods.Check_Market(Player4.getCurrent_Location())) {
                                    image_cells_player4[Player4.getCurrent_Location()-1]=1;
                                    Player4.SetImageIcon(Methods.Row_Number(Player4.getCurrent_Location()), Methods.Column_Number(Player4.getCurrent_Location()), Player4.getAddress_Image_Market());
                                } else if (Methods.Check_Lost_Object(Player4.getCurrent_Location())) {
                                    image_cells_player4[Player4.getCurrent_Location()-1]=2;
                                    Player4.SetImageIcon(Methods.Row_Number(Player4.getCurrent_Location()), Methods.Column_Number(Player4.getCurrent_Location()), Player4.getAddress_Image_Lost_Object());
                                } else if (Methods.Check_Trap(Player4.getCurrent_Location())) {
                                    image_cells_player4[Player4.getCurrent_Location()-1]=3;
                                    Player4.SetImageIcon(Methods.Row_Number(Player4.getCurrent_Location()), Methods.Column_Number(Player4.getCurrent_Location()), Player4.getAddress_Image_Trap());
                                } else if (Methods.Check_Treasure(Player4.getCurrent_Location()) > 0 && Methods.Check_Treasure(Player4.getCurrent_Location()) < 9) {
                                    image_cells_player4[Player4.getCurrent_Location()-1]=4;
                                    Player4.SetImageIcon(Methods.Row_Number(Player4.getCurrent_Location()), Methods.Column_Number(Player4.getCurrent_Location()), Player4.getAddress_Image_Treasure());
                                } else {
                                    image_cells_player4[Player4.getCurrent_Location()-1]=0;
                                    Player4.SetImageIcon(Methods.Row_Number(Player4.getCurrent_Location()), Methods.Column_Number(Player4.getCurrent_Location()), Player4.getAddress_Image_Empty());
                                }
                                Player4.setCurrent_Location(0);
                            } else {

                                long x = Value.getPower_Player3() - Value.getPower_Player4();
                                if (x < 0) x *= -1;
                                if (x != 0) {
                                    x /= (Value.getPower_Player3() + Value.getPower_Player4());
                                }
                                x *= Value.getMoney_Player3();
                                Value.setMoney_Player4(Value.getMoney_Player4() + x);
                                Value.setMoney_Player3(Value.getMoney_Player3() - x);
                                Value.setPower_Player4(Value.getPower_Player4() - Value.getPower_Player3());
                                Value.setPower_Player3(0);
                                Player3.setDice(0);

                                if (Methods.Check_Market(Player3.getCurrent_Location())) {
                                    image_cells_player3[Player3.getCurrent_Location()-1]=1;
                                    Player3.SetImageIcon(Methods.Row_Number(Player3.getCurrent_Location()), Methods.Column_Number(Player3.getCurrent_Location()), Player3.getAddress_Image_Market());
                                } else if (Methods.Check_Lost_Object(Player3.getCurrent_Location())) {
                                    image_cells_player3[Player3.getCurrent_Location()-1]=2;
                                    Player3.SetImageIcon(Methods.Row_Number(Player3.getCurrent_Location()), Methods.Column_Number(Player3.getCurrent_Location()), Player3.getAddress_Image_Lost_Object());
                                } else if (Methods.Check_Trap(Player3.getCurrent_Location())) {
                                    image_cells_player3[Player3.getCurrent_Location()-1]=3;
                                    Player3.SetImageIcon(Methods.Row_Number(Player3.getCurrent_Location()), Methods.Column_Number(Player3.getCurrent_Location()), Player3.getAddress_Image_Trap());
                                } else if (Methods.Check_Treasure(Player3.getCurrent_Location()) > 0 && Methods.Check_Treasure(Player3.getCurrent_Location()) < 9) {
                                    image_cells_player3[Player3.getCurrent_Location()-1]=4;
                                    Player3.SetImageIcon(Methods.Row_Number(Player3.getCurrent_Location()), Methods.Column_Number(Player3.getCurrent_Location()), Player3.getAddress_Image_Treasure());
                                } else {
                                    image_cells_player3[Player3.getCurrent_Location()-1]=0;
                                    Player3.SetImageIcon(Methods.Row_Number(Player3.getCurrent_Location()), Methods.Column_Number(Player3.getCurrent_Location()), Player3.getAddress_Image_Empty());
                                }
                                Player3.setCurrent_Location(0);
                            }


                        }

                        Player3.setChange_Dice(0);

                    }
                    if (Player3.getDice() == 0 && !market.isVisible()) {
                        Value.setPlayer(9);
                        Value.setMoney_Player3(Value.getMoney_Player3() - penalty);
                        penalty = 0;
                        for (int i = 0; i < 7; i++) {
                            paste[i] = 0;
                        }
                    }
                }

            }


            //player4


            if (Value.getPlayer() == 4) {


                if (!Value.game_loaded) {
                    Time_Now_Player = System.currentTimeMillis();
                    Elapsed_Time_Player = (Time_Now_Player - Start_Time_Player);
                    Remaining_Time_Player = Time_Player - Elapsed_Time_Player;
                    Second_Player = (Remaining_Time_Player / 1000);
                }
                else {
                    Time_Now_Player = System.currentTimeMillis();
                    Elapsed_Time_Player = (Time_Now_Player - Start_Time_Player);
                    Remaining_Time_Player = Time_Player2 - Elapsed_Time_Player;
                    Second_Player = (Remaining_Time_Player / 1000);
                }
                if (Second_Player >= 0 || Remaining_Time1_Player >= 0) {
                    if (Remaining_Time_Player % 137 == 0) Remaining_Time1_Player = Remaining_Time_Player % 100;
                    if (Second_Player > 9 && Remaining_Time1_Player > 9) {
                        Player4.textField2.setText("    " + Second_Player + " : " + Remaining_Time1_Player);
                    }
                    if (Second_Player < 10 && Remaining_Time1_Player > 9) {
                        Player4.textField2.setText("    " + "0" + Second_Player + " : " + Remaining_Time1_Player);
                    }
                    if (Second_Player < 10 && Remaining_Time1_Player < 10) {
                        Player4.textField2.setText("    " + "0" + Second_Player + " : " + "0" + Remaining_Time1_Player);
                    }
                    if (Second_Player > 9 && Remaining_Time1_Player < 10) {
                        Player4.textField2.setText("    " + Second_Player + " : " + "0" + Remaining_Time1_Player);
                    }
                }
                if (Second_Player < 0 && Remaining_Time1_Player < 0) {
                    penalty = -2 * (Second_Player);
                    Player4.textField2.setText("" + penalty + text5);
                }


                if (!Player4.Permission_To_Dice) {

                    if (Player4.getDice() > 0)
                        Player4.SetHighlight(Player4.getCurrent_Location(), paste, Color.CYAN, 8);

                    if (Player4.getChange_Dice() == 1) {
                        Player4.SetHighlight(Player4.getCurrent_Location(), paste, Color.BLACK, 2);

                        paste[Player4.getDice()] = Player4.getCurrent_Location();

                        if (Player4.getCurrent_Location() > 0) {
                            if (Methods.Check_Market(Player4.getCurrent_Location())) {
                                image_cells_player4[Player4.getCurrent_Location()-1]=1;
                                Player4.SetImageIcon(Methods.Row_Number(Player4.getCurrent_Location()), Methods.Column_Number(Player4.getCurrent_Location()), Player4.getAddress_Image_Market());
                            } else if (Methods.Check_Lost_Object(Player4.getCurrent_Location())) {
                                image_cells_player4[Player4.getCurrent_Location()-1]=2;
                                Player4.SetImageIcon(Methods.Row_Number(Player4.getCurrent_Location()), Methods.Column_Number(Player4.getCurrent_Location()), Player4.getAddress_Image_Lost_Object());
                            } else if (Methods.Check_Trap(Player4.getCurrent_Location())) {
                                image_cells_player4[Player4.getCurrent_Location()-1]=3;
                                Player4.SetImageIcon(Methods.Row_Number(Player4.getCurrent_Location()), Methods.Column_Number(Player4.getCurrent_Location()), Player4.getAddress_Image_Trap());
                            } else if (Methods.Check_Treasure(Player4.getCurrent_Location()) > 0 && Methods.Check_Treasure(Player4.getCurrent_Location()) < 9) {
                                image_cells_player4[Player4.getCurrent_Location()-1]=4;
                                Player4.SetImageIcon(Methods.Row_Number(Player4.getCurrent_Location()), Methods.Column_Number(Player4.getCurrent_Location()), Player4.getAddress_Image_Treasure());
                            } else {
                                image_cells_player4[Player4.getCurrent_Location()-1]=0;
                                Player4.SetImageIcon(Methods.Row_Number(Player4.getCurrent_Location()), Methods.Column_Number(Player4.getCurrent_Location()), Player4.getAddress_Image_Empty());
                            }

                        }
                        Player4.setCurrent_Location(Player4.getTarget_Location());


                        //Market

                        if (Methods.Check_Market(Player4.getCurrent_Location())) {
                            Object[] options = {text6, text7};
                            int a = JOptionPane.showOptionDialog(null, text8, text9,
                                    JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE,
                                    null, options, null);
                            if (a == JOptionPane.YES_OPTION) {
                                market.setVisible(true);
                            }
                        }

                        //Lost Object

                        if (Methods.Check_Lost_Object(Player4.getCurrent_Location())) {
                            if (Methods.Find_Object(Player4.getCurrent_Location()) > 0) {
                                int x = Methods.Money_Rand1();
                                Object[] options = {text10};
                                JOptionPane.showOptionDialog(null, text11 + x + text12, text13,
                                        JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE,
                                        null, options, null);
                                Value.setMoney_Player4(Value.getMoney_Player4() + x);
                            }
                            switch (Methods.Find_Object(Player4.getCurrent_Location())) {
                                case 1:
                                    Value.setObject1(false);
                                    break;
                                case 2:
                                    Value.setObject2(false);
                                    break;
                                case 3:
                                    Value.setObject3(false);
                                    break;
                                case 4:
                                    Value.setObject4(false);
                                    break;
                                case 5:
                                    Value.setObject5(false);
                                    break;
                                case 6:
                                    Value.setObject6(false);
                                    break;
                                case 7:
                                    Value.setObject7(false);
                                    break;
                                case 8:
                                    Value.setObject8(false);
                                    break;
                                case 9:
                                    Value.setObject9(false);
                                    break;
                                case 10:
                                    Value.setObject10(false);
                                    break;
                                case 11:
                                    Value.setObject11(false);
                                    break;
                                case 12:
                                    Value.setObject12(false);
                                    break;
                                case 13:
                                    Value.setObject13(false);
                                    break;
                                case 14:
                                    Value.setObject14(false);
                                    break;
                                case 15:
                                    Value.setObject15(false);
                                    break;
                                case 16:
                                    Value.setObject16(false);
                                    break;

                            }

                        }

                        //Trap

                        if (Methods.Check_Trap(Player4.getCurrent_Location())) {
                            int x = Methods.Money_Rand1();
                            Object[] options = {text10};
                            JOptionPane.showOptionDialog(null, text14 + x + text15, text16,
                                    JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE,
                                    null, options, null);
                            Value.setMoney_Player4(Value.getMoney_Player4() - x);
                        }

                        //Treasure

                        if (Methods.Check_Treasure(Player4.getCurrent_Location()) > 0) {
                            int y = Methods.Check_Treasure(Player4.getCurrent_Location());
                            int x = 0;
                            switch (y) {
                                case 1:
                                    x = Value.getTreasure1_Diamond_Ring_Code_Player4();
                                    break;
                                case 2:
                                    x = Value.getTreasure2_Jeweled_Sword_Code_Player4();
                                    break;
                                case 3:
                                    x = Value.getTreasure3_Golden_Glass_Code_Player4();
                                    break;
                                case 4:
                                    x = Value.getTreasure4_Glass_Cup_Code_Player4();
                                    break;
                                case 5:
                                    x = Value.getTreasure5_Wooden_Bow_Code_Player4();
                                    break;
                                case 6:
                                    x = Value.getTreasure6_Steel_Shield_Code_Player4();
                                    break;
                                case 7:
                                    x = Value.getTreasure7_Golden_Key_Code_Player4();
                                    break;
                                case 8:
                                    x = Value.getTreasure8_Dragon_Scroll_Code_Player4();
                                    break;
                            }
                            Object[] options = {text10};
                            JOptionPane.showOptionDialog(null, text17 + x, text18,
                                    JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE,
                                    null, options, null);

                        } else {
                        }


                        if (Player4.getCurrent_Location() == Player2.getCurrent_Location()&& (Player4.getCurrent_Location()!=0&&Player2.getCurrent_Location()!=0)) {
                            new FightGif();
                            try {
                                Thread.sleep(10200);
                            } catch (Exception e) {
                            }
                            new Fight(4, 2, Value.getPower_Player4(), Value.getPower_Player2(), Value.getMoney_Player4(), Value.getMoney_Player2());

                            if (Value.win_Fight == 4) {

                                long x = Value.getPower_Player2() - Value.getPower_Player4();
                                if (x < 0) x *= -1;
                                if (x != 0) {
                                    x /= (Value.getPower_Player2() + Value.getPower_Player4());
                                }
                                x *= Value.getMoney_Player2();
                                Value.setMoney_Player4(Value.getMoney_Player4() + x);
                                Value.setMoney_Player2(Value.getMoney_Player2() - x);
                                Value.setPower_Player4(Value.getPower_Player4() - Value.getPower_Player2());
                                Value.setPower_Player2(0);

                                if (Methods.Check_Market(Player2.getCurrent_Location())) {
                                    image_cells_player2[Player2.getCurrent_Location()-1]=1;
                                    Player2.SetImageIcon(Methods.Row_Number(Player2.getCurrent_Location()), Methods.Column_Number(Player2.getCurrent_Location()), Player2.getAddress_Image_Market());
                                } else if (Methods.Check_Lost_Object(Player2.getCurrent_Location())) {
                                    image_cells_player2[Player2.getCurrent_Location()-1]=2;
                                    Player2.SetImageIcon(Methods.Row_Number(Player2.getCurrent_Location()), Methods.Column_Number(Player2.getCurrent_Location()), Player2.getAddress_Image_Lost_Object());
                                } else if (Methods.Check_Trap(Player2.getCurrent_Location())) {
                                    image_cells_player2[Player2.getCurrent_Location()-1]=3;
                                    Player2.SetImageIcon(Methods.Row_Number(Player2.getCurrent_Location()), Methods.Column_Number(Player2.getCurrent_Location()), Player2.getAddress_Image_Trap());
                                } else if (Methods.Check_Treasure(Player2.getCurrent_Location()) > 0 && Methods.Check_Treasure(Player2.getCurrent_Location()) < 9) {
                                    image_cells_player2[Player2.getCurrent_Location()-1]=4;
                                    Player2.SetImageIcon(Methods.Row_Number(Player2.getCurrent_Location()), Methods.Column_Number(Player2.getCurrent_Location()), Player2.getAddress_Image_Treasure());
                                } else {
                                    image_cells_player2[Player2.getCurrent_Location()-1]=0;
                                    Player2.SetImageIcon(Methods.Row_Number(Player2.getCurrent_Location()), Methods.Column_Number(Player2.getCurrent_Location()), Player2.getAddress_Image_Empty());
                                }
                                Player2.setCurrent_Location(0);
                            } else {

                                long x = Value.getPower_Player2() - Value.getPower_Player4();
                                if (x < 0) x *= -1;
                                if (x != 0) {
                                    x /= (Value.getPower_Player2() + Value.getPower_Player4());
                                }
                                x *= Value.getMoney_Player4();
                                Value.setMoney_Player2(Value.getMoney_Player2() + x);
                                Value.setMoney_Player4(Value.getMoney_Player4() - x);
                                Value.setPower_Player2(Value.getPower_Player2() - Value.getPower_Player4());
                                Value.setPower_Player4(0);
                                Player4.setDice(0);

                                if (Methods.Check_Market(Player4.getCurrent_Location())) {
                                    image_cells_player4[Player4.getCurrent_Location()-1]=1;
                                    Player4.SetImageIcon(Methods.Row_Number(Player4.getCurrent_Location()), Methods.Column_Number(Player4.getCurrent_Location()), Player4.getAddress_Image_Market());
                                } else if (Methods.Check_Lost_Object(Player4.getCurrent_Location())) {
                                    image_cells_player4[Player4.getCurrent_Location()-1]=2;
                                    Player4.SetImageIcon(Methods.Row_Number(Player4.getCurrent_Location()), Methods.Column_Number(Player4.getCurrent_Location()), Player4.getAddress_Image_Lost_Object());
                                } else if (Methods.Check_Trap(Player4.getCurrent_Location())) {
                                    image_cells_player4[Player4.getCurrent_Location()-1]=3;
                                    Player4.SetImageIcon(Methods.Row_Number(Player4.getCurrent_Location()), Methods.Column_Number(Player4.getCurrent_Location()), Player4.getAddress_Image_Trap());
                                } else if (Methods.Check_Treasure(Player4.getCurrent_Location()) > 0 && Methods.Check_Treasure(Player4.getCurrent_Location()) < 9) {
                                    image_cells_player4[Player4.getCurrent_Location()-1]=4;
                                    Player4.SetImageIcon(Methods.Row_Number(Player4.getCurrent_Location()), Methods.Column_Number(Player4.getCurrent_Location()), Player4.getAddress_Image_Treasure());
                                } else {
                                    image_cells_player4[Player4.getCurrent_Location()-1]=0;
                                    Player4.SetImageIcon(Methods.Row_Number(Player4.getCurrent_Location()), Methods.Column_Number(Player4.getCurrent_Location()), Player4.getAddress_Image_Empty());
                                }
                                Player4.setCurrent_Location(0);
                            }


                        }


                        if (Player4.getCurrent_Location() == Player3.getCurrent_Location()&& (Player4.getCurrent_Location()!=0&&Player3.getCurrent_Location()!=0)) {
                            new FightGif();
                            try {
                                Thread.sleep(10200);
                            } catch (Exception e) {
                            }
                            new Fight(4, 3, Value.getPower_Player4(), Value.getPower_Player3(), Value.getMoney_Player4(), Value.getMoney_Player3());

                            if (Value.win_Fight == 4) {

                                long x = Value.getPower_Player3() - Value.getPower_Player4();
                                if (x < 0) x *= -1;
                                if (x != 0) {
                                    x /= (Value.getPower_Player3() + Value.getPower_Player4());
                                }
                                x *= Value.getMoney_Player3();
                                Value.setMoney_Player4(Value.getMoney_Player4() + x);
                                Value.setMoney_Player3(Value.getMoney_Player3() - x);
                                Value.setPower_Player4(Value.getPower_Player4() - Value.getPower_Player3());
                                Value.setPower_Player3(0);

                                if (Methods.Check_Market(Player3.getCurrent_Location())) {
                                    image_cells_player3[Player3.getCurrent_Location()-1]=1;
                                    Player3.SetImageIcon(Methods.Row_Number(Player3.getCurrent_Location()), Methods.Column_Number(Player3.getCurrent_Location()), Player3.getAddress_Image_Market());
                                } else if (Methods.Check_Lost_Object(Player3.getCurrent_Location())) {
                                    image_cells_player3[Player3.getCurrent_Location()-1]=2;
                                    Player3.SetImageIcon(Methods.Row_Number(Player3.getCurrent_Location()), Methods.Column_Number(Player3.getCurrent_Location()), Player3.getAddress_Image_Lost_Object());
                                } else if (Methods.Check_Trap(Player3.getCurrent_Location())) {
                                    image_cells_player3[Player3.getCurrent_Location()-1]=3;
                                    Player3.SetImageIcon(Methods.Row_Number(Player3.getCurrent_Location()), Methods.Column_Number(Player3.getCurrent_Location()), Player3.getAddress_Image_Trap());
                                } else if (Methods.Check_Treasure(Player3.getCurrent_Location()) > 0 && Methods.Check_Treasure(Player3.getCurrent_Location()) < 9) {
                                    image_cells_player3[Player3.getCurrent_Location()-1]=4;
                                    Player3.SetImageIcon(Methods.Row_Number(Player3.getCurrent_Location()), Methods.Column_Number(Player3.getCurrent_Location()), Player3.getAddress_Image_Treasure());
                                } else {
                                    image_cells_player3[Player3.getCurrent_Location()-1]=0;
                                    Player3.SetImageIcon(Methods.Row_Number(Player3.getCurrent_Location()), Methods.Column_Number(Player3.getCurrent_Location()), Player3.getAddress_Image_Empty());
                                }
                                Player3.setCurrent_Location(0);
                            } else {

                                long x = Value.getPower_Player3() - Value.getPower_Player4();
                                if (x < 0) x *= -1;
                                if (x != 0) {
                                    x /= (Value.getPower_Player3() + Value.getPower_Player4());
                                }
                                x *= Value.getMoney_Player4();
                                Value.setMoney_Player3(Value.getMoney_Player3() + x);
                                Value.setMoney_Player4(Value.getMoney_Player4() - x);
                                Value.setPower_Player3(Value.getPower_Player3() - Value.getPower_Player4());
                                Value.setPower_Player4(0);
                                Player4.setDice(0);

                                if (Methods.Check_Market(Player4.getCurrent_Location())) {
                                    image_cells_player4[Player4.getCurrent_Location()-1]=1;
                                    Player4.SetImageIcon(Methods.Row_Number(Player4.getCurrent_Location()), Methods.Column_Number(Player4.getCurrent_Location()), Player4.getAddress_Image_Market());
                                } else if (Methods.Check_Lost_Object(Player4.getCurrent_Location())) {
                                    image_cells_player4[Player4.getCurrent_Location()-1]=2;
                                    Player4.SetImageIcon(Methods.Row_Number(Player4.getCurrent_Location()), Methods.Column_Number(Player4.getCurrent_Location()), Player4.getAddress_Image_Lost_Object());
                                } else if (Methods.Check_Trap(Player4.getCurrent_Location())) {
                                    image_cells_player4[Player4.getCurrent_Location()-1]=3;
                                    Player4.SetImageIcon(Methods.Row_Number(Player4.getCurrent_Location()), Methods.Column_Number(Player4.getCurrent_Location()), Player4.getAddress_Image_Trap());
                                } else if (Methods.Check_Treasure(Player4.getCurrent_Location()) > 0 && Methods.Check_Treasure(Player4.getCurrent_Location()) < 9) {
                                    image_cells_player4[Player4.getCurrent_Location()-1]=4;
                                    Player4.SetImageIcon(Methods.Row_Number(Player4.getCurrent_Location()), Methods.Column_Number(Player4.getCurrent_Location()), Player4.getAddress_Image_Treasure());
                                } else {
                                    image_cells_player4[Player4.getCurrent_Location()-1]=0;
                                    Player4.SetImageIcon(Methods.Row_Number(Player4.getCurrent_Location()), Methods.Column_Number(Player4.getCurrent_Location()), Player4.getAddress_Image_Empty());
                                }
                                Player4.setCurrent_Location(0);
                            }

                        }


                        if (Player4.getCurrent_Location() == Player1.getCurrent_Location()&& (Player4.getCurrent_Location()!=0&&Player1.getCurrent_Location()!=0)) {
                            new FightGif();
                            try {
                                Thread.sleep(10200);
                            } catch (Exception e) {
                            }
                            new Fight(4, 1, Value.getPower_Player4(), Value.getPower_Player1(), Value.getMoney_Player4(), Value.getMoney_Player1());

                            if (Value.win_Fight == 4) {

                                long x = Value.getPower_Player1() - Value.getPower_Player4();
                                if (x < 0) x *= -1;
                                if (x != 0) {
                                    x /= (Value.getPower_Player1() + Value.getPower_Player4());
                                }
                                x *= Value.getMoney_Player1();
                                Value.setMoney_Player4(Value.getMoney_Player4() + x);
                                Value.setMoney_Player1(Value.getMoney_Player1() - x);
                                Value.setPower_Player4(Value.getPower_Player4() - Value.getPower_Player1());
                                Value.setPower_Player1(0);


                                if (Methods.Check_Market(Player1.getCurrent_Location())) {
                                    image_cells_player1[Player1.getCurrent_Location()-1]=1;
                                    Player1.SetImageIcon(Methods.Row_Number(Player1.getCurrent_Location()), Methods.Column_Number(Player1.getCurrent_Location()), Player1.getAddress_Image_Market());
                                } else if (Methods.Check_Lost_Object(Player1.getCurrent_Location())) {
                                    image_cells_player1[Player1.getCurrent_Location()-1]=2;
                                    Player1.SetImageIcon(Methods.Row_Number(Player1.getCurrent_Location()), Methods.Column_Number(Player1.getCurrent_Location()), Player1.getAddress_Image_Lost_Object());
                                } else if (Methods.Check_Trap(Player1.getCurrent_Location())) {
                                    image_cells_player1[Player1.getCurrent_Location()-1]=3;
                                    Player1.SetImageIcon(Methods.Row_Number(Player1.getCurrent_Location()), Methods.Column_Number(Player1.getCurrent_Location()), Player1.getAddress_Image_Trap());
                                } else if (Methods.Check_Treasure(Player1.getCurrent_Location()) > 0 && Methods.Check_Treasure(Player1.getCurrent_Location()) < 9) {
                                    image_cells_player1[Player1.getCurrent_Location()-1]=4;
                                    Player1.SetImageIcon(Methods.Row_Number(Player1.getCurrent_Location()), Methods.Column_Number(Player1.getCurrent_Location()), Player1.getAddress_Image_Treasure());
                                } else {
                                    image_cells_player1[Player1.getCurrent_Location()-1]=0;
                                    Player1.SetImageIcon(Methods.Row_Number(Player1.getCurrent_Location()), Methods.Column_Number(Player1.getCurrent_Location()), Player1.getAddress_Image_Empty());
                                }
                                Player1.setCurrent_Location(0);
                            } else {

                                long x = Value.getPower_Player1() - Value.getPower_Player4();
                                if (x < 0) x *= -1;
                                if (x != 0) {
                                    x /= (Value.getPower_Player1() + Value.getPower_Player4());
                                }
                                x *= Value.getMoney_Player4();
                                Value.setMoney_Player1(Value.getMoney_Player1() + x);
                                Value.setMoney_Player4(Value.getMoney_Player4() - x);
                                Value.setPower_Player1(Value.getPower_Player1() - Value.getPower_Player4());
                                Value.setPower_Player4(0);
                                Player4.setDice(0);

                                if (Methods.Check_Market(Player4.getCurrent_Location())) {
                                    image_cells_player4[Player4.getCurrent_Location()-1]=1;
                                    Player4.SetImageIcon(Methods.Row_Number(Player4.getCurrent_Location()), Methods.Column_Number(Player4.getCurrent_Location()), Player4.getAddress_Image_Market());
                                } else if (Methods.Check_Lost_Object(Player4.getCurrent_Location())) {
                                    image_cells_player4[Player4.getCurrent_Location()-1]=2;
                                    Player4.SetImageIcon(Methods.Row_Number(Player4.getCurrent_Location()), Methods.Column_Number(Player4.getCurrent_Location()), Player4.getAddress_Image_Lost_Object());
                                } else if (Methods.Check_Trap(Player4.getCurrent_Location())) {
                                    image_cells_player4[Player4.getCurrent_Location()-1]=3;
                                    Player4.SetImageIcon(Methods.Row_Number(Player4.getCurrent_Location()), Methods.Column_Number(Player4.getCurrent_Location()), Player4.getAddress_Image_Trap());
                                } else if (Methods.Check_Treasure(Player4.getCurrent_Location()) > 0 && Methods.Check_Treasure(Player4.getCurrent_Location()) < 9) {
                                    image_cells_player4[Player4.getCurrent_Location()-1]=4;
                                    Player4.SetImageIcon(Methods.Row_Number(Player4.getCurrent_Location()), Methods.Column_Number(Player4.getCurrent_Location()), Player4.getAddress_Image_Treasure());
                                } else {
                                    image_cells_player4[Player4.getCurrent_Location()-1]=0;
                                    Player4.SetImageIcon(Methods.Row_Number(Player4.getCurrent_Location()), Methods.Column_Number(Player4.getCurrent_Location()), Player4.getAddress_Image_Empty());
                                }
                                Player4.setCurrent_Location(0);
                            }


                        }


                        Player4.setChange_Dice(0);

                    }


                    if (Player4.getDice() == 0 && !market.isVisible()) {
                        Value.setPlayer(10);
                        Value.setMoney_Player4(Value.getMoney_Player4() - penalty);
                        penalty = 0;
                        for (int i = 0; i < 7; i++) {
                            paste[i] = 0;
                        }
                    }
                }

            }


            //singlePlayer


            if (Value.getPlayer() == 5 && move_single) {

                if (!Value.game_loaded) {
                    Time_Now_Player = System.currentTimeMillis();
                    Elapsed_Time_Player = (Time_Now_Player - Start_Time_Player);
                    Remaining_Time_Player = Time_Player - Elapsed_Time_Player;
                    Second_Player = (Remaining_Time_Player / 1000);
                }
                else {
                    Time_Now_Player = System.currentTimeMillis();
                    Elapsed_Time_Player = (Time_Now_Player - Start_Time_Player);
                    Remaining_Time_Player = Time_Player2 - Elapsed_Time_Player;
                    Second_Player = (Remaining_Time_Player / 1000);
                }
                if (Second_Player >= 0 || Remaining_Time1_Player >= 0) {
                    if (Remaining_Time_Player % 137 == 0) Remaining_Time1_Player = Remaining_Time_Player % 100;
                    if (Second_Player > 9 && Remaining_Time1_Player > 9) {
                        Single_player.textField2.setText("    " + Second_Player + " : " + Remaining_Time1_Player);
                    }
                    if (Second_Player < 10 && Remaining_Time1_Player > 9) {
                        Single_player.textField2.setText("    " + "0" + Second_Player + " : " + Remaining_Time1_Player);
                    }
                    if (Second_Player < 10 && Remaining_Time1_Player < 10) {
                        Single_player.textField2.setText("    " + "0" + Second_Player + " : " + "0" + Remaining_Time1_Player);
                    }
                    if (Second_Player > 9 && Remaining_Time1_Player < 10) {
                        Single_player.textField2.setText("    " + Second_Player + " : " + "0" + Remaining_Time1_Player);
                    }
                }
                if (Second_Player < 0 && Remaining_Time1_Player < 0) {
                    penalty = -2 * (Second_Player);
                    Single_Player.textField2.setText("" + penalty + text5);
                }


                if (Single_player.Dice == 0) Value.setPlayer(11);
                if (Single_player.Dice > 0) {
                    if (Single_player.getCurrent_Location() > 0) {
                        Single_player.SetHighlight(Single_player.getCurrent_Location(), paste, Color.CYAN, 8);
                    }
                    if (sleep > 40000 && Single_player.getCurrent_Location() > 0) {
                        sleep = 0;

                        paste2[Single_player.getCurrent_Location()] = Single_player.getCurrent_Location();

                        Single_player.SetHighlight(Single_player.getCurrent_Location(), paste, Color.BLACK, 2);

                        paste[Single_player.Dice] = Single_player.getCurrent_Location();

                        if (Single_player.getCurrent_Location() > 0) {

                            if (Methods.Check_Market(Single_player.getCurrent_Location())) {
                                image_cells_single[Single_player.getCurrent_Location()-1]=1;
                                Single_player.SetImageIcon(Methods.Row_Number(Single_player.getCurrent_Location()), Methods.Column_Number(Single_player.getCurrent_Location()), Single_player.getAddress_Image_Market());
                            } else if (Methods.Check_Lost_Object(Single_player.getCurrent_Location())) {
                                image_cells_single[Single_player.getCurrent_Location()-1]=2;
                                Single_player.SetImageIcon(Methods.Row_Number(Single_player.getCurrent_Location()), Methods.Column_Number(Single_player.getCurrent_Location()), Single_player.getAddress_Image_Lost_Object());
                            } else if (Methods.Check_Trap(Single_player.getCurrent_Location())) {
                                image_cells_single[Single_player.getCurrent_Location()-1]=3;
                                Single_player.SetImageIcon(Methods.Row_Number(Single_player.getCurrent_Location()), Methods.Column_Number(Single_player.getCurrent_Location()), Single_player.getAddress_Image_Trap());
                            } else if (Methods.Check_Treasure(Single_player.getCurrent_Location()) > 0 && Methods.Check_Treasure(Single_player.getCurrent_Location()) < 9) {
                                image_cells_single[Single_player.getCurrent_Location()-1]=4;
                                Single_player.SetImageIcon(Methods.Row_Number(Single_player.getCurrent_Location()), Methods.Column_Number(Single_player.getCurrent_Location()), Single_player.getAddress_Image_Treasure());
                            } else {
                                image_cells_single[Single_player.getCurrent_Location()-1]=0;
                                Single_player.SetImageIcon(Methods.Row_Number(Single_player.getCurrent_Location()), Methods.Column_Number(Single_player.getCurrent_Location()), Single_player.getAddress_Image_Empty());
                            }

                        }
                        int target = Methods.Target_Single_Player(Single_player.getCurrent_Location(), paste, paste2, Treasure_single_code);

                        switch (target) {
                            case 1:
                                Single_player.setCurrent_Location(Single_player.getCurrent_Location() + 1);
                                break;
                            case 2:
                                Single_player.setCurrent_Location(Single_player.getCurrent_Location() - 1);
                                break;
                            case 3:
                                Single_player.setCurrent_Location(Single_player.getCurrent_Location() - 11);
                                break;
                            case 4:
                                Single_player.setCurrent_Location(Single_player.getCurrent_Location() + 11);
                                break;
                        }


                        //Castle
                        if (Single_player.getCurrent_Location() == 61) {

                            for (int i = 0; i < 8; i++) {

                                castle.setVisible(false);
                                castle=null;
                                castle=new Castle();
                                castle.setVisible(true);

                                castle.codeField.setText("");

                                if (Treasure_single_code[i] != 0) {
                                    try {
                                        Thread.sleep(1500);
                                    } catch (Exception e) {
                                    }

                                    castle.codeField.setText("" + Treasure_single_code[i]);

                                    try {
                                        Thread.sleep(1500);
                                    } catch (Exception e) {
                                    }

                                    Treasure_single_code[i] = 0;

                                    int money = Methods.Money_Rand2();
                                    if (Integer.parseInt(castle.codeField.getText()) == Value.getTreasure1_Diamond_Ring_Code_Player2() && Value.isTreasure1_Diamond_Ring_Status()) {
                                        String message = text19 + text20 + money + text21;
                                        new ShowMessage(message, text18, 3000);

                                        Value.setMoney_Player2(Value.getMoney_Player2() + money);

                                        Value.setTreasure1_Diamond_Ring_Status(false);

                                        Treasure_single_code[i] = 0;

                                    } else if (Integer.parseInt(castle.codeField.getText()) == Value.getTreasure2_Jeweled_Sword_Code_Player2() && Value.isTreasure2_Jeweled_Sword_Status()) {
                                        String message = text22 + text20 + money + text21;
                                        new ShowMessage(message, text18, 3000);

                                        Value.setMoney_Player2(Value.getMoney_Player2() + money);

                                        Value.setTreasure2_Jeweled_Sword_Status(false);

                                        Treasure_single_code[i] = 0;

                                    } else if (Integer.parseInt(castle.codeField.getText()) == Value.getTreasure3_Golden_Glass_Code_Player2() && Value.isTreasure3_Golden_Glass_Status()) {
                                        String message = text23 + text20 + money + text21;
                                        new ShowMessage(message, text18, 3000);


                                        Value.setMoney_Player2(Value.getMoney_Player2() + money);

                                        Value.setTreasure3_Golden_Glass_Status(false);

                                        Treasure_single_code[i] = 0;

                                    } else if (Integer.parseInt(castle.codeField.getText()) == Value.getTreasure4_Glass_Cup_Code_Player2() && Value.isTreasure4_Glass_Cup_Status()) {
                                        String message = text24 + text20 + money + text21;
                                        new ShowMessage(message, text18, 3000);

                                        Value.setMoney_Player2(Value.getMoney_Player2() + money);

                                        Value.setTreasure4_Glass_Cup_Status(false);

                                        Treasure_single_code[i] = 0;

                                    } else if (Integer.parseInt(castle.codeField.getText()) == Value.getTreasure5_Wooden_Bow_Code_Player2() && Value.isTreasure5_Wooden_Bow_Status()) {
                                        String message = text25 + text20 + money + text21;
                                        new ShowMessage(message, text18, 3000);

                                        Value.setMoney_Player2(Value.getMoney_Player2() + money);

                                        Value.setTreasure5_Wooden_Bow_Status(false);

                                        Treasure_single_code[i] = 0;

                                    } else if (Integer.parseInt(castle.codeField.getText()) == Value.getTreasure6_Steel_Shield_Code_Player2() && Value.isTreasure6_Steel_Shield_Status()) {
                                        String message = text26 + text20 + money + text21;
                                        new ShowMessage(message, text18, 3000);

                                        Value.setMoney_Player2(Value.getMoney_Player2() + money);

                                        Value.setTreasure6_Steel_Shield_Status(false);

                                        Treasure_single_code[i] = 0;

                                    } else if (Integer.parseInt(castle.codeField.getText()) == Value.getTreasure7_Golden_Key_Code_Player2() && Value.isTreasure7_Golden_Key_Status()) {
                                        String message =  text27 + text20 + money + text21;
                                        new ShowMessage(message, text18, 3000);

                                        Value.setMoney_Player2(Value.getMoney_Player2() + money);

                                        Value.setTreasure7_Golden_Key_Status(false);

                                        Treasure_single_code[i] = 0;

                                    } else if (Integer.parseInt(castle.codeField.getText()) == Value.getTreasure8_Dragon_Scroll_Code_Player2() && Value.isTreasure8_Dragon_Scroll_Status()) {

                                        String message = text28 + text20 + money + text21;
                                        new ShowMessage(message, text18, 3000);

                                        Value.setMoney_Player2(Value.getMoney_Player2() + money);

                                        Value.setTreasure8_Dragon_Scroll_Status(false);

                                        Treasure_single_code[i] = 0;

                                    } else {
                                        new ShowMessage(text29, text18, 3000);
                                        Treasure_single_code[i] = 0;
                                    }


                                }

                            }
                            castle.setVisible(false);
                        }

                        //Market

                        if (Methods.Check_Market(Single_player.getCurrent_Location())) {

                            new ShowMessage(text8, text9, 3000);


                            if (Value.getMoney_Player2() > 1200) {
                                market.setVisible(true);
                                try {
                                    Thread.sleep(1500);
                                } catch (Exception e) {
                                }
                                int Shop = Methods.DiceRand();
                                String message2;
                                String title2;
                                String message3;
                                switch (Shop) {
                                    case 1:
                                        message2 = Market.text3 + Market.text4;
                                        title2 = Market.text7;
                                        new ShowMessage(message2, title2, 3000);
                                        message3 = Market.text8+Market.text9+Market.text7+Market.text5 + Market.text10;
                                        new ShowMessage(message3, title2, 3000);
                                        Value.setMoney_Player2(Value.getMoney_Player2() - 160);
                                        Value.setPower_Player2(Value.getPower_Player2() + 40);
                                        Value.setShield_player2(Value.getShield_player2()+1);
                                        break;
                                    case 2:
                                        message2 = Market.text12 + Market.text13;
                                        title2 = Market.text14;
                                        new ShowMessage(message2, title2, 3000);
                                        message3 = Market.text8+Market.text9+Market.text14+Market.text5 + Market.text15;
                                        new ShowMessage(message3, title2, 3000);
                                        Value.setMoney_Player2(Value.getMoney_Player2() - 100);
                                        Value.setPower_Player2(Value.getPower_Player2() + 25);
                                        Value.setSword_player2(Value.getSword_player2()+1);
                                        break;
                                    case 3:
                                        message2 = Market.text17 + Market.text18;
                                        title2 = Market.text19;
                                        new ShowMessage(message2, title2, 3000);
                                        message3 = Market.text8+Market.text9+Market.text19+Market.text5 + Market.text20;
                                        new ShowMessage(message3, title2, 3000);
                                        Value.setMoney_Player2(Value.getMoney_Player2() - 120);
                                        Value.setPower_Player2(Value.getPower_Player2() + 30);
                                        Value.setArmor_player2(Value.getArmor_player2()+1);
                                        break;
                                    case 4:
                                        message2 = Market.text22 + Market.text23;
                                        title2 = Market.text24;
                                        new ShowMessage(message2, title2, 3000);
                                        message3 = Market.text8+Market.text9+Market.text24+Market.text5 + Market.text25;
                                        new ShowMessage(message3, title2, 3000);
                                        Value.setMoney_Player2(Value.getMoney_Player2() - 80);
                                        Value.setPower_Player2(Value.getPower_Player2() + 20);
                                        Value.setFood_player2(Value.getFood_player2()+1);
                                        break;
                                    case 5:
                                        message2 =  Market.text27+ Market.text18;
                                        title2 =  Market.text28;
                                        new ShowMessage(message2, title2, 3000);
                                        message3 = Market.text8+Market.text9+Market.text28+Market.text5 + Market.text20;
                                        new ShowMessage(message3, title2, 3000);
                                        Value.setMoney_Player2(Value.getMoney_Player2() - 120);
                                        Value.setPower_Player2(Value.getPower_Player2() + 30);
                                        Value.setPotion_player2(Value.getPotion_player2()+1);
                                        break;
                                    case 6:
                                        message2 = Market.text29 + Market.text30;
                                        title2 = Market.text31;
                                        new ShowMessage(message2, title2, 3000);
                                        message3 = Market.text8+Market.text9+Market.text31+Market.text5 + Market.text32;
                                        new ShowMessage(message3, title2, 3000);
                                        Value.setMoney_Player2(Value.getMoney_Player2() - 200);
                                        Value.setPower_Player2(Value.getPower_Player2() + 50);
                                        Value.setBook_player2(Value.getBook_player2()+1);
                                        break;
                                }


                                market.setVisible(false);

                            }

                        }


                        //Lost Object
                        if (Methods.Check_Lost_Object(Single_player.getCurrent_Location())) {
                            if (Methods.Find_Object(Single_player.getCurrent_Location()) > 0) {
                                int x = Methods.Money_Rand1();
                                String message = text11 + x + text12;
                                String title = text13;
                                new ShowMessage(message, title, 4000);

                                Value.setMoney_Player2(Value.getMoney_Player2() + x);
                            }
                            switch (Methods.Find_Object(Single_player.getCurrent_Location())) {
                                case 1:
                                    Value.setObject1(false);
                                    break;
                                case 2:
                                    Value.setObject2(false);
                                    break;
                                case 3:
                                    Value.setObject3(false);
                                    break;
                                case 4:
                                    Value.setObject4(false);
                                    break;
                                case 5:
                                    Value.setObject5(false);
                                    break;
                                case 6:
                                    Value.setObject6(false);
                                    break;
                                case 7:
                                    Value.setObject7(false);
                                    break;
                                case 8:
                                    Value.setObject8(false);
                                    break;
                                case 9:
                                    Value.setObject9(false);
                                    break;
                                case 10:
                                    Value.setObject10(false);
                                    break;
                                case 11:
                                    Value.setObject11(false);
                                    break;
                                case 12:
                                    Value.setObject12(false);
                                    break;
                                case 13:
                                    Value.setObject13(false);
                                    break;
                                case 14:
                                    Value.setObject14(false);
                                    break;
                                case 15:
                                    Value.setObject15(false);
                                    break;
                                case 16:
                                    Value.setObject16(false);
                                    break;

                            }

                        }

                        //Trap

                        if (Methods.Check_Trap(Single_player.getCurrent_Location())) {

                            int x = Methods.Money_Rand1();
                            String message = text14 + x + text15;
                            String title = "تله!!";
                            new ShowMessage(message, title, 4000);

                            Value.setMoney_Player2(Value.getMoney_Player2() - x);
                        }


                        //Treasure

                        if (Methods.Check_Treasure(Single_player.getCurrent_Location()) > 0) {
                            int f = Methods.Check_Treasure(Single_player.getCurrent_Location());
                            int w = 0;
                            switch (f) {
                                case 1:
                                    w = Value.getTreasure1_Diamond_Ring_Code_Player2();
                                    break;
                                case 2:
                                    w = Value.getTreasure2_Jeweled_Sword_Code_Player2();
                                    break;
                                case 3:
                                    w = Value.getTreasure3_Golden_Glass_Code_Player2();
                                    break;
                                case 4:
                                    w = Value.getTreasure4_Glass_Cup_Code_Player2();
                                    break;
                                case 5:
                                    w = Value.getTreasure5_Wooden_Bow_Code_Player2();
                                    break;
                                case 6:
                                    w = Value.getTreasure6_Steel_Shield_Code_Player2();
                                    break;
                                case 7:
                                    w = Value.getTreasure7_Golden_Key_Code_Player2();
                                    break;
                                case 8:
                                    w = Value.getTreasure8_Dragon_Scroll_Code_Player2();
                                    break;
                            }
                            for (int i = 0; i < 8; i++) {
                                if (Treasure_single_code[i] == 0) {
                                    Treasure_single_code[i] = w;
                                    break;
                                }
                            }
                            String message = text17 + w;
                            new ShowMessage(message, text18, 4000);

                        } else {
                        }


                        if (Single_player.getCurrent_Location() == Player1.getCurrent_Location()&& (Single_player.getCurrent_Location()!=0&&Player1.getCurrent_Location()!=0)) {
                            new FightGif();
                            try {
                                Thread.sleep(10200);
                            } catch (Exception e) {
                            }
                            new Fight(2, 1, Value.getPower_Player2(), Value.getPower_Player1(), Value.getMoney_Player2(), Value.getMoney_Player1());

                            if (Value.win_Fight == 2) {

                                long x = Value.getPower_Player2() - Value.getPower_Player1();
                                if (x < 0) x *= -1;
                                if (x != 0) {
                                    x /= (Value.getPower_Player2() + Value.getPower_Player1());
                                }
                                x *= Value.getMoney_Player1();
                                Value.setMoney_Player2(Value.getMoney_Player2() + x);
                                Value.setMoney_Player1(Value.getMoney_Player1() - x);
                                Value.setPower_Player2(Value.getPower_Player2() - Value.getPower_Player1());
                                Value.setPower_Player1(0);


                                if (Methods.Check_Market(Player1.getCurrent_Location())) {
                                    image_cells_player1[Player1.getCurrent_Location()-1]=1;
                                    Player1.SetImageIcon(Methods.Row_Number(Player1.getCurrent_Location()), Methods.Column_Number(Player1.getCurrent_Location()), Player1.getAddress_Image_Market());
                                } else if (Methods.Check_Lost_Object(Player1.getCurrent_Location())) {
                                    image_cells_player1[Player1.getCurrent_Location()-1]=2;
                                    Player1.SetImageIcon(Methods.Row_Number(Player1.getCurrent_Location()), Methods.Column_Number(Player1.getCurrent_Location()), Player1.getAddress_Image_Lost_Object());
                                } else if (Methods.Check_Trap(Player1.getCurrent_Location())) {
                                    image_cells_player1[Player1.getCurrent_Location()-1]=3;
                                    Player1.SetImageIcon(Methods.Row_Number(Player1.getCurrent_Location()), Methods.Column_Number(Player1.getCurrent_Location()), Player1.getAddress_Image_Trap());
                                } else if (Methods.Check_Treasure(Player1.getCurrent_Location()) > 0 && Methods.Check_Treasure(Player1.getCurrent_Location()) < 9) {
                                    image_cells_player1[Player1.getCurrent_Location()-1]=4;
                                    Player1.SetImageIcon(Methods.Row_Number(Player1.getCurrent_Location()), Methods.Column_Number(Player1.getCurrent_Location()), Player1.getAddress_Image_Treasure());
                                } else {
                                    image_cells_player1[Player1.getCurrent_Location()-1]=0;
                                    Player1.SetImageIcon(Methods.Row_Number(Player1.getCurrent_Location()), Methods.Column_Number(Player1.getCurrent_Location()), Player1.getAddress_Image_Empty());
                                }

                                Player1.setCurrent_Location(0);
                            } else {

                                long x = Value.getPower_Player1() - Value.getPower_Player2();
                                if (x < 0) x *= -1;
                                if (x != 0) {
                                    x /= (Value.getPower_Player1() + Value.getPower_Player2());
                                }
                                x *= Value.getMoney_Player2();
                                Value.setMoney_Player1(Value.getMoney_Player1() + x);
                                Value.setMoney_Player2(Value.getMoney_Player2() - x);
                                Value.setPower_Player1(Value.getPower_Player1() - Value.getPower_Player2());
                                Value.setPower_Player2(0);
                                Single_player.Dice=0;
                                Single_player.setCurrent_Location(0);
                                Value.setPlayer(11);

                                if (Methods.Check_Market(Single_player.getCurrent_Location())) {
                                    image_cells_single[Single_player.getCurrent_Location()-1]=1;
                                    Single_player.SetImageIcon(Methods.Row_Number(Single_player.getCurrent_Location()), Methods.Column_Number(Single_player.getCurrent_Location()), Single_player.getAddress_Image_Market());
                                } else if (Methods.Check_Lost_Object(Single_player.getCurrent_Location())) {
                                    image_cells_single[Single_player.getCurrent_Location()-1]=2;
                                    Single_player.SetImageIcon(Methods.Row_Number(Single_player.getCurrent_Location()), Methods.Column_Number(Single_player.getCurrent_Location()), Single_player.getAddress_Image_Lost_Object());
                                } else if (Methods.Check_Trap(Single_player.getCurrent_Location())) {
                                    image_cells_single[Single_player.getCurrent_Location()-1]=3;
                                    Single_player.SetImageIcon(Methods.Row_Number(Single_player.getCurrent_Location()), Methods.Column_Number(Single_player.getCurrent_Location()), Single_player.getAddress_Image_Trap());
                                } else if (Methods.Check_Treasure(Single_player.getCurrent_Location()) > 0 && Methods.Check_Treasure(Single_player.getCurrent_Location()) < 9) {
                                    image_cells_single[Single_player.getCurrent_Location()-1]=4;
                                    Single_player.SetImageIcon(Methods.Row_Number(Single_player.getCurrent_Location()), Methods.Column_Number(Single_player.getCurrent_Location()), Single_player.getAddress_Image_Treasure());
                                } else {
                                    if (Single_player.getCurrent_Location()!=0)image_cells_single[Single_player.getCurrent_Location()-1]=0;
                                    Single_player.SetImageIcon(Methods.Row_Number(Single_player.getCurrent_Location()), Methods.Column_Number(Single_player.getCurrent_Location()), Single_player.getAddress_Image_Empty());
                                }
                                Single_player.setCurrent_Location(0);
                            }

                        }
                        move_single = false;
                    }

                    if (Single_player.getCurrent_Location() == 0) {
                        Single_player.setCurrent_Location(1);
                        move_single = false;
                    }

                }


            }


        }

    }

}
