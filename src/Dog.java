public class Dog extends Animal{

    public Dog(int numberOfLegs, String preferredClimate){
        super(numberOfLegs, preferredClimate);
    }

    private String breed;

    public String getBreed(){
        return breed;
    }

    public void setBreed(String breed){
        this.breed = breed;
    }

    public String getAnimalInfo(){
        String animalInfo = super.getAnimalInfo();
        animalInfo += "The breed is: " + getBreed() + "\n";
        return animalInfo;
    }

}
