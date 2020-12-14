package animalBonus;

public class Animal {
//
//    # Inheritance and Polymorphism Bonus
//
//    Create a class of animalBonus.Animal
//
//- add the following fields:
//            - ```private int numberOfLegs```
//            - ```private String prefferedClimate```
//            - ```public String getAnimalInfo()```: a method that returns a message with number of legs and preferrered climate info
//- add getters and setters
//- add a constructor that sets all properties
//
//    Create a class of animalBonus.Dog, animalBonus.Fish, animalBonus.Cat that extends animalBonus.Animal
//
//- add additional private properties that are unique to each specific animal type and getters and setters for these properties
//- overload the getAnimalInfo() to invoke the parent getAnimalInfo() method and return extra info on all the additional properties for the specific animal type
//- add a constructor that invokes the parent constructor and sets new properties
//
//    Create a class animalBonus.AnimalTester with a method ```public static void displayAnimalDetails(animalBonus.Animal a)``` that prints what is returned from calling the getAnimalInfo() method for a given animal object
//
//- this method should take in any animalBonus.Animal object but test it in the main method
//    with instantiated animalBonus.Dog, animalBonus.Fish, animalBonus.Cat objects of type animalBonus.Animal.

    private int numberOfLegs;
    private String preferredClimate;

    public Animal(int numberOfLegs, String preferredClimate){
        this.numberOfLegs = numberOfLegs;
        this.preferredClimate = preferredClimate;
    }

    public String getAnimalInfo(){
        String animalInfo = "This animal has " + getNumberOfLegs() + " legs. \nThis animal's preferred climate is: " + getPreferredClimate() + "\n";
        return animalInfo;
    }

    public int getNumberOfLegs(){
        return numberOfLegs;
    }

    public void setNumberOfLegs(int num){
        numberOfLegs = num;
    }

    public String getPreferredClimate(){
        return preferredClimate;
    }

    public void setPreferredClimate(String climate){
        preferredClimate = climate;
    }




}
