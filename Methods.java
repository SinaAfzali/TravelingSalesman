package classes;
import java.util.Random;
public class Methods {

    public static int CodeRand(int y) {
        Random Rand = new Random();
        int x = -1;
        switch (y) {
            case 11:
                x = Rand.nextInt(560) + 1010;
                return x;
            case 12:
                x = Rand.nextInt(560) + 1570;
                return x;
            case 21:
                x = Rand.nextInt(560) + 2130;
                return x;
            case 22:
                x = Rand.nextInt(560) + 2690;
                return x;
            case 31:
                x = Rand.nextInt(560) + 3250;
                return x;
            case 32:
                x = Rand.nextInt(560) + 3810;
                return x;
            case 41:
                x = Rand.nextInt(560) + 4370;
                return x;
            case 42:
                x = Rand.nextInt(560) + 4930;
                return x;
            case 51:
                x = Rand.nextInt(560) + 5490;
                return x;
            case 52:
                x = Rand.nextInt(560) + 6050;
                return x;
            case 61:
                x = Rand.nextInt(560) + 6610;
                return x;
            case 62:
                x = Rand.nextInt(560) + 7170;
                return x;
            case 71:
                x = Rand.nextInt(560) + 7730;
                return x;
            case 72:
                x = Rand.nextInt(560) + 8290;
                return x;
            case 81:
                x = Rand.nextInt(560) + 8850;
                return x;
            case 82:
                x = Rand.nextInt(560) + 9410;
                return x;
        }
        return x;
    }

    public static int Money_Rand1() {
        Random Money = new Random();
        int x = Money.nextInt(201) + 100;
        return x;
    }

    public static int Money_Rand2() {
        Random Money = new Random();
        int x = Money.nextInt(2001) + 1000;
        return x;
    }


    public static int DiceRand() {
        Random dice = new Random();
        int x = dice.nextInt(6) + 1;
        return x;
    }


    public static int Quest_Rand(){
        Random quest=new Random();
        int x=quest.nextInt(8)+1;
        return x;
    }


    public static int Cell_Rand1() {
        int x = 0;
        Random rand = new Random();
        while (true) {
            x = rand.nextInt(59) + 2;
            if (x == Value.getTreasure1_Diamond_Ring()) continue;
            else if (x == Value.getTreasure2_Jeweled_Sword()) continue;
            else if (x == Value.getTreasure3_Golden_Glass()) continue;
            else if (x == Value.getTreasure4_Glass_Cup()) continue;
            else if (x == Value.getLost_Object1()) continue;
            else if (x == Value.getLost_Object2()) continue;
            else if (x == Value.getLost_Object3()) continue;
            else if (x == Value.getLost_Object4()) continue;
            else if (x == Value.getLost_Object5()) continue;
            else if (x == Value.getLost_Object6()) continue;
            else if (x == Value.getLost_Object7()) continue;
            else if (x == Value.getLost_Object8()) continue;
            else if (x == Value.getMarket1()) continue;
            else if (x == Value.getMarket2()) continue;
            else if (x == Value.getMarket3()) continue;
            else if (x == Value.getTrap1()) continue;
            else if (x == Value.getTrap2()) continue;
            else if (x == Value.getTrap3()) continue;
            else if (x == Value.getWall1()) continue;
            else if (x == Value.getWall2()) continue;
            else if (x == Value.getWall3()) continue;
            else if (x == Value.getWall4()) continue;
            else break;
        }
        return x;
    }

