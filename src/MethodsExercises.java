import java.util.Scanner;
import java.lang.Math;

public class MethodsExercises {

    public static void main(String[] args) {
//        addStuff(14,32);
//        subtractStuff(14,32);
//        multiplyStuff(14,32);
//        divideStuff(14,32);
//        findRemainder(32,14);
//        divideStuff(5,0); //Gives us infinity??????? Dunno why.
//        //Dividing by infinity in Java can throw an exception, or result in infinity, depending on whether we are using an int or a float, etc.
//        multiplyWithLoop(5,3);
//        multiplyWithLoop(7,8);
        System.out.println(multiplyWithRecursion(5,3));
//        getInteger(1, 10);
//        getFactorialLoop();
//        useInputToFindFactorial();
//        rollTheDice();
    }


    public static void addStuff(int num1, int num2) {
        System.out.println(num1 + " + " + num2 + " = " + (num1 + num2));
    }


    public static void subtractStuff(int num1, int num2) {
        System.out.println(num1 - num2);
    }


    public static void multiplyStuff(int num1, int num2) {
        System.out.println(num1 * num2);
    }


    public static void divideStuff(float num1, float num2) {
        System.out.println(num1 / num2);
    }


    public static void findRemainder(int num1, int num2) {
        System.out.println(num1 % num2);
    }


    public static void multiplyWithLoop(int baseNum, int numOfTimes) {
        int result = 0;
        for (int i = 1; i <= numOfTimes; i++) {
            result += baseNum;
        }
        System.out.println(baseNum + "x" + numOfTimes + " = " + result);
    }


    public static int multiplyWithRecursion(int baseNum, int numOfTimes) {
        if (numOfTimes <= 0) {
            return 0;
        } else {
            return multiplyWithRecursion(baseNum, numOfTimes - 1);
        }
    }


//    Create a method that validates that user input is in a certain range
//
//    The method signature should look like this:
//
//
//    public static int getInteger(int min, int max);
//    and is used like this:
//
//
//            System.out.print("Enter a number between 1 and 10: ");
//    int userInput = getInteger(1, 10);
//    If the input is invalid, prompt the user again.
//
//    Hint: recursion might be helpful here!


//    public static int getInteger(int min, int max){
//        System.out.println("Enter a number between 1 and 10:");
//        Scanner userInput = new Scanner (System.in);
//        int userInt = userInput.nextInt();
//        if (userInt <= 10 && userInt >=1){
//            System.out.println("You entered a valid number. Good job");
//            return userInt;
//        } else {
//            return getInteger(min, max);
//        }
//    }

//    Calculate the factorial of a number.
//
//    Prompt the user to enter an integer from 1 to 10.
//    Display the factorial of the number entered by the user.
//    Ask if the user wants to continue.
//    Use a for loop to calculate the factorial.
//    Assume that the user will enter an integer, but verify it’s between 1 and 10.
//    Use the long type to store the factorial.
//    Continue only if the user agrees to.
//    A factorial is a number multiplied by each of the numbers before it.
//    Factorials are denoted by the exclamation point (n!). Ex:
//
//
//            1! = 1               = 1
//            2! = 1 x 2           = 2
//            3! = 1 x 2 x 3       = 6
//            4! = 1 x 2 x 3 x 4   = 24
//    Bonus
//
//    Test the application and find the integer for the highest factorial that can be accurately calculated by this application, then modify the prompt so that it prompts the user for a number "from 1 to {the highest integer that returns accurate factorial calculation}". Don’t forget to change your verification too!
//    Use recursion to implement the factorial.

//    public static void getFactorialLoop(){
//            boolean stillWantsToPlay = true;
//        do {
//            System.out.println("Please enter an integer between 1 and 20:");
//            Scanner userInput = new Scanner(System.in);
//            int userInt = userInput.nextInt();
//            if (userInt > 20 || userInt < 1) {
//                System.out.println("Invalid input.");
//            } else {
//                long factorialResult = 1;
//                for (int i = 1; i <= userInt; i++) {
//                    factorialResult *= i;
//                }
//                System.out.println("Your factorial is: " + factorialResult);
//                System.out.println("Would you like to try again? [y/n]");
//                String yesOrNo = userInput.next();
//                if (yesOrNo.equalsIgnoreCase("n")) {
//                    System.out.println("Ok. Ending program.");
//                    stillWantsToPlay = false;
//                }
//            }
//        }while(stillWantsToPlay);


        //    Recursion factorial stuff===========================

//    public static void useInputToFindFactorial(){
//        int userInt;
//        boolean stillWantsToPlay = true;
//        do {
//            System.out.println("Please enter an integer between 1 and 20:");
//            Scanner userInput = new Scanner(System.in);
//            userInt = userInput.nextInt();
//            if (userInt < 1 || userInt > 20) {
//                System.out.println("Invalid input.");
//            } else {
//                long factorialResult = calculateFactorialRecursion(userInt);
//                System.out.println("Your result is: " + factorialResult);
//                System.out.println("Would you like to continue? [y/n]");
//                String yesOrNo = userInput.next();
//                if (yesOrNo.equalsIgnoreCase("n")) {
//                    System.out.println("Ok. Ending program.");
//                    stillWantsToPlay = false;
//                }
//
//            }
//        } while (stillWantsToPlay);
//    }

//    public static long calculateFactorialRecursion(int userInt) {
//        if (userInt >= 1) {
//            return userInt * calculateFactorialRecursion(userInt - 1);
//        } else {
//            return 1;
//        }
//
//
//    }
//        ==========================================================================

//    Create an application that simulates dice rolling.
//
//    Ask the user to enter the number of sides for a pair of dice.
//    Prompt the user to roll the dice.
//"Roll" two n-sided dice, display the results of each, and then ask the user if he/she wants to roll the dice again.
//            Use static methods to implement the method(s) that generate the random numbers.
//    Use the .random method of the java.lang.Math class to generate random numbers.


//    public static int generateRandom(int numOfSides){
//        double randomNum = Math.floor(Math.random() * numOfSides) + 2;
//        int randomInt = (int)randomNum;
//        return randomInt;
//    }

//    public static void rollTheDice(){
//            boolean stillPlaying = true;
//        do {
//            System.out.println("Let's roll the dice!");
//            System.out.println("How many sides does each die have? Enter two integers, each greater than or equal to 2:");
//            Scanner userInput = new Scanner(System.in);
//            int numOfSides1 = userInput.nextInt();
//            int numOfSides2 = userInput.nextInt();
//            int firstRoll = generateRandom(numOfSides1);
//            int secondRoll = generateRandom(numOfSides2);
//            if(firstRoll == 20 || secondRoll == 20){
//                System.out.printf("You rolled a(n) %d and a(n) %d. You got a nat 20!%n", firstRoll, secondRoll);
//            } else {
//                System.out.printf("You rolled a(n) %d and a(n) %d.%n", firstRoll, secondRoll);
//            }
//            System.out.println("Would you like to roll again? [y/n]");
//            String yesOrNo = userInput.next();
//            if(yesOrNo.equalsIgnoreCase("n")){
//                System.out.println("Ok! Game over.");
//                stillPlaying = false;
//            }
//        }while(stillPlaying);
//    }



//    Leave this curly brace alone!!!!
}


