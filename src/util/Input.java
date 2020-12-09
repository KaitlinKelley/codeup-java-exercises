package util;

import java.util.Scanner;

public class Input {


    private Scanner scanner;

    public Input(){
        this.scanner = new Scanner(System.in);
    }

    public String getString(){
        return scanner.nextLine();
    }

//    public boolean yesNo(){
//
//    }
//
//    public int getInt(int min, int max){
//
//    }
//
    public int getInt(){
        return scanner.nextInt();
    }
//
//    public double getDouble(double min, double max){
//
//    }
//
    public double getDouble(){
        return scanner.nextDouble();
    }




}
