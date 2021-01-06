package carDealership;

public class Customer extends Person {

    private int cash;
    private int creditRating;

    public Customer(String name, int cash, int creditRating){
        super(name);
        this.cash = cash;
        this.creditRating = creditRating;
    }

    public int getCash() {
        return cash;
    }

    public void setCash(int cash) {
        this.cash = cash;
    }

    public int getCreditRating() {
        return creditRating;
    }

    public void setCreditRating(int creditRating) {
        this.creditRating = creditRating;
    }

    public void purchaseCar(Vehicle vehicle, Employee emp, boolean finance){

        if(finance){
            System.out.println("Hello, I'm looking to finance a " + vehicle.getMake() + " " + vehicle.getModel());
        }else{
            System.out.println("Hello, I'm looking to buy a " + vehicle.getMake() + " " + vehicle.getModel() + ", CASH!!!");
        }

        emp.handleCustomer(this, vehicle, finance);
    }





}