    public static int Cell_Rand2() {
        int x = 0;
        Random rand = new Random();
        while (true) {
            x = rand.nextInt(60) + 62;
            if (x == Value.getTreasure5_Wooden_Bow()) continue;
            else if (x == Value.getTreasure6_Steel_Shield()) continue;
            else if (x == Value.getTreasure7_Golden_Key()) continue;
            else if (x == Value.getTreasure8_Dragon_Scroll()) continue;
            else if (x == Value.getLost_Object9()) continue;
            else if (x == Value.getLost_Object10()) continue;
            else if (x == Value.getLost_Object11()) continue;
            else if (x == Value.getLost_Object12()) continue;
            else if (x == Value.getLost_Object13()) continue;
            else if (x == Value.getLost_Object14()) continue;
            else if (x == Value.getLost_Object15()) continue;
            else if (x == Value.getLost_Object16()) continue;
            else if (x == Value.getMarket4()) continue;
            else if (x == Value.getMarket5()) continue;
            else if (x == Value.getMarket6()) continue;
            else if (x == Value.getTrap4()) continue;
            else if (x == Value.getTrap5()) continue;
            else if (x == Value.getTrap6()) continue;
            else if (x == Value.getWall5()) continue;
            else if (x == Value.getWall6()) continue;
            else if (x == Value.getWall7()) continue;
            else if (x == Value.getWall8()) continue;
            else break;
        }
        return x;
    }

    public static int Wall_Rand1() {
        int x = 0;
        Random rand = new Random();
        while (true) {
            x = rand.nextInt(59) + 2;
            if (x == Value.getTreasure1_Diamond_Ring()) continue;
            else if (x == Value.getTreasure2_Jeweled_Sword()) continue;
            else if (x == Value.getTreasure3_Golden_Glass()) continue;
            else if (x == Value.getTreasure4_Glass_Cup()) continue;
            else if (x == Value.getLost_Object1()) continue;
            else if (x == Value.getLost_Object2()) continue;
            else if (x == Value.getLost_Object3()) continue;
            else if (x == Value.getLost_Object4()) continue;
            else if (x == Value.getLost_Object5()) continue;
            else if (x == Value.getLost_Object6()) continue;
            else if (x == Value.getLost_Object7()) continue;
            else if (x == Value.getLost_Object8()) continue;
            else if (x == Value.getMarket1()) continue;
            else if (x == Value.getMarket2()) continue;
            else if (x == Value.getMarket3()) continue;
            else if (x == Value.getTrap1()) continue;
            else if (x == Value.getTrap2()) continue;
            else if (x == Value.getTrap3()) continue;
            else if (x == Value.getWall1()) continue;
            else if (x == Value.getWall2()) continue;
            else if (x == Value.getWall3()) continue;
            else if (x == Value.getWall4()) continue;
            else if (x == Value.getWall1() + 1) continue;
            else if (x == Value.getWall2() + 1) continue;
            else if (x == Value.getWall3() + 1) continue;
            else if (x == Value.getWall4() + 1) continue;
            else if (x == Value.getWall1() - 1) continue;
            else if (x == Value.getWall2() - 1) continue;
            else if (x == Value.getWall3() - 1) continue;
            else if (x == Value.getWall4() - 1) continue;
            else if (x == Value.getWall1() + 11) continue;
            else if (x == Value.getWall2() + 11) continue;
            else if (x == Value.getWall3() + 11) continue;
            else if (x == Value.getWall4() + 11) continue;
            else if (x == Value.getWall1() - 11) continue;
            else if (x == Value.getWall2() - 11) continue;
            else if (x == Value.getWall3() - 11) continue;
            else if (x == Value.getWall4() - 11) continue;
            else if (x == Value.getWall1() + 10) continue;
            else if (x == Value.getWall2() + 10) continue;
            else if (x == Value.getWall3() + 10) continue;
            else if (x == Value.getWall4() + 10) continue;
            else if (x == Value.getWall1() - 10) continue;
            else if (x == Value.getWall2() - 10) continue;
            else if (x == Value.getWall3() - 10) continue;
            else if (x == Value.getWall4() - 10) continue;
            else if (x == Value.getWall1() + 12) continue;
            else if (x == Value.getWall2() + 12) continue;
            else if (x == Value.getWall3() + 12) continue;
            else if (x == Value.getWall4() + 12) continue;
            else if (x == Value.getWall1() - 12) continue;
            else if (x == Value.getWall2() - 12) continue;
            else if (x == Value.getWall3() - 12) continue;
            else if (x == Value.getWall4() - 12) continue;
            else break;
        }
        return x;
    }


