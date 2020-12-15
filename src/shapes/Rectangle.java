package shapes;

public class Rectangle extends Quadrilateral implements Measurable {

//    protected double length;
//    protected double width;
//
//    public Rectangle(double length, double width){
//        this.length = length;
//        this.width = width;
//    }
//
//    public double getArea(){
//        System.out.println("Using Rectangle class!");
//        return length*width;
//    }
//
//    public double getPerimeter(){
//        System.out.println("Using Rectangle class!");
//        return length*2 + width*2;
//    }

    protected double length;
    protected double width;

    public Rectangle(double length, double width) {
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

    //These were defined as abstract in Quadrilateral, must have a body here
    @Override
    public void setLength(double length) {
        this.length = length;
    }

    @Override
    public void setWidth(double width) {
        this.width = width;
    }
}
