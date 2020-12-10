package util;

import java.util.Scanner;

public class Input {

    private Scanner sc;

    public Input(){
        this.sc = new Scanner(System.in);
        //or scanner = new Scanner(System.in);
    }

    public String getString(){
        String userString = this.sc.nextLine();
        return userString;
        //or return this.sc.nextLine();
    }

    public String getString(String prompt){
        System.out.println(prompt);
        return getString();
    }

    public boolean yesNo(){
        System.out.println("Please enter either yes or no:");
        String userYesOrNo = this.sc.nextLine().trim();
        //can also reuse getString() here
        if(userYesOrNo.equalsIgnoreCase("yes") || userYesOrNo.equalsIgnoreCase("y")){
//            System.out.println("Thank you. This boolean is now true.");
            return true;
        }else{
//            System.out.println("Thank you. This boolean is now false.");
            return false;
        }

        //or return (userYesOrNo.trim().toLowerCase().equals("y") || userYesOrNo.trim().toLowerCase().equals("yes"));
    }

    public boolean yesNo(String prompt){
        System.out.println(prompt);
        String userYesOrNo = this.sc.next().trim();
        //can also reuse getString() here
        if(userYesOrNo.equalsIgnoreCase("yes") || userYesOrNo.equalsIgnoreCase("y")){
//            System.out.println("Thank you. This boolean is now true.");
            return true;
        }else{
//            System.out.println("Thank you. This boolean is now false.");
            return false;
        }

        //or return (userYesOrNo.trim().toLowerCase().equals("y") || userYesOrNo.trim().toLowerCase().equals("yes"));
    }

    public int getInt(int min, int max){
        System.out.printf("Please enter an integer between %d and %d:%n", min, max);
        int userInt = this.sc.nextInt();
        if(userInt > max || userInt < min){
            System.out.println("That number is out of range.");
            return getInt(min, max);
        } else {
            System.out.println("Thank you! That number was within the range.");
        }
            return userInt;
    }


    //ALTERNATE SOLUTION USING DO WHILE
//    public int getInt(int min, int max){
//        int userInt;
//        do{
//        System.out.printf("Please enter an integer between %d and %d:%n", min, max);
//        userInt = this.sc.nextInt();
//        }while(userInt < min || userInt > max);
//
//        return userInt;
//    }

    public int getInt(){
        System.out.println("Please enter an integer:");
        int userInt = this.sc.nextInt();
        return userInt;
        //or return this.sc.nextInt();
    }

    public int getInt(String prompt){
        System.out.println(prompt);
        return getInt();
    }


    public double getDouble(double min, double max){
        System.out.printf("Please enter a decimal value between %.2f and %.2f:%n", min, max);
        double userDouble = this.sc.nextDouble();
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
        double userDouble = this.sc.nextDouble();
        return userDouble;
    }




}
