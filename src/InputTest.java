import util.Input;

import java.util.Scanner;

public class InputTest {

    public static void main(String[] args){
        Input userInput = new Input();

//        System.out.println("Please enter y or n:");

        System.out.println("Please enter a string:");
        String userString = userInput.getString();
        System.out.println(userString);

        System.out.println("Please enter an integer:");
        int userInt = userInput.getInt();
        System.out.println(userInt);

        System.out.println("Please enter a decimal value:");
        double userDouble = userInput.getDouble();
        System.out.println(userDouble);
    }
}
