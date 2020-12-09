public class DishTest {
//    Create another class called DishTest
//            Add a main method and inside the method...
//            1) instantiate a Dish object and assign to a variable called dish1
//    2) assign creative values for each of the properties
//    3) test the printSummary() method by invoking it and checking if all instance values are correctly printed

    public static void main(String[] args){

//        Dish shakshuka = new Dish();
//        shakshuka.nameOfDish = "Shakshuka";
//        shakshuka.costInCents = 1100;
//        shakshuka.wouldRecommend = true;
//        shakshuka.vegetarian = true;
//        shakshuka.courseType = "Entree";
//        shakshuka.origin = "North Africa, Middle East";
//
//        Dish bananasFoster = new Dish();
//        bananasFoster.nameOfDish = "Bananas Foster";
//        bananasFoster.costInCents = 899;
//        bananasFoster.wouldRecommend = false;
//        bananasFoster.vegetarian = true;
//        bananasFoster.courseType = "Dessert";
//        bananasFoster.origin = "New Orleans";
//
//        Dish maqluba = new Dish();
//        maqluba.nameOfDish = "Maqluba";
//        maqluba.costInCents = 1200;
//        maqluba.wouldRecommend = true;
//        maqluba.vegetarian = false;
//        maqluba.courseType = "Entree";
//        maqluba.origin = "Middle East, Eastern Mediterranean";
//
//        Dish chickenMarsala = new Dish();
//        chickenMarsala.nameOfDish = "Chicken Marsala";
//        chickenMarsala.costInCents = 1350;
//        chickenMarsala.wouldRecommend = true;
//        chickenMarsala.vegetarian = false;
//        chickenMarsala.courseType = "Entree";
//        chickenMarsala.origin = "Italy";
//
//        Dish doroWat = new Dish();
//        doroWat.nameOfDish = "Doro Wat";
//        doroWat.costInCents = 1000;
//        doroWat.wouldRecommend = true;
//        doroWat.vegetarian = false;
//        doroWat.courseType = "Entree";
//        doroWat.origin = "Ethiopia";
//
//        Dish lambBiryani = new Dish();
//        lambBiryani.nameOfDish = "Lamb Biryani";
//        lambBiryani.costInCents = 1200;
//        lambBiryani.wouldRecommend = true;
//        lambBiryani.vegetarian = false;
//        lambBiryani.courseType = "Entree";
//        lambBiryani.origin = "Middle East, India";
//
//        Dish cobbSalad = new Dish();
//        cobbSalad.nameOfDish = "Cobb Salad with Gorgonzola";
//        cobbSalad.costInCents = 699;
//        cobbSalad.wouldRecommend = false;
//        cobbSalad.vegetarian = false;
//        cobbSalad.courseType = "Appetizer";
//        cobbSalad.origin = "United States";

//        shakshuka.printSummary();
//        bananasFoster.printSummary();
//        maqluba.printSummary();
//        chickenMarsala.printSummary();
//        doroWat.printSummary();
//        lambBiryani.printSummary();
//        cobbSalad.printSummary();

//        DishTools.shoutDishName(shakshuka);
//        DishTools.shoutDishName(cobbSalad);
//
//        DishTools.analyzeDishCost(maqluba);
//        DishTools.analyzeDishCost(chickenMarsala);

//        System.out.println(DishTools.flipRecommendation(cobbSalad));
//        System.out.println(DishTools.flipRecommendation(chickenMarsala));
//
//        cobbSalad.printSummary();
//        chickenMarsala.printSummary();

        //Refactor to use constructors and get/set=========================

        Dish d1 = new Dish(1000, "Doro Wat", true, false, "Entree", "Ethiopia");

        Dish d2 = new Dish(1200, "Lamb Biryani", true, false, "Entree", "Middle East, India");

//        d1.printSummary();
//        d2.printSummary();

        System.out.println(d1.getCostInCents()); //1000
        d1.setCostInCents(1550);
        d1.printSummary(); //cost is now 1550

        DishTools.shoutDishName(d1);

        System.out.println(DishTools.flipRecommendation(d1));

        DishTools.analyzeDishCost(d1);






    }
}
