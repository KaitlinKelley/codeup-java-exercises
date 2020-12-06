import java.util.Scanner;

public class MethodsExercises {

    public static void main(String[] args){
//        addStuff(14,32);
//        subtractStuff(14,32);
//        multiplyStuff(14,32);
//        divideStuff(14,32);
//        findRemainder(32,14);
//        divideStuff(5,0); //Gives us infinity??????? Dunno why.
//        //Dividing by infinity in Java can throw an exception, or result in infinity, depending on whether we are using an int or a float, etc.
//        multiplyWithLoop(5,3);
//        multiplyWithLoop(7,8);
//        multiplyWithRecursion(5,3);
//        getInteger(1, 10);
        getFactorialLoop();

    }

    public static void addStuff(int num1, int num2){
        System.out.println(num1 + " + " + num2 + " = " + (num1 + num2));
    }

    public static void subtractStuff(int num1, int num2){
        System.out.println(num1 - num2);
    }

    public static void multiplyStuff(int num1, int num2){
        System.out.println(num1*num2);
    }

    public static void divideStuff(float num1, float num2){
        System.out.println(num1/num2);
    }

    public static void findRemainder(int num1, int num2){
        System.out.println(num1 % num2);
    }

    public static void multiplyWithLoop(int baseNum, int numOfTimes){
        int result = 0;
        for(int i = 1; i <= numOfTimes; i++){
            result += baseNum;
        }
        System.out.println(baseNum + "x" + numOfTimes + " = " + result);
    }

//    Doesn't work!!!!
    public static int multiplyWithRecursion(int baseNum, int numOfTimes){
        if(baseNum == 0 || numOfTimes == 0){
            System.out.println("0");
            return 0;
        } else {
            if (numOfTimes == 1){
                System.out.println(baseNum);
                return baseNum;
            } else {
                System.out.println(baseNum + (multiplyWithRecursion(baseNum, numOfTimes - 1)));
                return baseNum + (multiplyWithRecursion(baseNum, numOfTimes - 1));
            }
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


    public static int getInteger(int min, int max){
        System.out.println("Enter a number between 1 and 10:");
        Scanner userInput = new Scanner (System.in);
        int userInt = userInput.nextInt();
        if (userInt <= 10 && userInt >=1){
            System.out.println("You entered a valid number. Good job");
            return userInt;
        } else {
            return getInteger(min, max);
        }
    }

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

    public static void getFactorialLoop(){
            boolean stillWantsToPlay = true;
        do {
            System.out.println("Please enter an integer between 1 and 10:");
            Scanner userInput = new Scanner(System.in);
            int userInt = userInput.nextInt();
            if (userInt > 10 || userInt < 1) {
                System.out.println("Invalid input.");
            } else {
                long factorialResult = 1;
                for (int i = 1; i <= userInt; i++) {
                    factorialResult *= i;
                }
                System.out.println("Your factorial is: " + factorialResult);
                System.out.println("Would you like to try again? [y/n]");
                String yesOrNo = userInput.next();
                if (yesOrNo.equalsIgnoreCase("n")) {
                    System.out.println("Ok. Ending program.");
                    stillWantsToPlay = false;
                }
            }
        }while(stillWantsToPlay);

//    public static int getFactorialRecurs(int someInt){
//        System.out.println("Please enter an integer between 1 and 10:");
//        Scanner userInput = new Scanner (System.in);
//        int userInt = userInput.nextInt();
//    }


}

}
