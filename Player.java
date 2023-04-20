package classes;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
 class Player {


     JLabel label3 = new JLabel();
     JLabel label4 = new JLabel();
     JTextField textField1 = new JTextField();
     JTextField textField2 = new JTextField();


     private int Current_Location = 60;

     public int getCurrent_Location() {
         return Current_Location;
     }

     public void setCurrent_Location(int current_Location) {
         Current_Location = current_Location;
     }

     boolean Permission_To_Dice = true;

     private int Target_Location = 0;

     public int getTarget_Location() {
         return Target_Location;
     }

     public void setTarget_Location(int target_Location) {
         Target_Location = target_Location;
     }

     private final String Address_Image_Wall = "D:\\Programming\\intellij\\Traveling_Salesman\\image\\Walls.jpg";

     private final String Address_Image_Market = "D:\\Programming\\intellij\\Traveling_Salesman\\image\\Market.jpg";
     private final String Address_Image_Piece = "D:\\Programming\\intellij\\Traveling_Salesman\\image\\m1.png";
     private final String Address_Image_Dice = "D:\\Programming\\intellij\\Traveling_Salesman\\image\\dicee.png";
     private final String Address_Image_Dice1 = "D:\\Programming\\intellij\\Traveling_Salesman\\image\\dice11.jpg";
     private final String Address_Image_Dice2 = "D:\\Programming\\intellij\\Traveling_Salesman\\image\\dice22.jpg";
     private final String Address_Image_Dice3 = "D:\\Programming\\intellij\\Traveling_Salesman\\image\\dice33.jpg";
     private final String Address_Image_Dice4 = "D:\\Programming\\intellij\\Traveling_Salesman\\image\\dice44.jpg";
     private final String Address_Image_Dice5 = "D:\\Programming\\intellij\\Traveling_Salesman\\image\\dice55.jpg";
     private final String Address_Image_Dice6 = "D:\\Programming\\intellij\\Traveling_Salesman\\image\\dice66.jpg";
     private final String Address_Image_Trap = "D:\\Programming\\intellij\\Traveling_Salesman\\image\\Trap.jpg";
     private final String Address_Image_Empty = "D:\\Programming\\intellij\\Traveling_Salesman\\image\\Empty.jpg";
     private final String Address_Image_Treasure = "D:\\Programming\\intellij\\Traveling_Salesman\\image\\Treasure.jpg";
     private final String Address_Image_Lost_Object = "D:\\Programming\\intellij\\Traveling_Salesman\\image\\Lost_Object.jpg";

     private final String Address_Image_Castle="D:\\Programming\\intellij\\Traveling_Salesman\\image\\Castle.png";

     public String getAddress_Image_Piece() {
         return Address_Image_Piece;
     }

     public String getAddress_Image_Dice() {
         return Address_Image_Dice;
     }

     public String getAddress_Image_Dice1() {
         return Address_Image_Dice1;
     }

     public String getAddress_Image_Dice2() {
         return Address_Image_Dice2;
     }

     public String getAddress_Image_Dice3() {
         return Address_Image_Dice3;
     }

     public String getAddress_Image_Dice4() {
         return Address_Image_Dice4;
     }

     public String getAddress_Image_Dice5() {
         return Address_Image_Dice5;
     }

     public String getAddress_Image_Dice6() {
         return Address_Image_Dice6;
     }

     public String getAddress_Image_Wall() {
         return Address_Image_Wall;
     }

     public String getAddress_Image_Trap() {
         return Address_Image_Trap;
     }

     public String getAddress_Image_Market() {
         return Address_Image_Market;
     }

     public String getAddress_Image_Lost_Object() {
         return Address_Image_Lost_Object;
     }

     public String getAddress_Image_Treasure() {
         return Address_Image_Treasure;
     }

     public String getAddress_Image_Empty() {
         return Address_Image_Empty;
     }

     public String getAddress_Image_Castle() {return Address_Image_Castle;}

     private  int Dice = 0;

     public int getDice() {
         return Dice;
     }

     public  void setDice(int dice) {
         Dice = dice;
     }

     private int Change_Dice = 0;

     public int getChange_Dice() {
         return Change_Dice;
     }

     public void setChange_Dice(int change_Dice) {
         Change_Dice = change_Dice;
     }

     private static final int BOARD_SIZE = 12;
     private static final int CELL_SIZE = 50;

     private final JPanel boardPanel;


      JButton[][] cells;


     JFrame frame = new JFrame();

     public void SetHighlight(int Location, int []paste, Color c, int thickness) {
         int x = 0;
         if (Location==0)cells[1][0].setBorder(BorderFactory.createLineBorder(c, thickness));
         if ((Location % 11) != 1&&Location!=0) {
             for (int i = 0; i < 6; i++) {
                 if (Location - 1 != paste[i]) {
                     x++;
                 }
             }
             if (x == 6 && (!Methods.Check_Wall(Location - 1))) {
                 cells[Methods.Row_Number(Location - 1)][Methods.Column_Number(Location - 1)].setBorder(BorderFactory.createLineBorder(c, thickness));
             }
         }
         x = 0;
         if ((Location % 11) != 0&&Location>0) {
             for (int i = 0; i < 6; i++) {
                 if (Location + 1 != paste[i]) {
                     x++;
                 }
             }
             if (x == 6 && (!Methods.Check_Wall(Location + 1))) {
                 cells[Methods.Row_Number(Location + 1)][Methods.Column_Number(Location + 1)].setBorder(BorderFactory.createLineBorder(c, thickness));
             }
         }
         x = 0;
         if (Location > 11) {
             for (int i = 0; i < 6; i++) {
                 if (Location - 11 != paste[i]) {
                     x++;
                 }
             }
             if (x == 6 && (!Methods.Check_Wall(Location - 11))) {
                 cells[Methods.Row_Number(Location - 11)][Methods.Column_Number(Location - 11)].setBorder(BorderFactory.createLineBorder(c, thickness));
             }
         }
         x = 0;
         if (Location < 111&&Location!=0) {
             for (int i = 0; i < 6; i++) {
                 if (Location + 11 != paste[i]) {
                     x++;
                 }
             }
             if (x == 6 && (!Methods.Check_Wall(Location + 11))) {
                 cells[Methods.Row_Number(Location + 11)][Methods.Column_Number(Location + 11)].setBorder(BorderFactory.createLineBorder(c, thickness));
             }
         }
     }


     public void SetImageIcon(int i, int j, String Address_Image) {
         cells[i][j].setIcon(new ImageIcon(Address_Image));
     }

     public void SetColorBackground(int i, int j, Color z) {
         cells[i][j].setBackground(z);
     }

     public void SetTextButton(long x1, long y1, long x2, long y2) {
         cells[0][6].setText(textField1.getText());
         cells[0][7].setText(label4.getText());
         cells[0][5].setText(label3.getText());
         cells[0][4].setText(textField2.getText());
         if (x1 >= 5 && y1 >= 0) {
             cells[0][4].setBackground(Color.PINK);
             cells[0][5].setBackground(Color.PINK);
         } else {
             cells[0][4].setBackground(Color.red);
             cells[0][5].setBackground(Color.red);
         }
         if (x2 >= 0 && y2 >= 1) {
             cells[0][6].setBackground(Color.yellow);
             cells[0][7].setBackground(Color.yellow);
         } else {
             cells[0][6].setBackground(Color.RED);
             cells[0][7].setBackground(Color.RED);
         }
     }



     public Player() {


         frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
         frame.setTitle("Traveling Salesman");
         frame.setBounds(0, 0, 1550, 830);
         frame.setVisible(false);

         boardPanel=new JPanel(new GridLayout(BOARD_SIZE,BOARD_SIZE)){
             protected void paintComponent(Graphics g){
                 super.paintComponent(g);
                 ImageIcon backgroundImage = new ImageIcon("D:\\Bluetooth\\blue.png");
                 g.drawImage(backgroundImage.getImage(),0,0,null);
             }
         };
//         boardPanel.setLayout(new GridLayout(BOARD_SIZE, BOARD_SIZE));
         boardPanel.setBorder(BorderFactory.createEmptyBorder(0, 100, 10, 100));

         cells = new JButton[BOARD_SIZE][BOARD_SIZE];

         // Add cells to the board panel
         int i = 0;
         for (i = 0; i < BOARD_SIZE; i++) {
             int j = 0;
             for (j = 0; j < BOARD_SIZE - 1; j++) {
                 cells[i][j] = new JButton();
                 if (i == 0 && j == 0) {
                     cells[i][j].setBorder(BorderFactory.createLineBorder(Color.BLACK, 2));
                     boardPanel.add(cells[i][j]);
                 }
                 if (i != 0) cells[i][j].setBackground(Color.ORANGE);
                 if (i == 0 && j != 0) cells[i][j].setBackground(Color.white);
                 if (i == 6 && j == 5) {
                     cells[i][j].setIcon(new ImageIcon(getAddress_Image_Castle()));
                 }


                 cells[i][j].setPreferredSize(new Dimension(CELL_SIZE, CELL_SIZE));
                 if (i > 0) cells[i][j].setBorder(BorderFactory.createLineBorder(Color.BLACK, 2));
                 if (i == 0) cells[i][j].setBorder(BorderFactory.createLineBorder(Color.white, 2));
                 boardPanel.add(cells[i][j]);

             }
         }

         frame.add(boardPanel);


         cells[0][1].setBounds(0, 0, 10, 10);
         cells[0][1].addActionListener(new ActionListener() {
             public void actionPerformed(ActionEvent e) {
                 // Generate a random number between 1 and 6
                 if (Permission_To_Dice == true) {

                     Dice = Methods.DiceRand();
                     Permission_To_Dice = false;
                 }

             }
         });





         cells[0][9].setIcon(new ImageIcon("D:\\Programming\\intellij\\Traveling_Salesman\\image\\music.png"));
         cells[0][9].addActionListener(new ActionListener() {
             @Override
             public void actionPerformed(ActionEvent e) {
                 Music.frame5.setVisible(true);
             }
         });

         //ردیف اول

         cells[0][3].addActionListener(new ActionListener() {
             public void actionPerformed(ActionEvent e) {
                 new Wallet();
             }
         });


         cells[1][0].addActionListener(new ActionListener() {
             public void actionPerformed(ActionEvent e) {
                 Target_Location = 1;
                 if (Current_Location >= 0 && Methods.Permission_To_Move(Current_Location, Target_Location) == true && Dice > 0&&Methods.Check_Wall(Target_Location)==false) {
                     Dice -= 1;
                     Change_Dice = 1;
                 }
             }
         });
         cells[1][1].addActionListener(new ActionListener() {
             public void actionPerformed(ActionEvent e) {
                 Target_Location = 2;
                 if (Current_Location > 0 && Methods.Permission_To_Move(Current_Location, Target_Location) == true && Dice > 0&&Methods.Check_Wall(Target_Location)==false) {
                     Dice -= 1;
                     Change_Dice = 1;
                 }
             }
         });
         cells[1][2].addActionListener(new ActionListener() {
             public void actionPerformed(ActionEvent e) {
                 Target_Location = 3;
                 if (Current_Location > 0 && Methods.Permission_To_Move(Current_Location, Target_Location) == true && Dice > 0&&Methods.Check_Wall(Target_Location)==false) {
                     Dice -= 1;
                     Change_Dice = 1;
                 }
             }
         });
         cells[1][3].addActionListener(new ActionListener() {
             public void actionPerformed(ActionEvent e) {
                 Target_Location = 4;
                 if (Current_Location > 0 && Methods.Permission_To_Move(Current_Location, Target_Location) == true && Dice > 0&&Methods.Check_Wall(Target_Location)==false) {
                     Dice -= 1;
                     Change_Dice = 1;
                 }
             }
         });
         cells[1][4].addActionListener(new ActionListener() {
             public void actionPerformed(ActionEvent e) {
                 Target_Location = 5;
                 if (Current_Location > 0 && Methods.Permission_To_Move(Current_Location, Target_Location) == true && Dice > 0&&Methods.Check_Wall(Target_Location)==false) {
                     Dice -= 1;
                     Change_Dice = 1;
                 }
             }
         });
         cells[1][5].addActionListener(new ActionListener() {
             public void actionPerformed(ActionEvent e) {
                 Target_Location = 6;
                 if (Current_Location > 0 && Methods.Permission_To_Move(Current_Location, Target_Location) == true && Dice > 0&&Methods.Check_Wall(Target_Location)==false) {
                     Dice -= 1;
                     Change_Dice = 1;
                 }
             }
         });
         cells[1][6].addActionListener(new ActionListener() {
             public void actionPerformed(ActionEvent e) {
                 Target_Location = 7;
                 if (Current_Location > 0 && Methods.Permission_To_Move(Current_Location, Target_Location) == true && Dice > 0&&Methods.Check_Wall(Target_Location)==false) {
                     Dice -= 1;
                     Change_Dice = 1;
                 }
             }
         });
         cells[1][7].addActionListener(new ActionListener() {
             public void actionPerformed(ActionEvent e) {
                 Target_Location = 8;
                 if (Current_Location > 0 && Methods.Permission_To_Move(Current_Location, Target_Location) == true && Dice > 0&&Methods.Check_Wall(Target_Location)==false) {
                     Dice -= 1;
                     Change_Dice = 1;
                 }
             }
         });
         cells[1][8].addActionListener(new ActionListener() {
             public void actionPerformed(ActionEvent e) {
                 Target_Location = 9;
                 if (Current_Location > 0 && Methods.Permission_To_Move(Current_Location, Target_Location) == true && Dice > 0&&Methods.Check_Wall(Target_Location)==false) {
                     Dice -= 1;
                     Change_Dice = 1;
                 }
             }
         });
         cells[1][9].addActionListener(new ActionListener() {
             public void actionPerformed(ActionEvent e) {
                 Target_Location = 10;
                 if (Current_Location > 0 && Methods.Permission_To_Move(Current_Location, Target_Location) == true && Dice > 0&&Methods.Check_Wall(Target_Location)==false) {
                     Dice -= 1;
                     Change_Dice = 1;
                 }
             }
         });
         cells[1][10].addActionListener(new ActionListener() {
             public void actionPerformed(ActionEvent e) {
                 Target_Location = 11;
                 if (Current_Location > 0 && Methods.Permission_To_Move(Current_Location, Target_Location) == true && Dice > 0&&Methods.Check_Wall(Target_Location)==false) {
                     Dice -= 1;
                     Change_Dice = 1;
                 }
             }
         });


         //ردیف دوم
         cells[2][0].addActionListener(new ActionListener() {
             public void actionPerformed(ActionEvent e) {
                 Target_Location = 12;
                 if (Current_Location > 0 && Methods.Permission_To_Move(Current_Location, Target_Location) == true && Dice > 0&&Methods.Check_Wall(Target_Location)==false) {
                     Dice -= 1;
                     Change_Dice = 1;
                 }
             }
         });
         cells[2][1].addActionListener(new ActionListener() {
             public void actionPerformed(ActionEvent e) {
                 Target_Location = 13;
                 if (Current_Location > 0 && Methods.Permission_To_Move(Current_Location, Target_Location) == true && Dice > 0&&Methods.Check_Wall(Target_Location)==false) {
                     Dice -= 1;
                     Change_Dice = 1;
                 }
             }
         });
         cells[2][2].addActionListener(new ActionListener() {
             public void actionPerformed(ActionEvent e) {
                 Target_Location = 14;
                 if (Current_Location > 0 && Methods.Permission_To_Move(Current_Location, Target_Location) == true && Dice > 0&&Methods.Check_Wall(Target_Location)==false) {
                     Dice -= 1;
                     Change_Dice = 1;
                 }
             }
         });
         cells[2][3].addActionListener(new ActionListener() {
             public void actionPerformed(ActionEvent e) {
                 Target_Location = 15;
                 if (Current_Location > 0 && Methods.Permission_To_Move(Current_Location, Target_Location) == true && Dice > 0&&Methods.Check_Wall(Target_Location)==false) {
                     Dice -= 1;
                     Change_Dice = 1;
                 }
             }
         });
         cells[2][4].addActionListener(new ActionListener() {
             public void actionPerformed(ActionEvent e) {
                 Target_Location = 16;
                 if (Current_Location > 0 && Methods.Permission_To_Move(Current_Location, Target_Location) == true && Dice > 0&&Methods.Check_Wall(Target_Location)==false) {
                     Dice -= 1;
                     Change_Dice = 1;
                 }
             }
         });
         cells[2][5].addActionListener(new ActionListener() {
             public void actionPerformed(ActionEvent e) {
                 Target_Location = 17;
                 if (Current_Location > 0 && Methods.Permission_To_Move(Current_Location, Target_Location) == true && Dice > 0&&Methods.Check_Wall(Target_Location)==false) {
                     Dice -= 1;
                     Change_Dice = 1;
                 }
             }
         });
         cells[2][6].addActionListener(new ActionListener() {
             public void actionPerformed(ActionEvent e) {
                 Target_Location = 18;
                 if (Current_Location > 0 && Methods.Permission_To_Move(Current_Location, Target_Location) == true && Dice > 0&&Methods.Check_Wall(Target_Location)==false) {
                     Dice -= 1;
                     Change_Dice = 1;
                 }
             }
         });
         cells[2][7].addActionListener(new ActionListener() {
             public void actionPerformed(ActionEvent e) {
                 Target_Location = 19;
                 if (Current_Location > 0 && Methods.Permission_To_Move(Current_Location, Target_Location) == true && Dice > 0&&Methods.Check_Wall(Target_Location)==false) {
                     Dice -= 1;
                     Change_Dice = 1;
                 }
             }
         });
         cells[2][8].addActionListener(new ActionListener() {
             public void actionPerformed(ActionEvent e) {
                 Target_Location = 20;
                 if (Current_Location > 0 && Methods.Permission_To_Move(Current_Location, Target_Location) == true && Dice > 0&&Methods.Check_Wall(Target_Location)==false) {
                     Dice -= 1;
                     Change_Dice = 1;
                 }
             }
         });
         cells[2][9].addActionListener(new ActionListener() {
             public void actionPerformed(ActionEvent e) {
                 Target_Location = 21;
                 if (Current_Location > 0 && Methods.Permission_To_Move(Current_Location, Target_Location) == true && Dice > 0&&Methods.Check_Wall(Target_Location)==false) {
                     Dice -= 1;
                     Change_Dice = 1;
                 }
             }
         });
         cells[2][10].addActionListener(new ActionListener() {
             public void actionPerformed(ActionEvent e) {
                 Target_Location = 22;
                 if (Current_Location > 0 && Methods.Permission_To_Move(Current_Location, Target_Location) == true && Dice > 0&&Methods.Check_Wall(Target_Location)==false) {
                     Dice -= 1;
                     Change_Dice = 1;
                 }
             }
         });


         //ردیف سوم
         cells[3][0].addActionListener(new ActionListener() {
             public void actionPerformed(ActionEvent e) {
                 Target_Location = 23;
                 if (Current_Location > 0 && Methods.Permission_To_Move(Current_Location, Target_Location) == true && Dice > 0&&Methods.Check_Wall(Target_Location)==false) {
                     Dice -= 1;
                     Change_Dice = 1;
                 }
             }
         });
         cells[3][1].addActionListener(new ActionListener() {
             public void actionPerformed(ActionEvent e) {
                 Target_Location = 24;
                 if (Current_Location > 0 && Methods.Permission_To_Move(Current_Location, Target_Location) == true && Dice > 0&&Methods.Check_Wall(Target_Location)==false) {
                     Dice -= 1;
                     Change_Dice = 1;
                 }
             }
         });
         cells[3][2].addActionListener(new ActionListener() {
             public void actionPerformed(ActionEvent e) {
                 Target_Location = 25;
                 if (Current_Location > 0 && Methods.Permission_To_Move(Current_Location, Target_Location) == true && Dice > 0&&Methods.Check_Wall(Target_Location)==false) {
                     Dice -= 1;
                     Change_Dice = 1;
                 }
             }
         });
         cells[3][3].addActionListener(new ActionListener() {
             public void actionPerformed(ActionEvent e) {
                 Target_Location = 26;
                 if (Current_Location > 0 && Methods.Permission_To_Move(Current_Location, Target_Location) == true && Dice > 0&&Methods.Check_Wall(Target_Location)==false) {
                     Dice -= 1;
                     Change_Dice = 1;
                 }
             }
         });
         cells[3][4].addActionListener(new ActionListener() {
             public void actionPerformed(ActionEvent e) {
                 Target_Location = 27;
                 if (Current_Location > 0 && Methods.Permission_To_Move(Current_Location, Target_Location) == true && Dice > 0&&Methods.Check_Wall(Target_Location)==false) {
                     Dice -= 1;
                     Change_Dice = 1;
                 }
             }
         });
         cells[3][5].addActionListener(new ActionListener() {
             public void actionPerformed(ActionEvent e) {
                 Target_Location = 28;
                 if (Current_Location > 0 && Methods.Permission_To_Move(Current_Location, Target_Location) == true && Dice > 0&&Methods.Check_Wall(Target_Location)==false) {
                     Dice -= 1;
                     Change_Dice = 1;
                 }
             }
         });
         cells[3][6].addActionListener(new ActionListener() {
             public void actionPerformed(ActionEvent e) {
                 Target_Location = 29;
                 if (Current_Location > 0 && Methods.Permission_To_Move(Current_Location, Target_Location) == true && Dice > 0&&Methods.Check_Wall(Target_Location)==false) {
                     Dice -= 1;
                     Change_Dice = 1;
                 }
             }
         });
         cells[3][7].addActionListener(new ActionListener() {
             public void actionPerformed(ActionEvent e) {
                 Target_Location = 30;
                 if (Current_Location > 0 && Methods.Permission_To_Move(Current_Location, Target_Location) == true && Dice > 0&&Methods.Check_Wall(Target_Location)==false) {
                     Dice -= 1;
                     Change_Dice = 1;
                 }
             }
         });
         cells[3][8].addActionListener(new ActionListener() {
             public void actionPerformed(ActionEvent e) {
                 Target_Location = 31;
                 if (Current_Location > 0 && Methods.Permission_To_Move(Current_Location, Target_Location) == true && Dice > 0&&Methods.Check_Wall(Target_Location)==false) {
                     Dice -= 1;
                     Change_Dice = 1;
                 }
             }
         });
         cells[3][9].addActionListener(new ActionListener() {
             public void actionPerformed(ActionEvent e) {
                 Target_Location = 32;
                 if (Current_Location > 0 && Methods.Permission_To_Move(Current_Location, Target_Location) == true && Dice > 0&&Methods.Check_Wall(Target_Location)==false) {
                     Dice -= 1;
                     Change_Dice = 1;
                 }
             }
         });
         cells[3][10].addActionListener(new ActionListener() {
             public void actionPerformed(ActionEvent e) {
                 Target_Location = 33;
                 if (Current_Location > 0 && Methods.Permission_To_Move(Current_Location, Target_Location) == true && Dice > 0&&Methods.Check_Wall(Target_Location)==false) {
                     Dice -= 1;
                     Change_Dice = 1;
                 }
             }
         });


         //ردیف چهارم
         cells[4][0].addActionListener(new ActionListener() {
             public void actionPerformed(ActionEvent e) {
                 Target_Location = 34;
                 if (Current_Location > 0 && Methods.Permission_To_Move(Current_Location, Target_Location) == true && Dice > 0&&Methods.Check_Wall(Target_Location)==false) {
                     Dice -= 1;
                     Change_Dice = 1;
                 }
             }
         });
         cells[4][1].addActionListener(new ActionListener() {
             public void actionPerformed(ActionEvent e) {
                 Target_Location = 35;
                 if (Current_Location > 0 && Methods.Permission_To_Move(Current_Location, Target_Location) == true && Dice > 0&&Methods.Check_Wall(Target_Location)==false) {
                     Dice -= 1;
                     Change_Dice = 1;
                 }
             }
         });
         cells[4][2].addActionListener(new ActionListener() {
             public void actionPerformed(ActionEvent e) {
                 Target_Location = 36;
                 if (Current_Location > 0 && Methods.Permission_To_Move(Current_Location, Target_Location) == true && Dice > 0&&Methods.Check_Wall(Target_Location)==false) {
                     Dice -= 1;
                     Change_Dice = 1;
                 }
             }
         });
         cells[4][3].addActionListener(new ActionListener() {
             public void actionPerformed(ActionEvent e) {
                 Target_Location = 37;
                 if (Current_Location > 0 && Methods.Permission_To_Move(Current_Location, Target_Location) == true && Dice > 0&&Methods.Check_Wall(Target_Location)==false) {
                     Dice -= 1;
                     Change_Dice = 1;
                 }
             }
         });
         cells[4][4].addActionListener(new ActionListener() {
             public void actionPerformed(ActionEvent e) {
                 Target_Location = 38;
                 if (Current_Location > 0 && Methods.Permission_To_Move(Current_Location, Target_Location) == true && Dice > 0&&Methods.Check_Wall(Target_Location)==false) {
                     Dice -= 1;
                     Change_Dice = 1;
                 }
             }
         });
         cells[4][5].addActionListener(new ActionListener() {
             public void actionPerformed(ActionEvent e) {
                 Target_Location = 39;
                 if (Current_Location > 0 && Methods.Permission_To_Move(Current_Location, Target_Location) == true && Dice > 0&&Methods.Check_Wall(Target_Location)==false) {
                     Dice -= 1;
                     Change_Dice = 1;
                 }
             }
         });
         cells[4][6].addActionListener(new ActionListener() {
             public void actionPerformed(ActionEvent e) {
                 Target_Location = 40;
                 if (Current_Location > 0 && Methods.Permission_To_Move(Current_Location, Target_Location) == true && Dice > 0&&Methods.Check_Wall(Target_Location)==false) {
                     Dice -= 1;
                     Change_Dice = 1;
                 }
             }
         });
         cells[4][7].addActionListener(new ActionListener() {
             public void actionPerformed(ActionEvent e) {
                 Target_Location = 41;
                 if (Current_Location > 0 && Methods.Permission_To_Move(Current_Location, Target_Location) == true && Dice > 0&&Methods.Check_Wall(Target_Location)==false) {
                     Dice -= 1;
                     Change_Dice = 1;
                 }
             }
         });
         cells[4][8].addActionListener(new ActionListener() {
             public void actionPerformed(ActionEvent e) {
                 Target_Location = 42;
                 if (Current_Location > 0 && Methods.Permission_To_Move(Current_Location, Target_Location) == true && Dice > 0&&Methods.Check_Wall(Target_Location)==false) {
                     Dice -= 1;
                     Change_Dice = 1;
                 }
             }
         });
         cells[4][9].addActionListener(new ActionListener() {
             public void actionPerformed(ActionEvent e) {
                 Target_Location = 43;
                 if (Current_Location > 0 && Methods.Permission_To_Move(Current_Location, Target_Location) == true && Dice > 0&&Methods.Check_Wall(Target_Location)==false) {
                     Dice -= 1;
                     Change_Dice = 1;
                 }
             }
         });
         cells[4][10].addActionListener(new ActionListener() {
             public void actionPerformed(ActionEvent e) {
                 Target_Location = 44;
                 if (Current_Location > 0 && Methods.Permission_To_Move(Current_Location, Target_Location) == true && Dice > 0&&Methods.Check_Wall(Target_Location)==false) {
                     Dice -= 1;
                     Change_Dice = 1;
                 }
             }
         });


         //ردیف پنجم
         cells[5][0].addActionListener(new ActionListener() {
             public void actionPerformed(ActionEvent e) {
                 Target_Location = 45;
                 if (Current_Location > 0 && Methods.Permission_To_Move(Current_Location, Target_Location) == true && Dice > 0&&Methods.Check_Wall(Target_Location)==false) {
                     Dice -= 1;
                     Change_Dice = 1;
                 }
             }
         });
         cells[5][1].addActionListener(new ActionListener() {
             public void actionPerformed(ActionEvent e) {
                 Target_Location = 46;
                 if (Current_Location > 0 && Methods.Permission_To_Move(Current_Location, Target_Location) == true && Dice > 0&&Methods.Check_Wall(Target_Location)==false) {
                     Dice -= 1;
                     Change_Dice = 1;
                 }
             }
         });
         cells[5][2].addActionListener(new ActionListener() {
             public void actionPerformed(ActionEvent e) {
                 Target_Location = 47;
                 if (Current_Location > 0 && Methods.Permission_To_Move(Current_Location, Target_Location) == true && Dice > 0&&Methods.Check_Wall(Target_Location)==false) {
                     Dice -= 1;
                     Change_Dice = 1;
                 }
             }
         });
         cells[5][3].addActionListener(new ActionListener() {
             public void actionPerformed(ActionEvent e) {
                 Target_Location = 48;
                 if (Current_Location > 0 && Methods.Permission_To_Move(Current_Location, Target_Location) == true && Dice > 0&&Methods.Check_Wall(Target_Location)==false) {
                     Dice -= 1;
                     Change_Dice = 1;
                 }
             }
         });
         cells[5][4].addActionListener(new ActionListener() {
             public void actionPerformed(ActionEvent e) {
                 Target_Location = 49;
                 if (Current_Location > 0 && Methods.Permission_To_Move(Current_Location, Target_Location) == true && Dice > 0&&Methods.Check_Wall(Target_Location)==false) {
                     Dice -= 1;
                     Change_Dice = 1;
                 }
             }
         });
         cells[5][5].addActionListener(new ActionListener() {
             public void actionPerformed(ActionEvent e) {
                 Target_Location = 50;
                 if (Current_Location > 0 && Methods.Permission_To_Move(Current_Location, Target_Location) == true && Dice > 0&&Methods.Check_Wall(Target_Location)==false) {
                     Dice -= 1;
                     Change_Dice = 1;
                 }
             }
         });
         cells[5][6].addActionListener(new ActionListener() {
             public void actionPerformed(ActionEvent e) {
                 Target_Location = 51;
                 if (Current_Location > 0 && Methods.Permission_To_Move(Current_Location, Target_Location) == true && Dice > 0&&Methods.Check_Wall(Target_Location)==false) {
                     Dice -= 1;
                     Change_Dice = 1;
                 }
             }
         });
         cells[5][7].addActionListener(new ActionListener() {
             public void actionPerformed(ActionEvent e) {
                 Target_Location = 52;
                 if (Current_Location > 0 && Methods.Permission_To_Move(Current_Location, Target_Location) == true && Dice > 0&&Methods.Check_Wall(Target_Location)==false) {
                     Dice -= 1;
                     Change_Dice = 1;
                 }
             }
         });
         cells[5][8].addActionListener(new ActionListener() {
             public void actionPerformed(ActionEvent e) {
                 Target_Location = 53;
                 if (Current_Location > 0 && Methods.Permission_To_Move(Current_Location, Target_Location) == true && Dice > 0&&Methods.Check_Wall(Target_Location)==false) {
                     Dice -= 1;
                     Change_Dice = 1;
                 }
             }
         });
         cells[5][9].addActionListener(new ActionListener() {
             public void actionPerformed(ActionEvent e) {
                 Target_Location = 54;
                 if (Current_Location > 0 && Methods.Permission_To_Move(Current_Location, Target_Location) == true && Dice > 0&&Methods.Check_Wall(Target_Location)==false) {
                     Dice -= 1;
                     Change_Dice = 1;
                 }
             }
         });
         cells[5][10].addActionListener(new ActionListener() {
             public void actionPerformed(ActionEvent e) {
                 Target_Location = 55;
                 if (Current_Location > 0 && Methods.Permission_To_Move(Current_Location, Target_Location) == true && Dice > 0&&Methods.Check_Wall(Target_Location)==false) {
                     Dice -= 1;
                     Change_Dice = 1;
                 }
             }
         });


         //ردیف ششم
         cells[6][0].addActionListener(new ActionListener() {
             public void actionPerformed(ActionEvent e) {
                 Target_Location = 56;
                 if (Current_Location > 0 && Methods.Permission_To_Move(Current_Location, Target_Location) == true && Dice > 0&&Methods.Check_Wall(Target_Location)==false) {
                     Dice -= 1;
                     Change_Dice = 1;
                 }
             }
         });
         cells[6][1].addActionListener(new ActionListener() {
             public void actionPerformed(ActionEvent e) {
                 Target_Location = 57;
                 if (Current_Location > 0 && Methods.Permission_To_Move(Current_Location, Target_Location) == true && Dice > 0&&Methods.Check_Wall(Target_Location)==false) {
                     Dice -= 1;
                     Change_Dice = 1;
                 }
             }
         });
         cells[6][2].addActionListener(new ActionListener() {
             public void actionPerformed(ActionEvent e) {
                 Target_Location = 58;
                 if (Current_Location > 0 && Methods.Permission_To_Move(Current_Location, Target_Location) == true && Dice > 0&&Methods.Check_Wall(Target_Location)==false) {
                     Dice -= 1;
                     Change_Dice = 1;
                 }
             }
         });
         cells[6][3].addActionListener(new ActionListener() {
             public void actionPerformed(ActionEvent e) {
                 Target_Location = 59;
                 if (Current_Location > 0 && Methods.Permission_To_Move(Current_Location, Target_Location) == true && Dice > 0&&Methods.Check_Wall(Target_Location)==false) {
                     Dice -= 1;
                     Change_Dice = 1;
                 }
             }
         });
         cells[6][4].addActionListener(new ActionListener() {
             public void actionPerformed(ActionEvent e) {
                 Target_Location = 60;
                 if (Current_Location > 0 && Methods.Permission_To_Move(Current_Location, Target_Location)&& Dice > 0&&!Methods.Check_Wall(Target_Location)) {
                     Dice -= 1;
                     Change_Dice = 1;
                 }
             }
         });
         cells[6][5].addActionListener(new ActionListener() {
             public void actionPerformed(ActionEvent e) {
                 Target_Location = 61;
                 if (Current_Location > 0 && Methods.Permission_To_Move(Current_Location, Target_Location)  && Dice > 0&&!Methods.Check_Wall(Target_Location)) {
                     Dice -= 1;
                     Change_Dice = 1;
                 }
                 new Castle();
             }
         });
         cells[6][6].addActionListener(new ActionListener() {
             public void actionPerformed(ActionEvent e) {
                 Target_Location = 62;
                 if (Current_Location > 0 && Methods.Permission_To_Move(Current_Location, Target_Location) == true && Dice > 0&&Methods.Check_Wall(Target_Location)==false) {
                     Dice -= 1;
                     Change_Dice = 1;
                 }
             }
         });
         cells[6][7].addActionListener(new ActionListener() {
             public void actionPerformed(ActionEvent e) {
                 Target_Location = 63;
                 if (Current_Location > 0 && Methods.Permission_To_Move(Current_Location, Target_Location) == true && Dice > 0&&Methods.Check_Wall(Target_Location)==false) {
                     Dice -= 1;
                     Change_Dice = 1;
                 }
             }
         });
         cells[6][8].addActionListener(new ActionListener() {
             public void actionPerformed(ActionEvent e) {
                 Target_Location = 64;
                 if (Current_Location > 0 && Methods.Permission_To_Move(Current_Location, Target_Location) == true && Dice > 0&&Methods.Check_Wall(Target_Location)==false) {
                     Dice -= 1;
                     Change_Dice = 1;
                 }
             }
         });
         cells[6][9].addActionListener(new ActionListener() {
             public void actionPerformed(ActionEvent e) {
                 Target_Location = 65;
                 if (Current_Location > 0 && Methods.Permission_To_Move(Current_Location, Target_Location) == true && Dice > 0&&Methods.Check_Wall(Target_Location)==false) {
                     Dice -= 1;
                     Change_Dice = 1;
                 }
             }
         });
         cells[6][10].addActionListener(new ActionListener() {
             public void actionPerformed(ActionEvent e) {
                 Target_Location = 66;
                 if (Current_Location > 0 && Methods.Permission_To_Move(Current_Location, Target_Location) == true && Dice > 0&&Methods.Check_Wall(Target_Location)==false) {
                     Dice -= 1;
                     Change_Dice = 1;
                 }
             }
         });


         //ردیف هفتم
         cells[7][0].addActionListener(new ActionListener() {
             public void actionPerformed(ActionEvent e) {
                 Target_Location = 67;
                 if (Current_Location > 0 && Methods.Permission_To_Move(Current_Location, Target_Location) == true && Dice > 0&&Methods.Check_Wall(Target_Location)==false) {
                     Dice -= 1;
                     Change_Dice = 1;
                 }
             }
         });
         cells[7][1].addActionListener(new ActionListener() {
             public void actionPerformed(ActionEvent e) {
                 Target_Location = 68;
                 if (Current_Location > 0 && Methods.Permission_To_Move(Current_Location, Target_Location) == true && Dice > 0&&Methods.Check_Wall(Target_Location)==false) {
                     Dice -= 1;
                     Change_Dice = 1;
                 }
             }
         });
         cells[7][2].addActionListener(new ActionListener() {
             public void actionPerformed(ActionEvent e) {
                 Target_Location = 69;
                 if (Current_Location > 0 && Methods.Permission_To_Move(Current_Location, Target_Location) == true && Dice > 0&&Methods.Check_Wall(Target_Location)==false) {
                     Dice -= 1;
                     Change_Dice = 1;
                 }
             }
         });
         cells[7][3].addActionListener(new ActionListener() {
             public void actionPerformed(ActionEvent e) {
                 Target_Location = 70;
                 if (Current_Location > 0 && Methods.Permission_To_Move(Current_Location, Target_Location) == true && Dice > 0&&Methods.Check_Wall(Target_Location)==false) {
                     Dice -= 1;
                     Change_Dice = 1;
                 }
             }
         });
         cells[7][4].addActionListener(new ActionListener() {
             public void actionPerformed(ActionEvent e) {
                 Target_Location = 71;
                 if (Current_Location > 0 && Methods.Permission_To_Move(Current_Location, Target_Location) == true && Dice > 0&&Methods.Check_Wall(Target_Location)==false) {
                     Dice -= 1;
                     Change_Dice = 1;
                 }
             }
         });
         cells[7][5].addActionListener(new ActionListener() {
             public void actionPerformed(ActionEvent e) {
                 Target_Location = 72;
                 if (Current_Location > 0 && Methods.Permission_To_Move(Current_Location, Target_Location) == true && Dice > 0&&Methods.Check_Wall(Target_Location)==false) {
                     Dice -= 1;
                     Change_Dice = 1;
                 }
             }
         });
         cells[7][6].addActionListener(new ActionListener() {
             public void actionPerformed(ActionEvent e) {
                 Target_Location = 73;
                 if (Current_Location > 0 && Methods.Permission_To_Move(Current_Location, Target_Location) == true && Dice > 0&&Methods.Check_Wall(Target_Location)==false) {
                     Dice -= 1;
                     Change_Dice = 1;
                 }
             }
         });
         cells[7][7].addActionListener(new ActionListener() {
             public void actionPerformed(ActionEvent e) {
                 Target_Location = 74;
                 if (Current_Location > 0 && Methods.Permission_To_Move(Current_Location, Target_Location) == true && Dice > 0&&Methods.Check_Wall(Target_Location)==false) {
                     Dice -= 1;
                     Change_Dice = 1;
                 }
             }
         });
         cells[7][8].addActionListener(new ActionListener() {
             public void actionPerformed(ActionEvent e) {
                 Target_Location = 75;
                 if (Current_Location > 0 && Methods.Permission_To_Move(Current_Location, Target_Location) == true && Dice > 0&&Methods.Check_Wall(Target_Location)==false) {
                     Dice -= 1;
                     Change_Dice = 1;
                 }
             }
         });
         cells[7][9].addActionListener(new ActionListener() {
             public void actionPerformed(ActionEvent e) {
                 Target_Location = 76;
                 if (Current_Location > 0 && Methods.Permission_To_Move(Current_Location, Target_Location) == true && Dice > 0&&Methods.Check_Wall(Target_Location)==false) {
                     Dice -= 1;
                     Change_Dice = 1;
                 }
             }
         });
         cells[7][10].addActionListener(new ActionListener() {
             public void actionPerformed(ActionEvent e) {
                 Target_Location = 77;
                 if (Current_Location > 0 && Methods.Permission_To_Move(Current_Location, Target_Location) == true && Dice > 0&&Methods.Check_Wall(Target_Location)==false) {
                     Dice -= 1;
                     Change_Dice = 1;
                 }
             }
         });


         //ردیف هشتم
         cells[8][0].addActionListener(new ActionListener() {
             public void actionPerformed(ActionEvent e) {
                 Target_Location = 78;
                 if (Current_Location > 0 && Methods.Permission_To_Move(Current_Location, Target_Location) == true && Dice > 0&&Methods.Check_Wall(Target_Location)==false) {
                     Dice -= 1;
                     Change_Dice = 1;
                 }
             }
         });
         cells[8][1].addActionListener(new ActionListener() {
             public void actionPerformed(ActionEvent e) {
                 Target_Location = 79;
                 if (Current_Location > 0 && Methods.Permission_To_Move(Current_Location, Target_Location) == true && Dice > 0&&Methods.Check_Wall(Target_Location)==false) {
                     Dice -= 1;
                     Change_Dice = 1;
                 }
             }
         });
         cells[8][2].addActionListener(new ActionListener() {
             public void actionPerformed(ActionEvent e) {
                 Target_Location = 80;
                 if (Current_Location > 0 && Methods.Permission_To_Move(Current_Location, Target_Location) == true && Dice > 0&&Methods.Check_Wall(Target_Location)==false) {
                     Dice -= 1;
                     Change_Dice = 1;
                 }
             }
         });
         cells[8][3].addActionListener(new ActionListener() {
             public void actionPerformed(ActionEvent e) {
                 Target_Location = 81;
                 if (Current_Location > 0 && Methods.Permission_To_Move(Current_Location, Target_Location) == true && Dice > 0&&Methods.Check_Wall(Target_Location)==false) {
                     Dice -= 1;
                     Change_Dice = 1;
                 }
             }
         });
         cells[8][4].addActionListener(new ActionListener() {
             public void actionPerformed(ActionEvent e) {
                 Target_Location = 82;
                 if (Current_Location > 0 && Methods.Permission_To_Move(Current_Location, Target_Location) == true && Dice > 0&&Methods.Check_Wall(Target_Location)==false) {
                     Dice -= 1;
                     Change_Dice = 1;
                 }
             }
         });
         cells[8][5].addActionListener(new ActionListener() {
             public void actionPerformed(ActionEvent e) {
                 Target_Location = 83;
                 if (Current_Location > 0 && Methods.Permission_To_Move(Current_Location, Target_Location) == true && Dice > 0&&Methods.Check_Wall(Target_Location)==false) {
                     Dice -= 1;
                     Change_Dice = 1;
                 }
             }
         });
         cells[8][6].addActionListener(new ActionListener() {
             public void actionPerformed(ActionEvent e) {
                 Target_Location = 84;
                 if (Current_Location > 0 && Methods.Permission_To_Move(Current_Location, Target_Location) == true && Dice > 0&&Methods.Check_Wall(Target_Location)==false) {
                     Dice -= 1;
                     Change_Dice = 1;
                 }
             }
         });
         cells[8][7].addActionListener(new ActionListener() {
             public void actionPerformed(ActionEvent e) {
                 Target_Location = 85;
                 if (Current_Location > 0 && Methods.Permission_To_Move(Current_Location, Target_Location) == true && Dice > 0&&Methods.Check_Wall(Target_Location)==false) {
                     Dice -= 1;
                     Change_Dice = 1;
                 }
             }
         });
         cells[8][8].addActionListener(new ActionListener() {
             public void actionPerformed(ActionEvent e) {
                 Target_Location = 86;
                 if (Current_Location > 0 && Methods.Permission_To_Move(Current_Location, Target_Location) == true && Dice > 0&&Methods.Check_Wall(Target_Location)==false) {
                     Dice -= 1;
                     Change_Dice = 1;
                 }
             }
         });
         cells[8][9].addActionListener(new ActionListener() {
             public void actionPerformed(ActionEvent e) {
                 Target_Location = 87;
                 if (Current_Location > 0 && Methods.Permission_To_Move(Current_Location, Target_Location) == true && Dice > 0&&Methods.Check_Wall(Target_Location)==false) {
                     Dice -= 1;
                     Change_Dice = 1;
                 }
             }
         });
         cells[8][10].addActionListener(new ActionListener() {
             public void actionPerformed(ActionEvent e) {
                 Target_Location = 88;
                 if (Current_Location > 0 && Methods.Permission_To_Move(Current_Location, Target_Location) == true && Dice > 0&&Methods.Check_Wall(Target_Location)==false) {
                     Dice -= 1;
                     Change_Dice = 1;
                 }
             }
         });


         //ردیف نهم
         cells[9][0].addActionListener(new ActionListener() {
             public void actionPerformed(ActionEvent e) {
                 Target_Location = 89;
                 if (Current_Location > 0 && Methods.Permission_To_Move(Current_Location, Target_Location) == true && Dice > 0&&Methods.Check_Wall(Target_Location)==false) {
                     Dice -= 1;
                     Change_Dice = 1;
                 }
             }
         });
         cells[9][1].addActionListener(new ActionListener() {
             public void actionPerformed(ActionEvent e) {
                 Target_Location = 90;
                 if (Current_Location > 0 && Methods.Permission_To_Move(Current_Location, Target_Location) == true && Dice > 0&&Methods.Check_Wall(Target_Location)==false) {
                     Dice -= 1;
                     Change_Dice = 1;
                 }
             }
         });
         cells[9][2].addActionListener(new ActionListener() {
             public void actionPerformed(ActionEvent e) {
                 Target_Location = 91;
                 if (Current_Location > 0 && Methods.Permission_To_Move(Current_Location, Target_Location) == true && Dice > 0&&Methods.Check_Wall(Target_Location)==false) {
                     Dice -= 1;
                     Change_Dice = 1;
                 }
             }
         });
         cells[9][3].addActionListener(new ActionListener() {
             public void actionPerformed(ActionEvent e) {
                 Target_Location = 92;
                 if (Current_Location > 0 && Methods.Permission_To_Move(Current_Location, Target_Location) == true && Dice > 0&&Methods.Check_Wall(Target_Location)==false) {
                     Dice -= 1;
                     Change_Dice = 1;
                 }
             }
         });
         cells[9][4].addActionListener(new ActionListener() {
             public void actionPerformed(ActionEvent e) {
                 Target_Location = 93;
                 if (Current_Location > 0 && Methods.Permission_To_Move(Current_Location, Target_Location) == true && Dice > 0&&Methods.Check_Wall(Target_Location)==false) {
                     Dice -= 1;
                     Change_Dice = 1;
                 }
             }
         });
         cells[9][5].addActionListener(new ActionListener() {
             public void actionPerformed(ActionEvent e) {
                 Target_Location = 94;
                 if (Current_Location > 0 && Methods.Permission_To_Move(Current_Location, Target_Location) == true && Dice > 0&&Methods.Check_Wall(Target_Location)==false) {
                     Dice -= 1;
                     Change_Dice = 1;
                 }
             }
         });
         cells[9][6].addActionListener(new ActionListener() {
             public void actionPerformed(ActionEvent e) {
                 Target_Location = 95;
                 if (Current_Location > 0 && Methods.Permission_To_Move(Current_Location, Target_Location) == true && Dice > 0&&Methods.Check_Wall(Target_Location)==false) {
                     Dice -= 1;
                     Change_Dice = 1;
                 }
             }
         });
         cells[9][7].addActionListener(new ActionListener() {
             public void actionPerformed(ActionEvent e) {
                 Target_Location = 96;
                 if (Current_Location > 0 && Methods.Permission_To_Move(Current_Location, Target_Location) == true && Dice > 0&&Methods.Check_Wall(Target_Location)==false) {
                     Dice -= 1;
                     Change_Dice = 1;
                 }
             }
         });
         cells[9][8].addActionListener(new ActionListener() {
             public void actionPerformed(ActionEvent e) {
                 Target_Location = 97;
                 if (Current_Location > 0 && Methods.Permission_To_Move(Current_Location, Target_Location) == true && Dice > 0&&Methods.Check_Wall(Target_Location)==false) {
                     Dice -= 1;
                     Change_Dice = 1;
                 }
             }
         });
         cells[9][9].addActionListener(new ActionListener() {
             public void actionPerformed(ActionEvent e) {
                 Target_Location = 98;
                 if (Current_Location > 0 && Methods.Permission_To_Move(Current_Location, Target_Location) == true && Dice > 0&&Methods.Check_Wall(Target_Location)==false) {
                     Dice -= 1;
                     Change_Dice = 1;
                 }
             }
         });
         cells[9][10].addActionListener(new ActionListener() {
             public void actionPerformed(ActionEvent e) {
                 Target_Location = 99;
                 if (Current_Location > 0 && Methods.Permission_To_Move(Current_Location, Target_Location) == true && Dice > 0&&Methods.Check_Wall(Target_Location)==false) {
                     Dice -= 1;
                     Change_Dice = 1;
                 }
             }
         });


         //ردیف دهم
         cells[10][0].addActionListener(new ActionListener() {
             public void actionPerformed(ActionEvent e) {
                 Target_Location = 100;
                 if (Current_Location > 0 && Methods.Permission_To_Move(Current_Location, Target_Location) == true && Dice > 0&&Methods.Check_Wall(Target_Location)==false) {
                     Dice -= 1;
                     Change_Dice = 1;
                 }
             }
         });
         cells[10][1].addActionListener(new ActionListener() {
             public void actionPerformed(ActionEvent e) {
                 Target_Location = 101;
                 if (Current_Location > 0 && Methods.Permission_To_Move(Current_Location, Target_Location) == true && Dice > 0&&Methods.Check_Wall(Target_Location)==false) {
                     Dice -= 1;
                     Change_Dice = 1;
                 }
             }
         });
         cells[10][2].addActionListener(new ActionListener() {
             public void actionPerformed(ActionEvent e) {
                 Target_Location = 102;
                 if (Current_Location > 0 && Methods.Permission_To_Move(Current_Location, Target_Location) == true && Dice > 0&&Methods.Check_Wall(Target_Location)==false) {
                     Dice -= 1;
                     Change_Dice = 1;
                 }
             }
         });
         cells[10][3].addActionListener(new ActionListener() {
             public void actionPerformed(ActionEvent e) {
                 Target_Location = 103;
                 if (Current_Location > 0 && Methods.Permission_To_Move(Current_Location, Target_Location) == true && Dice > 0&&Methods.Check_Wall(Target_Location)==false) {
                     Dice -= 1;
                     Change_Dice = 1;
                 }
             }
         });
         cells[10][4].addActionListener(new ActionListener() {
             public void actionPerformed(ActionEvent e) {
                 Target_Location = 104;
                 if (Current_Location > 0 && Methods.Permission_To_Move(Current_Location, Target_Location) == true && Dice > 0&&Methods.Check_Wall(Target_Location)==false) {
                     Dice -= 1;
                     Change_Dice = 1;
                 }
             }
         });
         cells[10][5].addActionListener(new ActionListener() {
             public void actionPerformed(ActionEvent e) {
                 Target_Location = 105;
                 if (Current_Location > 0 && Methods.Permission_To_Move(Current_Location, Target_Location) == true && Dice > 0&&Methods.Check_Wall(Target_Location)==false) {
                     Dice -= 1;
                     Change_Dice = 1;
                 }
             }
         });
         cells[10][6].addActionListener(new ActionListener() {
             public void actionPerformed(ActionEvent e) {
                 Target_Location = 106;
                 if (Current_Location > 0 && Methods.Permission_To_Move(Current_Location, Target_Location) == true && Dice > 0&&Methods.Check_Wall(Target_Location)==false) {
                     Dice -= 1;
                     Change_Dice = 1;
                 }
             }
         });
         cells[10][7].addActionListener(new ActionListener() {
             public void actionPerformed(ActionEvent e) {
                 Target_Location = 107;
                 if (Current_Location > 0 && Methods.Permission_To_Move(Current_Location, Target_Location) == true && Dice > 0&&Methods.Check_Wall(Target_Location)==false) {
                     Dice -= 1;
                     Change_Dice = 1;
                 }
             }
         });
         cells[10][8].addActionListener(new ActionListener() {
             public void actionPerformed(ActionEvent e) {
                 Target_Location = 108;
                 if (Current_Location > 0 && Methods.Permission_To_Move(Current_Location, Target_Location) == true && Dice > 0&&Methods.Check_Wall(Target_Location)==false) {
                     Dice -= 1;
                     Change_Dice = 1;
                 }
             }
         });
         cells[10][9].addActionListener(new ActionListener() {
             public void actionPerformed(ActionEvent e) {
                 Target_Location = 109;
                 if (Current_Location > 0 && Methods.Permission_To_Move(Current_Location, Target_Location) == true && Dice > 0&&Methods.Check_Wall(Target_Location)==false) {
                     Dice -= 1;
                     Change_Dice = 1;
                 }
             }
         });
         cells[10][10].addActionListener(new ActionListener() {
             public void actionPerformed(ActionEvent e) {
                 Target_Location = 110;
                 if (Current_Location > 0 && Methods.Permission_To_Move(Current_Location, Target_Location) == true && Dice > 0&&Methods.Check_Wall(Target_Location)==false) {
                     Dice -= 1;
                     Change_Dice = 1;
                 }
             }
         });





         //ردیف یازدهم

         cells[11][0].addActionListener(new ActionListener() {
             public void actionPerformed(ActionEvent e) {
                 Target_Location = 111;
                 if (Current_Location > 0 && Methods.Permission_To_Move(Current_Location, Target_Location) == true && Dice > 0&&Methods.Check_Wall(Target_Location)==false) {
                     Dice -= 1;
                     Change_Dice = 1;
                 }
             }
         });
         cells[11][1].addActionListener(new ActionListener() {
             public void actionPerformed(ActionEvent e) {
                 Target_Location = 112;
                 if (Current_Location > 0 && Methods.Permission_To_Move(Current_Location, Target_Location) == true && Dice > 0&&Methods.Check_Wall(Target_Location)==false) {
                     Dice -= 1;
                     Change_Dice = 1;
                 }
             }
         });
         cells[11][2].addActionListener(new ActionListener() {
             public void actionPerformed(ActionEvent e) {
                 Target_Location = 113;
                 if (Current_Location > 0 && Methods.Permission_To_Move(Current_Location, Target_Location) == true && Dice > 0&&Methods.Check_Wall(Target_Location)==false) {
                     Dice -= 1;
                     Change_Dice = 1;
                 }
             }
         });
         cells[11][3].addActionListener(new ActionListener() {
             public void actionPerformed(ActionEvent e) {
                 Target_Location = 114;
                 if (Current_Location > 0 && Methods.Permission_To_Move(Current_Location, Target_Location) == true && Dice > 0&&Methods.Check_Wall(Target_Location)==false) {
                     Dice -= 1;
                     Change_Dice = 1;
                 }
             }
         });
         cells[11][4].addActionListener(new ActionListener() {
             public void actionPerformed(ActionEvent e) {
                 Target_Location = 115;
                 if (Current_Location > 0 && Methods.Permission_To_Move(Current_Location, Target_Location) == true && Dice > 0&&Methods.Check_Wall(Target_Location)==false) {
                     Dice -= 1;
                     Change_Dice = 1;
                 }
             }
         });
         cells[11][5].addActionListener(new ActionListener() {
             public void actionPerformed(ActionEvent e) {
                 Target_Location = 116;
                 if (Current_Location > 0 && Methods.Permission_To_Move(Current_Location, Target_Location) == true && Dice > 0&&Methods.Check_Wall(Target_Location)==false) {
                     Dice -= 1;
                     Change_Dice = 1;
                 }
             }
         });
         cells[11][6].addActionListener(new ActionListener() {
             public void actionPerformed(ActionEvent e) {
                 Target_Location = 117;
                 if (Current_Location > 0 && Methods.Permission_To_Move(Current_Location, Target_Location) == true && Dice > 0&&Methods.Check_Wall(Target_Location)==false) {
                     Dice -= 1;
                     Change_Dice = 1;
                 }
             }
         });
         cells[11][7].addActionListener(new ActionListener() {
             public void actionPerformed(ActionEvent e) {
                 Target_Location = 118;
                 if (Current_Location > 0 && Methods.Permission_To_Move(Current_Location, Target_Location) == true && Dice > 0&&Methods.Check_Wall(Target_Location)==false) {
                     Dice -= 1;
                     Change_Dice = 1;
                 }
             }
         });
         cells[11][8].addActionListener(new ActionListener() {
             public void actionPerformed(ActionEvent e) {
                 Target_Location = 119;
                 if (Current_Location > 0 && Methods.Permission_To_Move(Current_Location, Target_Location) == true && Dice > 0&&Methods.Check_Wall(Target_Location)==false) {
                     Dice -= 1;
                     Change_Dice = 1;
                 }
             }
         });
         cells[11][9].addActionListener(new ActionListener() {
             public void actionPerformed(ActionEvent e) {
                 Target_Location = 120;
                 if (Current_Location > 0 && Methods.Permission_To_Move(Current_Location, Target_Location) == true && Dice > 0&&Methods.Check_Wall(Target_Location)==false) {
                     Dice -= 1;
                     Change_Dice = 1;
                 }
             }
         });
         cells[11][10].addActionListener(new ActionListener() {
             public void actionPerformed(ActionEvent e) {
                 Target_Location = 121;
                 if (Current_Location > 0 && Methods.Permission_To_Move(Current_Location, Target_Location) == true && Dice > 0&&Methods.Check_Wall(Target_Location)==false) {
                     Dice -= 1;
                     Change_Dice = 1;
                 }
             }
         });





     }
 }
