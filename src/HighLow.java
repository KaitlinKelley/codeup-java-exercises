import java.lang.Math;
import java.util.Scanner;

public class HighLow {
//    Game Development 101
//
//    Welcome to the world of game development!
//
//    You are going to build a high-low guessing game. Create a class named HighLow inside of src.
//
//    The specs for the game are:
//
//    Game picks a random number between 1 and 100.
//    Prompts user to guess the number.
//    All user inputs are validated.
//    If user's guess is less than the number, it outputs "HIGHER".
//    If user's guess is more than the number, it outputs "LOWER".
//    If a user guesses the number, the game should declare "GOOD GUESS!"
//    Hints
//
//    Use the random method of the java.lang.Math class to generate a random number.
//    Bonus
//
//    Keep track of how many guesses a user makes.
//    Set an upper limit on the number of guesses.

    public static void main(String[] args){
        guessingGame();
    }






    public static int pickRandom(){
        double randomNum = Math.floor(Math.random() * 100) + 1;
        int randomInt = (int) randomNum;
        return randomInt;
    }

    public static void guessingGame(){
        boolean stillPlaying = true;
        int numOfGuesses = 0;
        int randomInt = pickRandom();
            System.out.println("=============================");
            System.out.println("Welcome to the Guessing Game!");
            System.out.println("=============================");
            System.out.println();
            System.out.println("Please enter an integer between 1 and 100, inclusive:");
        do {

            Scanner userInput = new Scanner(System.in);

            int userGuess = userInput.nextInt();
            numOfGuesses++;
            if(numOfGuesses<=10){

                if(userGuess == randomInt){
                    System.out.println("==== Congratulations! You guessed it! The number was: " + randomInt + " ====");
                    stillPlaying = false;
                }else if(userGuess > randomInt){
                    System.out.println("Too high! Try again.");
                    numOfGuesses++;
                }else if(userGuess < randomInt){
                    System.out.println("Too low! Try again.");
                    numOfGuesses++;
                }

            }else {
                System.out.println("Number of guesses exceeded. Game over.");
                stillPlaying = false;
            }

        }while(stillPlaying);
    }






//    Leave this brace alone!
}
