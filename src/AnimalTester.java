public class AnimalTester {

    public static void main(String[] args) {

        Animal zebra = new Animal(4, "African Savannah");
        System.out.println(zebra.getAnimalInfo());

        Dog sledDog = new Dog(4, "Frozen tundra");
        sledDog.setBreed("Siberian Husky");
        System.out.println(sledDog.getAnimalInfo());

        Fish salmon = new Fish(0, "Freshwater");
        salmon.setTasty(true);
        System.out.println(salmon.getAnimalInfo());

        Cat jaguar = new Cat(4, "Rainforest");
        jaguar.setCoatPattern("Spots");
        System.out.println(jaguar.getAnimalInfo());




    }









}