    public static int Wall_Rand2() {
        int x = 0;
        Random rand = new Random();
        while (true) {
            x = rand.nextInt(60) + 62;
            if (x == Value.getTreasure5_Wooden_Bow()) continue;
            else if (x == Value.getTreasure6_Steel_Shield()) continue;
            else if (x == Value.getTreasure7_Golden_Key()) continue;
            else if (x == Value.getTreasure8_Dragon_Scroll()) continue;
            else if (x == Value.getLost_Object9()) continue;
            else if (x == Value.getLost_Object10()) continue;
            else if (x == Value.getLost_Object11()) continue;
            else if (x == Value.getLost_Object12()) continue;
            else if (x == Value.getLost_Object13()) continue;
            else if (x == Value.getLost_Object14()) continue;
            else if (x == Value.getLost_Object15()) continue;
            else if (x == Value.getLost_Object16()) continue;
            else if (x == Value.getMarket4()) continue;
            else if (x == Value.getMarket5()) continue;
            else if (x == Value.getMarket6()) continue;
            else if (x == Value.getTrap4()) continue;
            else if (x == Value.getTrap5()) continue;
            else if (x == Value.getTrap6()) continue;
            else if (x == Value.getWall5()) continue;
            else if (x == Value.getWall6()) continue;
            else if (x == Value.getWall7()) continue;
            else if (x == Value.getWall8()) continue;
            else if (x == Value.getWall5() + 1) continue;
            else if (x == Value.getWall6() + 1) continue;
            else if (x == Value.getWall7() + 1) continue;
            else if (x == Value.getWall8() + 1) continue;
            else if (x == Value.getWall5() - 1) continue;
            else if (x == Value.getWall6() - 1) continue;
            else if (x == Value.getWall7() - 1) continue;
            else if (x == Value.getWall8() - 1) continue;
            else if (x == Value.getWall5() + 11) continue;
            else if (x == Value.getWall6() + 11) continue;
            else if (x == Value.getWall7() + 11) continue;
            else if (x == Value.getWall8() + 11) continue;
            else if (x == Value.getWall5() - 11) continue;
            else if (x == Value.getWall6() - 11) continue;
            else if (x == Value.getWall7() - 11) continue;
            else if (x == Value.getWall8() - 11) continue;
            else if (x == Value.getWall5() + 10) continue;
            else if (x == Value.getWall6() + 10) continue;
            else if (x == Value.getWall7() + 10) continue;
            else if (x == Value.getWall8() + 10) continue;
            else if (x == Value.getWall5() - 10) continue;
            else if (x == Value.getWall6() - 10) continue;
            else if (x == Value.getWall7() - 10) continue;
            else if (x == Value.getWall8() - 10) continue;
            else if (x == Value.getWall5() + 12) continue;
            else if (x == Value.getWall6() + 12) continue;
            else if (x == Value.getWall7() + 12) continue;
            else if (x == Value.getWall8() + 12) continue;
            else if (x == Value.getWall5() - 12) continue;
            else if (x == Value.getWall6() - 12) continue;
            else if (x == Value.getWall7() - 12) continue;
            else if (x == Value.getWall8() - 12) continue;
            else break;
        }
        return x;
    }


    public static boolean Permission_To_Move(int Current_Location, int Target_Location) {
        int x = Target_Location - Current_Location;
        if (x < 0) x = -x;
        if (x == 1 || x == 11) return true;
        return false;
    }

