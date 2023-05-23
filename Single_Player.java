package classes;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Single_Player {
    JLabel label3 = new JLabel();
    JLabel label4 = new JLabel();
    JTextField textField1 = new JTextField();
    JTextField textField2 = new JTextField();


    private int Current_Location = 0;

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

    public String getAddress_Image_Piece1() {
        return "image\\m1.png";
    }

    public String getAddress_Image_Piece2() {
        return "image\\m2.png";
    }

    public String getAddress_Image_Piece3() {
        return "image\\m3.png";
    }

    public String getAddress_Image_Piece4() {
        return "image\\m4.png";
    }

    public String getAddress_Image_Piece5() {
        return "image\\m5.png";
    }

    public String getAddress_Image_Piece6() {
        return "image\\m6.png";
    }

    public String getAddress_Image_Dice() {
        return "image\\dice.png";
    }

    public String getAddress_Image_Dice1() {
        return "image\\dice1.png";
    }

    public String getAddress_Image_Dice2() {
        return "image\\dice2.png";
    }

    public String getAddress_Image_Dice3() {
        return "image\\dice3.png";
    }

    public String getAddress_Image_Dice4() {
        return "image\\dice4.png";
    }

    public String getAddress_Image_Dice5() {
        return "image\\dice5.png";
    }

    public String getAddress_Image_Dice6() {
        return "image\\dice6.png";
    }

    public String getAddress_Image_Wall() {
        return "image\\Walls.jpg";
    }

    public String getAddress_Image_Trap() {
        return "image\\Trap.png";
    }

    public String getAddress_Image_Market() {
        return "image\\market.png";
    }

    public String getAddress_Image_Lost_Object() {
        return "image\\Lost_Object.jpg";
    }

    public String getAddress_Image_Treasure() {
        return "image\\Treasure.png";
    }

    public String getAddress_Image_Empty() {
        return "image\\Empty.jpg";
    }

    public String getAddress_Image_Castle() {
        return "image\\Castle.png";}

    int Dice = 0;



    private int Change_Dice = 0;

    public int getChange_Dice() {
        return Change_Dice;
    }

    public void setChange_Dice(int change_Dice) {
        Change_Dice = change_Dice;
    }

    private static final int BOARD_SIZE = 12;
    private static final int CELL_SIZE = 50;

    private final JPanel boardPanel ;


    JButton[][] cells;


    JFrame frame = new JFrame();

    public void SetHighlight(int Location, int paste[], Color c, int thickness) {
        int x = 0;
        if (Location==0)cells[1][0].setBorder(BorderFactory.createLineBorder(c, thickness));
        if ((Location % 11) != 1&&Location!=0) {
            for (int i = 0; i < 6; i++) {
                if (Location - 1 != paste[i]) {
                    x++;
                }
            }
            if (x == 6 && (Methods.Check_Wall(Location - 1) == false)) {
                cells[Methods.Row_Number(Location - 1)][Methods.Column_Number(Location - 1)].setBorder(BorderFactory.createLineBorder(c, thickness));
            }
        }
        x = 0;
        if ((Location % 11) != 0&&Location!=0) {
            for (int i = 0; i < 6; i++) {
                if (Location + 1 != paste[i]) {
                    x++;
                }
            }
            if (x == 6 && (Methods.Check_Wall(Location + 1) == false)) {
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
            if (x == 6 && (Methods.Check_Wall(Location - 11) == false)) {
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
            if (x == 6 && (Methods.Check_Wall(Location + 11) == false)) {
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







    Single_Player(){



        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setTitle("Traveling Salesman");
        frame.setBounds(0, 0, 1550, 830);

        boardPanel=new JPanel(new GridLayout(BOARD_SIZE,BOARD_SIZE)){
            protected void paintComponent(Graphics g){
                super.paintComponent(g);
                ImageIcon backgroundImage = new ImageIcon("image\\blue.png");
                g.drawImage(backgroundImage.getImage(),0,0,null);
            }
        };

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


                cells[i][j].setPreferredSize(new Dimension(CELL_SIZE, CELL_SIZE));
                if (i > 0) cells[i][j].setBorder(BorderFactory.createLineBorder(Color.BLACK, 2));
                if (i == 0) cells[i][j].setBorder(BorderFactory.createLineBorder(Color.white, 2));
                boardPanel.add(cells[i][j]);

            }
        }

        frame.add(boardPanel);
        cells[0][9].setIcon(new ImageIcon("D:\\Programming\\intellij\\Traveling_Salesman\\image\\music.jpg"));

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

        frame.setVisible(false);




        cells[0][0].setFocusPainted(false);





    }




}
