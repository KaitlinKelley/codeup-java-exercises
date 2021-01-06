package carDealership;

public class CarDealership {

    public static void main(String[] args) {

        Customer newCustomer = new Customer("Ry Sutton", 10000, 650);

        Employee newEmployee = new Employee("Chris Parker");

        Vehicle newVehicle = new Vehicle(1100, "Honda", "Civic", "Coupe");

        newCustomer.purchaseCar(newVehicle, newEmployee, false);

    }


}
