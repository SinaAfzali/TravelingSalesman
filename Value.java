package classes;

 class Value {


     private  static int Market1 = 3;

     private  static int Market2 = 28;

     private  static int Market3 = 53;

     private  static int Market4 = 69;

     private  static int Market5 = 94;

     private  static int Market6 = 119;






     private static boolean save=false;

     public static void setSave(boolean save) {
         Value.save = save;
     }

     public static boolean isSave() {
         return save;
     }

     private static boolean load=false;

     public static void setLoad(boolean load) {
         Value.load = load;
     }

     public static boolean isLoad() {
         return load;
     }

     private static int character=1;

     public static void setCharacter(int character) {
         Value.character = character;
     }

     public static int getCharacter() {
         return character;
     }

     public static boolean Start=false;
     private static int player = 6;

     static int quest=0;

     static boolean viewQuest=false;

     static boolean change_Quest=false;

     static int win_Fight=0;
     private static int number_player=1;



     private static int shield_player1=0;
     private static int shield_player2=0;
     private static int shield_player3=0;
     private static int shield_player4=0;



     private static int sword_player1=0;
     private static int sword_player2=0;
     private static int sword_player3=0;
     private static int sword_player4=0;



     private static int armor_player1=0;
     private static int armor_player2=0;
     private static int armor_player3=0;
     private static int armor_player4=0;


     private static int food_player1=0;
     private static int food_player2=0;
     private static int food_player3=0;
     private static int food_player4=0;



     private static int potion_player1=0;
     private static int potion_player2=0;
     private static int potion_player3=0;
     private static int potion_player4=0;



     private static int book_player1=0;
     private static int book_player2=0;
     private static int book_player3=0;
     private static int book_player4=0;



     private static int bow_player1=0;
     private static int bow_player2=0;
     private static int bow_player3=0;
     private static int bow_player4=0;

     public static void setArmor_player1(int armor_player1) {
         Value.armor_player1 = armor_player1;
     }

     public static void setArmor_player2(int armor_player2) {
         Value.armor_player2 = armor_player2;
     }

     public static void setArmor_player3(int armor_player3) {
         Value.armor_player3 = armor_player3;
     }

     public static void setArmor_player4(int armor_player4) {
         Value.armor_player4 = armor_player4;
     }

     public static void setBook_player1(int book_player1) {
         Value.book_player1 = book_player1;
     }

     public static void setBook_player2(int book_player2) {
         Value.book_player2 = book_player2;
     }

     public static void setBook_player3(int book_player3) {
         Value.book_player3 = book_player3;
     }

     public static void setBook_player4(int book_player4) {
         Value.book_player4 = book_player4;
     }

     public static void setBow_player1(int bow_player1) {
         Value.bow_player1 = bow_player1;
     }

     public static void setBow_player2(int bow_player2) {
         Value.bow_player2 = bow_player2;
     }

     public static void setBow_player3(int bow_player3) {
         Value.bow_player3 = bow_player3;
     }

     public static void setBow_player4(int bow_player4) {
         Value.bow_player4 = bow_player4;
     }

     public static void setFood_player1(int food_player1) {
         Value.food_player1 = food_player1;
     }

     public static void setFood_player2(int food_player2) {
         Value.food_player2 = food_player2;
     }

     public static void setFood_player3(int food_player3) {
         Value.food_player3 = food_player3;
     }

     public static void setFood_player4(int food_player4) {
         Value.food_player4 = food_player4;
     }

     public static void setPotion_player1(int potion_player1) {
         Value.potion_player1 = potion_player1;
     }

     public static void setPotion_player2(int potion_player2) {
         Value.potion_player2 = potion_player2;
     }

     public static void setPotion_player3(int potion_player3) {
         Value.potion_player3 = potion_player3;
     }

     public static void setPotion_player4(int potion_player4) {
         Value.potion_player4 = potion_player4;
     }

     public static void setShield_player1(int shield_player1) {
         Value.shield_player1 = shield_player1;
     }

     public static void setShield_player2(int shield_player2) {
         Value.shield_player2 = shield_player2;
     }

     public static void setShield_player3(int shield_player3) {
         Value.shield_player3 = shield_player3;
     }

     public static void setShield_player4(int shield_player4) {
         Value.shield_player4 = shield_player4;
     }

     public static void setSword_player1(int sword_player1) {
         Value.sword_player1 = sword_player1;
     }

     public static void setSword_player2(int sword_player2) {
         Value.sword_player2 = sword_player2;
     }

     public static void setSword_player3(int sword_player3) {
         Value.sword_player3 = sword_player3;
     }

     public static void setSword_player4(int sword_player4) {
         Value.sword_player4 = sword_player4;
     }


     public static int getArmor_player1() {
         return armor_player1;
     }

     public static int getArmor_player2() {
         return armor_player2;
     }

     public static int getArmor_player3() {
         return armor_player3;
     }

     public static int getArmor_player4() {
         return armor_player4;
     }

     public static int getBook_player1() {
         return book_player1;
     }

     public static int getBook_player2() {
         return book_player2;
     }

     public static int getBook_player3() {
         return book_player3;
     }

     public static int getBook_player4() {
         return book_player4;
     }

     public static int getBow_player1() {
         return bow_player1;
     }

     public static int getBow_player2() {
         return bow_player2;
     }

     public static int getBow_player3() {
         return bow_player3;
     }

     public static int getBow_player4() {
         return bow_player4;
     }

     public static int getFood_player1() {
         return food_player1;
     }

     public static int getFood_player2() {
         return food_player2;
     }

     public static int getFood_player3() {
         return food_player3;
     }

     public static int getFood_player4() {
         return food_player4;
     }

     public static int getPotion_player1() {
         return potion_player1;
     }

     public static int getPotion_player2() {
         return potion_player2;
     }

     public static int getPotion_player3() {
         return potion_player3;
     }

     public static int getPotion_player4() {
         return potion_player4;
     }

     public static int getShield_player1() {
         return shield_player1;
     }

     public static int getShield_player2() {
         return shield_player2;
     }

     public static int getShield_player3() {
         return shield_player3;
     }

     public static int getShield_player4() {
         return shield_player4;
     }

     public static int getSword_player1() {
         return sword_player1;
     }

     public static int getSword_player2() {
         return sword_player2;
     }

     public static int getSword_player3() {
         return sword_player3;
     }

     public static int getSword_player4() {
         return sword_player4;
     }

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


     private static int lean_player1=-2;
     private static int lean_player2=-2;
     private static int lean_player3=-2;
     private static int lean_player4=-2;

     public static void setLean_player1(int lean_player1) {
         Value.lean_player1 = lean_player1;
     }

     public static void setLean_player2(int lean_player2) {
         Value.lean_player2 = lean_player2;
     }

     public static void setLean_player3(int lean_player3) {
         Value.lean_player3 = lean_player3;
     }

     public static void setLean_player4(int lean_player4) {
         Value.lean_player4 = lean_player4;
     }

     public static int getLean_player1() {
         return lean_player1;
     }

     public static int getLean_player2() {
         return lean_player2;
     }

     public static int getLean_player3() {
         return lean_player3;
     }

     public static int getLean_player4() {
         return lean_player4;
     }

     private static long  money_Lean=0;

     public static void setMoney_Lean(long money_Lean) {
         Value.money_Lean = money_Lean;
     }

     public static long getMoney_Lean() {
         return money_Lean;
     }

     //Treasure
     private  static int Treasure1_Diamond_Ring = Methods.Cell_Rand1();// انگشتر الماس

     private  static int Treasure2_Jeweled_Sword = Methods.Cell_Rand1();// شمشیر جواهر نشان

     private  static int Treasure3_Golden_Glass = Methods.Cell_Rand1();// لیوان طلایی

     private  static int Treasure4_Glass_Cup = Methods.Cell_Rand1();// جام شیشه ای

     private  static int Treasure5_Wooden_Bow = Methods.Cell_Rand2();// کمان چوبی

     private  static int Treasure6_Steel_Shield = Methods.Cell_Rand2();// سپر پولادین

     private  static int Treasure7_Golden_Key = Methods.Cell_Rand2();// کلید زرین

     private  static int Treasure8_Dragon_Scroll = Methods.Cell_Rand2();// طومار اژدها




     public static int getTreasure1_Diamond_Ring() {
         return Treasure1_Diamond_Ring;
     }

     public static void setTreasure1_Diamond_Ring(int treasure1_Diamond_Ring) {
         Treasure1_Diamond_Ring = treasure1_Diamond_Ring;
     }

     public static int getTreasure2_Jeweled_Sword() {
         return Treasure2_Jeweled_Sword;
     }

     public static void setTreasure2_Jeweled_Sword(int treasure2_Jeweled_Sword) {
         Treasure2_Jeweled_Sword = treasure2_Jeweled_Sword;
     }

     public static int getTreasure3_Golden_Glass() {
         return Treasure3_Golden_Glass;
     }

     public static void setTreasure3_Golden_Glass(int treasure3_Golden_Glass) {
         Treasure3_Golden_Glass = treasure3_Golden_Glass;
     }

     public static int getTreasure4_Glass_Cup() {
         return Treasure4_Glass_Cup;
     }

     public static void setTreasure4_Glass_Cup(int treasure4_Glass_Cup) {
         Treasure4_Glass_Cup = treasure4_Glass_Cup;
     }

     public static int getTreasure5_Wooden_Bow() {
         return Treasure5_Wooden_Bow;
     }

     public static void setTreasure5_Wooden_Bow(int treasure5_Wooden_Bow) {
         Treasure5_Wooden_Bow = treasure5_Wooden_Bow;
     }

     public static int getTreasure6_Steel_Shield() {
         return Treasure6_Steel_Shield;
     }

     public static void setTreasure6_Steel_Shield(int treasure6_Steel_Shield) {
         Treasure6_Steel_Shield = treasure6_Steel_Shield;
     }

     public static int getTreasure7_Golden_Key() {
         return Treasure7_Golden_Key;
     }

     public static void setTreasure7_Golden_Key(int treasure7_Golden_Key) {
         Treasure7_Golden_Key = treasure7_Golden_Key;
     }

     public static int getTreasure8_Dragon_Scroll() {
         return Treasure8_Dragon_Scroll;
     }

     public static void setTreasure8_Dragon_Scroll(int treasure8_Dragon_Scroll) {
         Treasure8_Dragon_Scroll = treasure8_Dragon_Scroll;
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

     private  static int Trap1 = Methods.Cell_Rand1();

     private  static int Trap2 = Methods.Cell_Rand1();

     private  static int Trap3 = Methods.Cell_Rand1();

     private  static int Trap4 = Methods.Cell_Rand2();

     private  static int Trap5 = Methods.Cell_Rand2();

     private  static int Trap6 = Methods.Cell_Rand2();


     private  static int Wall1 = Methods.Wall_Rand1();

     private  static int Wall2 = Methods.Wall_Rand1();

     private  static int Wall3 = Methods.Wall_Rand1();

     private  static int Wall4 = Methods.Wall_Rand1();

     private  static int Wall5 = Methods.Wall_Rand2();

     private  static int Wall6 = Methods.Wall_Rand2();

     private  static int Wall7 = Methods.Wall_Rand2();

     private  static int Wall8 = Methods.Wall_Rand2();


     public static int getMarket1() {
         return Market1;
     }

     public static void setMarket1(int market1) {
         Market1 = market1;
     }

     public static int getMarket2() {
         return Market2;
     }

     public static void setMarket2(int market2) {
         Market2 = market2;
     }

     public static int getMarket3() {
         return Market3;
     }

     public static void setMarket3(int market3) {
         Market3 = market3;
     }

     public static int getMarket4() {
         return Market4;
     }

     public static void setMarket4(int market4) {
         Market4 = market4;
     }

     public static int getMarket5() {
         return Market5;
     }

     public static void setMarket5(int market5) {
         Market5 = market5;
     }

     public static int getMarket6() {
         return Market6;
     }

     public static void setMarket6(int market6) {
         Market6 = market6;
     }

     public static int getTrap1() {
         return Trap1;
     }

     public static void setTrap1(int trap1) {
         Trap1 = trap1;
     }

     public static int getTrap2() {
         return Trap2;
     }

     public static void setTrap2(int trap2) {
         Trap2 = trap2;
     }

     public static int getTrap3() {
         return Trap3;
     }

     public static void setTrap3(int trap3) {
         Trap3 = trap3;
     }

     public static int getTrap4() {
         return Trap4;
     }

     public static void setTrap4(int trap4) {
         Trap4 = trap4;
     }

     public static int getTrap5() {
         return Trap5;
     }

     public static void setTrap5(int trap5) {
         Trap5 = trap5;
     }

     public static int getTrap6() {
         return Trap6;
     }

     public static void setTrap6(int trap6) {
         Trap6 = trap6;
     }

     public static int getWall1() {
         return Wall1;
     }

     public static void setWall1(int wall1) {
         Wall1 = wall1;
     }

     public static int getWall2() {
         return Wall2;
     }

     public static void setWall2(int wall2) {
         Wall2 = wall2;
     }

     public static int getWall3() {
         return Wall3;
     }

     public static void setWall3(int wall3) {
         Wall3 = wall3;
     }

     public static int getWall4() {
         return Wall4;
     }

     public static void setWall4(int wall4) {
         Wall4 = wall4;
     }

     public static int getWall5() {
         return Wall5;
     }

     public static void setWall5(int wall5) {
         Wall5 = wall5;
     }

     public static int getWall6() {
         return Wall6;
     }

     public static void setWall6(int wall6) {
         Wall6 = wall6;
     }

     public static int getWall7() {
         return Wall7;
     }

     public static void setWall7(int wall7) {
         Wall7 = wall7;
     }

     public static int getWall8() {
         return Wall8;
     }

     public static void setWall8(int wall8) {
         Wall8 = wall8;
     }


     //Treasure code
     private  static int Treasure1_Diamond_Ring_Code_Player1 = Methods.CodeRand(11);
     private  static int Treasure1_Diamond_Ring_Code_Player2 = Methods.CodeRand(12);
     private  static int Treasure1_Diamond_Ring_Code_Player3 = Methods.CodeRand(11);
     private  static int Treasure1_Diamond_Ring_Code_Player4 = Methods.CodeRand(12);

     private  static int Treasure2_Jeweled_Sword_Code_Player1 = Methods.CodeRand(21);
     private  static int Treasure2_Jeweled_Sword_Code_Player2 = Methods.CodeRand(22);
     private  static int Treasure2_Jeweled_Sword_Code_Player3 = Methods.CodeRand(21);
     private  static int Treasure2_Jeweled_Sword_Code_Player4 = Methods.CodeRand(22);

     private  static int Treasure3_Golden_Glass_Code_Player1 = Methods.CodeRand(31);
     private  static int Treasure3_Golden_Glass_Code_Player2 = Methods.CodeRand(32);
     private  static int Treasure3_Golden_Glass_Code_Player3 = Methods.CodeRand(31);
     private  static int Treasure3_Golden_Glass_Code_Player4 = Methods.CodeRand(32);

     private  static int Treasure4_Glass_Cup_Code_Player1 = Methods.CodeRand(41);
     private  static int Treasure4_Glass_Cup_Code_Player2 = Methods.CodeRand(42);
     private  static int Treasure4_Glass_Cup_Code_Player3 = Methods.CodeRand(41);
     private  static int Treasure4_Glass_Cup_Code_Player4 = Methods.CodeRand(42);

     private  static int Treasure5_Wooden_Bow_Code_Player1 = Methods.CodeRand(51);
     private  static int Treasure5_Wooden_Bow_Code_Player2 = Methods.CodeRand(52);
     private  static int Treasure5_Wooden_Bow_Code_Player3 = Methods.CodeRand(51);
     private  static int Treasure5_Wooden_Bow_Code_Player4 = Methods.CodeRand(52);

     private  static int Treasure6_Steel_Shield_Code_Player1 = Methods.CodeRand(61);
     private  static int Treasure6_Steel_Shield_Code_Player2 = Methods.CodeRand(62);
     private  static int Treasure6_Steel_Shield_Code_Player3 = Methods.CodeRand(61);
     private  static int Treasure6_Steel_Shield_Code_Player4 = Methods.CodeRand(62);

     private  static int Treasure7_Golden_Key_Code_Player1 = Methods.CodeRand(71);
     private  static int Treasure7_Golden_Key_Code_Player2 = Methods.CodeRand(72);
     private  static int Treasure7_Golden_Key_Code_Player3 = Methods.CodeRand(71);
     private  static int Treasure7_Golden_Key_Code_Player4 = Methods.CodeRand(72);

     private  static int Treasure8_Dragon_Scroll_Code_Player1 = Methods.CodeRand(81);
     private  static int Treasure8_Dragon_Scroll_Code_Player2 = Methods.CodeRand(82);
     private  static int Treasure8_Dragon_Scroll_Code_Player3 = Methods.CodeRand(81);
     private  static int Treasure8_Dragon_Scroll_Code_Player4 = Methods.CodeRand(82);

     public static int getTreasure1_Diamond_Ring_Code_Player1() {
         return Treasure1_Diamond_Ring_Code_Player1;
     }

     public static void setTreasure1_Diamond_Ring_Code_Player1(int treasure1_Diamond_Ring_Code_Player1) {
         Treasure1_Diamond_Ring_Code_Player1 = treasure1_Diamond_Ring_Code_Player1;
     }

     public static int getTreasure1_Diamond_Ring_Code_Player2() {
         return Treasure1_Diamond_Ring_Code_Player2;
     }

     public static void setTreasure1_Diamond_Ring_Code_Player2(int treasure1_Diamond_Ring_Code_Player2) {
         Treasure1_Diamond_Ring_Code_Player2 = treasure1_Diamond_Ring_Code_Player2;
     }

     public static int getTreasure1_Diamond_Ring_Code_Player3() {
         return Treasure1_Diamond_Ring_Code_Player3;
     }

     public static void setTreasure1_Diamond_Ring_Code_Player3(int treasure1_Diamond_Ring_Code_Player3) {
         Treasure1_Diamond_Ring_Code_Player3 = treasure1_Diamond_Ring_Code_Player3;
     }

     public static int getTreasure1_Diamond_Ring_Code_Player4() {
         return Treasure1_Diamond_Ring_Code_Player4;
     }

     public static void setTreasure1_Diamond_Ring_Code_Player4(int treasure1_Diamond_Ring_Code_Player4) {
         Treasure1_Diamond_Ring_Code_Player4 = treasure1_Diamond_Ring_Code_Player4;
     }

     public static int getTreasure2_Jeweled_Sword_Code_Player1() {
         return Treasure2_Jeweled_Sword_Code_Player1;
     }

     public static void setTreasure2_Jeweled_Sword_Code_Player1(int treasure2_Jeweled_Sword_Code_Player1) {
         Treasure2_Jeweled_Sword_Code_Player1 = treasure2_Jeweled_Sword_Code_Player1;
     }

     public static int getTreasure2_Jeweled_Sword_Code_Player2() {
         return Treasure2_Jeweled_Sword_Code_Player2;
     }

     public static void setTreasure2_Jeweled_Sword_Code_Player2(int treasure2_Jeweled_Sword_Code_Player2) {
         Treasure2_Jeweled_Sword_Code_Player2 = treasure2_Jeweled_Sword_Code_Player2;
     }

     public static int getTreasure2_Jeweled_Sword_Code_Player3() {
         return Treasure2_Jeweled_Sword_Code_Player3;
     }

     public static void setTreasure2_Jeweled_Sword_Code_Player3(int treasure2_Jeweled_Sword_Code_Player3) {
         Treasure2_Jeweled_Sword_Code_Player3 = treasure2_Jeweled_Sword_Code_Player3;
     }

     public static int getTreasure2_Jeweled_Sword_Code_Player4() {
         return Treasure2_Jeweled_Sword_Code_Player4;
     }

     public static void setTreasure2_Jeweled_Sword_Code_Player4(int treasure2_Jeweled_Sword_Code_Player4) {
         Treasure2_Jeweled_Sword_Code_Player4 = treasure2_Jeweled_Sword_Code_Player4;
     }

     public static int getTreasure3_Golden_Glass_Code_Player1() {
         return Treasure3_Golden_Glass_Code_Player1;
     }

     public static void setTreasure3_Golden_Glass_Code_Player1(int treasure3_Golden_Glass_Code_Player1) {
         Treasure3_Golden_Glass_Code_Player1 = treasure3_Golden_Glass_Code_Player1;
     }

     public static int getTreasure3_Golden_Glass_Code_Player2() {
         return Treasure3_Golden_Glass_Code_Player2;
     }

     public static void setTreasure3_Golden_Glass_Code_Player2(int treasure3_Golden_Glass_Code_Player2) {
         Treasure3_Golden_Glass_Code_Player2 = treasure3_Golden_Glass_Code_Player2;
     }

     public static int getTreasure3_Golden_Glass_Code_Player3() {
         return Treasure3_Golden_Glass_Code_Player3;
     }

     public static void setTreasure3_Golden_Glass_Code_Player3(int treasure3_Golden_Glass_Code_Player3) {
         Treasure3_Golden_Glass_Code_Player3 = treasure3_Golden_Glass_Code_Player3;
     }

     public static int getTreasure3_Golden_Glass_Code_Player4() {
         return Treasure3_Golden_Glass_Code_Player4;
     }

     public static void setTreasure3_Golden_Glass_Code_Player4(int treasure3_Golden_Glass_Code_Player4) {
         Treasure3_Golden_Glass_Code_Player4 = treasure3_Golden_Glass_Code_Player4;
     }

     public static int getTreasure4_Glass_Cup_Code_Player1() {
         return Treasure4_Glass_Cup_Code_Player1;
     }

     public static void setTreasure4_Glass_Cup_Code_Player1(int treasure4_Glass_Cup_Code_Player1) {
         Treasure4_Glass_Cup_Code_Player1 = treasure4_Glass_Cup_Code_Player1;
     }

     public static int getTreasure4_Glass_Cup_Code_Player2() {
         return Treasure4_Glass_Cup_Code_Player2;
     }

     public static void setTreasure4_Glass_Cup_Code_Player2(int treasure4_Glass_Cup_Code_Player2) {
         Treasure4_Glass_Cup_Code_Player2 = treasure4_Glass_Cup_Code_Player2;
     }

     public static int getTreasure4_Glass_Cup_Code_Player3() {
         return Treasure4_Glass_Cup_Code_Player3;
     }

     public static void setTreasure4_Glass_Cup_Code_Player3(int treasure4_Glass_Cup_Code_Player3) {
         Treasure4_Glass_Cup_Code_Player3 = treasure4_Glass_Cup_Code_Player3;
     }

     public static int getTreasure4_Glass_Cup_Code_Player4() {
         return Treasure4_Glass_Cup_Code_Player4;
     }

     public static void setTreasure4_Glass_Cup_Code_Player4(int treasure4_Glass_Cup_Code_Player4) {
         Treasure4_Glass_Cup_Code_Player4 = treasure4_Glass_Cup_Code_Player4;
     }

     public static int getTreasure5_Wooden_Bow_Code_Player1() {
         return Treasure5_Wooden_Bow_Code_Player1;
     }

     public static void setTreasure5_Wooden_Bow_Code_Player1(int treasure5_Wooden_Bow_Code_Player1) {
         Treasure5_Wooden_Bow_Code_Player1 = treasure5_Wooden_Bow_Code_Player1;
     }

     public static int getTreasure5_Wooden_Bow_Code_Player2() {
         return Treasure5_Wooden_Bow_Code_Player2;
     }

     public static void setTreasure5_Wooden_Bow_Code_Player2(int treasure5_Wooden_Bow_Code_Player2) {
         Treasure5_Wooden_Bow_Code_Player2 = treasure5_Wooden_Bow_Code_Player2;
     }

     public static int getTreasure5_Wooden_Bow_Code_Player3() {
         return Treasure5_Wooden_Bow_Code_Player3;
     }

     public static void setTreasure5_Wooden_Bow_Code_Player3(int treasure5_Wooden_Bow_Code_Player3) {
         Treasure5_Wooden_Bow_Code_Player3 = treasure5_Wooden_Bow_Code_Player3;
     }

     public static int getTreasure5_Wooden_Bow_Code_Player4() {
         return Treasure5_Wooden_Bow_Code_Player4;
     }

     public static void setTreasure5_Wooden_Bow_Code_Player4(int treasure5_Wooden_Bow_Code_Player4) {
         Treasure5_Wooden_Bow_Code_Player4 = treasure5_Wooden_Bow_Code_Player4;
     }

     public static int getTreasure6_Steel_Shield_Code_Player1() {
         return Treasure6_Steel_Shield_Code_Player1;
     }

     public static void setTreasure6_Steel_Shield_Code_Player1(int treasure6_Steel_Shield_Code_Player1) {
         Treasure6_Steel_Shield_Code_Player1 = treasure6_Steel_Shield_Code_Player1;
     }

     public static int getTreasure6_Steel_Shield_Code_Player2() {
         return Treasure6_Steel_Shield_Code_Player2;
     }

     public static void setTreasure6_Steel_Shield_Code_Player2(int treasure6_Steel_Shield_Code_Player2) {
         Treasure6_Steel_Shield_Code_Player2 = treasure6_Steel_Shield_Code_Player2;
     }

     public static int getTreasure6_Steel_Shield_Code_Player3() {
         return Treasure6_Steel_Shield_Code_Player3;
     }

     public static void setTreasure6_Steel_Shield_Code_Player3(int treasure6_Steel_Shield_Code_Player3) {
         Treasure6_Steel_Shield_Code_Player3 = treasure6_Steel_Shield_Code_Player3;
     }

     public static int getTreasure6_Steel_Shield_Code_Player4() {
         return Treasure6_Steel_Shield_Code_Player4;
     }

     public static void setTreasure6_Steel_Shield_Code_Player4(int treasure6_Steel_Shield_Code_Player4) {
         Treasure6_Steel_Shield_Code_Player4 = treasure6_Steel_Shield_Code_Player4;
     }

     public static int getTreasure7_Golden_Key_Code_Player1() {
         return Treasure7_Golden_Key_Code_Player1;
     }

     public static void setTreasure7_Golden_Key_Code_Player1(int treasure7_Golden_Key_Code_Player1) {
         Treasure7_Golden_Key_Code_Player1 = treasure7_Golden_Key_Code_Player1;
     }

     public static int getTreasure7_Golden_Key_Code_Player2() {
         return Treasure7_Golden_Key_Code_Player2;
     }

     public static void setTreasure7_Golden_Key_Code_Player2(int treasure7_Golden_Key_Code_Player2) {
         Treasure7_Golden_Key_Code_Player2 = treasure7_Golden_Key_Code_Player2;
     }

     public static int getTreasure7_Golden_Key_Code_Player3() {
         return Treasure7_Golden_Key_Code_Player3;
     }

     public static void setTreasure7_Golden_Key_Code_Player3(int treasure7_Golden_Key_Code_Player3) {
         Treasure7_Golden_Key_Code_Player3 = treasure7_Golden_Key_Code_Player3;
     }

     public static int getTreasure7_Golden_Key_Code_Player4() {
         return Treasure7_Golden_Key_Code_Player4;
     }

     public static void setTreasure7_Golden_Key_Code_Player4(int treasure7_Golden_Key_Code_Player4) {
         Treasure7_Golden_Key_Code_Player4 = treasure7_Golden_Key_Code_Player4;
     }

     public static int getTreasure8_Dragon_Scroll_Code_Player1() {
         return Treasure8_Dragon_Scroll_Code_Player1;
     }

     public static void setTreasure8_Dragon_Scroll_Code_Player1(int treasure8_Dragon_Scroll_Code_Player1) {
         Treasure8_Dragon_Scroll_Code_Player1 = treasure8_Dragon_Scroll_Code_Player1;
     }

     public static int getTreasure8_Dragon_Scroll_Code_Player2() {
         return Treasure8_Dragon_Scroll_Code_Player2;
     }

     public static void setTreasure8_Dragon_Scroll_Code_Player2(int treasure8_Dragon_Scroll_Code_Player2) {
         Treasure8_Dragon_Scroll_Code_Player2 = treasure8_Dragon_Scroll_Code_Player2;
     }

     public static int getTreasure8_Dragon_Scroll_Code_Player3() {
         return Treasure8_Dragon_Scroll_Code_Player3;
     }

     public static void setTreasure8_Dragon_Scroll_Code_Player3(int treasure8_Dragon_Scroll_Code_Player3) {
         Treasure8_Dragon_Scroll_Code_Player3 = treasure8_Dragon_Scroll_Code_Player3;
     }

     public static int getTreasure8_Dragon_Scroll_Code_Player4() {
         return Treasure8_Dragon_Scroll_Code_Player4;
     }

     public static void setTreasure8_Dragon_Scroll_Code_Player4(int treasure8_Dragon_Scroll_Code_Player4) {
         Treasure8_Dragon_Scroll_Code_Player4 = treasure8_Dragon_Scroll_Code_Player4;
     }

     //Object
     private  static int Lost_Object1 = Methods.Cell_Rand1();

     private  static int Lost_Object2 = Methods.Cell_Rand1();

     private  static int Lost_Object3 = Methods.Cell_Rand1();

     private  static int Lost_Object4 = Methods.Cell_Rand1();

     private  static int Lost_Object5 = Methods.Cell_Rand1();

     private  static int Lost_Object6 = Methods.Cell_Rand1();

     private  static int Lost_Object7 = Methods.Cell_Rand1();

     private  static int Lost_Object8 = Methods.Cell_Rand1();

     private  static int Lost_Object9 = Methods.Cell_Rand2();

     private  static int Lost_Object10 = Methods.Cell_Rand2();

     private  static int Lost_Object11 = Methods.Cell_Rand2();

     private  static int Lost_Object12 = Methods.Cell_Rand2();

     private  static int Lost_Object13 = Methods.Cell_Rand2();

     private  static int Lost_Object14 = Methods.Cell_Rand2();

     private  static int Lost_Object15 = Methods.Cell_Rand2();

     private  static int Lost_Object16 = Methods.Cell_Rand2();


     public static int getLost_Object1() {
         return Lost_Object1;
     }

     public static void setLost_Object1(int lost_Object1) {
         Lost_Object1 = lost_Object1;
     }

     public static int getLost_Object2() {
         return Lost_Object2;
     }

     public static void setLost_Object2(int lost_Object2) {
         Lost_Object2 = lost_Object2;
     }

     public static int getLost_Object3() {
         return Lost_Object3;
     }

     public static void setLost_Object3(int lost_Object3) {
         Lost_Object3 = lost_Object3;
     }

     public static int getLost_Object4() {
         return Lost_Object4;
     }

     public static void setLost_Object4(int lost_Object4) {
         Lost_Object4 = lost_Object4;
     }

     public static int getLost_Object5() {
         return Lost_Object5;
     }

     public static void setLost_Object5(int lost_Object5) {
         Lost_Object5 = lost_Object5;
     }

     public static int getLost_Object6() {
         return Lost_Object6;
     }

     public static void setLost_Object6(int lost_Object6) {
         Lost_Object6 = lost_Object6;
     }

     public static int getLost_Object7() {
         return Lost_Object7;
     }

     public static void setLost_Object7(int lost_Object7) {
         Lost_Object7 = lost_Object7;
     }

     public static int getLost_Object8() {
         return Lost_Object8;
     }

     public static void setLost_Object8(int lost_Object8) {
         Lost_Object8 = lost_Object8;
     }

     public static int getLost_Object9() {
         return Lost_Object9;
     }

     public static void setLost_Object9(int lost_Object9) {
         Lost_Object9 = lost_Object9;
     }

     public static int getLost_Object10() {
         return Lost_Object10;
     }

     public static void setLost_Object10(int lost_Object10) {
         Lost_Object10 = lost_Object10;
     }

     public static int getLost_Object11() {
         return Lost_Object11;
     }

     public static void setLost_Object11(int lost_Object11) {
         Lost_Object11 = lost_Object11;
     }

     public static int getLost_Object12() {
         return Lost_Object12;
     }

     public static void setLost_Object12(int lost_Object12) {
         Lost_Object12 = lost_Object12;
     }

     public static int getLost_Object13() {
         return Lost_Object13;
     }

     public static void setLost_Object13(int lost_Object13) {
         Lost_Object13 = lost_Object13;
     }

     public static int getLost_Object14() {return Lost_Object14;}

     public static void setLost_Object14(int lost_Object14) {
         Lost_Object14 = lost_Object14;
     }

     public static int getLost_Object15() {return Lost_Object15;}

     public static void setLost_Object15(int lost_Object15) {
         Lost_Object15 = lost_Object15;
     }

     public static int getLost_Object16() {return Lost_Object16;}

     public static void setLost_Object16(int lost_Object16) {
         Lost_Object16 = lost_Object16;
     }

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




     static boolean change_music=false;

     static int language=2;

     static int game=1;

     static boolean game_loaded=false;

     static boolean change_language=true;

     static boolean autoSave=false;


 }
