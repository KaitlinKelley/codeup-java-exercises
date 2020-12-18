package abstractClassesInterface;

//declaring this to be an abstract class
public abstract class Franchise {
    //all the methods in an abstract class are like a list of rules or requirements for what needs to be implemented in any class that extends this abstract class

    //If we were to create a class that extends a Franchise
    //i.e. McDonald's on I-10 vs McDonald's on Loop 1604

    //Properties (constant values)=======================================
    private final String companyName = "McDonalds";
    //This is always the same no matter where we build a franchise
    private String managerName;

    //If we have enough properties to warrant a constructor to set those values when initializing this class....
    //We don't have to set companyName because it is already final
    public Franchise(String managerName){
        this.managerName = managerName;
    }

    //Methods============================================================
    public abstract void broilStuff(String menuItem);
    //Notice there's no curly braces, no method body, no functionality
    //the classes that extend Franchise MUST declare their own version of this

    //for example, 8am = 8800, 10pm = 2200
    public abstract void businessHours(int openTime, int closeTime);

    public abstract boolean iceCreamMachineWorking();

    //non-abstract method, will NOT be unique to each McDonalds
    public void greetCustomer(){
        //not abstract, so needs a method body
        System.out.println("Welcome to " + this.companyName + ". Enjoy your meal.");
    }

    //Getter
    //Can retrieve the company name from any class that extends Franchise
    public String getCompanyName(){
        return companyName;
    }


    //Quick examples of Static vs. Non-Static============================================
    //Static
//    double result = Math.pow(10,2);

    //Non-Static
    //Can't do this! Cannot instantiate a new math object!! Because it's static!!
//    Math myCoolMathTool = new Math();
    //===================================================================================





}
