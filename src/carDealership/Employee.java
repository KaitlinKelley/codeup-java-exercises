package carDealership;

public class Employee extends Person {

    public Employee(String name){
        super(name);
    }

    private String runCreditHistory(Customer customer){
        if(customer.getCreditRating() <= 500){
            return "Bad Credit";
        }else{
            return "Good Credit";
        }

    }

    public void handleCustomer(Customer customer, Vehicle vehicle, boolean finance){
        if(finance){
            String credit = runCreditHistory(customer);
            if(credit.equals("Good Credit")){
                System.out.println("Credit is good. I think we can work this out for you!");
            }else{
                System.out.println("Sorry, we are currently unable to assist you with financing.");
            }
        }

        if(customer.getCash() >= vehicle.getPrice()){
            System.out.println("Everything's good! You have a ton of cash. Good job. Enjoy the " + vehicle.getModel());
        }else{
            System.out.println("Sorry, that's not enough cash.");
        }

    }






}
