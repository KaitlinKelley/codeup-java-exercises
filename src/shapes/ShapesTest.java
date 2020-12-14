package shapes;

public class ShapesTest {

    public static void main(String[] args) {

        Rectangle box1 = new Rectangle(5,4);

        Rectangle box2 = new Square(5);//example of polymorphism!!!!!

        System.out.println(box1.getArea()); //20, uses rectangle class

        System.out.println(box1.getPerimeter()); //18, uses rectangle class

        System.out.println(box2.getArea()); //25, uses square class

        System.out.println(box2.getPerimeter()); //20, uses square class




    }











}
