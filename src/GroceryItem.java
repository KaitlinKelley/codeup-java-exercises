import java.util.ArrayList;
import java.util.HashMap;

public class GroceryItem {

    private String name;
    private int quantity;
    private int category;
    public ArrayList<GroceryItem> groceryList = new ArrayList<>();


    public static void main(String[] args) {
        HashMap<Integer, String> categories = new HashMap<>();
        categories.put(1, "Produce");
        categories.put(2, "Eggs and Dairy");
        categories.put(3, "Meat");
        categories.put(4, "Canned Goods");
        categories.put(5, "Dry Goods");
    }

    public static void displayChoices(){
        System.out.println("Please select a category by typing the corresponding number:");
        System.out.println("1: Produce");
        System.out.println("2: Eggs and Dairy");
        System.out.println("3: Meat");
        System.out.println("4: Canned Goods");
        System.out.println("5: Dry Goods");
    }


    public GroceryItem(String name, int quantity, int category){
        this.name = name;
        this.quantity = quantity;
        this.category = category;
    }

    public void addItem(GroceryItem itemToAdd){
        groceryList.add(itemToAdd);
    }

    public static void displayAllItems(ArrayList<GroceryItem> groceryList){
        for(GroceryItem item: groceryList){
            System.out.println("Category: " + item.category + ", Item: " + item.name + ", Quantity: " + item.quantity);
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public int getCategory() {
        return category;
    }

    public void setCategory(int category) {
        this.category = category;
    }

    public ArrayList<GroceryItem> getGroceryList() {
        return groceryList;
    }


    public void setGroceryList(ArrayList<GroceryItem> groceryList) {
        this.groceryList = groceryList;
    }








}
