package abstractClassesInterface;

//Declaring this as an "interface"

//Can't have constructors in an interface!! (only in abstract classes)
public interface McFranchise {
    //Properties
    String companyName = "McDonald's"; //this String is a constant, even without "final"

    //Abstract Methods (that we have to completely write out in any class that IMPLEMENTS this interface)
    //Methods are inherently abstract, but don't use the abstract keyword
    //Interfaces won't allow you to completely write out a method with a body and functionality
    public void broilStuff(String menuItem);
    public void businessHours(int openTime, int closeTime);
    public String iceCreamMachineWorking();


}
