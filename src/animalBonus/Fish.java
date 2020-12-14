package animalBonus;

public class Fish extends Animal {

    public Fish(int numberOfLegs, String preferredClimate){
        super(numberOfLegs, preferredClimate);
    }

    private Boolean tasty;

    public Boolean getTasty(){
        return tasty;
    }

    public void setTasty(Boolean tasty){
        this.tasty = tasty;
    }

    public String getAnimalInfo(){
        String animalInfo = super.getAnimalInfo();
        animalInfo += "Is this fish tasty? -- " + getTasty() + "\n";
        return animalInfo;
    }

}
