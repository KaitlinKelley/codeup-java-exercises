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


    public int costInCents;
    public String nameOfDish;
    public Boolean wouldRecommend;
    public Boolean vegetarian;
    public String courseType;
    public String origin;

    public void printSummary(){
        System.out.printf("Name: %s%nCost: %d%nRecommended: %b%nVegetarian? %b%nCourse Type: %s%nArea(s) of Origin: %s%n%n", nameOfDish, costInCents, wouldRecommend, vegetarian, courseType, origin);
    }
}
