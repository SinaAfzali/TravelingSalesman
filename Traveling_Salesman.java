package classes;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;

public class Traveling_Salesman {

    public static void main(String[] args) {

        UIManager.put("OptionPane.messageFont", new Font("serif", Font.BOLD, 24));
        UIManager.put("OptionPane.background", new Color(23, 20, 21, 255));
        String Address_Image_Player1 = "D:\\Programming\\intellij\\Traveling_Salesman\\image\\p1.jpg";
        String Address_Image_Player2 = "D:\\Programming\\intellij\\Traveling_Salesman\\image\\p2.jpg";


        int []Treasure_single_code=new int[8];
        long sleep = 0;
        boolean move_single = true;
        boolean Start_game = false;
        int[] paste = new int[7];
        int[] paste2 = new int[121];
        final long Total_Time = 1201000;
        final long Time_Player = 30200;
        long Start_Time = System.currentTimeMillis();
        long Start_Time_Player = 0;
        long Time_Now;
        long Elapsed_Time;
        long Remaining_Time;
        long Time_Now_Player;
        long Elapsed_Time_Player;
        long Remaining_Time_Player;
        long Second_Player = 0;
        long Remaining_Time1 = 0;
        long Remaining_Time1_Player = 0;
        long Minutes = 0;
        long Second = 0;
        long Time = 0;
        long penalty = 0;
        Player Player1 = new Player();
        Player Player2 = new Player();
        Player Player3 = new Player();
        Player Player4 = new Player();
        Single_Player Single_Player = new Single_Player();
        Market market = new Market();
        market.setVisible(false);
        Castle castle=new Castle();
        castle.setVisible(false);
        Single_Player Single_player = new Single_Player();
        Single_player.frame.setVisible(false);


        for (int i=0;i<11;i++){
            Player1.cells[0][i].setBorder(BorderFactory.createLineBorder(new Color(12, 132, 197, 255), 2));
            Player2.cells[0][i].setBorder(BorderFactory.createLineBorder(new Color(12, 132, 197, 255), 2));
            Player3.cells[0][i].setBorder(BorderFactory.createLineBorder(new Color(12, 132, 197, 255), 2));
            Player4.cells[0][i].setBorder(BorderFactory.createLineBorder(new Color(12, 132, 197, 255), 2));
            Single_player.cells[0][i].setBorder(BorderFactory.createLineBorder(new Color(12, 132, 197, 255), 2));
        }

        Player1.SetColorBackground(0,2,new Color(12, 132, 197, 255));
        Player1.SetColorBackground(0,8,new Color(12, 132, 197, 255));

        Player2.SetColorBackground(0,2,new Color(12, 132, 197, 255));
        Player2.SetColorBackground(0,8,new Color(12, 132, 197, 255));

        Player3.SetColorBackground(0,2,new Color(12, 132, 197, 255));
        Player3.SetColorBackground(0,8,new Color(12, 132, 197, 255));

        Player4.SetColorBackground(0,2,new Color(12, 132, 197, 255));
        Player4.SetColorBackground(0,8,new Color(12, 132, 197, 255));

        Single_player.SetColorBackground(0,2,new Color(12, 132, 197, 255));
        Single_player.SetColorBackground(0,8,new Color(12, 132, 197, 255));


        for (int i = 1; i < 12; i++) {
            for (int j = 0; j < 11; j++) {
                Player2.SetColorBackground(i, j, Color.GREEN);
            }
        }
        for (int i = 1; i < 12; i++) {
            for (int j = 0; j < 11; j++) {
                Player3.SetColorBackground(i, j, Color.lightGray);
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


        LoadingScreen loadingScreen=new LoadingScreen();
        int delay=100;
        new Thread(()->{
            for (int i=0;i<=100;i++){
                loadingScreen.updateProgress(i);
                try {
                    Thread.sleep(delay);
                }catch (InterruptedException e){
                    e.printStackTrace();
                }
            }
            loadingScreen.dispose();
            new Intro();
        }).start();





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
        Player3.SetImageIcon(0, 10, Address_Image_Player1);
        Player4.SetImageIcon(0, 10, Address_Image_Player2);
        Single_player.SetImageIcon(0, 10, Address_Image_Player2);

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



        Player1.SetImageIcon(Methods.Row_Number(Value.getMarket1()),Methods.Column_Number(Value.getMarket1()),Player1.getAddress_Image_Market());
        Player1.SetImageIcon(Methods.Row_Number(Value.getMarket2()),Methods.Column_Number(Value.getMarket2()),Player1.getAddress_Image_Market());
        Player1.SetImageIcon(Methods.Row_Number(Value.getMarket3()),Methods.Column_Number(Value.getMarket3()),Player1.getAddress_Image_Market());
        Player1.SetImageIcon(Methods.Row_Number(Value.getMarket4()),Methods.Column_Number(Value.getMarket4()),Player1.getAddress_Image_Market());
        Player1.SetImageIcon(Methods.Row_Number(Value.getMarket5()),Methods.Column_Number(Value.getMarket5()),Player1.getAddress_Image_Market());
        Player1.SetImageIcon(Methods.Row_Number(Value.getMarket6()),Methods.Column_Number(Value.getMarket6()),Player1.getAddress_Image_Market());


        Player2.SetImageIcon(Methods.Row_Number(Value.getMarket1()),Methods.Column_Number(Value.getMarket1()),Player1.getAddress_Image_Market());
        Player2.SetImageIcon(Methods.Row_Number(Value.getMarket2()),Methods.Column_Number(Value.getMarket2()),Player1.getAddress_Image_Market());
        Player2.SetImageIcon(Methods.Row_Number(Value.getMarket3()),Methods.Column_Number(Value.getMarket3()),Player1.getAddress_Image_Market());
        Player2.SetImageIcon(Methods.Row_Number(Value.getMarket4()),Methods.Column_Number(Value.getMarket4()),Player1.getAddress_Image_Market());
        Player2.SetImageIcon(Methods.Row_Number(Value.getMarket5()),Methods.Column_Number(Value.getMarket5()),Player1.getAddress_Image_Market());
        Player2.SetImageIcon(Methods.Row_Number(Value.getMarket6()),Methods.Column_Number(Value.getMarket6()),Player1.getAddress_Image_Market());


        Player3.SetImageIcon(Methods.Row_Number(Value.getMarket1()),Methods.Column_Number(Value.getMarket1()),Player1.getAddress_Image_Market());
        Player3.SetImageIcon(Methods.Row_Number(Value.getMarket2()),Methods.Column_Number(Value.getMarket2()),Player1.getAddress_Image_Market());
        Player3.SetImageIcon(Methods.Row_Number(Value.getMarket3()),Methods.Column_Number(Value.getMarket3()),Player1.getAddress_Image_Market());
        Player3.SetImageIcon(Methods.Row_Number(Value.getMarket4()),Methods.Column_Number(Value.getMarket4()),Player1.getAddress_Image_Market());
        Player3.SetImageIcon(Methods.Row_Number(Value.getMarket5()),Methods.Column_Number(Value.getMarket5()),Player1.getAddress_Image_Market());
        Player3.SetImageIcon(Methods.Row_Number(Value.getMarket6()),Methods.Column_Number(Value.getMarket6()),Player1.getAddress_Image_Market());


        Player4.SetImageIcon(Methods.Row_Number(Value.getMarket1()),Methods.Column_Number(Value.getMarket1()),Player1.getAddress_Image_Market());
        Player4.SetImageIcon(Methods.Row_Number(Value.getMarket2()),Methods.Column_Number(Value.getMarket2()),Player1.getAddress_Image_Market());
        Player4.SetImageIcon(Methods.Row_Number(Value.getMarket3()),Methods.Column_Number(Value.getMarket3()),Player1.getAddress_Image_Market());
        Player4.SetImageIcon(Methods.Row_Number(Value.getMarket4()),Methods.Column_Number(Value.getMarket4()),Player1.getAddress_Image_Market());
        Player4.SetImageIcon(Methods.Row_Number(Value.getMarket5()),Methods.Column_Number(Value.getMarket5()),Player1.getAddress_Image_Market());
        Player4.SetImageIcon(Methods.Row_Number(Value.getMarket6()),Methods.Column_Number(Value.getMarket6()),Player1.getAddress_Image_Market());


        Single_player.SetImageIcon(Methods.Row_Number(Value.getMarket1()),Methods.Column_Number(Value.getMarket1()),Player1.getAddress_Image_Market());
        Single_player.SetImageIcon(Methods.Row_Number(Value.getMarket2()),Methods.Column_Number(Value.getMarket2()),Player1.getAddress_Image_Market());
        Single_player.SetImageIcon(Methods.Row_Number(Value.getMarket3()),Methods.Column_Number(Value.getMarket3()),Player1.getAddress_Image_Market());
        Single_player.SetImageIcon(Methods.Row_Number(Value.getMarket4()),Methods.Column_Number(Value.getMarket4()),Player1.getAddress_Image_Market());
        Single_player.SetImageIcon(Methods.Row_Number(Value.getMarket5()),Methods.Column_Number(Value.getMarket5()),Player1.getAddress_Image_Market());
        Single_player.SetImageIcon(Methods.Row_Number(Value.getMarket6()),Methods.Column_Number(Value.getMarket6()),Player1.getAddress_Image_Market());






        Music music = new Music("D:\\Programming\\intellij\\Traveling_Salesman\\music\\1.mp3");
        music.change();
        Music.frame5.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);

        Player1.SetImageIcon(0, 3, "D:\\Programming\\intellij\\Traveling_Salesman\\image\\money.png");
        Player2.SetImageIcon(0, 3, "D:\\Programming\\intellij\\Traveling_Salesman\\image\\money.png");
        Player3.SetImageIcon(0, 3, "D:\\Programming\\intellij\\Traveling_Salesman\\image\\money.png");
        Player4.SetImageIcon(0, 3, "D:\\Programming\\intellij\\Traveling_Salesman\\image\\money.png");






        while (true) {



            if (Value.getPlayer()==1)Castle.status=Player1.getCurrent_Location();
            if (Value.getPlayer()==2)Castle.status=Player2.getCurrent_Location();
            if (Value.getPlayer()==3)Castle.status=Player3.getCurrent_Location();
            if (Value.getPlayer()==4)Castle.status=Player4.getCurrent_Location();



            if (Player1.getCurrent_Location()!=61)Player1.SetImageIcon(6,5,Player1.getAddress_Image_Castle());
            if (Player2.getCurrent_Location()!=61)Player2.SetImageIcon(6,5,Player1.getAddress_Image_Castle());
            if (Player3.getCurrent_Location()!=61)Player3.SetImageIcon(6,5,Player1.getAddress_Image_Castle());
            if (Player4.getCurrent_Location()!=61)Player4.SetImageIcon(6,5,Player1.getAddress_Image_Castle());
            if (Single_Player.getCurrent_Location()!=61)Single_Player.SetImageIcon(6,5,Player1.getAddress_Image_Castle());

            if (Player1.getCurrent_Location() > 0) {
                Player1.cells[0][0].setIcon(null);
                Player1.cells[0][0].setText("شروع");
                Player1.cells[0][0].setFont(new Font("serif", Font.BOLD, 24));
            }
            if (Player2.getCurrent_Location() > 0) {
                Player2.cells[0][0].setIcon(null);
                Player2.cells[0][0].setText("شروع");
                Player2.cells[0][0].setFont(new Font("serif", Font.BOLD, 24));
            }
            if (Player3.getCurrent_Location() > 0) {
                Player3.cells[0][0].setIcon(null);
                Player3.cells[0][0].setText("شروع");
                Player3.cells[0][0].setFont(new Font("serif", Font.BOLD, 24));
            }
            if (Player4.getCurrent_Location() > 0) {
                Player4.cells[0][0].setIcon(null);
                Player4.cells[0][0].setText("شروع");
                Player4.cells[0][0].setFont(new Font("serif", Font.BOLD, 24));
            }
            if (Single_player.getCurrent_Location() > 0) {
                Single_player.cells[0][0].setIcon(null);
                Single_player.cells[0][0].setText("شروع");
                Single_player.cells[0][0].setFont(new Font("serif", Font.BOLD, 24));
            }

            Player1.SetImageIcon(Methods.Row_Number(Player1.getCurrent_Location()), Methods.Column_Number(Player1.getCurrent_Location()), Player1.getAddress_Image_Piece());
            Player2.SetImageIcon(Methods.Row_Number(Player2.getCurrent_Location()), Methods.Column_Number(Player2.getCurrent_Location()), Player2.getAddress_Image_Piece());
            Player3.SetImageIcon(Methods.Row_Number(Player3.getCurrent_Location()), Methods.Column_Number(Player3.getCurrent_Location()), Player3.getAddress_Image_Piece());
            Player4.SetImageIcon(Methods.Row_Number(Player4.getCurrent_Location()), Methods.Column_Number(Player4.getCurrent_Location()), Player4.getAddress_Image_Piece());
            Single_player.SetImageIcon(Methods.Row_Number(Single_player.getCurrent_Location()), Methods.Column_Number(Single_player.getCurrent_Location()), Single_Player.getAddress_Image_Piece());


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




            if (Value.getPlayer() == 6 && Value.Start) {
                if (Start_game) {
                    try {
                        Thread.sleep(1500);
                    } catch (Exception e) {
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
                if (Value.getNumber_player()>=2) {
                    Player2.frame.setVisible(true);
                    Value.setPlayer(2);
                }
                if (Value.getNumber_player()==1) {
                    Single_player.frame.setVisible(true);
                    Single_player.Dice = Methods.DiceRand();
                    Value.setPlayer(5);
                }
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
                if (Value.getNumber_player()==2) {
                    Player1.frame.setVisible(true);
                    Value.setPlayer(1);
                }
                if (Value.getNumber_player()>=3) {
                    Player3.frame.setVisible(true);
                    Value.setPlayer(3);
                }
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
                if (Value.getNumber_player()==4) {
                    Player4.frame.setVisible(true);
                    Value.setPlayer(4);
                }
                if (Value.getNumber_player()==3) {
                    Player1.frame.setVisible(true);
                    Value.setPlayer(1);
                }
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
                Start_Time_Player = System.currentTimeMillis();
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

            Time_Now = System.currentTimeMillis();
            Elapsed_Time = (Time_Now - Start_Time);
            Remaining_Time = Total_Time - Elapsed_Time;
            Minutes = Remaining_Time / 60000;
            Second = (Remaining_Time / 1000) - (Minutes * 60);
            if (Time != Second && Minutes > 0) {
                if (Minutes > 9 && Second > 9) {
                    Player1.textField1.setText("" + Minutes + " : " + Second);
                    Player2.textField1.setText("" + Minutes + " : " + Second);
                    Single_player.textField1.setText("" + Minutes + " : " + Second);
                }
                if (Minutes < 10 && Second > 9) {
                    Player1.textField1.setText("" + "0" + Minutes + " : " + Second);
                    Player2.textField1.setText("" + "0" + Minutes + " : " + Second);
                    Single_player.textField1.setText("" + "0" + Minutes + " : " + Second);
                }
                if (Minutes < 10 && Second < 10) {
                    Player1.textField1.setText("" + "0" + Minutes + " : " + "0" + Second);
                    Player2.textField1.setText("" + "0" + Minutes + " : " + "0" + Second);
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
                    Player1.textField1.setText("    " + Second + " : " + Remaining_Time1);
                    Player2.textField1.setText("    " + Second + " : " + Remaining_Time1);
                    Single_Player.textField1.setText("    " + Second + " : " + Remaining_Time1);
                }
                if (Second < 10 && Remaining_Time1 > 9) {
                    Player1.textField1.setText("     " + "0" + Second + " : " + Remaining_Time1);
                    Player2.textField1.setText("     " + "0" + Second + " : " + Remaining_Time1);
                    Single_Player.textField1.setText("     " + "0" + Second + " : " + Remaining_Time1);
                }
                if (Second < 10 && Remaining_Time1 < 10) {
                    Player1.textField1.setText("     " + "0" + Second + " : " + "0" + Remaining_Time1);
                    Player2.textField1.setText("     " + "0" + Second + " : " + "0" + Remaining_Time1);
                    Single_Player.textField1.setText("     " + "0" + Second + " : " + "0" + Remaining_Time1);
                }
                if (Second > 9 && Remaining_Time1 < 10) {
                    Player1.textField1.setText("     " + Second + " : " + "0" + Remaining_Time1);
                    Player2.textField1.setText("     " + Second + " : " + "0" + Remaining_Time1);
                    Single_Player.textField1.setText("     " + Second + " : " + "0" + Remaining_Time1);
                }
                int x = 15;
                if (Second < 40) x = 10;
                if (Second < 20) x = 5;
                if (Second < 5) x = 2;
                if ((Remaining_Time / 100) % x == 0) {
                    Player1.textField1.setBackground(Color.white);
                    Player2.textField1.setBackground(Color.white);
                    Single_player.textField1.setBackground(Color.white);
                } else {
                    Player1.textField1.setBackground(Color.red);
                    Player2.textField1.setBackground(Color.red);
                    Single_player.textField1.setBackground(Color.red);
                }
            }
            if (Minutes == 0 && Second == 0) {
                System.exit(1);
            }










            if (Value.getPlayer() == 1) {


                Time_Now_Player = System.currentTimeMillis();
                Elapsed_Time_Player = (Time_Now_Player - Start_Time_Player);
                Remaining_Time_Player = Time_Player - Elapsed_Time_Player;
                Second_Player = (Remaining_Time_Player / 1000);
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
                    Player1.textField2.setText("" + penalty + "  ریال جریمه");
                }


                if (!Player1.Permission_To_Dice) {

                    if (Player1.getDice() > 0)
                        Player1.SetHighlight(Player1.getCurrent_Location(), paste, Color.CYAN, 8);

                    if (Player1.getChange_Dice() == 1) {
                        Player1.SetHighlight(Player1.getCurrent_Location(), paste, Color.BLACK, 2);

                        paste[Player1.getDice()] = Player1.getCurrent_Location();

                        if (Player1.getCurrent_Location() > 0) {
                            if (Methods.Check_Market(Player1.getCurrent_Location())) {
                                Player1.SetImageIcon(Methods.Row_Number(Player1.getCurrent_Location()), Methods.Column_Number(Player1.getCurrent_Location()), Player1.getAddress_Image_Market());
                            } else if (Methods.Check_Lost_Object(Player1.getCurrent_Location())) {
                                Player1.SetImageIcon(Methods.Row_Number(Player1.getCurrent_Location()), Methods.Column_Number(Player1.getCurrent_Location()), Player1.getAddress_Image_Lost_Object());
                            } else if (Methods.Check_Trap(Player1.getCurrent_Location())) {
                                Player1.SetImageIcon(Methods.Row_Number(Player1.getCurrent_Location()), Methods.Column_Number(Player1.getCurrent_Location()), Player1.getAddress_Image_Trap());
                            } else if (Methods.Check_Treasure(Player1.getCurrent_Location()) > 0 && Methods.Check_Treasure(Player1.getCurrent_Location()) < 9) {
                                Player1.SetImageIcon(Methods.Row_Number(Player1.getCurrent_Location()), Methods.Column_Number(Player1.getCurrent_Location()), Player1.getAddress_Image_Treasure());
                            } else {
                                Player1.SetImageIcon(Methods.Row_Number(Player1.getCurrent_Location()), Methods.Column_Number(Player1.getCurrent_Location()), Player1.getAddress_Image_Empty());
                            }

                        }
                        Player1.setCurrent_Location(Player1.getTarget_Location());

                        //Castle
                        if (Player1.getCurrent_Location() == 61) {

                        }


                        //Market

                        if (Methods.Check_Market(Player1.getCurrent_Location())) {
                            Object[] options = {"آره", "فعلا نه"};
                            int a = JOptionPane.showOptionDialog(null, "این مکان یک فروشگاه است\n آیا میخواهید به آن سر بزنید؟", "فروشگاه",
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
                                Object[] options = {"متوجه شدم"};
                                JOptionPane.showOptionDialog(null, "تبریک!!                      \n شما یک شیء باارزش و قدیمی راپیدا کرده اید\n  به همین دلیل ما به شما " + x + " ریال پاداش می دهیم", "شیء گم شده",
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
                            Object[] options = {"متوجه شدم"};
                            JOptionPane.showOptionDialog(null, "وای!!                    \n  خفتگیرها از شما " + x + " ریال دزدیدند ", "خفتگیری!!",
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
                            Object[] options = {"متوجه شدم"};
                            JOptionPane.showOptionDialog(null, "بسیار عالی!!\n شما یک گنج پیدا کردید \n حال باید آن را به قلعه تحویل دهید\n کد زیر را به خاطر بسپارید \n و هنگام تحویل آن را ثبت کنید.\n کد گنج : " + x, "گنج",
                                    JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE,
                                    null, options, null);

                        } else {
                        }

                        if (Player1.getCurrent_Location() == Player2.getCurrent_Location()) {
                            new Fight();
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









            if (Value.getPlayer() == 2) {


                Time_Now_Player = System.currentTimeMillis();
                Elapsed_Time_Player = (Time_Now_Player - Start_Time_Player);
                Remaining_Time_Player = Time_Player - Elapsed_Time_Player;
                Second_Player = (Remaining_Time_Player / 1000);
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
                    Player2.textField2.setText("" + penalty + "  ریال جریمه");
                }


                if (!Player2.Permission_To_Dice) {

                    Player2.SetHighlight(Player2.getCurrent_Location(), paste, Color.CYAN, 8);


                    if (Player2.getChange_Dice() == 1) {
                        Player2.SetHighlight(Player2.getCurrent_Location(), paste, Color.BLACK, 2);

                        paste[Player2.getDice()] = Player2.getCurrent_Location();

                        if (Player2.getCurrent_Location() > 0) {
                            if (Methods.Check_Market(Player2.getCurrent_Location())) {
                                Player2.SetImageIcon(Methods.Row_Number(Player2.getCurrent_Location()), Methods.Column_Number(Player2.getCurrent_Location()), Player2.getAddress_Image_Market());
                            } else if (Methods.Check_Lost_Object(Player2.getCurrent_Location())) {
                                Player2.SetImageIcon(Methods.Row_Number(Player2.getCurrent_Location()), Methods.Column_Number(Player2.getCurrent_Location()), Player2.getAddress_Image_Lost_Object());
                            } else if (Methods.Check_Trap(Player2.getCurrent_Location())) {
                                Player2.SetImageIcon(Methods.Row_Number(Player2.getCurrent_Location()), Methods.Column_Number(Player2.getCurrent_Location()), Player2.getAddress_Image_Trap());
                            } else if (Methods.Check_Treasure(Player2.getCurrent_Location()) > 0 && Methods.Check_Treasure(Player2.getCurrent_Location()) < 9) {
                                Player2.SetImageIcon(Methods.Row_Number(Player2.getCurrent_Location()), Methods.Column_Number(Player2.getCurrent_Location()), Player2.getAddress_Image_Treasure());
                            } else {
                                Player2.SetImageIcon(Methods.Row_Number(Player2.getCurrent_Location()), Methods.Column_Number(Player2.getCurrent_Location()), Player2.getAddress_Image_Empty());
                            }
                        }

                        Player2.setCurrent_Location(Player2.getTarget_Location());


                        //Castle
                        if (Player2.getCurrent_Location() == 61) {


                        }

                        //Market

                        if (Methods.Check_Market(Player2.getCurrent_Location())) {
                            Object[] options = {"آره", "فعلا نه"};
                            int b = JOptionPane.showOptionDialog(null, "این مکان یک فروشگاه است        \n آیا میخواهید به آن سر بزنید؟        ", "فروشگاه",
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
                                Object[] options = {"متوجه شدم"};
                                int b = JOptionPane.showOptionDialog(null, "تبریک!!                      \n شما یک شیء باارزش و قدیمی راپیدا کرده اید\n  به همین دلیل ما به شما " + x + " ریال پاداش می دهیم", "شیء گم شده",
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
                            Object[] options2 = {"متوجه شدم"};
                            int b = JOptionPane.showOptionDialog(null, "وای!!                    \n  خفتگیرها از شما " + x + " ریال دزدیدند ", "خفتگیری!!",
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
                            Object[] options2 = {"متوجه شدم"};
                            int b = JOptionPane.showOptionDialog(null, "بسیار عالی!!\n شما یک گنج پیدا کردید \n حال باید آن را به قلعه تحویل دهید\n کد زیر را به خاطر بسپارید \n و هنگام تحویل آن را ثبت کنید.\n کد گنج : " + w, "گنج",
                                    JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE,
                                    null, options2, null);

                        } else {}


                        if (Player1.getCurrent_Location() == Player2.getCurrent_Location()) {
                            new Fight();
                        }


                        Player2.setChange_Dice(0);
                    }
                    if (Player2.getDice() == 0&&!market.isVisible()) {
                        Value.setPlayer(8);
                        Value.setMoney_Player2(Value.getMoney_Player2() - penalty);
                        penalty = 0;
                        for (int i = 0; i < 7; i++) {
                            paste[i] = 0;
                        }
                    }

                }
            }









            if (Value.getPlayer() == 3) {


                Time_Now_Player = System.currentTimeMillis();
                Elapsed_Time_Player = (Time_Now_Player - Start_Time_Player);
                Remaining_Time_Player = Time_Player - Elapsed_Time_Player;
                Second_Player = (Remaining_Time_Player / 1000);
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
                    Player3.textField2.setText("" + penalty + "  ریال جریمه");
                }


                if (!Player3.Permission_To_Dice) {

                    if (Player3.getDice() > 0)
                        Player3.SetHighlight(Player3.getCurrent_Location(), paste, Color.CYAN, 8);

                    if (Player3.getChange_Dice() == 1) {
                        Player3.SetHighlight(Player3.getCurrent_Location(), paste, Color.BLACK, 2);

                        paste[Player3.getDice()] = Player3.getCurrent_Location();

                        if (Player3.getCurrent_Location() > 0) {
                            if (Methods.Check_Market(Player3.getCurrent_Location())) {
                                Player3.SetImageIcon(Methods.Row_Number(Player3.getCurrent_Location()), Methods.Column_Number(Player3.getCurrent_Location()), Player3.getAddress_Image_Market());
                            } else if (Methods.Check_Lost_Object(Player3.getCurrent_Location())) {
                                Player3.SetImageIcon(Methods.Row_Number(Player3.getCurrent_Location()), Methods.Column_Number(Player3.getCurrent_Location()), Player3.getAddress_Image_Lost_Object());
                            } else if (Methods.Check_Trap(Player3.getCurrent_Location())) {
                                Player3.SetImageIcon(Methods.Row_Number(Player3.getCurrent_Location()), Methods.Column_Number(Player3.getCurrent_Location()), Player3.getAddress_Image_Trap());
                            } else if (Methods.Check_Treasure(Player3.getCurrent_Location()) > 0 && Methods.Check_Treasure(Player3.getCurrent_Location()) < 9) {
                                Player3.SetImageIcon(Methods.Row_Number(Player3.getCurrent_Location()), Methods.Column_Number(Player3.getCurrent_Location()), Player3.getAddress_Image_Treasure());
                            } else {
                                Player3.SetImageIcon(Methods.Row_Number(Player3.getCurrent_Location()), Methods.Column_Number(Player3.getCurrent_Location()), Player3.getAddress_Image_Empty());
                            }

                        }
                        Player3.setCurrent_Location(Player3.getTarget_Location());


                        //Market

                        if (Methods.Check_Market(Player3.getCurrent_Location())) {
                            Object[] options = {"آره", "فعلا نه"};
                            int a = JOptionPane.showOptionDialog(null, "این مکان یک فروشگاه است\n آیا میخواهید به آن سر بزنید؟", "فروشگاه",
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
                                Object[] options = {"متوجه شدم"};
                                int a = JOptionPane.showOptionDialog(null, "تبریک!!                      \n شما یک شیء باارزش و قدیمی راپیدا کرده اید\n  به همین دلیل ما به شما " + x + " ریال پاداش می دهیم", "شیء گم شده",
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
                            Object[] options = {"متوجه شدم"};
                            JOptionPane.showOptionDialog(null, "وای!!                    \n  خفتگیرها از شما " + x + " ریال دزدیدند ", "خفتگیری!!",
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
                            Object[] options = {"متوجه شدم"};
                            JOptionPane.showOptionDialog(null, "بسیار عالی!!\n شما یک گنج پیدا کردید \n حال باید آن را به قلعه تحویل دهید\n کد زیر را به خاطر بسپارید \n و هنگام تحویل آن را ثبت کنید.\n کد گنج : " + x, "گنج",
                                    JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE,
                                    null, options, null);

                        } else {
                        }

                        if (Player3.getCurrent_Location() == Player2.getCurrent_Location()) {
                            new Fight();
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











            if (Value.getPlayer() == 4) {


                Time_Now_Player = System.currentTimeMillis();
                Elapsed_Time_Player = (Time_Now_Player - Start_Time_Player);
                Remaining_Time_Player = Time_Player - Elapsed_Time_Player;
                Second_Player = (Remaining_Time_Player / 1000);
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
                    Player4.textField2.setText("" + penalty + "  ریال جریمه");
                }


                if (!Player4.Permission_To_Dice) {

                    if (Player4.getDice() > 0)
                        Player4.SetHighlight(Player4.getCurrent_Location(), paste, Color.CYAN, 8);

                    if (Player4.getChange_Dice() == 1) {
                        Player4.SetHighlight(Player4.getCurrent_Location(), paste, Color.BLACK, 2);

                        paste[Player4.getDice()] = Player4.getCurrent_Location();

                        if (Player4.getCurrent_Location() > 0) {
                            if (Methods.Check_Market(Player4.getCurrent_Location())) {
                                Player4.SetImageIcon(Methods.Row_Number(Player4.getCurrent_Location()), Methods.Column_Number(Player4.getCurrent_Location()), Player4.getAddress_Image_Market());
                            } else if (Methods.Check_Lost_Object(Player4.getCurrent_Location())) {
                                Player4.SetImageIcon(Methods.Row_Number(Player4.getCurrent_Location()), Methods.Column_Number(Player4.getCurrent_Location()), Player4.getAddress_Image_Lost_Object());
                            } else if (Methods.Check_Trap(Player4.getCurrent_Location())) {
                                Player4.SetImageIcon(Methods.Row_Number(Player4.getCurrent_Location()), Methods.Column_Number(Player4.getCurrent_Location()), Player4.getAddress_Image_Trap());
                            } else if (Methods.Check_Treasure(Player4.getCurrent_Location()) > 0 && Methods.Check_Treasure(Player4.getCurrent_Location()) < 9) {
                                Player4.SetImageIcon(Methods.Row_Number(Player4.getCurrent_Location()), Methods.Column_Number(Player4.getCurrent_Location()), Player4.getAddress_Image_Treasure());
                            } else {
                                Player4.SetImageIcon(Methods.Row_Number(Player4.getCurrent_Location()), Methods.Column_Number(Player4.getCurrent_Location()), Player4.getAddress_Image_Empty());
                            }

                        }
                        Player4.setCurrent_Location(Player4.getTarget_Location());


                        //Market

                        if (Methods.Check_Market(Player4.getCurrent_Location())) {
                            Object[] options = {"آره", "فعلا نه"};
                            int a = JOptionPane.showOptionDialog(null, "این مکان یک فروشگاه است\n آیا میخواهید به آن سر بزنید؟", "فروشگاه",
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
                                Object[] options = {"متوجه شدم"};
                                JOptionPane.showOptionDialog(null, "تبریک!!                      \n شما یک شیء باارزش و قدیمی راپیدا کرده اید\n  به همین دلیل ما به شما " + x + " ریال پاداش می دهیم", "شیء گم شده",
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
                            Object[] options = {"متوجه شدم"};
                            JOptionPane.showOptionDialog(null, "وای!!                    \n  خفتگیرها از شما " + x + " ریال دزدیدند ", "خفتگیری!!",
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
                            Object[] options = {"متوجه شدم"};
                            JOptionPane.showOptionDialog(null, "بسیار عالی!!\n شما یک گنج پیدا کردید \n حال باید آن را به قلعه تحویل دهید\n کد زیر را به خاطر بسپارید \n و هنگام تحویل آن را ثبت کنید.\n کد گنج : " + x, "گنج",
                                    JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE,
                                    null, options, null);

                        } else {
                        }

                        if (Player4.getCurrent_Location() == Player2.getCurrent_Location()) {
                            new Fight();
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



































            if (Value.getPlayer() == 5 && move_single) {

                Time_Now_Player = System.currentTimeMillis();
                Elapsed_Time_Player = (Time_Now_Player - Start_Time_Player);
                Remaining_Time_Player = Time_Player - Elapsed_Time_Player;
                Second_Player = (Remaining_Time_Player / 1000);
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
                    Single_Player.textField2.setText("" + penalty + "  ریال جریمه");
                }


                if (Single_player.Dice == 0) Value.setPlayer(11);
                if (Single_player.Dice > 0) {
                    Single_player.SetHighlight(Single_player.getCurrent_Location(), paste, Color.CYAN, 8);
                    if (sleep > 20000) {
                        sleep = 0;

                        paste2[Single_player.getCurrent_Location()] = Single_player.getCurrent_Location();

                        Single_player.SetHighlight(Single_player.getCurrent_Location(), paste, Color.BLACK, 2);

                        paste[Single_player.Dice] = Single_player.getCurrent_Location();

                        if (Single_player.getCurrent_Location() > 0) {

                            if (Methods.Check_Market(Single_player.getCurrent_Location())) {
                                Single_player.SetImageIcon(Methods.Row_Number(Single_player.getCurrent_Location()), Methods.Column_Number(Single_player.getCurrent_Location()), Single_player.getAddress_Image_Market());
                            } else if (Methods.Check_Lost_Object(Single_player.getCurrent_Location())) {
                                Single_player.SetImageIcon(Methods.Row_Number(Single_player.getCurrent_Location()), Methods.Column_Number(Single_player.getCurrent_Location()), Single_player.getAddress_Image_Lost_Object());
                            } else if (Methods.Check_Trap(Single_player.getCurrent_Location())) {
                                Single_player.SetImageIcon(Methods.Row_Number(Single_player.getCurrent_Location()), Methods.Column_Number(Single_player.getCurrent_Location()), Single_player.getAddress_Image_Trap());
                            } else if (Methods.Check_Treasure(Single_player.getCurrent_Location()) > 0 && Methods.Check_Treasure(Single_player.getCurrent_Location()) < 9) {
                                Single_player.SetImageIcon(Methods.Row_Number(Single_player.getCurrent_Location()), Methods.Column_Number(Single_player.getCurrent_Location()), Single_player.getAddress_Image_Treasure());
                            } else {
                                Single_player.SetImageIcon(Methods.Row_Number(Single_player.getCurrent_Location()), Methods.Column_Number(Single_player.getCurrent_Location()), Single_player.getAddress_Image_Empty());
                            }

                        }
                        int target = Methods.Target_Single_Player(Single_player.getCurrent_Location(), paste, paste2,Treasure_single_code);
                        System.out.println(target);

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

                            for (int i=0;i<8;i++) {

                                castle.setVisible(true);

                                castle.codeField.setText("");

                                if (Treasure_single_code[i] != 0) {
                                    try {
                                        Thread.sleep(1500);
                                    } catch (Exception e) {}

                                    castle.codeField.setText("" + Treasure_single_code[i]);

                                    try {
                                        Thread.sleep(1500);
                                    } catch (Exception e) {}

                                    Treasure_single_code[i] = 0;

                                    int money = Methods.Money_Rand2();
                                    if (Integer.parseInt(castle.codeField.getText()) == Value.getTreasure1_Diamond_Ring_Code_Player2() && Value.isTreasure1_Diamond_Ring_Status()) {

                                        final JOptionPane optionPane2 = new JOptionPane("شما گنج انگشتر الماس را پیدا کردید\n" + "پاداش شما : " + money + "سکه ", JOptionPane.INFORMATION_MESSAGE, JOptionPane.DEFAULT_OPTION, null, new Object[]{}, null);
                                        final JDialog dialog2 = new JDialog();
                                        dialog2.setTitle("گنج");
                                        dialog2.setModal(true);
                                        dialog2.setBounds(600, 340, 400, 300);
                                        dialog2.setContentPane(optionPane2);
                                        dialog2.setDefaultCloseOperation(JDialog.DO_NOTHING_ON_CLOSE);
                                        dialog2.pack();
                                        Timer timer2 = new Timer(3000, new AbstractAction() {
                                            public void actionPerformed(ActionEvent ae) {
                                                dialog2.dispose();
                                            }
                                        });
                                        timer2.setRepeats(false);//the timer should only go off once
                                        timer2.start();
                                        dialog2.setVisible(true);

                                        Value.setMoney_Player2(Value.getMoney_Player2() + money);

                                        Value.setTreasure1_Diamond_Ring_Status(false);

                                        Treasure_single_code[i]=0;

                                    } else if (Integer.parseInt(castle.codeField.getText()) == Value.getTreasure2_Jeweled_Sword_Code_Player2() && Value.isTreasure2_Jeweled_Sword_Status()) {

                                        final JOptionPane optionPane2 = new JOptionPane("شما گنج شمشیر جواهر نشان را پیدا کردید\n" + "پاداش شما : " + money + "سکه ", JOptionPane.INFORMATION_MESSAGE, JOptionPane.DEFAULT_OPTION, null, new Object[]{}, null);
                                        final JDialog dialog2 = new JDialog();
                                        dialog2.setTitle("گنج");
                                        dialog2.setModal(true);
                                        dialog2.setBounds(600, 340, 400, 300);
                                        dialog2.setContentPane(optionPane2);
                                        dialog2.setDefaultCloseOperation(JDialog.DO_NOTHING_ON_CLOSE);
                                        dialog2.pack();
                                        Timer timer2 = new Timer(3000, new AbstractAction() {
                                            public void actionPerformed(ActionEvent ae) {
                                                dialog2.dispose();
                                            }
                                        });
                                        timer2.setRepeats(false);//the timer should only go off once
                                        timer2.start();
                                        dialog2.setVisible(true);


                                        Value.setMoney_Player2(Value.getMoney_Player2() + money);

                                        Value.setTreasure2_Jeweled_Sword_Status(false);

                                        Treasure_single_code[i]=0;

                                    } else if (Integer.parseInt(castle.codeField.getText()) == Value.getTreasure3_Golden_Glass_Code_Player2() && Value.isTreasure3_Golden_Glass_Status()) {

                                        final JOptionPane optionPane2 = new JOptionPane("شما گنج لیوان طلایی را پیدا کردید\n" + "پاداش شما : " + money + "سکه ", JOptionPane.INFORMATION_MESSAGE, JOptionPane.DEFAULT_OPTION, null, new Object[]{}, null);
                                        final JDialog dialog2 = new JDialog();
                                        dialog2.setTitle("گنج");
                                        dialog2.setModal(true);
                                        dialog2.setBounds(600, 340, 400, 300);
                                        dialog2.setContentPane(optionPane2);
                                        dialog2.setDefaultCloseOperation(JDialog.DO_NOTHING_ON_CLOSE);
                                        dialog2.pack();
                                        Timer timer2 = new Timer(3000, new AbstractAction() {
                                            public void actionPerformed(ActionEvent ae) {
                                                dialog2.dispose();
                                            }
                                        });
                                        timer2.setRepeats(false);//the timer should only go off once
                                        timer2.start();
                                        dialog2.setVisible(true);

                                        Value.setMoney_Player2(Value.getMoney_Player2() + money);

                                        Value.setTreasure3_Golden_Glass_Status(false);

                                        Treasure_single_code[i]=0;

                                    } else if (Integer.parseInt(castle.codeField.getText()) == Value.getTreasure4_Glass_Cup_Code_Player2() && Value.isTreasure4_Glass_Cup_Status()) {

                                        final JOptionPane optionPane2 = new JOptionPane("شما گنج جام شیشه ای را پیدا کردید\n" + "پاداش شما : " + money + "سکه ", JOptionPane.INFORMATION_MESSAGE, JOptionPane.DEFAULT_OPTION, null, new Object[]{}, null);
                                        final JDialog dialog2 = new JDialog();
                                        dialog2.setTitle("گنج");
                                        dialog2.setModal(true);
                                        dialog2.setBounds(600, 340, 400, 300);
                                        dialog2.setContentPane(optionPane2);
                                        dialog2.setDefaultCloseOperation(JDialog.DO_NOTHING_ON_CLOSE);
                                        dialog2.pack();
                                        Timer timer2 = new Timer(3000, new AbstractAction() {
                                            public void actionPerformed(ActionEvent ae) {
                                                dialog2.dispose();
                                            }
                                        });
                                        timer2.setRepeats(false);//the timer should only go off once
                                        timer2.start();
                                        dialog2.setVisible(true);

                                        Value.setMoney_Player2(Value.getMoney_Player2() + money);

                                        Value.setTreasure4_Glass_Cup_Status(false);

                                        Treasure_single_code[i]=0;

                                    } else if (Integer.parseInt(castle.codeField.getText()) == Value.getTreasure5_Wooden_Bow_Code_Player2() && Value.isTreasure5_Wooden_Bow_Status()) {

                                        final JOptionPane optionPane2 = new JOptionPane("شما گنج کمان چوبی را پیدا کردید\n" + "پاداش شما : " + money + "سکه ", JOptionPane.INFORMATION_MESSAGE, JOptionPane.DEFAULT_OPTION, null, new Object[]{}, null);
                                        final JDialog dialog2 = new JDialog();
                                        dialog2.setTitle("گنج");
                                        dialog2.setModal(true);
                                        dialog2.setBounds(600, 340, 400, 300);
                                        dialog2.setContentPane(optionPane2);
                                        dialog2.setDefaultCloseOperation(JDialog.DO_NOTHING_ON_CLOSE);
                                        dialog2.pack();
                                        Timer timer2 = new Timer(3000, new AbstractAction() {
                                            public void actionPerformed(ActionEvent ae) {
                                                dialog2.dispose();
                                            }
                                        });
                                        timer2.setRepeats(false);//the timer should only go off once
                                        timer2.start();
                                        dialog2.setVisible(true);

                                        Value.setMoney_Player2(Value.getMoney_Player2() + money);

                                        Value.setTreasure5_Wooden_Bow_Status(false);

                                        Treasure_single_code[i]=0;

                                    } else if (Integer.parseInt(castle.codeField.getText()) == Value.getTreasure6_Steel_Shield_Code_Player2() && Value.isTreasure6_Steel_Shield_Status()) {

                                        final JOptionPane optionPane2 = new JOptionPane("شما گنج سپر پولادین را پیدا کردید\n" + "پاداش شما : " + money + "سکه ", JOptionPane.INFORMATION_MESSAGE, JOptionPane.DEFAULT_OPTION, null, new Object[]{}, null);
                                        final JDialog dialog2 = new JDialog();
                                        dialog2.setTitle("گنج");
                                        dialog2.setModal(true);
                                        dialog2.setBounds(600, 340, 400, 300);
                                        dialog2.setContentPane(optionPane2);
                                        dialog2.setDefaultCloseOperation(JDialog.DO_NOTHING_ON_CLOSE);
                                        dialog2.pack();
                                        Timer timer2 = new Timer(3000, new AbstractAction() {
                                            public void actionPerformed(ActionEvent ae) {
                                                dialog2.dispose();
                                            }
                                        });
                                        timer2.setRepeats(false);//the timer should only go off once
                                        timer2.start();
                                        dialog2.setVisible(true);

                                        Value.setMoney_Player2(Value.getMoney_Player2() + money);

                                        Value.setTreasure6_Steel_Shield_Status(false);

                                        Treasure_single_code[i]=0;

                                    } else if (Integer.parseInt(castle.codeField.getText()) == Value.getTreasure7_Golden_Key_Code_Player2() && Value.isTreasure7_Golden_Key_Status()) {

                                        final JOptionPane optionPane2 = new JOptionPane("شما گنج کلید زرین را پیدا کردید\n" + "پاداش شما : " + money + "سکه ", JOptionPane.INFORMATION_MESSAGE, JOptionPane.DEFAULT_OPTION, null, new Object[]{}, null);
                                        final JDialog dialog2 = new JDialog();
                                        dialog2.setTitle("گنج");
                                        dialog2.setModal(true);
                                        dialog2.setBounds(600, 340, 400, 300);
                                        dialog2.setContentPane(optionPane2);
                                        dialog2.setDefaultCloseOperation(JDialog.DO_NOTHING_ON_CLOSE);
                                        dialog2.pack();
                                        Timer timer2 = new Timer(3000, new AbstractAction() {
                                            public void actionPerformed(ActionEvent ae) {
                                                dialog2.dispose();
                                            }
                                        });
                                        timer2.setRepeats(false);//the timer should only go off once
                                        timer2.start();
                                        dialog2.setVisible(true);

                                        Value.setMoney_Player2(Value.getMoney_Player2() + money);

                                        Value.setTreasure7_Golden_Key_Status(false);

                                        Treasure_single_code[i]=0;

                                    } else if (Integer.parseInt(castle.codeField.getText()) == Value.getTreasure8_Dragon_Scroll_Code_Player2() && Value.isTreasure8_Dragon_Scroll_Status()) {

                                        final JOptionPane optionPane2 = new JOptionPane("شما گنج طومار اژدها را پیدا کردید\n" + "پاداش شما : " + money + "سکه ", JOptionPane.INFORMATION_MESSAGE, JOptionPane.DEFAULT_OPTION, null, new Object[]{}, null);
                                        final JDialog dialog2 = new JDialog();
                                        dialog2.setTitle("گنج");
                                        dialog2.setModal(true);
                                        dialog2.setBounds(600, 340, 400, 300);
                                        dialog2.setContentPane(optionPane2);
                                        dialog2.setDefaultCloseOperation(JDialog.DO_NOTHING_ON_CLOSE);
                                        dialog2.pack();
                                        Timer timer2 = new Timer(3000, new AbstractAction() {
                                            public void actionPerformed(ActionEvent ae) {
                                                dialog2.dispose();
                                            }
                                        });
                                        timer2.setRepeats(false);//the timer should only go off once
                                        timer2.start();
                                        dialog2.setVisible(true);

                                        Value.setMoney_Player2(Value.getMoney_Player2() + money);

                                        Value.setTreasure8_Dragon_Scroll_Status(false);

                                        Treasure_single_code[i]=0;

                                    } else {
                                        final JOptionPane optionPane2 = new JOptionPane("کد نامعتبراست!", JOptionPane.INFORMATION_MESSAGE, JOptionPane.DEFAULT_OPTION, null, new Object[]{}, null);
                                        final JDialog dialog2 = new JDialog();
                                        dialog2.setTitle("گنج");
                                        dialog2.setModal(true);
                                        dialog2.setBounds(600, 340, 400, 300);
                                        dialog2.setContentPane(optionPane2);
                                        dialog2.setDefaultCloseOperation(JDialog.DO_NOTHING_ON_CLOSE);
                                        dialog2.pack();
                                        Timer timer2 = new Timer(3000, new AbstractAction() {
                                            public void actionPerformed(ActionEvent ae) {
                                                dialog2.dispose();
                                            }
                                        });
                                        timer2.setRepeats(false);//the timer should only go off once
                                        timer2.start();
                                        dialog2.setVisible(true);

                                        Treasure_single_code[i]=0;

                                    }


                            }

                            }
                            castle.setVisible(false);
                        }

                        //Market

                        if (Methods.Check_Market(Single_player.getCurrent_Location())) {

                            final JOptionPane optionPane = new JOptionPane("این مکان یک فروشگاه است        \n آیا میخواهید به آن سر بزنید؟        ", JOptionPane.INFORMATION_MESSAGE, JOptionPane.DEFAULT_OPTION, null, new Object[]{}, null);
                            final JDialog dialog = new JDialog();
                            dialog.setTitle("فروشگاه");
                            dialog.setModal(true);
                            dialog.setBounds(600, 340, 400, 300);
                            dialog.setContentPane(optionPane);
                            dialog.setDefaultCloseOperation(JDialog.DO_NOTHING_ON_CLOSE);
                            dialog.pack();
                            Timer timer = new Timer(3000, new AbstractAction() {
                                public void actionPerformed(ActionEvent ae) {
                                    dialog.dispose();
                                }
                            });
                            timer.setRepeats(false);//the timer should only go off once
                            timer.start();
                            dialog.setVisible(true);

                            if (Value.getMoney_Player2()>800){
                                market.setVisible(true);

                                try {
                                    Thread.sleep(1500);
                                } catch (Exception e) {}

                                final JOptionPane optionPane2 = new JOptionPane("آیا میخواهید یک سپر بخرید/بفروشید؟", JOptionPane.INFORMATION_MESSAGE, JOptionPane.DEFAULT_OPTION, null, new Object[]{}, null);
                                final JDialog dialog2 = new JDialog();
                                dialog2.setTitle("سپر");
                                dialog2.setModal(true);
                                dialog2.setBounds(600, 340, 400, 300);
                                dialog2.setContentPane(optionPane2);
                                dialog2.setDefaultCloseOperation(JDialog.DO_NOTHING_ON_CLOSE);
                                dialog2.pack();
                                Timer timer2 = new Timer(3000, new AbstractAction() {
                                    public void actionPerformed(ActionEvent ae) {
                                        dialog2.dispose();
                                    }
                                });
                                timer2.setRepeats(false);//the timer should only go off once
                                timer2.start();
                                dialog2.setVisible(true);



                                final JOptionPane optionPane3 = new JOptionPane("شما با موفقیت یک سپر خریدید", JOptionPane.INFORMATION_MESSAGE, JOptionPane.DEFAULT_OPTION, null, new Object[]{}, null);
                                final JDialog dialog3 = new JDialog();
                                dialog3.setTitle("سپر");
                                dialog3.setModal(true);
                                dialog3.setBounds(600, 340, 400, 300);
                                dialog3.setContentPane(optionPane3);
                                dialog3.setDefaultCloseOperation(JDialog.DO_NOTHING_ON_CLOSE);
                                dialog3.pack();
                                Timer timer3 = new Timer(2000, new AbstractAction() {
                                    public void actionPerformed(ActionEvent ae) {
                                        dialog3.dispose();
                                    }
                                });
                                timer3.setRepeats(false);//the timer should only go off once
                                timer3.start();
                                dialog3.setVisible(true);



                                market.setVisible(false);

                            }

                        }


                        //Lost Object
                        if (Methods.Check_Lost_Object(Single_player.getCurrent_Location())) {
                            if (Methods.Find_Object(Single_player.getCurrent_Location()) > 0) {
                                int x = Methods.Money_Rand1();

                                final JOptionPane optionPane = new JOptionPane("تبریک!!                      \n شما یک شیء باارزش و قدیمی راپیدا کرده اید\n  به همین دلیل ما به شما " + x + " ریال پاداش می دهیم", JOptionPane.INFORMATION_MESSAGE, JOptionPane.DEFAULT_OPTION, null, new Object[]{}, null);
                                final JDialog dialog = new JDialog();
                                dialog.setTitle("شیء گم شده");
                                dialog.setModal(true);
                                dialog.setBounds(580, 320, 400, 300);
                                dialog.setContentPane(optionPane);
                                dialog.setDefaultCloseOperation(JDialog.DO_NOTHING_ON_CLOSE);
                                dialog.pack();
                                Timer timer = new Timer(3000, new AbstractAction() {
                                    public void actionPerformed(ActionEvent ae) {
                                        dialog.dispose();
                                    }
                                });
                                timer.setRepeats(false);//the timer should only go off once
                                timer.start();
                                dialog.setVisible(true);


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

                            final JOptionPane optionPane = new JOptionPane("وای!!                    \n  خفتگیرها از شما " + x + " ریال دزدیدند ", JOptionPane.INFORMATION_MESSAGE, JOptionPane.DEFAULT_OPTION, null, new Object[]{}, null);
                            final JDialog dialog = new JDialog();
                            dialog.setTitle("تله!!");
                            dialog.setModal(true);
                            dialog.setBounds(600, 340, 400, 300);
                            dialog.setContentPane(optionPane);
                            dialog.setDefaultCloseOperation(JDialog.DO_NOTHING_ON_CLOSE);
                            dialog.pack();
                            Timer timer = new Timer(3000, new AbstractAction() {
                                public void actionPerformed(ActionEvent ae) {
                                    dialog.dispose();
                                }
                            });
                            timer.setRepeats(false);//the timer should only go off once
                            timer.start();
                            dialog.setVisible(true);

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
                            for (int i=0;i<8;i++){
                                if (Treasure_single_code[i]==0)Treasure_single_code[i]=w;
                            }
                            final JOptionPane optionPane = new JOptionPane("بسیار عالی!!\n شما یک گنج پیدا کردید \n حال باید آن را به قلعه تحویل دهید\n کد زیر را به خاطر بسپارید \n و هنگام تحویل آن را ثبت کنید.\n کد گنج : " + w, JOptionPane.INFORMATION_MESSAGE, JOptionPane.DEFAULT_OPTION, null, new Object[]{}, null);
                            final JDialog dialog = new JDialog();
                            dialog.setTitle("گنج!");
                            dialog.setModal(true);
                            dialog.setBounds(600, 300, 400, 300);
                            dialog.setContentPane(optionPane);
                            dialog.setDefaultCloseOperation(JDialog.DO_NOTHING_ON_CLOSE);
                            dialog.pack();
                            Timer timer = new Timer(5000, new AbstractAction() {
                                public void actionPerformed(ActionEvent ae) {
                                    dialog.dispose();
                                }
                            });
                            timer.setRepeats(false);//the timer should only go off once
                            timer.start();
                            dialog.setVisible(true);
                        } else {
                        }


                        move_single = false;
                    }

                }


            }









        }


    }


}