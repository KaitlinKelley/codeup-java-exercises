import java.lang.Math;
import java.util.Scanner;

public class TextAdventure {

    public static void main(String[] args){
        playGame();
    }

    public static int getRandom(int max, int min){
        double randomDouble = Math.floor(Math.random() * max) + min;
        int randomInt = (int) randomDouble;
        return randomInt;
    }

    public static void displayCurrentStats(int playerHP, int playerMP, int enemyHP){
        System.out.println("Hero Stats:");
        System.out.println("Total health: " + playerHP + "hp");
        System.out.println("Magic meter: " + playerMP + "mp");
        System.out.println();
        System.out.println("TROGDOR THE DRAGON-MAN");
        System.out.println("Enemy Stats:");
        System.out.println("Total health: " + enemyHP + "hp");
    }

    public static void displayActions(){
        System.out.println();
        System.out.println("Please choose an action: [1,2,3,4,5]");
        System.out.println("1. Physical Attack");
        System.out.println("2. Magical Attack");
        System.out.println("3. Drink Health Potion");
        System.out.println("4. Drink Magic Potion");
        System.out.println("5. Flee");
    }


    public static void playGame() {
        boolean stillAlive = true;
//        boolean enemyAttack = false;
        int playerHP = getRandom(100, 50);
        int enemyHP = getRandom(100, 50);
        int playerMP = getRandom(100, 50);
//        int enemyMP = getRandom(100, 50);
        int numOfHealthPotions = getRandom(5, 1);
        int numOfMagicPotions = getRandom(5, 1);
        System.out.println("Welcome to the Text Adventure Game!");
        System.out.println("Would you like to battle? [y/n]");
        Scanner userInput = new Scanner(System.in);
        String yesOrNo = userInput.next();
        if (yesOrNo.equalsIgnoreCase("n")) {
            System.out.println("Coward. Game Over.");
            stillAlive = false;
        } else if (yesOrNo.equalsIgnoreCase("y")) {
            System.out.println("What's your name?");
            String playerName = userInput.next();
            System.out.println("----Hero Name: " + playerName + " the Epic----");
            System.out.println("Hero Stats:");
            System.out.println("Total health: " + playerHP + "hp");
            System.out.println("Magic meter: " + playerMP + "mp");
            System.out.println();
            System.out.println("Your foe is: TROGDOR THE DRAGON-MAN");
//            System.out.println("Enemy Stats:");
            System.out.println("Total health: " + enemyHP + "hp");
//                System.out.println("Magic meter: " + enemyMP + "mp");
            System.out.println();
            System.out.println("Start the battle? [y/n]");
            String startBattle = userInput.next();
            if (startBattle.equalsIgnoreCase("n")) {
                System.out.println("Coward. Game Over.");
                stillAlive = false;
            } else if (startBattle.equalsIgnoreCase("y")) {
                System.out.println("Okay! Here we go!");
                System.out.println();
                do {
                    displayActions();
                    int userAction = userInput.nextInt();

                    if (playerHP <= 0) {
                        System.out.println("Uh oh, you died. Game over.");
                        stillAlive = false;
                    } else if (enemyHP <= 0) {
                        System.out.println("Enemy defeated! You win the battle!");
                        stillAlive = false;
                    } else {
                        if (playerMP <= 0) {
                            System.out.println("No more magic left!");
//                            displayActions();
                        } else if (numOfMagicPotions <= 0) {
                            System.out.println("No more magic potions!");
//                            displayActions();
                        } else if (numOfHealthPotions <= 0) {
                            System.out.println("No more health potions!");
//                            displayActions();
                        } else if (userAction == 1) {
                            System.out.println("You attacked with your weapon! Delivered 15 damage.");
                            enemyHP -= 15;
                            if(enemyHP > 0) {
                                System.out.printf("Enemy Health is %d%n", enemyHP - 15);
//                            displayActions();
                            }else{
                                System.out.println("Enemy defeated. You win!");
                                stillAlive = false;
                            }
                        } else if (userAction == 2) {
                            System.out.println("You cast a spell! Delivered 10 damage.");
                            enemyHP -= 10;
                            playerMP -= 10;
                            System.out.printf("Enemy Health is %d, your Magic Meter is now at %d.%n", enemyHP, playerMP);
                            System.out.println();
//                            displayActions();
                        } else if (userAction == 3) {
                            playerHP += 10;
                            numOfHealthPotions--;
                            System.out.println("You drank a health potion!");
                            System.out.printf("Your health is now at %d.%n", playerHP);
//                            displayActions();
                        } else if (userAction == 4) {
                            playerMP += 10;
                            numOfMagicPotions--;
                            System.out.println("You drank a magic potion!");
                            System.out.printf("Your Magic Meter is now at %d", playerHP);
//                            displayActions();
                        } else if (userAction == 5){
                            System.out.println("You're a wuss, but you live to fight another day.");
                            System.out.println("Game Over");
                            stillAlive = false;
                        }
                    }


                } while (stillAlive);
            }
        }


    }

    public static void playSimpleGame(){
        
    }



//    Leave it!!
}
