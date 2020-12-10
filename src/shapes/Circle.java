package shapes;

public class Circle {

    private double radius;

    final static double pi = Math.PI;

    public Circle(double radius){
        this.radius = radius;
    }

    public static double getArea(double radius){
        return Math.pow(radius, 2) * pi;
    }

    public static double getCircumference(double radius){
        return 2*pi*radius;
    }










}