    public static int Row_Number(int Location) {
        int x = Location / 11;
        if (Location == 0) return 0;
        switch (Location) {
            case 11:
                return 1;
            case 22:
                return 2;
            case 33:
                return 3;
            case 44:
                return 4;
            case 55:
                return 5;
            case 66:
                return 6;
            case 77:
                return 7;
            case 88:
                return 8;
            case 99:
                return 9;
            case 110:
                return 10;
            case 121:
                return 11;
        }
        switch (x) {
            case 0:
                return 1;
            case 1:
                return 2;
            case 2:
                return 3;
            case 3:
                return 4;
            case 4:
                return 5;
            case 5:
                return 6;
            case 6:
                return 7;
            case 7:
                return 8;
            case 8:
                return 9;
            case 9:
                return 10;
            case 10:
                return 11;
        }
        return 0;
    }

    public static int Column_Number(int Location) {
        if (Location == 0) return 0;
        int mod = (Location % 11);
        switch (mod) {
            case 1:
                return 0;
            case 2:
                return 1;
            case 3:
                return 2;
            case 4:
                return 3;
            case 5:
                return 4;
            case 6:
                return 5;
            case 7:
                return 6;
            case 8:
                return 7;
            case 9:
                return 8;
            case 10:
                return 9;
            case 0:
                return 10;
        }
        return 0;
    }

    public static boolean Check_Wall(int Location) {
        if (Location == Value.getWall1() || Location == Value.getWall2()
                || Location == Value.getWall3() || Location == Value.getWall4()
                || Location == Value.getWall5() || Location == Value.getWall6()
                || Location == Value.getWall7() || Location == Value.getWall8()) return true;
        else return false;
    }

    public static int Check_Treasure(int Location) {
        if (Location == Value.getTreasure1_Diamond_Ring()) return 1;
        else if (Location == Value.getTreasure2_Jeweled_Sword()) return 2;
        else if (Location == Value.getTreasure3_Golden_Glass()) return 3;
        else if (Location == Value.getTreasure4_Glass_Cup()) return 4;
        else if (Location == Value.getTreasure5_Wooden_Bow()) return 5;
        else if (Location == Value.getTreasure6_Steel_Shield()) return 6;
        else if (Location == Value.getTreasure7_Golden_Key()) return 7;
        else if (Location == Value.getTreasure8_Dragon_Scroll()) return 8;
        else return 0;
    }

    public static boolean Check_Market(int Location) {
        if (Location == Value.getMarket1() || Location == Value.getMarket2()
                || Location == Value.getMarket3() || Location == Value.getMarket4()
                || Location == Value.getMarket5() || Location == Value.getMarket6()) return true;
        else return false;
    }

    public static boolean Check_Trap(int Location) {
        if (Location == Value.getTrap1() || Location == Value.getTrap2()
                || Location == Value.getTrap3() || Location == Value.getTrap4()
                || Location == Value.getTrap5() || Location == Value.getTrap6()) return true;
        else return false;
    }

    public static boolean Check_Lost_Object(int Location) {
        if (Location == Value.getLost_Object1() || Location == Value.getLost_Object2()
                || Location == Value.getLost_Object3() || Location == Value.getLost_Object4()
                || Location == Value.getLost_Object5() || Location == Value.getLost_Object6()
                || Location == Value.getLost_Object7() || Location == Value.getLost_Object8()
                || Location == Value.getLost_Object9() || Location == Value.getLost_Object10()
                || Location == Value.getLost_Object11() || Location == Value.getLost_Object12()
                || Location == Value.getLost_Object13() || Location == Value.getLost_Object14()
                || Location == Value.getLost_Object15() || Location == Value.getLost_Object16()) return true;
        else return false;
    }

