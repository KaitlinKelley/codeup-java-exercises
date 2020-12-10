package shapes;

public class Circle {

    private double radius;

    private static int circleCount = 0;

    final static double pi = Math.PI;

    public Circle(double radius){
        this.radius = radius;
        circleCount++;
    }

    public double getArea(){
        return Math.pow(radius, 2) * pi;
    }

    public double getCircumference(){
        return 2*pi*radius;
    }

    public static int getCircleCount(){
        return circleCount;
    }










}
