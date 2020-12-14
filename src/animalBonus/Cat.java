package animalBonus;

public class Cat extends Animal {

    public Cat(int numberOfLegs, String preferredClimate){
        super(numberOfLegs, preferredClimate);
    }

    private String coatPattern;

    public String getCoatPattern(){
        return coatPattern;
    }

    public void setCoatPattern(String coatPattern){
        this.coatPattern = coatPattern;
    }

    public String getAnimalInfo(){
        String animalInfo = super.getAnimalInfo();
        animalInfo += "The coat pattern is: " + getCoatPattern() + "\n";
        return animalInfo;
    }






}
