import util.Input;

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
                boolean addAnotherItem = userInput.yesNo();
                if(!addAnotherItem){
                    stillMakingList = false;
                }


            }while(stillUsingApp);




        }






    }






}
