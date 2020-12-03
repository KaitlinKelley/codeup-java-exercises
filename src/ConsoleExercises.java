import java.util.Scanner;

public class ConsoleExercises {
    public static void main(String[] args){
//        double pi = 3.14159;
//        System.out.printf("The value of pi is approximately %.2f.%n", pi);

        Scanner userInput = new Scanner(System.in);

//        System.out.printf("Please enter an integer.%n");
//
//        int userInteger = userInput.nextInt();
//
//        System.out.print("You typed in: " + userInteger);

//        System.out.printf("Please enter three words.%n");
//
//        String firstWord = userInput.next();
//        String secondWord = userInput.next();
//        String thirdWord = userInput.next();
//
//        System.out.printf("The three words you entered are: %n1.%s %n2.%s %n3.%s", firstWord, secondWord, thirdWord);

        System.out.printf("Please type in a sentence:%n");

        String sentence = userInput.nextLine();

        System.out.printf("Your sentence was: %s.", sentence);

    }
}
