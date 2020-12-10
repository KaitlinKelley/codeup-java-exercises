package shapes;

import util.Input;

public class CircleApp {

    public static void main(String[] args){

        Input userInput = new Input();

//        boolean wantsToContinue = true;

//        do {
            System.out.println("Let's make a circle! We need a radius.");

            double userRadius = userInput.getDouble();

            Circle c1 = new Circle(userRadius);

            System.out.println("You made a circle!");

            System.out.printf("The radius is: %f%n", userRadius);
            System.out.printf("The area is: %f%n", Circle.getArea(userRadius));
            System.out.printf("The circumference is: %f%n", Circle.getCircumference(userRadius));
            System.out.println(".....I have no idea what the units are. Sorry.");
            System.out.println();
//            System.out.println("Would you like to make another circle?");
//            boolean userYesNo = userInput.yesNo();
//            if (!userYesNo){
//                wantsToContinue = false;
//            }
//
//        }while(wantsToContinue);


    }







}
