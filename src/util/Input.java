package util;

import java.util.Scanner;

public class Input {


    private Scanner scanner;

    public Input(){
        this.scanner = new Scanner(System.in);
    }

    public String getString(){
        String userString = this.scanner.nextLine();
        return userString;
    }

    public String getString(String prompt){
        System.out.println(prompt);
        String userString = this.scanner.nextLine();
        return userString;
    }

    public boolean yesNo(){
        System.out.println("Please enter either yes or no:");
        String userYesOrNo = this.scanner.nextLine();
        if(userYesOrNo.equalsIgnoreCase("yes") || userYesOrNo.equalsIgnoreCase("y")){
//            System.out.println("Thank you. This boolean is now true.");
            return true;
        }else{
//            System.out.println("Thank you. This boolean is now false.");
            return false;
        }
    }

    public int getInt(int min, int max){
        System.out.printf("Please enter an integer between %d and %d:%n", min, max);
        int userInt = this.scanner.nextInt();
        if(userInt > max || userInt < min){
            System.out.println("That number is out of range.");
            return getInt(min, max);
        } else {
            System.out.println("Thank you! That number was within the range.");
        }
            return userInt;
    }

    public int getInt(){
//        System.out.println("Please enter an integer:");
        int userInt = this.scanner.nextInt();
        return userInt;
    }


    public double getDouble(double min, double max){
        System.out.printf("Please enter a decimal value between %f and %f:%n", min, max);
        double userDouble = this.scanner.nextDouble();
        if(userDouble > max || userDouble < min){
            System.out.println("That number is out of range.");
            return getDouble(min, max);
        } else {
            System.out.println("Thank you! That number was within the range.");
        }
        return userDouble;
    }


    public double getDouble(){
        System.out.println("Please enter a value of type double:");
        double userDouble = this.scanner.nextDouble();
        return userDouble;
    }




}
