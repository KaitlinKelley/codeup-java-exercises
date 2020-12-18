package shapes;

public class ShapesTest {

    public static void main(String[] args) {

//        Rectangle box1 = new Rectangle(5,4);
//
//        Rectangle box2 = new Square(5);//example of polymorphism!!!!!
//
//        System.out.println(box1.getArea()); //20, uses rectangle class
//
//        System.out.println(box1.getPerimeter()); //18, uses rectangle class
//
//        System.out.println(box2.getArea()); //25, uses square class
//
//        System.out.println(box2.getPerimeter()); //20, uses square class



        Measurable myShape = new Square(5,6);

        System.out.println("The area is: ");
        System.out.println(myShape.getArea());
        System.out.println("The perimeter is: ");
        System.out.println(myShape.getPerimeter());


        Measurable myShape2 = new Rectangle(4,3);

        System.out.println("The area is: ");
        System.out.println(myShape2.getArea());
        System.out.println("The perimeter is: ");
        System.out.println(myShape2.getPerimeter());



        //Why does the code fail to compile if you leave off the getPerimeter method in Rectangle?
        //-----Rectangle is an extension of Quadrilateral, which is an abstract class that contains an abstract getPerimeter method...so Rectangle MUST define a non-abstract getPerimeter method!

        //What happens if you try to call the getLength or getWidth methods of the myShape variable? Why?
        //"Cannot resolve 'getLength' method in 'Measurable'"
        //myShape is a type Measurable, only has getPerimeter and getArea methods






    }











}
