package abstractClassesInterface;

import java.util.ArrayList;
import java.util.List;

//an interface can be implemented many levels deep

public class McBurgerShop implements McFranchise {

    //Properties
    private List<String> menuItems;
    private List<String> menuCategories;
    private int seatingCapacity;
    private int openTime;
    private int closeTime;
    private boolean iceCreamTime;

    public static void main(String[] args) {
        //Let's try to access some of McBurgerShop's items and methods
        List<String>theseMenuItems = new ArrayList<>();
        theseMenuItems.add("Big Mac");
        theseMenuItems.add("French Fries");
        theseMenuItems.add("Quarter Pounder");
        List<String>theseCategories = new ArrayList<>();
        theseCategories.add("Entrees");
        theseCategories.add("Sides");
        theseCategories.add("Drinks");

        McBurgerShop mcDonaldsDallas = new McBurgerShop(theseMenuItems, theseCategories, 200, 800, 2300, true);

        //Loop through all of the menu items and print each one
        for(String thisItem: mcDonaldsDallas.getMenuItems()){
            //looking at one menu item at a time
            System.out.println("Menu Item: " + thisItem);
        }

        //Loop through all of the menu items, call broilStuff() on each one
        for(String thisItem: mcDonaldsDallas.getMenuItems()){
            mcDonaldsDallas.broilStuff(thisItem);
        }

        //Create an instance of AustinMcD, which implements methods slightly differently than McBurgerShop

        AustinMcD austinMcDonalds = new AustinMcD(theseMenuItems, theseCategories, 200, 800, 2300, true);

        for(String thisItem: austinMcDonalds.getMenuItems()){
            //See how Austin cooks their menu items
            austinMcDonalds.broilStuff(thisItem);
        }



    }

    //Constructor for McBurgerShop

    public McBurgerShop(List<String>menuItems, List<String>menuCategories, int seatingCapacity, int openTime, int closeTime, boolean iceCreamTime){
        this.menuItems = menuItems;
        this.menuCategories = menuCategories;
        this.seatingCapacity = seatingCapacity;
        this.openTime = openTime;
        this.closeTime = closeTime;
    }



    //Overrides (control + Enter, implement methods)
    @Override
    public void broilStuff(String menuItem) {
        System.out.println("The kitchen just cooked an order of: " + menuItem);
    }

    @Override
    public void businessHours(int openTime, int closeTime) {
        System.out.println("We are open from " + openTime + " to " + closeTime);
    }

    @Override
    public String iceCreamMachineWorking() {
        if(this.iceCreamTime){
            return "Time for ice cream!";
        }else{
            return "No ice cream for you.";
        }
    }

    //getters and setters


    public List<String> getMenuItems() {
        return menuItems;
    }

    public void setMenuItems(List<String> menuItems) {
        this.menuItems = menuItems;
    }

    public List<String> getMenuCategories() {
        return menuCategories;
    }

    public void setMenuCategories(List<String> menuCategories) {
        this.menuCategories = menuCategories;
    }

    public int getSeatingCapacity() {
        return seatingCapacity;
    }

    public void setSeatingCapacity(int seatingCapacity) {
        this.seatingCapacity = seatingCapacity;
    }

    public int getOpenTime() {
        return openTime;
    }

    public void setOpenTime(int openTime) {
        this.openTime = openTime;
    }

    public int getCloseTime() {
        return closeTime;
    }

    public void setCloseTime(int closeTime) {
        this.closeTime = closeTime;
    }

    public boolean isIceCreamTime() {
        return iceCreamTime;
    }

    public void setIceCreamTime(boolean iceCreamTime) {
        this.iceCreamTime = iceCreamTime;
    }
}