    public static int Find_Object(int Location) {
        if (Location == Value.getLost_Object1() && Value.isObject1()) return 1;
        else if (Location == Value.getLost_Object2() && Value.isObject2()) return 2;
        else if (Location == Value.getLost_Object3() && Value.isObject3()) return 3;
        else if (Location == Value.getLost_Object4() && Value.isObject4()) return 4;
        else if (Location == Value.getLost_Object5() && Value.isObject5()) return 5;
        else if (Location == Value.getLost_Object6() && Value.isObject6()) return 6;
        else if (Location == Value.getLost_Object7() && Value.isObject7()) return 7;
        else if (Location == Value.getLost_Object8() && Value.isObject8()) return 8;
        else if (Location == Value.getLost_Object9() && Value.isObject9()) return 9;
        else if (Location == Value.getLost_Object10() && Value.isObject10()) return 10;
        else if (Location == Value.getLost_Object11() && Value.isObject11()) return 11;
        else if (Location == Value.getLost_Object12() && Value.isObject12()) return 12;
        else if (Location == Value.getLost_Object13() && Value.isObject13()) return 13;
        else if (Location == Value.getLost_Object14() && Value.isObject14()) return 14;
        else if (Location == Value.getLost_Object15() && Value.isObject15()) return 15;
        else if (Location == Value.getLost_Object16() && Value.isObject16()) return 16;
        else return 0;
    }


    public static String Change_Music() {
        Random rand = new Random();
        int rand_music = rand.nextInt(10) + 1;
        switch (rand_music) {
            case 1:
                return "music\\1.mp3";
            case 2:
                return "music\\2.mp3";
            case 3:
                return "music\\3.mp3";
            case 4:
                return "music\\4.mp3";
            case 5:
                return "music\\5.mp3";
            case 6:
                return "music\\6.mp3";
            case 7:
                return "music\\7.mp3";
            case 8:
                return "music\\8.mp3";
            case 9:
                return "music\\9.mp3";
            case 10:
                return "music\\10.mp3";
        }
        return "";
    }

    public static int point(int location,int status,int[]paste,int[]paste2,int[]Treasure) {
        int point = 0;
        for (int i = 0; i < 7; i++) {
            if (location == paste[i]) point -= 10000;
        }
        for (int i=0;i<121;i++){
            if (location==paste2[i])point-=2000;
        }
        if (location==Value.getTrap1()||location==Value.getTrap2()||
        location==Value.getTrap3()||location==Value.getTrap4()||
        location==Value.getTrap5()||location==Value.getTrap6())point-=3500;

        if (location==Value.getWall1())point-=10000;
        if (location==Value.getWall2())point-=10000;
        if (location==Value.getWall3())point-=10000;
        if (location==Value.getWall4())point-=10000;
        if (location==Value.getWall5())point-=10000;
        if (location==Value.getWall6())point-=10000;
        if (location==Value.getWall7())point-=10000;
        if (location==Value.getWall8())point-=10000;


        if (location%11==1&&status==1)point-=10000;
        if (location%11==0&&status==2)point-=10000;
        if (location<1&&status==3)point-=10000;
        if (location>121&&status==4)point-=10000;


        int middle=61-location;
        if (middle<0)middle*=-1;

        for (int i=0;i<8;i++){
            if (Treasure[i]!=0){
                point+=((121-middle)*50);break;
            }
        }




        return point;
    }

    public static int Target_Single_Player(int location,int[]paste,int[]paste2,int[]Treasure) {
        int right = location + 1;
        int left=location-1;
        int top=location-11;
        int button=location+11;
        int point_right=point(right,1,paste,paste2,Treasure);
        int point_left=point(left,2,paste,paste2,Treasure);
        int point_top=point(top,3,paste,paste2,Treasure);
        int point_button=point(button,4,paste,paste2,Treasure);

        if (point_right>=point_left&&point_right>=point_top&&point_right>=point_button)return 1;
        if (point_left>=point_right&&point_left>=point_top&&point_left>=point_button)return 2;
        if (point_top>=point_right&&point_top>=point_left&&point_top>=point_button)return 3;
        if (point_button>=point_right&&point_button>=point_left&&point_button>=point_top)return 4;
        return 0;
    }
}