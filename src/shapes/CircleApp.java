package shapes;

import util.Input;

public class CircleApp {

    public static void main(String[] args){

        Input userInput = new Input();

        boolean wantsToContinue = true;

        do {
            System.out.println("Let's make a circle! We need a radius.");

            double userRadius = userInput.getDouble();

            Circle c1 = new Circle(userRadius);

            System.out.println("You made a circle!");

            System.out.printf("The radius is: %f%n", userRadius);
            System.out.printf("The area is: %f%n", c1.getArea());
            System.out.printf("The circumference is: %f%n", c1.getCircumference());
            System.out.println(".....I have no idea what the units are. Sorry.");
            System.out.printf("You have made %d circle(s)", Circle.getCircleCount());
            System.out.println();
            wantsToContinue = userInput.yesNo("Would you like to make another circle?");

        }while(wantsToContinue);


    }







}
