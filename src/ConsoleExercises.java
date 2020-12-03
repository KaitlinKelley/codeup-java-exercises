import java.util.Scanner;
import static java.lang.Integer.parseInt;
import static java.lang.Float.parseFloat;

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

//        userInput.useDelimiter("\n");

//        System.out.printf("Please type in a sentence:%n");
//
//        String sentence = userInput.nextLine();
//
//        System.out.printf("Your sentence was: %s.", sentence);


//        System.out.printf("Please enter a length and width and height:%n");
//
//        String length = userInput.nextLine();
//
//        String width = userInput.nextLine();
//
//        String height = userInput.nextLine();
//
//        float lengthInt = Float.parseFloat(length);
//        float widthInt = Float.parseFloat(width);
//        float heightNum = Float.parseFloat(height);
//
//        float perimeter = lengthInt*2 + widthInt*2;
//        float area = lengthInt*widthInt;
//        float volume = area*heightNum;
//
//        System.out.printf("The perimeter is %f and the area is %f and the volume is %f", perimeter, area, volume);

//        Rewrite to use nextInt method
        userInput.useDelimiter("\n");

        System.out.printf("Please enter a length and width and height:%n");


        int length = userInput.nextInt();

        int width = userInput.nextInt();

        int height = userInput.nextInt();



        int perimeter = length*2 + width*2;
        int area = length*width;
        int volume = area*height;

        System.out.printf("The perimeter is %d and the area is %d and the volume is %d", perimeter, area, volume);


    }
}
