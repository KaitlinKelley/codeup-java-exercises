import util.Input;

import java.util.ArrayList;

public class GroceryListApp {


    public static void main(String[] args) {
        Input userInput = new Input();
        boolean stillUsingApp = true;
        boolean stillMakingList = true;

        System.out.println("Hi! Would you like to create a grocery list?");
        boolean yesOrNo = userInput.yesNo();

        if(!yesOrNo){
            System.out.println("Ok. Goodbye.");
            stillUsingApp = false;
        }else{
            do{


                do {
                    GroceryItem.displayChoices();
                    int userCategory = userInput.getInt();
                    System.out.println("Please type in the name of the item:");
                    String userItem = userInput.getString();
                    userInput.getString();
                    System.out.println("Please enter the quantity:");
                    int userQuantity = userInput.getInt();
                    GroceryItem newItem = new GroceryItem(userItem, userQuantity, userCategory);
                    newItem.addItem(newItem);
                    System.out.println("Would you like to enter another item? [y/n]");
                    userInput.yesNo();
                    boolean addAnotherItem = userInput.yesNo();
                    if (!addAnotherItem) {
                        System.out.println("Ok, your list is complete.");
                        stillMakingList = false;
                    }
                }while(stillMakingList && stillUsingApp);


                System.out.println("Here is your completed list:");






            }while(stillUsingApp);




        }





    //end of main method
    }





//end of class
}
