package shapes;

public class Square extends Quadrilateral{

//    protected double length;
//    protected double width;


//    public Square(double side){
//        super(side, side);
//    }
//
//    @Override
//    public double getArea(){
//        System.out.println("Using Square class!");
//        return this.length*this.length;//inheriting the length and width properties from the Rectangle parent class
//    }
//
//    @Override
//    public double getPerimeter(){
//        System.out.println("Using Square class!");
//        return 4*this.length;
//    }

    public Square(double length, double width) {
        super(length, width);
    }

    @Override
    public double getPerimeter() {
        return super.getPerimeter();
    }

    @Override
    public double getArea() {
        return super.getArea();
    }

    @Override
    public double getLength() {
        return super.getLength();
    }

    @Override
    public double getWidth() {
        return super.getWidth();
    }

    //Setters for the width and the length (Quadrilateral abstract class says we have to define these here
    @Override
    public void setLength(double length) {
        this.length = length;
        this.width = length;
    }

    @Override
    public void setWidth(double width) {
        this.length = width;
        this.width = width;
    }
}
