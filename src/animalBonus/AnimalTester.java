package animalBonus;


public class AnimalTester {

    public static void main(String[] args) {

        Animal zebra = new Animal(4, "African Savannah");
        displayAnimalDetails(zebra);

        Dog sledDog = new Dog(4, "Frozen tundra");
        sledDog.setBreed("Siberian Husky");
        displayAnimalDetails(sledDog);

        Fish salmon = new Fish(0, "Freshwater");
        salmon.setTasty(true);
        displayAnimalDetails(salmon);

        Animal trout = new Fish(0, "Freshwater");
        displayAnimalDetails(trout);//set tasty to null

        Cat jaguar = new Cat(4, "Rainforest");
        jaguar.setCoatPattern("Spots");
        displayAnimalDetails(jaguar);

        Animal tiger = new Cat(4, "Jungle");
        displayAnimalDetails(tiger);//sets coat pattern as null

    }



    public static void displayAnimalDetails(Animal a) {
        System.out.println(a.getAnimalInfo());
    }









}
