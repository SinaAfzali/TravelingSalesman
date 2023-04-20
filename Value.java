package classes;

 class Value {

     public static boolean Start=false;
     private static int player = 6;

     private static int number_player=1;

     public static void setNumber_player(int number_player) {
         Value.number_player = number_player;
     }

     public static int getNumber_player() {
         return number_player;
     }

     public static int getPlayer() {
         return player;
     }

     public static void setPlayer(int player) {
         Value.player = player;
     }


     private static long Money_Player1 = 1000;

     public static long getMoney_Player1() {
         return Money_Player1;
     }

     public static void setMoney_Player1(long money_Player1) {
         Money_Player1 = money_Player1;
     }

     private static long  Money_Player2 = 1000;

     public static long getMoney_Player2() {
         return Money_Player2;
     }

     public static void setMoney_Player2(long money_Player2) {
         Money_Player2 = money_Player2;
     }

     private static long Money_Player3 = 1000;

     public static long getMoney_Player3() {
         return Money_Player3;
     }

     public static void setMoney_Player3(long money_Player3) {
         Money_Player3 = money_Player3;
     }

     private static long  Money_Player4 = 1000;

     public static long getMoney_Player4() {
         return Money_Player4;
     }

     public static void setMoney_Player4(long money_Player4) {
         Money_Player4 = money_Player4;
     }


     private static long Power_Player1 = 0;

     public static long getPower_Player1() {
         return Power_Player1;
     }

     public static void setPower_Player1(long power_Player1) {
         Power_Player1 = power_Player1;
     }

     private static long  Power_Player2 = 0;

     public static long  getPower_Player2() {
         return Power_Player2;
     }

     public static void setPower_Player2(long power_Player2) {
         Power_Player2 = power_Player2;
     }


     private static long Power_Player3 = 0;

     public static long getPower_Player3() {
         return Power_Player3;
     }

     public static void setPower_Player3(long power_Player3) {
         Power_Player1 = power_Player3;
     }

     private static long  Power_Player4 = 0;

     public static long  getPower_Player4() {
         return Power_Player4;
     }

     public static void setPower_Player4(long power_Player4) {
         Power_Player4 = power_Player4;
     }



     //Treasure
     private final static int Treasure1_Diamond_Ring = Methods.Cell_Rand1();// انگشتر الماس

     private final static int Treasure2_Jeweled_Sword = Methods.Cell_Rand1();// شمشیر جواهر نشان

     private final static int Treasure3_Golden_Glass = Methods.Cell_Rand1();// لیوان طلایی

     private final static int Treasure4_Glass_Cup = Methods.Cell_Rand1();// جام شیشه ای

     private final static int Treasure5_Wooden_Bow = Methods.Cell_Rand2();// کمان چوبی

     private final static int Treasure6_Steel_Shield = Methods.Cell_Rand2();// سپر پولادین

     private final static int Treasure7_Golden_Key = Methods.Cell_Rand2();// کلید زرین

     private final static int Treasure8_Dragon_Scroll = Methods.Cell_Rand2();// طومار اژدها




     public static int getTreasure1_Diamond_Ring() {
         return Treasure1_Diamond_Ring;
     }

     public static int getTreasure2_Jeweled_Sword() {
         return Treasure2_Jeweled_Sword;
     }

     public static int getTreasure3_Golden_Glass() {
         return Treasure3_Golden_Glass;
     }

     public static int getTreasure4_Glass_Cup() {
         return Treasure4_Glass_Cup;
     }

     public static int getTreasure5_Wooden_Bow() {
         return Treasure5_Wooden_Bow;
     }

     public static int getTreasure6_Steel_Shield() {
         return Treasure6_Steel_Shield;
     }

     public static int getTreasure7_Golden_Key() {
         return Treasure7_Golden_Key;
     }

     public static int getTreasure8_Dragon_Scroll() {
         return Treasure8_Dragon_Scroll;
     }



     private static boolean Treasure1_Diamond_Ring_Status = true;

     public static boolean isTreasure1_Diamond_Ring_Status() {
         return Treasure1_Diamond_Ring_Status;
     }

     public static void setTreasure1_Diamond_Ring_Status(boolean treasure1_Diamond_Ring_Status) {
         Treasure1_Diamond_Ring_Status = treasure1_Diamond_Ring_Status;
     }

     private static boolean Treasure2_Jeweled_Sword_Status = true;

     public static boolean isTreasure2_Jeweled_Sword_Status() {
         return Treasure2_Jeweled_Sword_Status;
     }

     public static void setTreasure2_Jeweled_Sword_Status(boolean treasure2_Jeweled_Sword_Status) {
         Treasure2_Jeweled_Sword_Status = treasure2_Jeweled_Sword_Status;
     }

     private static boolean Treasure3_Golden_Glass_Status = true;

     public static boolean isTreasure3_Golden_Glass_Status() {
         return Treasure3_Golden_Glass_Status;
     }

     public static void setTreasure3_Golden_Glass_Status(boolean treasure3_Golden_Glass_Status) {
         Treasure3_Golden_Glass_Status = treasure3_Golden_Glass_Status;
     }

     private static boolean Treasure4_Glass_Cup_Status = true;

     public static boolean isTreasure4_Glass_Cup_Status() {
         return Treasure4_Glass_Cup_Status;
     }

     public static void setTreasure4_Glass_Cup_Status(boolean treasure4_Glass_Cup_Status) {
         Treasure4_Glass_Cup_Status = treasure4_Glass_Cup_Status;
     }

     private static boolean Treasure5_Wooden_Bow_Status = true;

     public static boolean isTreasure5_Wooden_Bow_Status() {
         return Treasure5_Wooden_Bow_Status;
     }

     public static void setTreasure5_Wooden_Bow_Status(boolean treasure5_Wooden_Bow_Status) {
         Treasure5_Wooden_Bow_Status = treasure5_Wooden_Bow_Status;
     }

     private static boolean Treasure6_Steel_Shield_Status = true;

     public static boolean isTreasure6_Steel_Shield_Status() {
         return Treasure6_Steel_Shield_Status;
     }

     public static void setTreasure6_Steel_Shield_Status(boolean treasure6_Steel_Shield_Status) {
         Treasure6_Steel_Shield_Status = treasure6_Steel_Shield_Status;
     }

     private static boolean Treasure7_Golden_Key_Status = true;

     public static boolean isTreasure7_Golden_Key_Status() {
         return Treasure7_Golden_Key_Status;
     }

     public static void setTreasure7_Golden_Key_Status(boolean treasure7_Golden_Key_Status) {
         Treasure7_Golden_Key_Status = treasure7_Golden_Key_Status;
     }

     private static boolean Treasure8_Dragon_Scroll_Status = true;

     public static boolean isTreasure8_Dragon_Scroll_Status() {
         return Treasure8_Dragon_Scroll_Status;
     }

     public static void setTreasure8_Dragon_Scroll_Status(boolean treasure8_Dragon_Scroll_Status) {
         Treasure8_Dragon_Scroll_Status = treasure8_Dragon_Scroll_Status;
     }




     //Market & Trap & Wall

     private final static int Market1 = Methods.Cell_Rand1();

     private final static int Market2 = Methods.Cell_Rand1();

     private final static int Market3 = Methods.Cell_Rand1();

     private final static int Market4 = Methods.Cell_Rand2();

     private final static int Market5 = Methods.Cell_Rand2();

     private final static int Market6 = Methods.Cell_Rand2();


     private final static int Trap1 = Methods.Cell_Rand1();

     private final static int Trap2 = Methods.Cell_Rand1();

     private final static int Trap3 = Methods.Cell_Rand1();

     private final static int Trap4 = Methods.Cell_Rand2();

     private final static int Trap5 = Methods.Cell_Rand2();

     private final static int Trap6 = Methods.Cell_Rand2();


     private final static int Wall1 = Methods.Wall_Rand1();

     private final static int Wall2 = Methods.Wall_Rand1();

     private final static int Wall3 = Methods.Wall_Rand1();

     private final static int Wall4 = Methods.Wall_Rand1();

     private final static int Wall5 = Methods.Wall_Rand2();

     private final static int Wall6 = Methods.Wall_Rand2();

     private final static int Wall7 = Methods.Wall_Rand2();

     private final static int Wall8 = Methods.Wall_Rand2();


     public static int getMarket1() {
         return Market1;
     }

     public static int getMarket2() {
         return Market2;
     }

     public static int getMarket3() {
         return Market3;
     }

     public static int getMarket4() {
         return Market4;
     }

     public static int getMarket5() {
         return Market5;
     }

     public static int getMarket6() {
         return Market6;
     }


     public static int getTrap1() {
         return Trap1;
     }

     public static int getTrap2() {
         return Trap2;
     }

     public static int getTrap3() {
         return Trap3;
     }

     public static int getTrap4() {
         return Trap4;
     }

     public static int getTrap5() {
         return Trap5;
     }

     public static int getTrap6() {
         return Trap6;
     }


     public static int getWall1() {
         return Wall1;
     }

     public static int getWall2() {
         return Wall2;
     }

     public static int getWall3() {
         return Wall3;
     }

     public static int getWall4() {
         return Wall4;
     }

     public static int getWall5() {
         return Wall5;
     }

     public static int getWall6() {
         return Wall6;
     }

     public static int getWall7() {
         return Wall7;
     }

     public static int getWall8() {
         return Wall8;
     }

     //Treasure code
     private final static int Treasure1_Diamond_Ring_Code_Player1 = Methods.CodeRand(11);
     private final static int Treasure1_Diamond_Ring_Code_Player2 = Methods.CodeRand(12);
     private final static int Treasure1_Diamond_Ring_Code_Player3 = Methods.CodeRand(11);
     private final static int Treasure1_Diamond_Ring_Code_Player4 = Methods.CodeRand(12);

     private final static int Treasure2_Jeweled_Sword_Code_Player1 = Methods.CodeRand(21);
     private final static int Treasure2_Jeweled_Sword_Code_Player2 = Methods.CodeRand(22);
     private final static int Treasure2_Jeweled_Sword_Code_Player3 = Methods.CodeRand(21);
     private final static int Treasure2_Jeweled_Sword_Code_Player4 = Methods.CodeRand(22);

     private final static int Treasure3_Golden_Glass_Code_Player1 = Methods.CodeRand(31);
     private final static int Treasure3_Golden_Glass_Code_Player2 = Methods.CodeRand(32);
     private final static int Treasure3_Golden_Glass_Code_Player3 = Methods.CodeRand(31);
     private final static int Treasure3_Golden_Glass_Code_Player4 = Methods.CodeRand(32);

     private final static int Treasure4_Glass_Cup_Code_Player1 = Methods.CodeRand(41);
     private final static int Treasure4_Glass_Cup_Code_Player2 = Methods.CodeRand(42);
     private final static int Treasure4_Glass_Cup_Code_Player3 = Methods.CodeRand(41);
     private final static int Treasure4_Glass_Cup_Code_Player4 = Methods.CodeRand(42);

     private final static int Treasure5_Wooden_Bow_Code_Player1 = Methods.CodeRand(51);
     private final static int Treasure5_Wooden_Bow_Code_Player2 = Methods.CodeRand(52);
     private final static int Treasure5_Wooden_Bow_Code_Player3 = Methods.CodeRand(51);
     private final static int Treasure5_Wooden_Bow_Code_Player4 = Methods.CodeRand(52);

     private final static int Treasure6_Steel_Shield_Code_Player1 = Methods.CodeRand(61);
     private final static int Treasure6_Steel_Shield_Code_Player2 = Methods.CodeRand(62);
     private final static int Treasure6_Steel_Shield_Code_Player3 = Methods.CodeRand(61);
     private final static int Treasure6_Steel_Shield_Code_Player4 = Methods.CodeRand(62);

     private final static int Treasure7_Golden_Key_Code_Player1 = Methods.CodeRand(71);
     private final static int Treasure7_Golden_Key_Code_Player2 = Methods.CodeRand(72);
     private final static int Treasure7_Golden_Key_Code_Player3 = Methods.CodeRand(71);
     private final static int Treasure7_Golden_Key_Code_Player4 = Methods.CodeRand(72);

     private final static int Treasure8_Dragon_Scroll_Code_Player1 = Methods.CodeRand(81);
     private final static int Treasure8_Dragon_Scroll_Code_Player2 = Methods.CodeRand(82);
     private final static int Treasure8_Dragon_Scroll_Code_Player3 = Methods.CodeRand(81);
     private final static int Treasure8_Dragon_Scroll_Code_Player4 = Methods.CodeRand(82);

     public static int getTreasure1_Diamond_Ring_Code_Player1() {
         return Treasure1_Diamond_Ring_Code_Player1;
     }

     public static int getTreasure1_Diamond_Ring_Code_Player2() {
         return Treasure1_Diamond_Ring_Code_Player2;
     }

     public static int getTreasure1_Diamond_Ring_Code_Player3() {
         return Treasure1_Diamond_Ring_Code_Player3;
     }

     public static int getTreasure1_Diamond_Ring_Code_Player4() {
         return Treasure1_Diamond_Ring_Code_Player4;
     }

     public static int getTreasure2_Jeweled_Sword_Code_Player1() {
         return Treasure2_Jeweled_Sword_Code_Player1;
     }

     public static int getTreasure2_Jeweled_Sword_Code_Player2() {
         return Treasure2_Jeweled_Sword_Code_Player2;
     }

     public static int getTreasure2_Jeweled_Sword_Code_Player3() {
         return Treasure2_Jeweled_Sword_Code_Player3;
     }

     public static int getTreasure2_Jeweled_Sword_Code_Player4() {
         return Treasure2_Jeweled_Sword_Code_Player4;
     }

     public static int getTreasure3_Golden_Glass_Code_Player1() {
         return Treasure3_Golden_Glass_Code_Player1;
     }

     public static int getTreasure3_Golden_Glass_Code_Player2() {
         return Treasure3_Golden_Glass_Code_Player2;
     }

     public static int getTreasure3_Golden_Glass_Code_Player3() {
         return Treasure3_Golden_Glass_Code_Player3;
     }

     public static int getTreasure3_Golden_Glass_Code_Player4() {
         return Treasure3_Golden_Glass_Code_Player4;
     }

     public static int getTreasure4_Glass_Cup_Code_Player1() {
         return Treasure4_Glass_Cup_Code_Player1;
     }

     public static int getTreasure4_Glass_Cup_Code_Player2() {
         return Treasure4_Glass_Cup_Code_Player2;
     }

     public static int getTreasure4_Glass_Cup_Code_Player3() {
         return Treasure4_Glass_Cup_Code_Player3;
     }

     public static int getTreasure4_Glass_Cup_Code_Player4() {
         return Treasure4_Glass_Cup_Code_Player4;
     }

     public static int getTreasure5_Wooden_Bow_Code_Player1() {
         return Treasure5_Wooden_Bow_Code_Player1;
     }

     public static int getTreasure5_Wooden_Bow_Code_Player2() {
         return Treasure5_Wooden_Bow_Code_Player2;
     }

     public static int getTreasure5_Wooden_Bow_Code_Player3() {
         return Treasure5_Wooden_Bow_Code_Player3;
     }

     public static int getTreasure5_Wooden_Bow_Code_Player4() {
         return Treasure5_Wooden_Bow_Code_Player4;
     }

     public static int getTreasure6_Steel_Shield_Code_Player1() {
         return Treasure6_Steel_Shield_Code_Player1;
     }

     public static int getTreasure6_Steel_Shield_Code_Player2() {
         return Treasure6_Steel_Shield_Code_Player2;
     }

     public static int getTreasure6_Steel_Shield_Code_Player3() {
         return Treasure6_Steel_Shield_Code_Player3;
     }

     public static int getTreasure6_Steel_Shield_Code_Player4() {
         return Treasure6_Steel_Shield_Code_Player4;
     }

     public static int getTreasure7_Golden_Key_Code_Player1() {
         return Treasure7_Golden_Key_Code_Player1;
     }

     public static int getTreasure7_Golden_Key_Code_Player2() {
         return Treasure7_Golden_Key_Code_Player2;
     }

     public static int getTreasure7_Golden_Key_Code_Player3() {
         return Treasure7_Golden_Key_Code_Player3;
     }

     public static int getTreasure7_Golden_Key_Code_Player4() {
         return Treasure7_Golden_Key_Code_Player4;
     }

     public static int getTreasure8_Dragon_Scroll_Code_Player1() {
         return Treasure8_Dragon_Scroll_Code_Player1;
     }

     public static int getTreasure8_Dragon_Scroll_Code_Player2() {
         return Treasure8_Dragon_Scroll_Code_Player2;
     }

     public static int getTreasure8_Dragon_Scroll_Code_Player3() {
         return Treasure8_Dragon_Scroll_Code_Player3;
     }

     public static int getTreasure8_Dragon_Scroll_Code_Player4() {
         return Treasure8_Dragon_Scroll_Code_Player4;
     }

     //Object
     private final static int Lost_Object1 = Methods.Cell_Rand1();

     private final static int Lost_Object2 = Methods.Cell_Rand1();

     private final static int Lost_Object3 = Methods.Cell_Rand1();

     private final static int Lost_Object4 = Methods.Cell_Rand1();

     private final static int Lost_Object5 = Methods.Cell_Rand1();

     private final static int Lost_Object6 = Methods.Cell_Rand1();

     private final static int Lost_Object7 = Methods.Cell_Rand1();

     private final static int Lost_Object8 = Methods.Cell_Rand1();

     private final static int Lost_Object9 = Methods.Cell_Rand2();

     private final static int Lost_Object10 = Methods.Cell_Rand2();

     private final static int Lost_Object11 = Methods.Cell_Rand2();

     private final static int Lost_Object12 = Methods.Cell_Rand2();

     private final static int Lost_Object13 = Methods.Cell_Rand2();

     private final static int Lost_Object14 = Methods.Cell_Rand2();

     private final static int Lost_Object15 = Methods.Cell_Rand2();

     private final static int Lost_Object16 = Methods.Cell_Rand2();


     public static int getLost_Object1() {
         return Lost_Object1;
     }

     public static int getLost_Object2() {
         return Lost_Object2;
     }

     public static int getLost_Object3() {
         return Lost_Object3;
     }

     public static int getLost_Object4() {
         return Lost_Object4;
     }

     public static int getLost_Object5() {
         return Lost_Object5;
     }

     public static int getLost_Object6() {
         return Lost_Object6;
     }

     public static int getLost_Object7() {
         return Lost_Object7;
     }

     public static int getLost_Object8() {
         return Lost_Object8;
     }

     public static int getLost_Object9() {
         return Lost_Object9;
     }

     public static int getLost_Object10() {
         return Lost_Object10;
     }

     public static int getLost_Object11() {
         return Lost_Object11;
     }

     public static int getLost_Object12() {
         return Lost_Object12;
     }

     public static int getLost_Object13() {
         return Lost_Object13;
     }

     public static int getLost_Object14() {return Lost_Object14;}

     public static int getLost_Object15() {return Lost_Object15;}

     public static int getLost_Object16() {return Lost_Object16;}

     private static boolean Object1 = true;
     private static boolean Object2 = true;
     private static boolean Object3 = true;
     private static boolean Object4 = true;
     private static boolean Object5 = true;
     private static boolean Object6 = true;
     private static boolean Object7 = true;
     private static boolean Object8 = true;
     private static boolean Object9 = true;
     private static boolean Object10 = true;
     private static boolean Object11 = true;
     private static boolean Object12 = true;
     private static boolean Object13 = true;
     private static boolean Object14 = true;
     private static boolean Object15 = true;
     private static boolean Object16 = true;

     public static void setObject1(boolean object1) {
         Object1 = object1;
     }

     public static void setObject2(boolean object2) {
         Object2 = object2;
     }

     public static void setObject3(boolean object3) {
         Object3 = object3;
     }

     public static void setObject4(boolean object4) {
         Object4 = object4;
     }

     public static void setObject5(boolean object5) {
         Object5 = object5;
     }

     public static void setObject6(boolean object6) {
         Object6 = object6;
     }

     public static void setObject7(boolean object7) {
         Object7 = object7;
     }

     public static void setObject8(boolean object8) {
         Object8 = object8;
     }

     public static void setObject9(boolean object9) {
         Object9 = object9;
     }

     public static void setObject10(boolean object10) {
         Object10 = object10;
     }

     public static void setObject11(boolean object11) {
         Object11 = object11;
     }

     public static void setObject12(boolean object12) {
         Object12 = object12;
     }

     public static void setObject13(boolean object13) {
         Object13 = object13;
     }

     public static void setObject14(boolean object14) {
         Object14 = object14;
     }

     public static void setObject15(boolean object15) {
         Object15 = object15;
     }

     public static void setObject16(boolean object16) {
         Object16 = object16;
     }

     public static boolean isObject1() {
         return Object1;
     }

     public static boolean isObject2() {
         return Object2;
     }

     public static boolean isObject3() {
         return Object3;
     }

     public static boolean isObject4() {
         return Object4;
     }

     public static boolean isObject5() {
         return Object5;
     }

     public static boolean isObject6() {
         return Object6;
     }

     public static boolean isObject7() {
         return Object7;
     }

     public static boolean isObject8() {
         return Object8;
     }

     public static boolean isObject9() {
         return Object9;
     }

     public static boolean isObject10() {
         return Object10;
     }

     public static boolean isObject11() {
         return Object11;
     }

     public static boolean isObject12() {
         return Object12;
     }

     public static boolean isObject13() {
         return Object13;
     }

     public static boolean isObject14() {
         return Object14;
     }

     public static boolean isObject15() {
         return Object15;
     }

     public static boolean isObject16() {
         return Object16;
     }
 }
