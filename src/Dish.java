public class Dish {
//    Create a class called Dish. This class will represent various restaurant dishes.
//    Include an integer property called “costInCents”
//    Include a string property called “nameOfDish”
//    Include a boolean property called “wouldRecommend”
//    Include a method called “printSummary” with a void return type
//    this method will use a single printf method to print out the values of each of the instance properties in the following format:
//    Cost: COST_IN_CENTS_HERE
//    Name: NAME_OF_DISH_HERE
//    Recommended: BOOLEAN_VALUE_OF_WOULD_RECOMMEND_HERE


    private int costInCents;
    private String nameOfDish;
    private Boolean wouldRecommend;
    private Boolean vegetarian;
    private String courseType;
    private String origin;

    public Dish(int cost, String name, boolean doesRecommend, boolean isVegetarian, String typeOfCourse, String areaOfOrigin){
        this.costInCents = cost;
        this.nameOfDish = name;
        this.wouldRecommend = doesRecommend;
        this.vegetarian = isVegetarian;
        this.courseType = typeOfCourse;
        this.origin = areaOfOrigin;
    }

    public int getCostInCents(){
        return costInCents;
    }

    public void setCostInCents(int cost){
        this.costInCents = cost;
    }

    public String getNameOfDish(){
        return nameOfDish;
    }

    public void setNameOfDish(String name){
        this.nameOfDish = name;
    }

    public boolean getWouldRecommend(){
        return wouldRecommend;
    }

    public void setWouldRecommend(boolean doesRecommend){
        this.wouldRecommend = doesRecommend;
    }

    public boolean getIsVegetarian(){
        return vegetarian;
    }

    public void setVegetarian(boolean isVegetarian){
        this.vegetarian = isVegetarian;
    }

    public String getCourseType(){
        return courseType;
    }

    public void setCourseType(String typeOfCourse){
        this.courseType = typeOfCourse;
    }

    public String getOrigin(){
        return origin;
    }

    public void setOrigin(String areaOfOrigin){
        this.origin = areaOfOrigin;
    }

    public void printSummary(){
        System.out.printf("Name: %s%nCost: %d%nRecommended: %b%nVegetarian? %b%nCourse Type: %s%nArea(s) of Origin: %s%n%n", getNameOfDish(), getCostInCents(), getWouldRecommend(), getIsVegetarian(), getCourseType(), getOrigin());
    }
}
