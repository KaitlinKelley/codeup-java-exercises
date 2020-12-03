import java.lang.Math;
import java.lang.Integer;
import java.util.Scanner;

public class ControlFlowExercises {
    public static void main(String[] args){

//        Loop Basics
//
//        While
//
//        Create an integer variable i with a value of 5.
//        Create a while loop that runs so long as i is less than or equal to 15
//        Each loop iteration, output the current value of i, then increment i by one.
//        Your output should look like this:
//
//        5 6 7 8 9 10 11 12 13 14 15

//        int i = 5;
//
//        while(i <= 15){
//            System.out.print(i + " ");
//            ++i;
//        }

//        Do While
//
//        Create a do-while loop that will count by 2's starting with 0 and ending at 100. Follow each number with a new line.
//        Alter your loop to count backwards by 5's from 100 to -10.
//        Create a do-while loop that starts at 2, and displays the number squared on each line while the number is less than 1,000,000. Output should equal:
//
//        2
//        4
//        16
//        256
//        65536

//        int i = 0;
//
//        do{
//            System.out.println(i);
//            i+=2;
//        }while(i<=100);

//        int i = 100;
//
//        do{
//            System.out.println(i);
//            i-=5;
//        }while(i>=-10);

//        int i = 1;
//
//        do{
//            System.out.println(Math.pow(2,i));
//            i*=2;
//        }while(Math.pow(2,i) < 100000);

//        for(int i = 5; i <= 15; i++){
//            System.out.print(i + " ");
//        }

//        for(int i = 0; i <= 100; i+=2){
//            System.out.println(i);
//        }

//        for(int i = 100; i >= -10; i-=5){
//            System.out.println(i);
//        }

//        for(int i = 1; Math.pow(2,i) < 1000000; i*=2){
//            System.out.println(Math.pow(2,i));
//        }

//        for(int i = 1; i <= 100; i++){
//            if(i%3 == 0 && i%5 == 0){
//                System.out.println("FizzBuzz");
//            } else if(i%3 == 0){
//                System.out.println("Fizz");
//            } else if(i%5 == 0){
//                System.out.println("Buzz");
//            } else {
//                System.out.println(i);
//            }
//        }

        Scanner userInput = new Scanner(System.in);

        while(true){
            System.out.println("What number would you like to go up to?\n");

            int maxNum = userInput.nextInt();
            String spacerXXs = "   | ";
            String spacerXs = "     | ";
            String spacerSmall = "      | ";
            String spacerMed = "       | ";

            System.out.println("Here is your table!");
            System.out.println();
            System.out.println("number | squared | cubed");
            System.out.println("------ | ------- | -----");
            for (int i = 1; i <= maxNum; i++) {
                if (i * i >= 100) {
                    System.out.println(i + spacerXs + i * i + spacerXs + i * i * i);
                } else if (i * i >= 10) {
                    System.out.println(i + spacerSmall + i * i + spacerSmall + i * i * i);
                } else {
                    System.out.println(i + spacerSmall + i * i + spacerMed + i * i * i);
                }
            }

            System.out.println("Would you like to continue? y or n\n");

            String yesOrNo = userInput.next();

            if(yesOrNo.equalsIgnoreCase("N")){
                System.out.println("Ok! No more tables for you.");
                break;
            }

        }










    }
}
